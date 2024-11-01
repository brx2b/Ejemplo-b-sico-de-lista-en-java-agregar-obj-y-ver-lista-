/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac_listas;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Prac_listas {

    public static void main(String[] args) {
        Inventario inv = new Inventario();  //Objeto inventario que permite almacenar objetos en el
        Scanner leer = new Scanner(System.in); //Se inicia el lector de entrada o input del sistema
        int op=0; //Se declara la variable 
        do {
            System.out.println("1.-Agregar objeto al inventario"); //Menú a mostrar al entrar en el bucle
            System.out.println("2.-Ver objetos en el inventario");
            System.out.println("3.-Salir");
            op = leer.nextInt(); //Se lee la tecla de entrada del sistema (teclado)
            switch (op) { //Dependiendo del numero ingresado se iniciará un metodo diferente de la clase inventario (inv)
                case 1:
                    inv.agregarObj(); //agregar objeto a inventario
                    break;
                case 2:
                    inv.verObjetos(); //ver objetos ingresados en el inventario
                    break;
                case 3:
                    System.out.println("Hasta pronto!"); //Al ingresar el número 3, Se saldrá de la aplicación
                    break;
            }
        } while (op != 3); //Se termina la ejecución cuando el valor de op sea 3
    }

}
