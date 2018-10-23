
package Pbo;

import java.util.Scanner;

public class Tugas {
     public static void main(String[] args) {
        int pilihan= 0;
        Scanner a= new Scanner (System.in);
        
        do {
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.print("Masukan Inputan : "); pilihan=a.nextInt();
        } while( pilihan != 3 );
            }
}
   
