
public class AccountTest  {

	public static void main(String[] args) throws InsufficientFundsException{
	
		Account AccountMain = new Account(1122, 20000, 0.045);

		AccountMain.setID(1122);
		AccountMain.setBalance(20000);
		AccountMain.setAnnualInterestRate(0.045);

		System.out.println ("The account ID is: " +  AccountMain.getID());
		System.out.println ("The account balance is: " +  AccountMain.getBalance());
		System.out.println("The annual interest rate is: " +  AccountMain.getAnnualInterestRate());
        AccountMain.withdraw(2500);
        System.out.println("The account balance after withdraw is: " + AccountMain.getBalance());
		AccountMain.deposit(3000);
		System.out.println("The account balance after deposit is: " + AccountMain.getBalance());
		System.out.println ("The monthly interest earned is: " +  AccountMain.getBalance() *  AccountMain.getAnnualInterestRate());
		System.out.println ("The account was created on: " +  AccountMain.getdateCreated());
		System.out.println ("Transactions Complete!");
	
	}
}

	
