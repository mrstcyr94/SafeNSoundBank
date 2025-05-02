import java.util.Scanner;

public class ATM {

    public static Scanner s = new Scanner(System.in);
    static Checkings checkings = new Checkings();
    static Savings savings = new Savings();

    public static void main(String[] args) throws Exception {
        welcome();
    }

    public static void welcome() {

        System.out.println("Hello! Welcome to SafeNSound Bank! Would you like to open a checkings or savings account?");
        System.out.println("Checkings | Savings");

        String choice2 = s.nextLine();

        if (choice2.equalsIgnoreCase("Checkings")) {
            checkingsDeposit();
        }

        else if (choice2.equalsIgnoreCase("Savings")) {
            savingsDeposit();
        }

        else {
            System.out.println("Invalid response. Please try again.");
            welcome();

        }

    }

    public static void checkingsDeposit() {
        checkings.setDeposit();
        System.out.printf("%.2f\n", checkings.getDeposit());

        System.out.println("Would you like to make another desposit?");
        System.out.println("Yes | No");
        String choice3 = s.nextLine();

        if (choice3.equalsIgnoreCase("Yes")) {
            checkingsDeposit();
        }

        else if (choice3.equalsIgnoreCase("No")) {

            System.out.println("What else would you like to do?");
            System.out.println("Check balance | Withdraw | Go to savings account | Leave");

            String choice4 = s.nextLine();

            if (choice4.equalsIgnoreCase("Check balance")) {
                checkingsBalance();
            }

            else if (choice4.equalsIgnoreCase("Withdraw")) {
                checkingsWithdrawl();
            }

            else if (choice4.equalsIgnoreCase("Go to savings account")) {
                savingsDeposit();
            }

            else if (choice4.equalsIgnoreCase("Leave")) {
                System.out.println("Thank you for using SafeNSound Bank! See you next time!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid response");
            }
        } else {
            System.out.println("Invalid response");
        }
    }

    public static void checkingsWithdrawl() {
        checkings.setWithdrawl();
        System.out.printf("%.2f\n", checkings.getWithdrawl());

        System.out.println("Would you like to make another withdrawl?");
        System.out.println("Yes | No");
        String choice5 = s.nextLine();

        if (choice5.equalsIgnoreCase("Yes")) {
            checkingsWithdrawl();
        }

        else if (choice5.equalsIgnoreCase("No")) {

            System.out.println("What else would you like to do?");
            System.out.println("Check balance | Deposit | Go to savings account | Leave");

            String choice6 = s.nextLine();

            if (choice6.equalsIgnoreCase("Check balance")) {
                checkingsBalance();
            }

            else if (choice6.equalsIgnoreCase("Deposit")) {
                checkingsDeposit();
            }

            else if (choice6.equalsIgnoreCase("Go to savings account")) {
                savingsDeposit();
            }

            else if (choice6.equalsIgnoreCase("Leave")) {
                System.out.println("Thank you for using SafeNSound Bank! See you next time!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid response");
            }
        } else {
            System.out.println("Invalid response");
        }

    }

    public static void checkingsBalance() {
        checkings.getBalance();

        System.out.println("What else would you like to do?");
        System.out.println("Deposit | Withdraw | Go to savings account | Leave");

        String choice7 = s.nextLine();

        if (choice7.equalsIgnoreCase("Deposit")) {
            checkingsDeposit();
        }

        else if (choice7.equalsIgnoreCase("Withdraw")) {
            checkingsWithdrawl();
        }

        else if (choice7.equalsIgnoreCase("Go to savings account")) {
            savingsDeposit();
        }

        else if (choice7.equalsIgnoreCase("Leave")) {
            System.out.println("Thank you for using SafeNSound Bank! See you next time!");
            System.exit(0);
        }

        else {
            System.out.println("Invalid response");
        }

    }

    public static void savingsDeposit() {
        savings.setDeposit();
        System.out.printf("%.2f\n", savings.getDeposit());

        System.out.println("Would you like to make another desposit?");
        System.out.println("Yes | No");
        String choice8 = s.nextLine();

        if (choice8.equalsIgnoreCase("Yes")) {
            savingsDeposit();
        }

        else if (choice8.equalsIgnoreCase("No")) {

            System.out.println("What else would you like to do?");
            System.out.println("Check balance | Withdraw | Go to checkings account | Leave");

            String choice9 = s.nextLine();

            if (choice9.equalsIgnoreCase("Check balance")) {
                savingsBalance();
            }

            else if (choice9.equalsIgnoreCase("Withdraw")) {
                savingsWithdrawl();
            }

            else if (choice9.equalsIgnoreCase("Go to checkings account")) {
                checkingsDeposit();
            }

            else if (choice9.equalsIgnoreCase("Leave")) {
                System.out.println("Thank you for using SafeNSound Bank! See you next time!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid response");
            }
        } else {
            System.out.println("Invalid response");
        }
    }

    public static void savingsWithdrawl() {
        savings.setWithdrawl();
        System.out.printf("%.2f\n", savings.getWithdrawl());

        System.out.println("Would you like to make another withdrawl?");
        System.out.println("Yes | No");
        String choice10 = s.nextLine();

        if (choice10.equalsIgnoreCase("Yes")) {
            savingsWithdrawl();
        }

        else if (choice10.equalsIgnoreCase("No")) {

            System.out.println("What else would you like to do?");
            System.out.println("Check balance | Deposit | Go to checkings account | Leave");

            String choice11 = s.nextLine();

            if (choice11.equalsIgnoreCase("Check balance")) {
                savingsBalance();
            }

            else if (choice11.equalsIgnoreCase("Desposit")) {
                savingsDeposit();
            }

            else if (choice11.equalsIgnoreCase("Go to checkings account")) {
                checkingsDeposit();
            }

            else if (choice11.equalsIgnoreCase("Leave")) {
                System.out.println("Thank you for using SafeNSound Bank! See you next time!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid response");
            }
        } else {
            System.out.println("Invalid response");
        }
    }

    public static void savingsBalance() {
        System.out.println(savings.getBalance());

        System.out.println("What else would you like to do?");
        System.out.println("Deposit | Withdraw | Go to checkings account | Leave");

        String choice12 = s.nextLine();

        if (choice12.equalsIgnoreCase("Deposit")) {
            savingsDeposit();
        }

        else if (choice12.equalsIgnoreCase("Withdraw")) {
            savingsWithdrawl();
        }

        else if (choice12.equalsIgnoreCase("Go to checkings account")) {
            checkingsDeposit();
        }

        else if (choice12.equalsIgnoreCase("Leave")) {
            System.out.println("Thank you for using SafeNSound Bank! See you next time!");
            System.exit(0);
        }

        else {
            System.out.println("Invalid response");
        }
    }

}
