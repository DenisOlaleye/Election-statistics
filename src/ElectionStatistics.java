/*Write a program that accepts the names of three political parties and the number
of votes each received in the last mayoral election. Display the percentage of the
vote each party received. Save the program as ElectionStatistics.java.*/

import java.util.Scanner;

public class ElectionStatistics 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter name of first party >> ");
		String party1 = input.nextLine();
		System.out.println("Enter name of second party >> ");
		String party2 = input.nextLine();
		System.out.println("Enter name of third part >> ");
		String party3 = input.nextLine();
		
		System.out.println("Enter number of votes for " +party1+ " >> ");
		int votes1 = input.nextInt();
		System.out.println("Enter number of votes for " +party2+ " >> ");
		int votes2 = input.nextInt();
		System.out.println("Enter number of votes for " +party3+ " >> ");
		int votes3 = input.nextInt();
		
		int totalVotes = votes1+votes2+votes3;
		
		float percVotes1 = votes1*100/totalVotes;
		float percVotes2 = votes2*100/totalVotes;
		float percVotes3 = votes3*100/totalVotes;
		
		System.out.println("In the last mayoral election " +party1+ " get "
				+percVotes1+ "% of votes, " +party2+ " get "
						+percVotes2+ "% of votes and "  +party3+ " get "
								+percVotes3+ "% of votes.");
		
	}

}
