package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    public Integer deposit(int amount) {
        balance += amount;
        return balance;
    }

    public Integer withdraw(int amount) {
        balance -= amount;
        return balance;
    }
}
