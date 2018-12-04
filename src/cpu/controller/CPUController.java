package cpu.controller;

import cpu.model.CPU;
import javax.swing.JOptionPane;
//import java.util.ArrayList;

public class CPUController
{
	private CPU userCPU;
	
	public CPUController()
	{
		userCPU = new CPU();
	}
	
	public void start()
	{
		String userInput = JOptionPane.showInputDialog(null, "What is the clock speed of your CPU in GHz?");
		double clockSpeed = -99.99;
		if (validDouble(userInput))
		{
			clockSpeed = Double.parseDouble(userInput);
		}
		userCPU.setClockSpeed(clockSpeed);
		
		userInput = JOptionPane.showInputDialog(null, "What architecture is your CPU?");
		userCPU.setArchitecture(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "How many cores does the CPU have?");
		int core = -1;
		if (validInt(userInput))
		{
			core = Integer.parseInt(userInput);
		}
		userCPU.setCore(core);
		
		if(core > 3 && clockSpeed > 2.99)
		{
			JOptionPane.showMessageDialog(null, "That is a good buy!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "That is a bad buy!");
		}
		//arrayInit();
	}
	
	/*private void arrayInit()
	{
		for (int index = 0; index < CPU.length; index += 1)
		{
			if (index % 2 == 0)
			{
				CPU[index] = new myCPU();
			}
			else
			{
				CPU[index] = new myCPU(index * 15);
			}
		}
	}*/
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null,	"You need to type in a rational number");
		}
		return isValid;
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number!");
		}
		return isValid;
	}
}
