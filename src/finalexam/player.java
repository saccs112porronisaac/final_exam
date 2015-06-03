package finalexam;
 public class player {

	public int hand(){
			
		int firsthand;
		int secondhand;
		int playercardvalue; 
		
		
		firsthand= 1+ (int)(Math.random()*11);
		secondhand = 1+ (int)(Math.random()*11);
		
				playercardvalue = firsthand + secondhand; 
		
		return playercardvalue; 
		
	}
	
	//public String  hit( ){
		
		//player hand = new player(); 
		
		// String hit = 1 + (int)(Math.random()*11) + "hand";
		 
	
		//return hit ;
	//
	//}
	
	
	
	
	
	
}
