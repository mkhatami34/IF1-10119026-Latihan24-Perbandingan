/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      perbandingan
 */
public class IF110119026Latihan24Perbandingan {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        boolean ulangi = true;
        int nilai1 = 0;
        int nilai2 = 0;
        
        System.out.println("=======Program Perbandingan Nilai=======");

        
        while(ulangi){
            System.out.print("Masukkan nilai pertama: ");
            nilai1 = scan.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            nilai2 = scan.nextInt();
            if(nilai1 < nilai2){
                System.out.println("hasil: " + nilai1 + " lebih kecil dari " + nilai2);
            }else if(nilai1 > nilai2){
                System.out.println("hasil: " + nilai1 + " lebih besar dari " + nilai2);
            }else if(nilai1 == nilai2){
                System.out.println("hasil: " + nilai1 + " sama dengan " + nilai2);
            }
            
            System.out.println("Ulangi Aktifitas ? ");
            String konfirm = scan.next();
            if(konfirm .equals("Ya") ){
                ulangi = true;
            }else{
                ulangi = false;
            }
        }
    }
    
}
