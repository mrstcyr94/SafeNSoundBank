import java.util.Scanner;

public class Checkings {

    private double checkingsDeposit;
    private double checkingsWithdraw;
    private double checkingsBalance;
    Scanner scan = new Scanner(System.in);

    public Checkings() {
        this.checkingsDeposit = 0;
        this.checkingsWithdraw = 0;
        this.checkingsBalance = 0;
    }

    public void setDeposit() {
        System.out.println("Welcome to your checkings account. Please enter how much you would like to deposit.");
        checkingsDeposit = scan.nextDouble();
        checkingsBalance = checkingsBalance + checkingsDeposit;
    }

    public double getDeposit() {
        return checkingsDeposit;
    }

    public void setWithdrawl() {
        System.out.println("Welcome to your checkings account. Please enter how much you would like to withdraw.");
        checkingsWithdraw = scan.nextDouble();

        if (checkingsWithdraw <= checkingsBalance) {
            checkingsBalance = checkingsBalance - checkingsWithdraw;
        } else {
            System.out.println("This amount is too large for withdrawl. Please enter a valid amount.");
            setWithdrawl();
        }
    }

    public double getWithdrawl() {
        return checkingsWithdraw;
    }

    public double getBalance() {
        if (checkingsBalance > 0) {
            System.out.printf("Your current balance in your checkings account is: $%.2f\n", checkingsBalance);
            return checkingsBalance;
        } else {
            System.out.println("Your balance is empty");
            return 0;
        }
    }

}
