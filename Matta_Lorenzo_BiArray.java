/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ljmc2
 */
public class Matta_Lorenzo_BiArray {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        Random azar=new Random();
        
        System.out.println("Ingrese un valor de n para generar el arreglo n*n:");
        int n=lea.nextInt();
        
        int tabla[][]=new int[n][n];
        
        //generación de valores 10-99
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                tabla[row][col]=azar.nextInt(90)+10;//(0-89)+10=10-99
            }
        }
        
        //impresión de arreglo
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(tabla[row][col]+" ");
            }
            System.out.println("");
        }
        
        int sumaizqder=0,sumaderizq=0;
        
        //cálculo suma izquierda-derecha
        for(int diagonal=0;diagonal<n;diagonal++){
            sumaizqder+=tabla[diagonal][diagonal];
        }
        
        //cálculo suma derecha-izquierda
        for(int diagonal=0;diagonal<n;diagonal++){
            sumaderizq+=tabla[diagonal][n-diagonal-1];//se resta el 1 porque el arreglo tiene posiciones numeradas hasta su tamaño asignado-1
        }
        
        System.out.println("Suma diagonal izquierda-derecha: "+sumaizqder
                        +"\nSuma diagonal derecha-izquierda: "+sumaderizq);
    }
}
