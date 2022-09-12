package com.account;

import java.time.LocalDateTime;

public class Account {
    private long accountNumber;
    private long balance;
    private LocalDateTime openingDate;
    private AccountType accountType;




    public Account(){}

    Card card = new Card();

    public Account(long accountNumber, long balance, LocalDateTime openingDate, AccountType accountType, String cardNumber, int cvv2, String expiryDate, int firstPIN, int secondPIN) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;
        this.accountType = accountType;
        card.cardNumber= cardNumber;
        card.cvv2 = cvv2;
        card.expiryDate = expiryDate;
        card.firstPIN = firstPIN;
        card.secondPIN = secondPIN;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


    public void withdraw(long withdrawal){
        if(withdrawal <= balance)
            balance = balance - withdrawal;
        System.out.println("New balance is: "+ balance);
    }

    public void deposit(long deposit){
            balance = balance + deposit;
        System.out.println("New balance is: "+ balance);
    }
    public static class Card{
        private String cardNumber;
        int cvv2;
        private String expiryDate;
        private int firstPIN;
        private int secondPIN;

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCvv2(int cvv2) {
            this.cvv2 = cvv2;
        }

        public int getCvv2(){
            return cvv2;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setFirstPIN(int firstPIN) {
            this.firstPIN = firstPIN;
        }

        public int getFirstPIN() {
            return firstPIN;
        }

        public void setSecondPIN(int secondPIN) {
            this.secondPIN = secondPIN;
        }

        public int getSecondPIN() {
            return secondPIN;
        }


    }//enf of inner class Card
}
