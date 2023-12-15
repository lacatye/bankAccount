package entities;

public class Account {

	private String holderAccount;
	private int number;
	private double balance;
	
	public Account(String holderAccount, int number) {
		this.holderAccount = holderAccount;
		this.number = number;
	}

	public Account(String holderAccount, int number, double initialDeposit) {
		this.holderAccount = holderAccount;
		this.number = number;
		deposit(initialDeposit);
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount - 5.0;
	}
	
	public String toString() {
		return "Account "
						+ number
						+", Holder: "
						+ holderAccount
						+ ", Balance: $ "
						+ String.format("%.2f", balance);
	}
}
