/**
 * MainClass.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign41;
/**
 * 
 * This Mainclass will illustrate the implementation of Method Overriding and Method Overriding features via MethodOverLoading.java & MethodOverRiding.java
 * and will instantiate their objects respectively.
 * @author Chhaya Yadav
 *
 */
public class MainClass {

// Declaration of main method for object instantiation
	
public static void main(String[] args) {
		
//Instantiation of the object of MethodOverLoading class
	
		MethodOverLoading  m1 = new MethodOverLoading();
		
//Implementation of Method Overloading  in Java		
		
		m1.displayAmount(100001);
		
		m1.displayAmount(500.5f);
		
		m1.displayAmount("C3007",5000);

//Instantiation of the object of MethodOverRiding class	
		
		MethodOverRiding m2 = new MethodOverRiding();
		
//Implementation of Method OverRiding  in Java	
		
		m2.displayAmount(22222);
		
		m2.displayAmount(666.95f);
		
		m2.displayAmount("D7003",9965);

		
	}
}
