package pathfind;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Node extends JButton implements ActionListener
{
	Node parent;
	int row,col,gcost,hcost,fcost;
	boolean start,goal,obstacle,walkable,checked;
	
	public Node(int row,int col)
	{
		this.row=row;
		this.col=col;
		
		setBackground(Color.WHITE);
		setForeground(Color.red);
		addActionListener(this);
	}
	//start node
	public void setAsStart()
	{
		setBackground(Color.blue);
		setForeground(Color.white);
		setText("Start");
		start=true;
	}
	//goal node
	public void setAsGoal()
	{
		setBackground(Color.yellow);
		setForeground(Color.black);
		setText("Goal");
		goal=true;
	}
	
	public void setAsObstacle()
	{
		setBackground(Color.black);
		setForeground(Color.black);
		obstacle=true;
	}
	
	public void setAsWalkable()
	{
		walkable=true;
	}
	
	public void setAsChecked()
	{
		if(start==false && goal==false)
		{
			setBackground(Color.orange);
			setForeground(Color.black);
		}
		checked=true;
	}
	
	public void setAsPath()
	{
		setBackground(Color.green);
		setForeground(Color.black);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		setBackground(Color.ORANGE);
		
	}

}
