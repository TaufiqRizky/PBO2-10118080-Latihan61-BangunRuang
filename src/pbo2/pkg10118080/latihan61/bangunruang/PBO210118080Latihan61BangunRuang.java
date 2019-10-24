/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan61.bangunruang;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========Hitung Volume Bangun Ruang========");
        //bola
        System.out.print("Masukan Jari-Jari Bola\t\t: ");
        Scanner a = new Scanner(System.in);
        Bola bl = new Bola();
        bl.setR(a.nextDouble());
        
        //tabung
        Tabung tb = new Tabung();
        System.out.print("Masukan Jari-Jari Tabung\t: ");
        Scanner rt = new Scanner(System.in);
        tb.setR(rt.nextDouble());
        System.out.print("Masukan Tinggi Tabung\t\t: ");
        Scanner tt = new Scanner(System.in);
        tb.setH(tt.nextDouble());
        
        //kerucut
        Kerucut kc = new Kerucut();
        System.out.print("Masukan Jari-Jari Kerucut\t: ");
        Scanner kr = new Scanner(System.in);
        kc.setR(kr.nextDouble());
        System.out.print("Masukan Tinggi Kerucut\t\t: ");
        Scanner kt = new Scanner(System.in);
        kc.setH(kt.nextDouble());
        
        System.out.println("");
        System.out.println("========Hasil Perhitungan Volume========");
        System.out.printf("Volume Bola    = %.2f cm\u00B3%n" , bl.HitungVolume());
        System.out.printf("Volume Tabung  = %.2f cm\u00B3%n" , tb.HitungVolume());
        System.out.printf("Volume Kerucut = %.2f cm\u00B3%n" , kc.HitungVolume());
        
        //System.out.println("Volume Bola\t: "+bl.HitungVolume()+"cm");
        //System.out.println("Volume Tabung\t: "+tb.HitungVolume()+"cm");
        //System.out.println("Volume Kerucut\t: "+kc.HitungVolume()+"cm");
        
        
    }
    
}
