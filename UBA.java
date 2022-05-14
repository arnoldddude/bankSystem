
package bankingapplication;

import java.util.Scanner;
public class UBA {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        
        System.out.println("Enter your Customer ID: ");
        String ID = scanner.next();
        
        Account newgate = new Account(name, ID);
        newgate.showMenu();
    }
    
}
