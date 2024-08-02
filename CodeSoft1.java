import java.util.*;
class CodeSoft1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int chances=8;
		int finals=0;
		boolean playAgain=true;
		System.out.println("Welcome Buddy!!");
		System.out.print("Hey buddy you have about "+chances+" chances to win the game. ");
		System.out.println();
		while(playAgain)
		{
			int random=getRandNo(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++)
			{
				System.out.print("Chance "+ (i+1) +" Enter your guess : ");
				int user=sc.nextInt();
				if(user==random)
				{
					guess=true;
					finals+=1;
					System.out.println("You won it");
					break;
				}
				else if(user>random)
				{
					System.out.println("Your guess is TOO HIGH");
				}
				else {
					System.out.println("Your guess is TOO LOW");
				}
			}
			if(guess==false)
			{
				System.out.println("Sorry buddy you lost the chance the number is "+random);
			}
			System.out.println("Do you want to play again(yes/no)");
			String pA=sc.next();
			playAgain=pA.equalsIgnoreCase("yes");
		}
		System.out.println("That's it buddy,hope you enjoyed it.");
		System.out.println("Here is your score is : "+finals);
	}
	public static int getRandNo(int min,int max)
		{
			return(int)(Math.random()*(max-min+1)+min);

		}
}