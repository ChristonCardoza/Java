package christu.deadman.springtutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("Humanheart")
	private Heart heart;

////	@Autowired
////	@Qualifier("Humanheart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}
//	
//	
////	public Human(Heart heart) {
////		this.heart = heart;
////	}
//	
	public void startPumping() {
		
		 if( heart == null){
			 System.out.println("You are Dead!!!");
		 }
		 else {
			 heart.pump();
		 }
	}



}
