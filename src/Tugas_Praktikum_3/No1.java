package Tugas_Praktikum_3;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        System.out.println(" ***** TUGAS PRAKTIKUM 3 ***** "+"\n");
        System.out.println(" ***** JAWABAN NO 1 ***** "+"\n");
        String data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Nama Mahasiswa","Tesla"};
        String key;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang akan dicari: ");
        key = scan.nextLine();
        
        System.out.print("isi data adalah: ");
        for (int i = 0; i< data.length; i++) {
        
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for (int i = 0; i <= data.length; i++) {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.print("Data"+key+" berada pada index ke -" +i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" ***** Terima Kasih ****** ");
    }
    
    
}
