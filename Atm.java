import java.util.Scanner;

public class Atm {

    int PASSCODE = 8900;
    String userid = "user_ABC";
    float bal = 20000;

    public void displayMenu() {
        while (true) {
            System.out.println(" ");
            System.out.println("   ATM INTERFACE   ");
            System.out.println("1. Check  Balance ");
            System.out.println("2. Withdraw cash ");
            System.out.println("3. Deposit cash");
            System.out.println("4. want to Exit?");
            System.out.println();
            System.out.print("Enter Your Choice : ");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            switch (opt) {
                case 1 -> getBalance();
                case 2 -> withdrawCash();
                case 3 -> depositCash();
                case 4 -> System.exit(0);
                default -> System.out.print("Enter a CORRECT choice");
            }

        }
    }
     public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your userID:");
        String id = scanner.nextLine();
        System.out.println("Enter your pin/passcode:");
        int enteredpin = scanner.nextInt();
        if ((id.equals(userid)) && (enteredpin == PASSCODE)) {
            System.out.println("You are now Logged In..");
            displayMenu();
        } else {
            System.out.println("Enter a valid Passcode!");
        }
    }

    public void getBalance() {
        System.out.println("Your Balance is :" + "Rs" + bal);
        displayMenu();
    }

    public void depositCash() {
        System.out.println("Enter deposit amount in Rs:");
        Scanner scanner = new Scanner(System.in);
        float amt = scanner.nextFloat();
        bal = bal + amt;
        System.out.printf("Amount Deposit was Success! Current balance is %f", bal);
    }
     public void withdrawCash() {
        System.out.println("Enter the withdraw amount in Rs:");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        if (amt > bal) {
            System.out.println("Can't Withdraw !your balance is insufficient...  ");
        } else {
            bal = bal - amt;
            System.out.printf("\nWithdraw was Success! your current balance is %f", bal);
        }
        displayMenu();
    }


}
