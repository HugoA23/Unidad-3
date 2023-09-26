/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;
import java.util.Scanner;

/**
 *
 * @author hugos
 */
public class ParImpar {
    public static boolean Par(int numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner N = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int numero = N.nextInt();
        N.close();
        if (Par(numero)) 
        {
            System.out.println("Si es par");
        } else {
            System.out.println("No es par");
        }
    }
    }
    
