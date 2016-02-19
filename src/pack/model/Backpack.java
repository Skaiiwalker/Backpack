package pack.model;

import java.awt.Color;

public class Backpack 
{
	private int numberOfPockets;
	private Color backpackColor;
	
	public Backpack()
	{
		
	}
	
	public Backpack(int numberOfPockets, Color backpackColor)
	{
		
	}
	
	public int getNumberOfPockets()
	{
		return numberOfPockets;
	}
	
	public void setNumberOfPockets(int numberOfPockets)
	{
		
	}
	
	public Color getBackpackColor()
	{
		return backpackColor;
	}
	
	public void setBackpackColor(Color backpackColor)
	{
		
	}
	
	public String toString()
	{
		String backpackDescription = "This backpack has" + numberOfPockets + "pockets";
		return backpackDescription;
	}
	
}
