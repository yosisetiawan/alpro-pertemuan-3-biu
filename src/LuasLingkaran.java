package src;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * Math.pow(jariJari, 2);

        System.out.println("Luas lingkaran: " + luas);
    }
}
