/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_java_pamujib_p1;

/**
 *
 * @author LENOVO
 */
public class Bab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan anjing = new Hewan();
        
        anjing.jenisKelamin = "Jantan";
        anjing.umur = 5;
        anjing.warnaBulu = "Cokelat";
        System.out.println("Anjing " + anjing.jenisKelamin + " berumur " + anjing.umur + " tahun berbulu " + anjing.warnaBulu);
        
        System.out.println(anjing.melompat("Pagar"));
        
        anjing.memakan("Baso");
    }
    
}
