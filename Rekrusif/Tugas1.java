import java.util.Scanner;
public class Tugas1 {
    
    static int totalRekursif (int[] data, int index) {
        if (index < 0) {
            return 0;
        } else {
            return data [index] + totalRekursif(data, index - 1);
        }
    }

    static int totalIteraktif (int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data [i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka (N): ");
        int N = sc.nextInt();

        int[] angka = new int [N];
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka ke-" +(i+1) +" \t: ");
            angka [i] = sc.nextInt();
        }

        int hasilRekursif = totalRekursif(angka, N-1);
        int hasilIteraktif = totalIteraktif(angka);
        System.out.println("Total Rekursif \t\t: " +hasilRekursif);
        System.out.println("Total Iteraktif \t: " +hasilIteraktif);
    }
}
