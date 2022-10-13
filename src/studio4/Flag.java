package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		
		//StdDraw.setPenColor(255, 0, 0);
		//StdDraw.filledRectangle(3, 3, 3, 3);
		//StdDraw.filledRectangle(3, 13, 3, 3);
		//StdDraw.filledRectangle(16, 3, 6, 3);
		//StdDraw.filledRectangle(16, 13, 6, 3);
		
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 5);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(11, 8, 3, 3);
		
		StdDraw.setPenColor(Color.YELLOW);
		double[] xCoor = {12, 13, 11, 9, 10};
		double[] yCoor = {10, 9, 6, 9, 10};
		StdDraw.filledPolygon(xCoor, yCoor);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.polygon(xCoor, yCoor);
		StdDraw.line(13, 9, 9, 9);
		StdDraw.line(12, 10, 11, 9);
		StdDraw.line(10, 10, 11, 9);

	}
}