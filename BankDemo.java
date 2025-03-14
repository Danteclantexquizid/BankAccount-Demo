class BankAccount {
    private double balance; // Private variable to prevent direct access

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount + ". New Balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Demonstration of Encapsulation
public class BankDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000); // Create an account with initial balance

        myAccount.deposit(500);    // Depositing money
        myAccount.withdraw(300);   // Withdrawing money
        myAccount.withdraw(1500);  // Attempting to withdraw more than balance

        // Direct access to balance is not allowed: 
        // myAccount.balance = 5000; // This will cause an error due to private access
        
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
