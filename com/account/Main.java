package com.account;
//import java.util.ArrayList;
//import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        Account account = new Account();
        Account.Card accountCard = new Account.Card();
        //System.out.println(user.getNationalID());
        boolean bankIsOpen = true;

        while(bankIsOpen){

            System.out.printf("_______You're welcome.________\n1. Open Accont\n2. Withdraw\n3. Deposit\n4. Change PIN\n5. Transfer money\n6. Exit\n");
            System.out.printf("Choose one item to proceed ...\n");
            int choice = input.nextInt();

            switch (choice){
                case 1:{
                    if(customer.getNationalID() == 0){

                        System.out.printf("Name:\n");
                        customer.setName(input.next());

                        System.out.printf("Family name:\n");
                        customer.setFamilyName(input.next());

                        System.out.printf("National ID:\n");
                        customer.setNationalID(input.nextLong());

                        System.out.printf("Phone Number:\n");
                        customer.setPhoneNumber(input.nextLong());

                        System.out.printf("Address:\n");
                        customer.setAddress(input.next());

                        System.out.printf("Email:\n");
                        customer.setEmail(input.next());

//                    ---------------------------------------
                        System.out.printf("Account Number:\n");
                        account.setAccountNumber(input.nextLong());

                        System.out.printf("Account type:\n");
                        account.setAccountType(AccountType.SAVINGD);

                        account.setOpeningDate(LocalDateTime.now());

                        System.out.printf("Balance:\n");
                        account.setBalance(input.nextLong());

//                    ----------------------------
                        System.out.printf("Card Number:\n");
                        accountCard.setCardNumber(input.next());


                        System.out.printf("CVV2:\n");
                        accountCard.setCvv2(input.nextInt());

                        System.out.printf("Expiray Date:\n");
                        accountCard.setExpiryDate(input.next());

                        System.out.printf("First PIN:\n");
                        accountCard.setFirstPIN(input.nextInt());

                        System.out.printf("Second PIN:\n");
                        accountCard.setSecondPIN(input.nextInt());

//                        System.out.println(account.getAccountNumber()+"      "+account.getBalance()+"      "+account.getOpeningDate()+"      "+account.getAccountType()+"      "+accountCard.getCardNumber()+"      "+accountCard.getCvv2()+"      "+accountCard.getExpiryDate()+"      "+accountCard.getFirstPIN()+"      "+accountCard.getSecondPIN());


                        account = new Account(account.getAccountNumber(), account.getBalance(), LocalDateTime.now(), account.getAccountType(), accountCard.getCardNumber(), accountCard.getCvv2(), accountCard.getExpiryDate(), accountCard.getFirstPIN(), accountCard.getSecondPIN());
                        customer.addAccount(account);

                    }//if(user.getNationalID() == 0)
                    else{

                        //System.out.println(customer.getName()+"      "+ customer.getFamilyName()+"      "+account.getAccountNumber()+"      "+account.getBalance()+"      "+account.getOpeningDate()+"      "+account.getAccountType()+"      "+accountCard.getCardNumber()+"      "+accountCard.getCvv2()+"      "+accountCard.getExpiryDate()+"      "+accountCard.getFirstPIN()+"      "+accountCard.getSecondPIN());
                        System.out.printf("%s %s with national ID %d alredy has %d accounts:\n", customer.getName(), customer.getFamilyName(), customer.getNationalID(), customer.numberOfAccounts());
                        customer.accountList();
                        System.out.println();
                        System.out.println("Would you like to open a new account?(Yes(Y) / No(N))");
                        String newAccountConfrim = input.next();
                        while (!(newAccountConfrim.charAt(0) =='y' || newAccountConfrim.charAt(0) == 'Y' || newAccountConfrim.charAt(0) == 'n' || newAccountConfrim.charAt(0) == 'N')){
                            System.out.println("Enter Yes(Y) / No(N) to proceed. Yes, to open account; No to exit.");
                            newAccountConfrim = input.next();
                        }
                        if(newAccountConfrim.charAt(0) =='y' || newAccountConfrim.charAt(0) == 'Y'){
                            System.out.printf("Account Number:\n");
                            account.setAccountNumber(input.nextLong());

                            System.out.printf("Account type:\n");
                            account.setAccountType(AccountType.SAVINGD);

                            account.setOpeningDate(LocalDateTime.now());

                            System.out.printf("Balance:\n");
                            account.setBalance(input.nextLong());

//                    ----------------------------
                            System.out.printf("Card Number:\n");
                            accountCard.setCardNumber(input.next());

                            System.out.printf("CVV2:\n");
                            accountCard.setCvv2(input.nextInt());

                            System.out.printf("Expiray Date:\n");
                            accountCard.setExpiryDate(input.next());

                            System.out.printf("First PIN:\n");
                            accountCard.setFirstPIN(input.nextInt());

                            System.out.printf("Second PIN:\n");
                            accountCard.setSecondPIN(input.nextInt());


                            account = new Account(account.getAccountNumber(), account.getBalance(), LocalDateTime.now(), account.getAccountType(), accountCard.getCardNumber(), accountCard.getCvv2(), accountCard.getExpiryDate(), accountCard.getFirstPIN(), accountCard.getSecondPIN());
                            customer.addAccount(account);

                        }//end of if(newAccount.charAt(0) =='y' || newAccount.charAt(0) == 'Y')

                    }//end of else

                }//case 1
                break;

                case 2:{

                }
                break;

                case 3:{

                }
                break;

                case 4:{

                }
                break;

                case 5:{

                }
                break;

                case 6:{
                    bankIsOpen =false;
                }
            }//end of switch
        }//end of while(bankIsOpen)
    }//end of main method
}//end of Main class