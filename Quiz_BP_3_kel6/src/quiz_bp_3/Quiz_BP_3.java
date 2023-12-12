/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz_bp_3;

public class Quiz_BP_3 {

    public static void main(String[] args) {
    String barang[][]={{"Sabun","Pasta","Detergen","Air","Fanta",},{"1000","3000","4000","5000","2500"}};
        System.out.println("Program Array Multidimensi menyimpan nama dan harga barang");
        System.out.println("Nama Barang");
        for(int i=0;i<barang.length;i++){
            for(int j=0;j<barang.length+3;j++){
            System.out.println(barang[i][j]+" ");
            }
        }
    }
}
