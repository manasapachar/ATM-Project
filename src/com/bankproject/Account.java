package com.bankproject;

public class Account extends BankTransaction{
	
	AccountHolder accountHolder;
	int accountNumber;
	int pinNumber;
	int balanceAmount;
	//BankTransaction bankTransactions;
	public Account(AccountHolder accountHolder, int accountNumber, int pinNumber, int balanceAmount) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
		this.balanceAmount = balanceAmount;
	}

}
