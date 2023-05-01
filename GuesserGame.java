import java.util.*;

public class GuesserGame {
	
	public static void main(String[] args) {
		Umpire c =new Umpire();
		c.collectFromGuesser();
		c.collectFromPlayers();
		c.compare();
		
	}
	
}
class Guesser{
	int guessNumber;
	int num;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Guesser Kindly guess a number between 1 to 10 ");
	    
	    guessNumber=scan.nextInt();
	    while(guessNumber<=10 || guessNumber>10 ) {
		    if(guessNumber>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNumber=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num=guessNumber;
		    break;}
	    }
		return num;
	}
}

class Player1{
	int guessNumber;
	int num1;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 1 Kindly guess a number");
	    guessNumber=scan.nextInt();
	    while(guessNumber<=10 || guessNumber>10 ) {
		    if(guessNumber>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNumber=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num1=guessNumber;
		    break;}
	    }
	    
	    return num1;
	}
}
class Player2{
	int guessNumber;
	int num2;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 2 Kindly guess a number");
	    guessNumber=scan.nextInt();
	    while(guessNumber<=10 || guessNumber>10 ) {
		    if(guessNumber>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNumber=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num2=guessNumber;
		    break;
		    }
	    }
	    return num2;
	}
}
class Player3{
	int guessNumber;
	int num3;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 3 Kindly guess a number");
	    guessNumber=scan.nextInt();
	    while(guessNumber<=10 || guessNumber>10 ) {
		    if(guessNumber>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNumber=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num3=guessNumber;
		    break;}
	    }
	    return num3;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser= g.guessNum();	
	}
	void collectFromPlayers() {
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare() {
		if (numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				System.out.println("All Players Won the Game");
			else if (numFromGuesser==numFromPlayer2)
				System.out.println("player1 and player2 Won the Game");
			else if (numFromGuesser==numFromPlayer3)
				System.out.println("player1 and player3 Won the Game");
			else
			    System.out.println("Player1 Won the Game");
			}
		else if (numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
				System.out.println("player 2 and player 3 wins");
			else
			    System.out.println("Player2 Won the Game");
			}
		else if (numFromGuesser==numFromPlayer3)
			
			System.out.println("Player3 Won the Game");
		else 
			
			System.out.println("You Lost Try Again!");
	}
}

