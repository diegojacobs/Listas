/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplo1;

/**
 *
 * @author Diego Jacobs
 * @param <t>
 */
public class Lista_Circular<t>extends Listas                                                                    {

    @Override
    public void Agregar(Object valor)
    {
        Nodo_Simple<t> _newNodo = new Nodo_Simple(valor);

        if (Cabeza == null)
        {
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else
        {
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;
        
        }
    }

    @Override
    public Nodo Eliminar(Object valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
