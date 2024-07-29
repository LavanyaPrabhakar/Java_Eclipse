package practicalprograms;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		String player1Move;
		String computerMove=null;
		int player2Computer;
		int n=3;
		Scanner scan = new Scanner(System.in);
		Random random = new Random(n);
		int player1Count=0;
		int computerCount=0;
		for(int i=0; i<n; i++)
		{
		 System.out.println("Enter user input: ");
		 player1Move=scan.nextLine();
	//	 scan.nextLine();
		 player2Computer=random.nextInt(n);
		 System.out.println("User input: "+player1Move);
		 System.out.println("Display computer input: "+player2Computer);

			if (player2Computer==0)
			{
			computerMove="Rock";
			System.out.println(computerMove);
			}
			else if (player2Computer==1)
			{
			computerMove="Paper";
			System.out.println(computerMove);
			}
			else if (player2Computer==2)
			{
			computerMove="Scissors";
			System.out.println(computerMove);
			}

			if (player1Move.equals(computerMove))
			{
			System.out.println("Draw");
			}
					
			else if ((player1Move.equals("Rock") && computerMove.equals("Paper"))||
					(player1Move.equals("Paper") && computerMove.equals("Scissors")) ||
					(player1Move.equals("Scissors") && computerMove.equals("Rock")))
			{
			System.out.println("print computer wins this time");
			computerCount++;
			}
			
			
			else if ((player1Move.equals("Paper") && computerMove.equals("Rock")) ||
					(player1Move.equals("Scissors") && computerMove.equals("Paper")) ||
					(player1Move.equals("Rock") && computerMove.equals("Scissors")))
			{
			System.out.println("print player1 wins this time");
			player1Count++;
			}
	
		System.out.println("player1Count "+player1Count);
		System.out.println("computerCount "+computerCount);
		}
		if(player1Count== computerCount)
		{
		System.out.println("The game is Draw");
		}
		else if(computerCount > player1Count)
		{
		System.out.println("computer is the winner");
		}
		else if(player1Count > computerCount)
		{
		System.out.println("player1 is the winner");
		}
	}

}
