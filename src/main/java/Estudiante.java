/*
autor: jhon freddy
fecha: 2021-07-04
programa:
2. Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales
 */

import java.util.Scanner;
public class Estudiante {
    public static void main (String[]args) {
        int num1, num2, num3, suma, promedio ;
        String nombre;
        int edad;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println ("Ingrese nota 1" );
        num1 = entrada.nextInt() ;
        System.out.println ("Ingrese nota 2" );
        num2 = entrada.nextInt() ;
        System.out.println ("Ingrese nota 3" );
        num3 = entrada.nextInt() ;
        suma = (num1 + num2 + num3) ;
        promedio = (suma/3) ;

        if (promedio > 3) {
            System.out.println ("su nombre es: " + nombre + "\nSu edad: " + edad +  "\nEl estudiante esta aprovado con un promedio de: " +promedio );
        }
        else {
            System.out.println ("su nombre es: " + nombre + "\nSu edad es: " + edad + "\nEl estudiante no esta aprovado, su promedio es de: " +promedio );
            System.out.println("FIN DEL PROGRAMA");
        }

    }
}
