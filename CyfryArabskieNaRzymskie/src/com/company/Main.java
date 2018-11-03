package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount mBank00342 = new BankAccount();
        mBank00342.setAccountNumber(552335235l);
        mBank00342.setBalance(1000/100);
        mBank00342.setCustomerName("Tom Redneck");
        mBank00342.setEmail("tomredneck@gmail.com");
        System.out.println("email =" + mBank00342.getEmail());



    }
}
