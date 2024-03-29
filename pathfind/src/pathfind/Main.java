package pathfind;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Main 
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setTitle("Path Finding AI");
		//Setting logo
	    ImageIcon image=new ImageIcon("gallery.jpg");
		frame.setIconImage(image.getImage());
		frame.add(new demopanel());
		frame.pack();
		//To set frame at center
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
