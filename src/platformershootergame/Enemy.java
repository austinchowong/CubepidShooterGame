package platformershootergame;

import java.awt.Rectangle;

public class Enemy {

	private int power, speedX, centerX, centerY;
	private Background bg = StartingClass.getBg1();
	public int health = 5;
	private Cubepid cubepid = StartingClass.getCubepid();
	
	private int movementSpeed;

	public Rectangle r = new Rectangle(0,0,0,0);
	
	// Behavioral Methods
	public void update() {
		follow();
		centerX += speedX;
		speedX = bg.getSpeedX() * 5 + movementSpeed;
		r.setBounds(centerX - 25, centerY - 25, 50, 60);

		if (r.intersects(Cubepid.yellowRed)) {
			checkCollision();
		}

	}
	public void follow() {
		
		if (centerX < -95 || centerX > 810){
			movementSpeed = 0;
		}

		else if (Math.abs(cubepid.getCenterX() - centerX) < 5) {
			movementSpeed = 0;
		}

		else {

			if (cubepid.getCenterX() >= centerX) {
				movementSpeed = 1;
			} else {
				movementSpeed = -1;
			}
		}

	}





	private void checkCollision() {
		if (r.intersects(Cubepid.rect) || r.intersects(Cubepid.rect2) || r.intersects(Cubepid.rect3) || r.intersects(Cubepid.rect4)){
			System.out.println("collision");
			
			}
		}

	public void die() {

	}

	public void attack() {

	}


	public int getPower() {
		return power;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public Background getBg() {
		return bg;
	}


	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}

	
}
