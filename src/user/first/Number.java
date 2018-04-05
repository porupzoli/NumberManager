package user.first;

public class Number {
	
	private double realnum;
	static double con=0.001;
	
	public Number(double realnum)
	{
		this.realnum=realnum;
	}

	public double getNumber() {
		return realnum;
	}

	public void setNumber(double realnum) {
		this.realnum = realnum;
	}
	
	public boolean isInThresold(double number)
	{
		if(Math.abs(realnum-number)==con)
		{
			return true;
		}
		return false;
	}
	

}
