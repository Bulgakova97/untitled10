public class hometask5 {
    public class CreditCard {
        private String accountNumber;
        private double balance;

        public CreditCard(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        public void printCardInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        public static void main(String[] args) {
            CreditCard card1 = new CreditCard("1234567890123456", 0.0);
            CreditCard card2 = new CreditCard("9876543210987654", 0.0);
            CreditCard card3 = new CreditCard("1111222233334444", 100.0);

            card1.deposit(500.0);
            card2.deposit(1000.0);
            card3.withdraw(200.0);

            System.out.println("Card 1:");
            card1.printCardInfo();

            System.out.println("Card 2:");
            card2.printCardInfo();

            System.out.println("Card 3:");
            card3.printCardInfo();
        }
    }
}
