import java.util.Scanner;

public class SavingsAccount {
    public double saldo;
    public double bunga = 0.02;
    public String nama;

    public void cetak() {
        System.out.println("Nama: " + nama);
     System.out.println("Saldo: " + saldo);
     System.out.println("Bunga: " + bunga);
     System.out.println("Total Saldo dengan Bunga: " + (saldo + (saldo * bunga)));
     System.out.println();
 }
    public void deposit(int x) {
        saldo += x;
        System.out.println("Deposit: " + x);
        System.out.println("Saldo setelah deposit: " + saldo);
    }
    public void withdraw() {


       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        int jumlahPenarikan = input.nextInt();
        if (jumlahPenarikan > saldo) {
            System.out.println("Saldo tidak cukup untuk penarikan.");
        }
        if (jumlahPenarikan <= saldo) {
            saldo -= jumlahPenarikan;
            System.out.println("Penarikan: " + jumlahPenarikan);
            System.out.println("Saldo setelah penarikan: " + saldo);
        }
        if (jumlahPenarikan < 0) {
            System.out.println("Jumlah penarikan tidak boleh negatif.");
        } 
        if (jumlahPenarikan == 0) {
            System.out.println("Tidak ada penarikan yang dilakukan.");
        }


     
    }
public double calkulateInterest() {
    double bunga = saldo * this.bunga;
    if (bunga < 0) {
        System.out.println("Bunga tidak bisa.");

    }
    else {
        System.out.println("Bunga yang didapat: " + bunga);
        saldo -= bunga;
        System.out.println("Saldo setelah pengurangan bunga bunga: " + saldo);
    }
    return bunga;
}
}    
    

