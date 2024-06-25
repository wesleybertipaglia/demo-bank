package com.wesleybertipaglia.bank;

public class BankApplication {
	public static void main(String[] args) {
		Client me = new Client("Jhon", "jhon@mail.com", "+00 (00)00000-0000", "5 Avenue Street, 1029 - New York");
		Account myAccount = new Account(me);
		myAccount.deposit(10000);
		myAccount.withdraw(500);
		myAccount.statement();
	}
}
