import java.util.Scanner;

public class TugasJobsheet9 {
    public static void main(String[] args) {
        System.out.print("Masukkan banyaknya elemen array: ");
        Scanner sc = new Scanner(System.in);
        int jmlElemen = sc.nextInt();
        int[] arrayInt = new int[jmlElemen];
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }
        int nilaiTertinggi = arrayInt[0];
        for (int i = 1; i < jmlElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
        }
        int nilaiTerendah = arrayInt[0];
        for (int i = 1; i < jmlElemen; i++) {
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
        }
        int total = 0; 
        for (int i = 0; i < jmlElemen; i++) {
            total += arrayInt[i];
        }
        double rataRata = total / jmlElemen;
        System.out.print("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.print("Nilai Terendah: " + nilaiTerendah);
        System.out.print("Rata-rata: " + rataRata);
    }
}