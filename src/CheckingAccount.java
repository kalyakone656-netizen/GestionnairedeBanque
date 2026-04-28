public class CheckingAccount extends BankAccount {
    double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    public void display() {
        super.display();
        System.out.println("Limite : " + limit);
    }
}
// Classe compte courant avec limite