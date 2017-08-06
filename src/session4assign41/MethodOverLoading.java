/**
 * MethodOverloading.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign41;
/**
 * 
 * This class will illustrate the Method OverLoading feature of Java.
 * @author Chhaya Yadav
 *
 */
public class MethodOverLoading {
	
// Instance Variable Declaration 	
	
	public double grossAmount ;
	
	public int cash ;
	
	public String cheque ;
	
	public float change ;
	
//Default Constructor declaration	
	
public 	MethodOverLoading(){
	
  grossAmount = 0 ;
  
  cash        = 0 ;
  
  change      = 0;
 
}


// Cash deposit method with PUBLIC Access Specifier

public void displayAmount(int cash){
	
	this.cash = cash ;
	
	this.grossAmount = this.grossAmount + this.cash ;
	
	System.out.println("************************************************");
	
	System.out.println("PAYMENT METHOD :CASH DEPOSIT");
	
	System.out.println("CASH DEPOSIT :"+ this.cash);
	
    System.out.println("Total Amount in ACCOUNT :" + this.grossAmount);
}

// Cheque Deposit with Protected Access Specifier

protected void displayAmount(String cheque, int cash){
	
	this.cheque = cheque ;
	
	this.cash = cash ;
	
	this.grossAmount = this.grossAmount + this.cash ;
	
	System.out.println("************************************************");
	
	System.out.println("PAYMENT METHOD : CHEQUE DEPOSIT");
	
	System.out.println("CASH DEPOSIT :"+ cash);
	
	System.out.println("CHEQUE NUMBER : "+ cheque);
	
    System.out.println("Total Amount in ACCOUNT :" + this.grossAmount);
}
	
// Deposit in form of Change with Default Access Specifier

void displayAmount(float change){
     
	 this.change = change ; 
	 
     this.grossAmount = this.grossAmount + this.change ;

 	 System.out.println("************************************************");
 	
     System.out.println("PAYMENT METHID : CHANGE IN CASH");
     
     System.out.println("Total Amount in ACCOUNT :" + this.grossAmount);
}



}


