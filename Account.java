
package bankingapplication;

import java.util.Scanner;

public class Account {
   
    double balance;
    double previousTransaction;
    String customerName;
    String customerID;
    
    Account(String cname, String cid){
        
        customerName = cname;
        customerID = cid;
    }
    
    
    void deposits(double amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
      }
    }
    
    void withdrawal(double amount){
        if(amount <= balance && amount != 0){
             balance = balance - amount;
             previousTransaction = -amount;
                
        }         
    }
    
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: " + previousTransaction);
        }
        else{
            System.out.println("No transactions made.");
        }
    }
    
    void calculateInterest(int years){
        double interestRate = 0.0033;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + interestRate);
        System.out.println("After " + years + " years, your balance would be $" + newBalance);
        
    }
    
    void showMenu(){
        char option = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transactions");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
        
            /*System.out.println();
            System.out.println("Enter your option: ");
            char options = input.next().charAt(0);
            option = Character.toUpperCase(option);*/
            
        while(option != 'F'){
             System.out.println();
            System.out.println("Enter your option: ");
            char options = input.next().charAt(0);
            option = Character.toUpperCase(options);
            
            if(option == 'A'){
                System.out.println("================================");
                System.out.println("Balance = $" + balance);
                System.out.println("================================");
                System.out.println();
            }
            else if(option == 'B'){
                System.out.println("Enter amount to deposit: ");
                double amount = input.nextDouble();
                deposits(amount);
                System.out.println();
        }
            else if(option == 'C'){
                System.out.println("Enter a withdrawal amount: ");
                double amount2 = input.nextDouble();
                withdrawal(amount2);
                
            }
            
            else if(option == 'D'){
                System.out.println("==============================");
                getPreviousTransaction();
                System.out.println("==============================");
                System.out.println();
            
            }
            else if(option == 'E'){
                System.out.println("How many years of interest have been accrued: ");
                int years = input.nextInt();
                calculateInterest(years);
                System.out.println();
            
            }
            else if(option == 'F'){
                System.out.println("=============================");
            }
            
            else{
                System.out.println("Error: option invalid. Enter A, B, C, D, E, or F");
            }
                System.out.println("Thank you for banking with us!");
        }
    }
}
