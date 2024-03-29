package pathfind;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import pathfind.demopanel.PathNotFoundException;
public class keyhandler implements KeyListener
{
	demopanel dp;
	
	public keyhandler(demopanel dp)
	{
		this.dp=dp;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		// TODO Auto-generated method stub
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_ENTER)
		{
//			dp.search();
			try {
				dp.autoSearch();
			} catch (PathNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(code==KeyEvent.VK_SPACE)
		{
//			
			try {
				dp.search();
			} catch (PathNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
