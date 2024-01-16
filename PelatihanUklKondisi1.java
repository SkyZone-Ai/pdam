
package com.mycompany.pelatihan.ukl23;

import java.util.Scanner;

public class PelatihanUklKondisi1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamat = {"", "Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        String[] va  = {"", "450 VA", "2200 VA", "1300 VA", "2200 VA"};
        int[] gol = {4, 1, 3, 2, 3};
        System.out.println("================================================");
        System.out.println("              PEMBAYARAN LISTRIK                ");
        System.out.println("================================================");
        System.out.print("Masukkan ID anda\t: ");
        int id = input.nextInt();
        if (id < 1 || id > 4) {
            System.out.println("SALAHSETAN");
            System.out.println("================================================");
        } else {
            System.out.print("Masukkan kwh anda\t: ");
            int kwh = input.nextInt();
            if (kwh < 0) {
                System.out.println("SALAHSETAN");
                System.out.println("================================================");
            } 
            else {
                int biaya = hitung(gol[id], kwh);
                System.out.println("================================================");
                System.out.println("ID Pelanggan\t: " + id);
                System.out.println("Nama Pelanggan\t: " + nama[id]);
                System.out.println("Alamat\t\t: " + alamat[id]);
                System.out.println("Golongan anda\t: " + gol[id] + " - " + va[id]);
                System.out.println("Jumlah Tagihan\t: " + biaya);
                System.out.println("================================================");
            }
        }
    }

    public static int hitung(int golo, int kwh) {
        int biaya = 0;

        switch (golo) {
            case 1:
                biaya = 1000 * kwh + 13000;
                break;
            case 2:
                biaya = 1300 * kwh + 13000;
                break;
            case 3:
                biaya = 1500 * kwh + 13000;
                break;
            default:
        }

        if (biaya < 50000) {
            biaya = 50000;
        }
        return biaya;
    }
    
}
