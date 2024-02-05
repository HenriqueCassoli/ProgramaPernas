/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mypact.programapernas;

import java.util.Scanner;

/**
 *
 * @author Pessoal
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        System.out.println("quantas pernas");
        int perna= tec.nextInt();
        String tipo;
        System.out.println("Isso um(a)");
        switch(perna){
            case 1:
                tipo ="Saci";
                break;
            case 2:
                tipo ="Bipede";
                break; 
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
