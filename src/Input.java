package src;
import java.util.Scanner;

public class Input {
    public static void main(String[] Args){
        String nama, alamat;
        int usia, gaji;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pendataan Karyawan PT.ABC");

        System.out.println("Nama  : ");

        nama = keyboard.next();

        System.out.println("Alamat : ");

        alamat = keyboard.next();

        System.out.println("Usia : ");
        usia = keyboard.nextInt();

        System.out.println("Gaji : ");
        gaji = keyboard.nextInt();

        keyboard.close();

        System.out.println("------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Gaji : " + gaji);
        System.out.println("----------------------");
    }
}
