package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	double[] x = {0.3,0.3,0.5};
	double[] y = {0.6,0.4,0.5};
		
	StdDraw.setPenColor(103,221,255);
	StdDraw.filledRectangle(0.5, 0.5, 2.5/6, 1.5/6);
	StdDraw.setPenColor(250,128,114);
	StdDraw.filledEllipse(0.5, 0.5, 0.15, 0.085);
	StdDraw.filledPolygon(x, y);
	StdDraw.setPenColor(0,0,0);
	StdDraw.filledCircle(0.61, 0.52, .01);
	StdDraw.arc(0.63, 0.52, 0.05, 250, 282);
	StdDraw.setPenColor(255,255,255);
	StdDraw.circle(0.2, 0.4, 0.1);
	StdDraw.circle(0.3, 0.7, 0.1);
	StdDraw.circle(0.7, 0.3, 0.1);
	StdDraw.circle(0.6, 0.7, 0.1);
	StdDraw.circle(0.8, 0.4, 0.1);
	StdDraw.setPenColor(0,0,0);
	StdDraw.rectangle(0.5, 0.5, 2.5/6, 1.5/6);
		
	}
}