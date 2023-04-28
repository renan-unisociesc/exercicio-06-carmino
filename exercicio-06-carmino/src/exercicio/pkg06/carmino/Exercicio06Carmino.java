/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg06.carmino;

import java.util.Scanner;
/**
 *
 * @author Renan
 */
public class Exercicio06Carmino {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);
    int numeroTriangular = 1;
    int resultadoTriangular = ((numeroTriangular + (numeroTriangular*numeroTriangular))/2);    
    int numeroDigitado = 1;
    //Tn = n + n*n / 2
    //(numeroTriangular * (numeroTriangular+1)/2);
        while (numeroDigitado >= 1){
            System.out.println("Digite um numero inteiro maior que zero: ");
                numeroDigitado = entrada.nextInt();
                resultadoTriangular = (numeroTriangular + (numeroTriangular*numeroTriangular)/2);                
                if (numeroDigitado <=0){
                System.out.println("Obrigado por usar o algoritmo!");
                return;
                }
            
                while (numeroDigitado>resultadoTriangular) {
                    resultadoTriangular = ((numeroTriangular + (numeroTriangular*numeroTriangular))/2);                    
                    numeroTriangular = numeroTriangular + 1;
                    
                }
                numeroTriangular = 1;
                    if (numeroDigitado==resultadoTriangular){
                        System.out.println("O numero " + numeroDigitado + " e triangular.");
                    }
                    else {
                        System.out.println("O numero " + numeroDigitado + " nao e triangular.");
                    }     
                
        }
    
    }
}