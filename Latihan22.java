/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan22;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author nm
 */
public class Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double diameter;
        double jarijari, luas, keliling;
        DecimalFormat df = new DecimalFormat("0.00");


        while (true) {
            System.out.println("======Perhitungan Lingkaran======");

            try {
                System.out.print("Masukkan Nilai Diameter Lingkaran : ");
                diameter = scanner.nextDouble();

                if (diameter <= 0) {
                    System.out.println("Nilai diameter tidak sesuai. Diameter harus lebih dari 0.");
                } else {
                    System.out.println("======Hasil Perhitungan Lingkaran======");

                    jarijari = diameter / 2.0;
                    luas = Math.PI * jarijari * jarijari;
                    keliling = Math.PI * diameter;

                    // Menampilkan hasil
                    System.out.println("Jari-jari Lingkaran adalah: " + (int) jarijari + "cm");
                    System.out.println("Luas Lingkaran adalah: " + df.format(luas) + "cm");
                    System.out.println("Keliling Lingkaran adalah: " + df.format(keliling) + "cm\n");

                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Nilai diameter tidak sesuai. Masukkan angka yang valid.");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
    }
    
}
