/**
 * MethodOverRiding.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign41;
/**
 * 
 * This class will illustrate the Method Overriding feature of Java.
 * @author Chhaya Yadav
 *
 */

// Declaring the MethodOverRiding child class 

public class MethodOverRiding extends MethodOverLoading{
	
// Overriding the displayAmount of parent class with public access specifier
	
public void displayAmount(int cash){
			
			
			System.out.println("************************************************");
			
			System.out.println("PAYMENT METHOD :CASH DEPOSIT OVERRIDDEN ! ");
				
		    System.out.println("CASH DEPOSIT AMOUNT :" + cash);
}

//Overriding the displayAmount of parent class with protected access specifier

public void displayAmount(String cheque, int cash){
			
			
			System.out.println("************************************************");
			
			System.out.println("PAYMENT METHOD : CHEQUE DEPOSIT OVERRIDDEN  !! ");
			
		    System.out.println("CASH DEPOSIT IN CHEQUE :" + cash);
}

//Overriding the displayAmount of parent class with default access specifier

public void displayAmount(float change){

		 	 System.out.println("************************************************");
		 	
		     System.out.println("PAYMENT METHOD : CHANGE IN CASH OVERRIDDEN !!! ");
		     
		     System.out.println("CHANGE IN DEPOSIT  :" + change);
}


}
