/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
package Ejemplo1;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejemplo1 extends Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listas<Integer> _lista = new Listas<Integer>();
        Nodo<Integer>[] list;
        //list = new Nodo<Integer>(8);
        list =  (Nodo[])Array.newInstance(Nodo.class, 8);
        list[0] = new Nodo<Integer>(1);
        list[1] = new Nodo<Integer>(2);
        list[2] = new Nodo<Integer>(3);
        list[3] = new Nodo<Integer>(4);
        list[4] = new Nodo<Integer>(5);
        list[5] = new Nodo<Integer>(6);
        list[6] = new Nodo<Integer>(7);
        list[7] = new Nodo<Integer>(8);
        Scanner _in  = new Scanner(System.in);
        
        int opcion =0;
        
        while (opcion!= 4){
            System.out.print("1. Agregar\n");
            System.out.print("2. Mostrar\n");
            System.out.print("3. Ordenar lista\n");
            System.out.print("4. Salir\n");
            opcion = _in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Ingrese un numero: ");
                    int num =_in.nextInt();
                    _lista.Agregar(num);
                    break;
                case 2:
                    System.out.print(_lista.toString());
                    System.out.print("\n");
                    break;    
                case 3:
                    Sorting.selectionSort(list);
                    Sorting.insertionSort(list);
                    System.out.print("La lista se ha ordenado.");
                    System.out.print("\n");
                    break;
            }
        }
    }
}
