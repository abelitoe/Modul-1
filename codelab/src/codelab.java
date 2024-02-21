import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class codelab {
    public static void main(String[] args) {
        String nama;
        char gender;
        Scanner objinput = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        nama = objinput.nextLine();
        System.out.println("Masukkan jenis kelamin (L/P) : ");
        gender = objinput.next().charAt(0);

        System.out.println("Masukkan tanggal lahir (yyy/mm/dd) : ");
        int tahun = objinput.nextInt();
        int bulan = objinput.nextInt();
        int tanggal = objinput.nextInt();

        System.out.println("Nama : " + nama );

        if (gender == 'L') {
            System.out.println("Jenis kelamin : Laki-laki ");
        } else if (gender == 'P') {
            System.out.println("Jenis kelamin : Perempuan ");
        } else {
            System.out.println("?");
        }

        LocalDate hariIni = LocalDate.now();
        LocalDate tanggalLahir = LocalDate.of(tahun, bulan, tanggal);
        Period periode = Period.between(tanggalLahir, hariIni);

        System.out.println("Usia : " + periode.getYears() + " tahun " + periode.getMonths() + " bulan");
    }
}
