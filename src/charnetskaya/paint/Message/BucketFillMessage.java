package charnetskaya.paint.Message;

import java.awt.Graphics2D;

public class BucketFillMessage implements PaintMessage {

	private int x, y;
	private int color;

	@Override
	public void apply(Graphics2D g2) {
		// TODO Auto-generated method stub

	}

	public BucketFillMessage(int x, int y, int color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}