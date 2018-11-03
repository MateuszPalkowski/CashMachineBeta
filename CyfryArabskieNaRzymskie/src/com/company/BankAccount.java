package com.company;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;


    public void setAccountNumber(long accountNumber) {

        long WrongAccountNumber = accountNumber;

        if (WrongAccountNumber == 552335235l) {

            System.out.println("Account number is correct " + accountNumber);
        } else {
            System.out.println("Wrong account number");
            System.exit(1);

        }
        this.accountNumber = accountNumber;

    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setEmail(String email){

        String WrongEmailAdress = email;

        if (WrongEmailAdress == email){
        System.out.println("Email is correct " + email);
    } else {
            System.out.println("Wrong email adres");
            System.exit(1);

        }
        this.email = email;



    }
    public String getEmail (){
        return this.email;
    }

    public void setBalance(long balance) {
        this.balance = balance / 100;
        System.out.println("Actual balance is: " + balance + "Złotych");

        Scanner scanner = new Scanner(System.in);
        System.out.println("If u want to add money press " + "5");
        System.out.println("If u want to windrow money press " + "7");
        int pressFive = scanner.nextInt();
        if (pressFive == 5) {
            System.out.println("How much u want add? ");
            int addMoney = scanner.nextInt();

            System.out.println("Thank, now your account value is: " + (balance + addMoney) + "złotych");

        }else if (pressFive == 7){
            scanner.nextLine();
            System.out.println("How much u want to windrow?");
            System.out.println("Type number of złotych");
            long windrow = scanner.nextInt();

            if (windrow > balance ){
                System.out.println("You have not enough money ");
            }

            else {
               long valueAfterWindrow =  balance - windrow;
                System.out.println("Take money");
                System.out.println("Your current account value is: " + valueAfterWindrow);
                System.out.println("Thank you and have nice day ");
            }


        }

        else {
            System.out.println("Good Bye dear client");

        }

        scanner.close();


    }


    public long getBalance() {
        return this.balance;
    }

    public void setCustomerName (String customerName){
        this.customerName = customerName;


    }

    public String getCustomerName() {
        return this.customerName;

    }
}


