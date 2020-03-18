
public class Bank_Account {
	private long account_number;
	private String account_name;
	private double account_balance;
	
	
	public void deposite(double amt) {
		if(amt > 0) {
			account_balance = account_balance+amt;
			System.out.println("You deposit amount $"+amt);
		}else {
			System.out.println("you cannot depost $"+amt);
		}
		}
	
	public void withdraw(double amt) {
		if((amt > 0) && (amt < account_balance)) {
			
			account_balance = account_balance-amt;
			System.out.println("You draw amount $"+amt);
		}else {
			System.out.println("you cannot withdraw $"+amt);
		}
	
	}
	public void blanceCheck() {
		System.out.println("you current balance $"+account_balance);
	}
	//constructor 
	public Bank_Account(long account_number,String account_name,double account_balance) {
		this.account_number = account_number;
		this.account_name = account_name;
		this.account_balance = account_balance;
		
	}
	

}
