/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author Deadpool
 */
public class PBO210117063Latihan41MassaJenis {

    /*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : menghitung massa jenis kubus
     */
    public static void main(String[] args) {
        Kubus cube = new Kubus();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("====Masssa Jenis Kubus====");
        System.out.print("Sisi : ");
        cube.setSisi(sc.nextInt());
        System.out.print("Massa : ");
        cube.setMassa(sc.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.print("Volume : " +cube.hitungVolume(cube.getSisi()));
        System.out.print("\nMassa Jenis : " +cube.hitungMassaJenis(cube.getMassa()
                , cube.hitungVolume(cube.getSisi()))+"\n");
       
    }
    
}
