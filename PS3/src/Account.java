
import java.util.Date;

/* Lucia Malvoni, PS3
 * A class named Account with the following variables:
 * Balance= Balance for account
 * annualInterestRate= current annual interest rate 
 * dateCreated= the date when the account was created
 */

public class Account {
	private int ID;
	private double Balance; 
	private double annualInterestRate; 
	private Date dateCreated; 
	

	public static void main(String[] args) {
		java.util.Date dateCreated = new java.util.Date();
		
	}
	/* This is the no-arg constructor. */
	Account () {
		ID = 0;
		Balance = 0.0;
		annualInterestRate = 0.0;
	}
	/* This is the constructor with the specific id 
	 * and initial balance */
	Account(int ID, double Balance) {
		this.ID = ID;
		this.Balance = Balance;
	}
	Account(int ID, double Balance, double annualInterestRate) {
		this.ID = ID;
		this.Balance = Balance;
		this.annualInterestRate = annualInterestRate;
	}
	/* These are the accessor and mutator methods for ID, 
	 * Balance, and annualInterestRate */
	public int getID() {
		return ID;
	}
	public double getBalance() {
		return Balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	public void setID(int newID) {
		ID = newID;
	}
	public void setBalance(double newBalance) {
		Balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	/* This is the accessor method for dateCreated. */
	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}
	/* This is the getMonthlyInterestRate method. */
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	/* This is the withdraw method. */
	double withdraw(double amount) {
		return Balance -= amount;
	}   
	/* This is the deposit method. */
	double deposit(double amount) {
		return Balance += amount;   
	}
}

