package pack.controller;

import pack.model.Backpack;
import pack.view.TwoDFrame;

public class TwoDController 
{
	private TwoDFrame baseFrame;
	private Backpack [][] myBackpacks;
	
	public TwoDController()
	{
		myBackpacks = new Backpack[3][3];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myBackpacks.length; row++)
		{
			for(int col = 0col < myBackpacks[0].length; col++)
			{
				myBackpacks[row][col].setNumberOfPockets(col + 5);
			}
			else
			{
				Backpacks[row][col].setBackpackColor(Color.CYAN);
			}
		}
	}
	
	public Backpack [][] getMyBackpacks()
	{
		return myBackpacks;
	}
}
