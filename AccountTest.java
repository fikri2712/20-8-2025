public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.nama = "fikri";
        account1.saldo = 1000.0;
        account1.bunga = 0.02;
        account1.cetak();
        account1.deposit(15000);
        account1.withdraw();
        account1.calkulateInterest();


SavingsAccount account2 = new SavingsAccount();
      account2.nama = "denis";
        account2.saldo = 1000.0;
        account2.bunga = 0.02;
        account2.cetak();
        account2.deposit(15000);
        account2.withdraw();
        account2.calkulateInterest();
   
        
    

    }
}