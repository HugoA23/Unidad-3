/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        
        int x = 0, y = 1 , z, numero;
        
        System.out.println("Ingresa el numero a realizar en la serie: ");
        
        numero = n.nextInt();
        n.close();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(x);
            z = x + y;
            x = y;
            y = z;
            
        }
        // TODO code application logic here
    }
    
}
