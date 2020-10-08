/**
 * This assignment is used to practice using git.
 * The class functions simulate a calculator.
 * 
 * Name: Shawn de Jesus
 * Class: CSE 360
 * Assignment: 02
 */
package cse360assignment02;

public class AddingMachine {
	
	private int total;
	private String history;
	
	public AddingMachine () {
    this.total = 0;  
    this.history = "0";
  }
	  
  public int getTotal () {
	  /**
	   * Returns the calculated total.
	   */
    return this.total;
  }
  
  public void add (int value) {
	  /**
	   * Records the addition to history.
	   * Performs addition to manipulate current total.
	   */
	  this.history = this.history +  " + " + Integer.toString(value);
	  
	  this.total = this.total + value;
  }

  public void subtract (int value) {
	  /**
	   * Records the subtraction to history.
	   * Performs subtraction to manipulate current total.
	   */
	  this.history = this.history + " - " + Integer.toString(value);
	  this.total = this.total - value;
  }

  public String toString () {
	  /**
	   * returns the saved history of actions performed.
	   */
    return this.history;
  }

  public void clear() {
	  /**
	   * Wipes previous actions.
	   * Resets data.
	   */
	  this.total = 0;
	  this.history = "0";
  }
}