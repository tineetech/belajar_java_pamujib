/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_java_pamujib_p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Bab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

//        print helo dunia basic
//        System.out.println("Halo, dunia!");
//        System.out.println("Halo"+" "+"Dunia");
//        System.out.println(2+" "+5);
//        System.out.println(2+5);
//        System.out.println("Angka "+" "+5);
//        System.out.println("2 + 5"+" = "+2+5);
//        System.out.println("2 + 5"+" = "+(2+5));
//        kalkulator();
//        inputUser();
        inputUser2();
//          JoptionPane();

    }

    public static void kalkulator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator CLI Sederhana ===");

        // Input bilangan pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextInt();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();

        // Input bilangan kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextInt();

        double hasil;

        // Proses kalkulasi berdasarkan operator
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                if (angka2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
                    return;
                }
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }

        // Output hasil
        System.out.println("Hasil: " + (int) hasil);
    }

    public static void inputUser() {
        String nama;
        Integer umur;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        nama = input.next();

        System.out.print("Masukan umur : ");
        umur = input.nextInt();

        System.out.println("Halo, " + nama + " kamu berumur " + umur + "tahun ya.");
    }
    
    public static void inputUser2() throws IOException {
        String namaDepan = "";
        String namaBelakang = "";
        //buat objek dari inputStream
        InputStreamReader ireader = new InputStreamReader(System.in);
        //buat objek bufferreader
        BufferedReader breader = new BufferedReader(ireader);
        System.out.println("Nama Depan : ");
        //membaca inputan user
        namaDepan =
        breader.readLine();
        System.out.println("Nama Belakang : ");
        //membaca inputan user
        namaBelakang =
        breader.readLine();
        System.out.println("Nama Saya adalah :");
        System.out.println(namaDepan + " " +
        namaBelakang);

    }
    
    public static void JoptionPane() {
        String nama = JOptionPane.showInputDialog("Masukan Nama :");
        JOptionPane.showMessageDialog(null, "Halo " + nama,"JustApp", JOptionPane.INFORMATION_MESSAGE);
        
        // untuk popup bilangan
        String a = JOptionPane.showInputDialog("Masukan nilai untuk variabel a : ");
        String b = JOptionPane.showInputDialog("Masukan nilai untuk variabel b : ");
        JOptionPane.showMessageDialog(null, "Hasil :" + (Integer.parseInt(a) * Integer.parseInt(b)),"JustApp", JOptionPane.INFORMATION_MESSAGE);
    }
}
