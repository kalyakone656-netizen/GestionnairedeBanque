public class BankAccount {
    String account;
    double balance;

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Compte : " + account);
        System.out.println("Solde : " + balance);
    }
}
// Classe principale des comptes bancaires