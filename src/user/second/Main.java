package user.second;

import user.first.Number;

public class Main {
	public static void main(String[] args) 
	{
		final Number num= new Number(Math.random());
		//System.out.println(num.getNumber());
		
		
		boolean watcher=false;
		int counter=1;
		while(!watcher)
		{
			double tempNum=Math.random();
			System.out.println(tempNum);
			if(num.isInThresold(tempNum))
			{
				watcher=true;
			}
			counter++;
		}
		System.out.println(counter);
		
	}

}
