import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        for (;;) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: ");
                int amount = sc.nextInt();
                account.withdraw(amount);

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                int amount = sc.nextInt();
                account.deposit(amount);

            } else if (choice == 3) {
                account.checkBalance();

            } else if (choice == 4) {
                System.out.println("Thank you for using ATM.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
