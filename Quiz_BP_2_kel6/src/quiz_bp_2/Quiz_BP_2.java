/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_bp_2;
import java.util.Scanner;
public class Quiz_BP_2 {

    public static void main(String[] args) {
        String barang;
        int temp=0;
        boolean ketemu;
        String data[]={"Sabun","Pasta Gigi", "Detergen", "AirMineral", "Fanta"};
        Scanner s = new Scanner(System.in);
        System.out.println("Program Pencarian Barang");
        System.out.print("Barang yang dicari = ");
        barang=s.next();
        ketemu=false;
        for(int i=0;i<6;i++){
            temp=i;
            if(i!=5){
                if(data[i].compareToIgnoreCase(barang)==0){
                ketemu=true;
                break;
            }
            }if(ketemu) break;
        }
        if(temp==5){
            System.out.println("Barang Tidak Ada");
        }else 
            System.out.println("Barang ada di nomor "+(temp+1));
        
    }
    
}
