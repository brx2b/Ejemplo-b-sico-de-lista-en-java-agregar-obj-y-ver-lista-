/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac_listas;

import java.util.Scanner; //SE IMPORTAN LAS "Librerias"
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class Inventario {

    private Scanner leer = new Scanner(System.in); //Se inicia el lector de entrada del teclado
    ArrayList<Object> listaInventario=new ArrayList(); //Se inicia la lista con -> NEW ARRAYLIST();

    public void agregarObj() { //Agregar un objeto a la lista
        System.out.println("Nombre");
        String nombre = leer.nextLine();
        if(nombre.isEmpty()){ //Si se encuentra vacía la variable anterior (largo=0), pedirá nuevamente ingresar el valor si es necesario (en caso de bugs)
           nombre = leer.nextLine();
        }
        System.out.println("Tipo");
        String tipo = leer.nextLine();
        if(tipo.isEmpty()){
           tipo = leer.nextLine();
        }
        System.out.println("ID");
        int id = leer.nextInt();
        if(id==0){
           nombre = leer.nextLine(); 
        }
        Objeto obj1 = new Objeto(nombre, tipo, id); //se crea el objeto nuevo con los valores ingresados anteriormente
        listaInventario.add(obj1); //Se agrega el objeto creado con sus valores a la lista
        
    }
    public void verObjetos(){ //Metodo para ver los objetos ingresados en la lista (listaInventario)
        int cont=1;
        for(Object i : listaInventario){ //recorre la lista de objetos (Object) y las muestra en pantalla
            System.out.println("--OBJETO "+cont+"--");
            cont=cont+1;
            System.out.println(i);
        }
    }

}
