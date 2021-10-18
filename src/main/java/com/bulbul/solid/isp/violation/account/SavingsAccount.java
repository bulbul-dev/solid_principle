package com.bulbul.solid.isp.violation.account;

public interface SavingsAccount {
    public double getBalance();

    public void creditLocalAmount(double amountInBDT);

    public void creditInternationalAmount(double amountInUSD);
}
