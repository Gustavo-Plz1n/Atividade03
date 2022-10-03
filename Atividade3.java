/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int x,y, soma;
        System.out.println("Insira Dois Numero");
        System.out.println("Insira o Primeiro Numero");
        x = leia.nextInt();
        System.out.println("Insira o Segundo Numero");
        y = leia.nextInt();
        leia.close();
        soma = (x+y);
        System.out.println("A soma dos numeros e de " + soma);
        
        
    }
    
}
