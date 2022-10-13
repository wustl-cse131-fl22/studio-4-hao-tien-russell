package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
		boolean filled = in.nextBoolean();
		
		if (shape.equals("rectangle")) {
			if (filled) {
				StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (!filled) {
				StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		
		if (shape.equals("triangle")) {
			if (filled) {
				double[] xCoor = new double[3];
				double[] yCoor = new double[3];
				for (int i=0; i<3; i++) {
					xCoor[i] = in.nextDouble();
					yCoor[i] = in.nextDouble();
				}
				StdDraw.filledPolygon(xCoor, yCoor);
			}
			else if (!filled) {
				double[] xCoor = new double[3];
				double[] yCoor = new double[3];
				for (int i=0; i<3; i++) {
					xCoor[i] = in.nextDouble();
					yCoor[i] = in.nextDouble();
				}
				StdDraw.polygon(xCoor, yCoor);
			}
		}
		
		if (shape.equals("ellipse")) {
			if (filled) {
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else if (!filled) {
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		
		
	}
}
