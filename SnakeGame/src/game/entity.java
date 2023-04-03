package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class entity {
	private int x,y,size;
	public entity(int size){
		this.size = size;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void move(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public Rectangle getBound(){
		return new Rectangle(x, y, size, size);
	}
	public boolean isCollsion(entity o){
		if (o == this) return false;
		return getBound().intersects(o.getBound());
	}
	public void render(Graphics2D g2d){
		g2d.fillRect(x + 1, y + 1, size - 2, size - 2);
	}
}
