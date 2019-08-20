/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.Scanner; 
/**
 * 
 * @author ZOELF
 */
public class Suhu  { 
    
    public static void main(String[] args) { 
        //deklarasi
        Double fahrenheit;
        int celcius; 
        
        
        // Membuat scanner baru 
        Scanner baca = new Scanner (System.in); 
        
        // Input 
        System.out.println("----- koversi suhu -----");
        System.out.println("Suhu Celcius ke Fahrenheit");
        System.out.print("Celcius: "); 
        celcius = baca.nextInt(); 
        
        //proses 
        fahrenheit = Double.valueOf((celcius * 9 / 5) + 32); 
        
        //output
        System.out.println("----- koversi suhu -----");
        System.out.println("Fahrenheit: " + fahrenheit);
       
    }
}
