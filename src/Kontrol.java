package src;
import java.util.Scanner;

public class Kontrol {

    public static void main(String[] args){
        String nama;
        int nilai;
    
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Masukkan Nama : ");
        nama = keyboard.nextLine();

        System.out.println("Masukkan Nilai : ");
        nilai = keyboard.nextInt();

        if(nilai >= 80){
            System.out.println("Selamat " + nama + " Anda lulus dengan Predikat A");
        }else if(nilai >= 70){
            System.out.println("Selamat " + nama + " Anda lulus dengan Predikat B");
        }else if(nilai >= 60){
            System.out.println("Selamat " + nama + " Anda lulus dengan Predikat C");
        }else{
            System.out.println("Maaf " + nama + " Anda Tidak Lulus!");
        }

        keyboard.close();
    }
}
