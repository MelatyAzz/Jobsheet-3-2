import java.util.Scanner;
public class MataKuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah17[] arrayOfMataKuliah = new MataKuliah17[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah17(kode, nama, sks, jumlahJam);
        }
    }
}
