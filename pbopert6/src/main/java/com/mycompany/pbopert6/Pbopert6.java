/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbopert6;

import java.util.Scanner;

public class Pbopert6 {
    public static void main(String[] args) {
        PersegiPanjang PersegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang PersegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang PersegiPanjang3 = new PersegiPanjang(25, 35);

        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Persegi Panjang 1");
        System.out.println("2. Persegi Panjang 2");
        System.out.println("3. Persegi Panjang 3");
        System.out.print("Pilih nomor Persegi Panjang yang ingin ditampilkan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Persegi Panjang 1:");
                System.out.println("Luas: " + PersegiPanjang1.getLuas());
                System.out.println("Keliling: " + PersegiPanjang1.getKeliling());
                break;
            case 2:
                System.out.println("Persegi Panjang 2:");
                System.out.println("Luas: " + PersegiPanjang2.getLuas());
                System.out.println("Keliling: " + PersegiPanjang2.getKeliling());
                break;
            case 3:
                System.out.println("Persegi Panjang 3:");
                System.out.println("Luas: " + PersegiPanjang3.getLuas());
                System.out.println("Keliling: " + PersegiPanjang3.getKeliling());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
