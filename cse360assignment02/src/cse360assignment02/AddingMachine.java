/**
 * CSE 360 
 * Assignment 1 
 * @version 2.0 
 * @author Xiang Luo <xluo55@asu.edu> 
 */ 
package cse360assignment02; 

/**
 * This is the AddingMachine class. 
 */ 
public class AddingMachine {
	  private int total;
	  private String transactionHistory = "0";
	  
	  /**
	   * This is a constructor. 
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * This method return the current total. 
	   * @return the current total 
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * This method adds the parameter to the total variable. 
	   * @param value This is an integer adds to the total variable.
	   */ 
	  public void add (int value) {
		  total = total + value;
		  transactionHistory += " + " + value; 
	  }
	  
	  /**
	   * This method subtracts the parameter from the total variable. 
	   * @param value This is an integer subtracts from the total variable.
	   */ 
	  public void subtract (int value) {
		  total = total - value;
		  transactionHistory += " - " + value; 

	  }
	  
	  /**
	   * This method returns the history of transactions. 
	   * @return history of transactions 
	   */
	  public String toString () {
	    return transactionHistory;
	  }
	  
	  /**
	   * This method clear AddingMachine.
	   */ 
	  public void clear() {
		  total = 0;
		  transactionHistory = "0";
	  }
	}