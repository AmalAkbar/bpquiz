/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_bp;
import java.util.Arrays;
public class Quiz_BP {
    public static void main(String[] args) {
        int hargabarang[]={1000,3000,4000,5000,2500};
        String namabarang[]={"Sabun","Pasta Gigi", "Detergen", "AirMineral", "Fanta"};
        System.out.println("Data Awal =");
        for(int i=0;i<5;i++){
            System.out.println(namabarang[i]+"     "+hargabarang[i]);
        }
        System.out.println("");
        for(int i=0;i<namabarang.length;i++){
        boolean swap=false;    
        for(int j=0;j<namabarang.length-1;j++){
            if(hargabarang[j]>hargabarang[j+1]){
                int temp=hargabarang[j];
                hargabarang[j]=hargabarang[j+1];
                hargabarang[j+1]=temp;
                swap=true;
            }
            }
        }
        System.out.println("Data sesuai harga terendah = ");
         for(int i=0;i<5;i++){
            System.out.println(namabarang[i]+"     "+hargabarang[i]);
        }
         System.out.println("");
        for(int i=0;i<hargabarang.length;i++){
        boolean swap=false;    
        for(int j=0;j<hargabarang.length-1;j++){
            if(hargabarang[j]<hargabarang[j+1]){
                int temp=hargabarang[j];
                hargabarang[j]=hargabarang[j+1];
                hargabarang[j+1]=temp;
                swap=true;
            }
            }
        }
        System.out.println("Data sesuai harga tertinggi = ");
         for(int i=0;i<5;i++){
            System.out.println(namabarang[i]+"     "+hargabarang[i]);
        }
         System.out.println("");
        Arrays.sort(namabarang);
        System.out.println("Data Urut Abjad = ");
        for(String urut:namabarang){
            System.out.print(urut+"   ");
            }
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.print(hargabarang[i]+"        ");
        }  
    }
}
