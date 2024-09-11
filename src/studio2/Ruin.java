package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner In = new Scanner(System.in);
		System.out.print("Enter value for starting money: ");
		double startAmount = In.nextDouble();
		double currentBalance = startAmount;
		System.out.print("Enter value for chance of winning: ");
		double winChance = In.nextDouble();
		System.out.print("Enter win limit: ");
		int winLimit = In.nextInt();
	
		System.out.println("Enter the number of total simulations");
		int totalSimulations = In.nextInt();
		
		int plays = 0;
		for(int i=0;i<totalSimulations;i++)
		{
			currentBalance=startAmount;
			System.out.println("Day "+(i+1));
			while(currentBalance<winLimit&&currentBalance>0) {
				if(Math.random()<=winChance) {
				currentBalance++;
				}
				else {
					currentBalance--;
				}
				plays++;
				
		    }
			System.out.println("Plays:"+plays);
			if(currentBalance<=0)
			{
				System.out.println(" (Day ended in ruin)");
			}
			else
			{
				System.out.println(" (Day ended in success)");
			}
		}
		
	
		
		
		
		
	}

}
