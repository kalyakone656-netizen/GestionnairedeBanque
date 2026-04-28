public class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount("A1", 1000);
        CheckingAccount c = new CheckingAccount("A2", 2000, 500);
        SavingsAccount s = new SavingsAccount("A3", 3000);
        COD cod = new COD("A4", 4000);

        System.out.println("=== BankAccount ===");
        b.display();

        System.out.println("\n=== CheckingAccount ===");
        c.display();

        System.out.println("\n=== SavingsAccount ===");
        s.display();

        System.out.println("\n=== COD ===");
        cod.display();
    }
}