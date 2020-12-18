/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujiaritmatika;

import java.util.Scanner;

/**
 *
 * @author zaka fahmi
 */
public class UjiAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        Aritmatika art = new Aritmatika();
        boolean ulang = true;
        while (ulang) {
            System.out.println("Menu :");
            System.out.println("1.Penambahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("5.Perbandingan");
            System.out.println("6.Konversi Desimal ke Biner");
            System.out.println("7.Konversi Biner ke Desimal");
            System.out.print("Pilih Menu : ");
            int pilih = angka.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("==================================================");
                    System.out.println("Penambahan");
                    System.out.print("Masukan Nilai ke 1 : ");
                    int nilai1 = angka.nextInt();
                    System.out.print("Masukan Nilai ke 2 : ");
                    int nilai2 = angka.nextInt();
                    int hasil = art.penambahan(nilai1, nilai2);
                    System.out.println("Hasilnya : " + hasil);
                    System.out.println("==================================================");
                    break;
                case 2:
                    System.out.println("==================================================");
                    System.out.println("Pengurangan");
                    System.out.print("Masukan Nilai ke 1 : ");
                    nilai1 = angka.nextInt();
                    System.out.print("Masukan Nilai ke 2 : ");
                    nilai2 = angka.nextInt();
                    hasil = art.pengurangan(nilai1, nilai2);
                    System.out.println("Hasilnya : " + hasil);
                    System.out.println("==================================================");
                    break;
                case 3:
                    System.out.println("==================================================");
                    System.out.println("Perkalian");
                    System.out.print("Masukan Nilai ke 1 : ");
                    nilai1 = angka.nextInt();
                    System.out.print("Masukan Nilai ke 2 : ");
                    nilai2 = angka.nextInt();
                    hasil = art.perkalian(nilai1, nilai2);
                    System.out.println("Hasilnya : " + hasil);
                    System.out.println("==================================================");
                    break;
                case 4:
                    System.out.println("==================================================");
                    System.out.println("Pembagian");
                    System.out.print("Masukan Nilai ke 1 : ");
                    nilai1 = angka.nextInt();
                    System.out.print("Masukan Nilai ke 2 : ");
                    nilai2 = angka.nextInt();
                    hasil = art.pembagian(nilai1, nilai2);
                    System.out.println("Hasilnya : " + hasil);
                    System.out.println("==================================================");
                    break;
                case 5:
                    System.out.println("==================================================");
                    System.out.println("Perbandingan");
                    System.out.print("Masukan Nilai ke 1 : ");
                    nilai1 = angka.nextInt();
                    System.out.print("Masukan Nilai ke 2 : ");
                    nilai2 = angka.nextInt();
                    String dadi = art.perbandingan(nilai1, nilai2);
                    System.out.println("Hasilnya : " + dadi);
                    System.out.println("==================================================");
                    break;
                case 6:
                    System.out.println("==================================================");
                    System.out.println("Konversi Desimal Ke Biner");
                    System.out.print("Masukan Angka Desimal : ");
                    int nilai = angka.nextInt();
                    System.out.print("Hasil Biner : ");
                    int a[] = art.binkedes(nilai);
                    int b =  a.length;
                    for(int i = b-1;i>=0; i--){
                        System.out.print(a[i]);
                    }
                    System.out.println("");
                    System.out.println("==================================================");
                    break;
                case 7:
                    System.out.println("==================================================");
                    System.out.println("Konversi Biner Ke Desimal");
                    System.out.print("Masukan Angka Biner : ");
                    nilai = angka.nextInt();
                    System.out.println("Hasil Desimal : " + art.deskebin(nilai));
                    break;
            }
        }
    }
    
}
