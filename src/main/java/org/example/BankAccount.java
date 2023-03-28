package org.example;

import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;

    //constructor
    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDateOfBirth){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 0;

    }
// setter and getter

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
////    Setters
//    Withdrawal Setter
  public void withdraw(int withdrawalAmount){
        this.balance = (this.balance - withdrawalAmount);

    }

//    Deposit Setter
  public void deposit(int depositAmount){
       this.balance = (this.balance + depositAmount);
  }

//  Account Number Setter
  public void setAccountNumber(int accountNumber1){
        this.accountNumber = (this.accountNumber + accountNumber1);
  }

//    this class code should be totally generic
}
