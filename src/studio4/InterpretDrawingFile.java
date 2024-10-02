package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {//ellipse 73 0 146 false 0.5 0.5 0.2 0.2

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = "";
		int r = 0;
		int g = 0;
		int b = 0;
		boolean filled = true;
		double x = 0;
		double y = 0;
		double halfwidth = 0;
		double halfheight = 0;
		
		while(in.hasNext())
		{
	
			if(in.hasNextInt())
			{
				r = in.nextInt();
				g = in.nextInt();
				b = in.nextInt();
			}
			if(in.hasNextBoolean())
			{
				filled = in.nextBoolean();
			}
			if(in.hasNextDouble())
			{
				x = in.nextDouble();
				y = in.nextDouble();
				halfwidth = in.nextDouble();
				halfheight = in.nextDouble();
			}
			else
			{
				shape = in.next();
			}
		}
		
		StdDraw.setPenColor(r,g,b);
		
		if(shape.equals("ellipse"))
		{
			if(filled)
			{	
			StdDraw.filledEllipse(x, y, halfwidth, halfheight);
			}
			else
			StdDraw.ellipse(x, y, halfwidth, halfheight);
		}
		
	}
}
