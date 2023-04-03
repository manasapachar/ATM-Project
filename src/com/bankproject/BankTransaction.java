package com.bankproject;

public class BankTransaction {
	
	//withdraw , deposit , transfer and quit
	
	public void withdraw(Account acc, int pin, int wAmount) {
		
		if(acc.pinNumber == pin) {
			if(acc.balanceAmount>= wAmount) {
				System.out.println("Withdrawing " + wAmount + "  amount from the account " );
				acc.balanceAmount-=wAmount;
				System.out.println("New balance in account ->" + acc + " = " + acc.balanceAmount);
			}
		}
		
	}
	
	public void deposit(Account acc, int pin, int dAmt) {
		
		if(acc.pinNumber == pin) {
			
				System.out.println("Depositing " + dAmt + "  into the account " );
				acc.balanceAmount+=dAmt;
				System.out.println("New balance in account ->" + acc + " = " + acc.balanceAmount);
		}
		
	}
	
	public void transfer(Account sourceAccount, Account destAccount, int enteredPin, int tAmt ) {
		if(sourceAccount.pinNumber == enteredPin) {
			if(sourceAccount.balanceAmount>= tAmt) {
				System.out.println("Transfering amount  " + tAmt + " into acount-> " + destAccount );
				sourceAccount.balanceAmount-= tAmt;
				destAccount.balanceAmount+= tAmt;
				System.out.println("New balance in account ->" + sourceAccount + " = " + sourceAccount.balanceAmount);
				System.out.println("New balance in account ->" + destAccount + " = " + destAccount.balanceAmount);
			}
		}
		
	}
	
	public void quit(Account aHolder) {
		
		
	}

}
