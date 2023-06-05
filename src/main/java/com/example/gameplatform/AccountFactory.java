package com.example.gameplatform;

public class AccountFactory {
    public Account createAccount(String accountType) {
        if (accountType.equalsIgnoreCase("savings")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("checking")) {
            return new CheckingAccount();
        }
        return null;
    }
}