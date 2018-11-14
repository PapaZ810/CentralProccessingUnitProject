package cpu.model;

public class CPU
{
	private String architecture; 
	private double clockSpeed;
	private int core;
	
	public CPU()
	{
		this.architecture = "tahiti";
		this.clockSpeed = -99.99;
		this.core = -1;
	}
	
	public CPU(String architecture, double clockSpeed, int core)
	{
		this.architecture = architecture;
		this.clockSpeed = clockSpeed;
		this.core = core;
	}
	public String getArchitecture()
	{
		return architecture;
	}
	public int getCore()
	{
		return core;
	}
	public double getClockSpeed()
	{
		return clockSpeed;
	}
	public void setClockSpeed(Double clockSpeed)
	{
		this.clockSpeed = clockSpeed;
	}
	public void setArchitecture(String architecture)
	{
		this.architecture = architecture;
	}
	public void setCore(int core)
	{
		this.core = core;
	}
}
