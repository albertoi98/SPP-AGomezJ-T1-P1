/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agomezj.t1.p1;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class SPPAGomezJT1P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("Calculadora de Promedio");
        //Declaracioón de variables
        int mat;
        double cal1, cal2, cal3, cal4, cal5, prom;
        String res;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introducir matrícula");
        mat = kb.nextInt();
        System.out.println("Introducir Calificación 1");
        cal1 = kb.nextDouble();
        System.out.println("Introducir Calificación 2");
        cal2 = kb.nextDouble();
        System.out.println("Introducir Calificación 3");
        cal3 = kb.nextDouble();
        System.out.println("Introducir Calificación 4");
        cal4 = kb.nextDouble();
        System.out.println("Introducir Calificación 5");
        cal5 = kb.nextDouble();
        //Promedio
        prom= (cal1+cal2+cal3+cal4+cal5)/5;
        //Evaluar si aprobó o reprobó
        if (prom>7.0){
            res= "Aprobado";
        }
        else {
            res= "Reprobado";
        }
    
        System.out.println(prom +  res);
     
          }
    
}
