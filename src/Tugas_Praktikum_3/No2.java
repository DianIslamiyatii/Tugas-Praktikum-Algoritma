package Tugas_Praktikum_3;
import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        System.out.println(" ***** TUGAS PRAKTIKUM 3 ***** " + "\n");
        System.out.println(" ***** JAWABAN NO 2 ***** " + "\n");
        int B[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan data yanga akan dicari: ");
        cari = scan.nextInt();
        
        System.out.println("isi data adalah: ");
        for (int i = 0; i <B.length; i++) {
            
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("indeks pointer: " + point);
                if (cari == B[point]) {
                    ketemu = 1;
                    System.out.println("Data" +
                    cari + "Telah ditemukan pada index ke" +point);
                }
                
                else if(cari < B[point]){
                    System.out.println("Cari di kiri");
                    IndeksAkhir = point-1;
                }
                else {
                    IndeksAwal = point+1;
                    System.out.println("Cari di kanan");
                }
            }
        
       if (ketemu == 1)
           System.out.println("Kesimpulan: data ditemukan ");
       else
           System.out.println("Kesimpulan: data tidak ditemukan");
    }
    
}
