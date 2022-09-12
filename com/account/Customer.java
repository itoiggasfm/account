package com.account;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String familyName;
    private long nationalID;
    private long phoneNumber;
    private String address;
    private String email;


    public Customer(){
    }


    public Customer(String name, String familyName, long nationalID, long phoneNumber, String address, String email){
        this.name = name;
        this.familyName = familyName;
        this.nationalID = nationalID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    private final ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public int numberOfAccounts(){
        return accounts.size();
    }


    public void accountList(){
        for(Account account: accounts){
            System.out.printf("\nAccount number: %d, Balance: %d, Opening Date: %tF %n Account type: %s\n", account.getAccountNumber(), account.getBalance(), account.getOpeningDate(), account.getAccountType());
        }
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public long getNationalID(){
        return nationalID;
    }

    public int getNumberOfAccouts(){
        return accounts.size();
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}