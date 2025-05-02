import java.util.Scanner;

public class Savings {

    private double savingsDeposit;
    private double savingsWithdrawl;
    private double savingsBalance;
    Scanner scan = new Scanner(System.in);

    public Savings() {
        this.savingsDeposit = 0;
        this.savingsWithdrawl = 0;
        this.savingsBalance = 0;
    }

    public void setDeposit() {
        System.out.println("Welcome to your savings account. Please enter how much you would like to deposit.");
        this.savingsDeposit = scan.nextDouble();
        this.savingsBalance = this.savingsBalance + this.savingsDeposit;
    }

    public double getDeposit() {
        return savingsDeposit;
    }

    public void setWithdrawl() {
        System.out.println("Welcome to your savings account. Please enter how much you would like to withdraw.");
        this.savingsWithdrawl = scan.nextDouble();

        if (this.savingsWithdrawl <= this.savingsBalance) {
            this.savingsBalance = this.savingsBalance - this.savingsWithdrawl;
        } else {
            System.out.println("This amount is too large for withdrawl. Please enter a valid amount.");
            setWithdrawl();
        }
    }

    public double getWithdrawl() {
        return savingsWithdrawl;
    }

    public double getBalance() {
        if (this.savingsBalance > 0) {
            System.out.printf("Your current balance in your savings account is: $%.2f\n", this.savingsBalance);
            return this.savingsBalance;
        } else {
            System.out.println("Your balance is empty");
            return 0;
        }
    }
}
