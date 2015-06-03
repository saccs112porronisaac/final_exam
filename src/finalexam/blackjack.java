package finalexam;

import java.util.Scanner; 


public class blackjack {
	
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);


		 String Answer = "YES" ;  


		 System.out.println("Do you want play a Blackjack game ");


		 if(Answer.equalsIgnoreCase("yes")){
			 
		 player hand1= new player(); 
		 System.out.print("Player hand value: " );
		 int playerhand = hand1.hand();
		 System.out.println( playerhand );

		 Dealer hand2= new Dealer(); 
		 System.out.print("Dealer hand value: " );
		 int dealerhand = hand2.hand();
		 System.out.println( dealerhand );
 
		 
		 String hit;
		 
		 do{
		 System.out.println("Do you want to hit, yes or no   ");
		 hit = input.nextLine();
		 if(hit.equalsIgnoreCase("yes"))
		 {
			 playerhand += hand1.hand();

			 System.out.print("Player hand value: " );
			 System.out.println( playerhand );
		 }
		 
		 }while (hit.equalsIgnoreCase("yes") && playerhand < 21);
		 

			

			 if ( playerhand > 21 )
			 {
				 System.out.println("you lose " );
				 
			 }
	
			 if ( dealerhand > 21 )
			 {
				 System.out.println("dealer lost " );
				 
			 }
			 
			 if ( playerhand <= 21 && playerhand > dealerhand)
			 {
				 System.out.println("you win " );
			 }
			 
			 if ( dealerhand <= 21 && playerhand < dealerhand)
			 {
				 System.out.println("dealer wins " );
			 }
			 
		System.out.println("Thank you for playing  "); 

}
}
	 } 
	
