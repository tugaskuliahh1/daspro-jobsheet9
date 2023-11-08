import java.util.Scanner;
public class ModifArrayRataNilai213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) +" :");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            double rataLulus = totalLulus/jumlahLulus;
            System.out.println("Rata-rata nilai lulus =" + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus: ");
        }
        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus =" + rataTidakLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus : ");
        }
    }
}