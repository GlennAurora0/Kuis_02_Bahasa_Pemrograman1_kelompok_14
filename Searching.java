/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;

/**
 *
 * @author Glen Aurora
 */
import java.util.Scanner;
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu Warteg");
        System.out.println("1. Nasi Ayam Goreng\n2. Nasi Rendang");
        System.out.println("3. Nasi Tahu Tempe\n4. Nasi Telur Goreng");
        System.out.println("5. Nasi Ikan Goreng");
        System.out.print("Pilihan Anda = ");
        int pilih = s.nextInt();
        switch(pilih){
                case 1: System.out.println("Harga 17000"); break;
                case 2: System.out.println("Harga 18000"); break;
                case 3: System.out.println("Harga 10000"); break;
                case 4: System.out.println("Harga 12000"); break;
                case 5: System.out.println("Harga 15000"); break;
                default: System.out.println("Pilihan tidak ada");
        }
    }
    
}
