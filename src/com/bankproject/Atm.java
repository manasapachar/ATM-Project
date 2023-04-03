package com.bankproject;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		AccountHolder a1 = new AccountHolder("fred", "mercury" , "India", 34, 1234);
		AccountHolder a2 = new AccountHolder("tom", "cruise" , "USA", 23, 2545);
		AccountHolder a3 = new AccountHolder("mk", "gandhi" , "India", 55, 9090);
		AccountHolder a4 = new AccountHolder("sachin", "dravid" , "Bangaldesh", 30, 8989);
		
		Account acc1 = new Account(a1, 123, 121, 50000);
		Account acc2 = new Account(a2, 234, 101, 1000);
		Account acc3 = new Account(a3, 345, 323, 25000);
		Account acc4 = new Account(a4, 456, 444, 4356);
		
		System.out.println("Enter the bank transaction you want to do"
				+ "1: Deposit"
				+ "2: Withdraw"
				+ "3: Transfer"
				+ "4: Quit");
		
		
		Scanner in = new Scanner(System.in);
 
        int a = in.nextInt();
        switch(a) {
        
        case 1: System.out.println("Deposit Transaction Selected"
        		+ "Please enter Account Number you want to deposit to");
        
        		int accNum = in.nextInt();
        		
        		System.out.println("Enter amount you want to deposit");
        		
        		int amt = in.nextInt();
        		
        }

	}

}
