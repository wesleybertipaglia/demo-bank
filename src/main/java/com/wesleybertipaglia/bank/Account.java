package com.wesleybertipaglia.bank;

import java.util.UUID;

public class Account implements IAccount {

    private static final int AGENCY_DEFAULT = 1;
    private static final int NUMBER_DEFAULT = 1;

    private UUID id;
    private int agency;
    private int number;
    private double balance;
    private Client client;

    public Account(Client client) {
        this.id = UUID.randomUUID();
        this.agency = AGENCY_DEFAULT;
        this.number = NUMBER_DEFAULT;
        this.balance = 0;
        this.client = client;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void transfer(Account account, double value) {
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public void statement() {
        System.out.println("-".repeat(50));
        System.out.println("Account Statement");
        System.out.println("Account ID: " + this.id);
        System.out.println("Agency: " + this.agency);
        System.out.println("Number: " + this.number);
        System.out.println("Client: " + this.client.getName());
        System.out.println("-".repeat(50));
        System.out.println("Balance: " + this.balance);
        System.out.println("-".repeat(50));
    }

    public static int getAgencyDefault() {
        return AGENCY_DEFAULT;
    }

    public static int getNumberDefault() {
        return NUMBER_DEFAULT;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
