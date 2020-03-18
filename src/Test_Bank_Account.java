
public class Test_Bank_Account {

	public static void main(String[] args) {
		Bank_Account b1 = new Bank_Account(000012345,"suren",1000);
		b1.withdraw(400);
		b1.blanceCheck();
		b1.deposite(2000);
		b1.blanceCheck();
		b1.withdraw(4000);
		

	}

}
