package pack.view;

import pack.controller.TwoDController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentBackpackLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable backpackTable;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(20);
		
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**]
	 * Helper method to load information from the model into the GUI as a 2D array.
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyBackpacks(), columnHeaders);
		backpackTable = new JTable(tableModel);
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 18, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -29, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -17, SpringLayout.NORTH, currentBackpackLabel);
		baseLayout.putConstraint(SpringLayout.WEST, currentBackpackLabel, 0, SpringLayout.WEST, editField);
		baseLayout.putConstraint(SpringLayout.SOUTH, currentBackpackLabel, -23, SpringLayout.NORTH, editField);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 97, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, editField);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -6, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, changeButton);
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(backpackTable);
		currentBackpackLabel = new JLabel("the current backpack");
		this.add(currentBackpackLabel);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.setBackground(Color.MAGENTA);
		changeButton = new JButton("Change the indicated backpack");
		this.add(changeButton);
		displayButton = new JButton("Display the indicated backpack");
		this.add(displayButton);
	}
	
	
}
