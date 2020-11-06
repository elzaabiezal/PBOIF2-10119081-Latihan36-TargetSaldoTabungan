/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan36.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Target Saldo Tabungan
 */
public class PBOIF210119081Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        System.out.print("Saldo Awal : RP. ");
        tabungan.saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan(%) : ");
        tabungan.bunga = scanner.nextFloat();
        
        System.out.print("Saldo Target : RP. ");
        tabungan.saldoTarget = scanner.nextDouble();
        System.out.println();
        tabungan.tampilSaldoTabungan();
    }
    
}
