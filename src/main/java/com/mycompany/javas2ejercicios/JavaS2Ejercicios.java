/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javas2ejercicios;
/**
 *1. Realizar un programa en Java que permita ingresar 2 números con el objetivo de
     operarlos como en una calculadora, utilizando funciones y estructuras básicas y operandos.
     * Ingresar 2 números reales.
    >Ingresar la operación a realizar [1:Suma, 2:Resta, etc].
    > El programa debe llamar a la función de la operación solicitada.
    >realizar el cálculo.
     *Mostrar el resultado mediante una función.
     >>>Las operaciones a realizar en el programa calculadora deben ser:
         - Suma
         - Resta
         - Multiplicación
         - División (No se debe dividir entre 0 ni negativos, mostrar error)
     - Mostrar resultados y seguir mostrando el menú.
     - Mostrar Error en caso de división no permitida.
 * @author Liliana
 */
import java.util.Scanner;

public class JavaS2Ejercicios {

    public static void main(String[] args) { 
        
       Calculadora operaciones =new Calculadora(); //Aqui se esta mandando llamar al metodo Calculadora
       Scanner calcula = new Scanner(System.in);
       int opcion,numero1, numero2, resultado = 0; //Declaracion de variables y opciones para el switch
       boolean menu=true; 
       
       while(menu){ //Cliclo repetitivo para el menu hasta que se cumpla con la condicion
       System.out.println("-----><----");    
        System.out.println("Elige una de las siguientes opciones");
         System.out.println("1.Suma");
         System.out.println("2.Resta");
         System.out.println("3.Multiplicacion");
         System.out.println("4.Division");
         System.out.println("5.Salir");
         System.out.println("Elige una opcion: ");
         opcion=  calcula.nextInt();
         
       if(opcion==5){ //Si la opcion se cumple esta termina
           System.out.println("Finalizado.");
          break; //Se rompe el if si no existe la opcion
       }
       else{//Si no se cumple se hacen las operaciones a la cual se haya seleccionado
           
            switch(opcion){ //Selecciona la opcion
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    numero1=calcula.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    numero2=calcula.nextInt();
                    resultado=operaciones.Suma(numero1,numero2);
                    System.out.println("El resultado es: "+ resultado); 
                       System.out.println("-----><----");
           break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    numero1=calcula.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    numero2=calcula.nextInt();
                    resultado=operaciones.Resta(numero1,numero2);
                    System.out.println("El resultado es: "+ resultado);
                       System.out.println("-----><----");
           break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    numero1=calcula.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    numero2=calcula.nextInt();
                    resultado=operaciones.Multiplicacion(numero1,numero2);
                    System.out.println("El resultado es: "+ resultado);
                       System.out.println("-----><----");
           break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    numero1=calcula.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    numero2=calcula.nextInt();
                    if(resultado<=0){ // condicion if donde marca error cuando el resultado es 0 o con un numero negativo
                        System.out.println("Error no se puede realizar");
                    }
                    else{ //Si la condicion anterior no es negativo o divisible entre cero realiza la division
                        resultado=operaciones.Division(numero1,numero2);    
                        System.out.println("El resultado es: "+ resultado);
                    }
                    
           break;
           
                default:
                     System.out.println("Opcion no es Valida");
       }
           
       }
      }
    }     
}
