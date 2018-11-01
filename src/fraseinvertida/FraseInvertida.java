/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraseinvertida;

import java.util.Scanner;

/**
 *
 * @author karen
 */
public class FraseInvertida {

    /**
     * @param args the command line arguments
     */
    public void invertirCadena(){
    Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese frase");
    String frase= scan.nextLine();
     String fraseInvertida="";    
     for (int i=frase.length()-1; i>=0; i--)
    fraseInvertida = fraseInvertida + frase.charAt(i);
    System.out.println(fraseInvertida);
    
        
    }
    public static void main(String[] args) {
        FraseInvertida obj= new FraseInvertida();
     obj.invertirCadena();
    }
    
}
