package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    public Integer deposit(int i) {
        balance += i;
        return balance;
    }

    public Integer withdraw(int i) {
        return balance;
    }
}
