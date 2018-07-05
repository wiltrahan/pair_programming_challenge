package pair_programming_challenge;

public class Transaction extends BankAccount {
	
	double transactionAmount;

	public Transaction(String name, int acctNumber, String branchLocation, double totalBalance, double transactionAmount) {
		super(name, acctNumber, branchLocation, totalBalance);
		this.transactionAmount = transactionAmount;
	}

	public double getAmount() {
		return transactionAmount;
	}

	public void setAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	public void theTransaction(double amount, String transactionType) {
		if(transactionType == "withdraw") {
			double withdraw = getTotalBalance() - amount;
			applyTransaction(withdraw);
		} else if(transactionType == "deposit") {
			double deposit = getTotalBalance() + amount;
			applyTransaction(deposit);
		}
	}

}
