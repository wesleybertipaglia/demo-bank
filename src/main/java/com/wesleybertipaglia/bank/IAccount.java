package com.wesleybertipaglia.bank;

public interface IAccount {

    void deposit(double value);

    void withdraw(double value);

    void transfer(Account account, double value);

    void statement();
}
