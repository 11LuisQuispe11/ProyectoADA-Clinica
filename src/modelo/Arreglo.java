/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static javax.swing.text.html.HTML.Tag.TD;


/**
 * @author nick paredes
 */
public class Arreglo<TD> {
    
   /* 
    public static void main(String args[]){
        ArrayList <Integer> lista = new ArrayList<Integer>();
    }
    */

    private int valorHash;
    private final int tamano;
    private Object[] arreglo;

    public Arreglo(int tamano) {

        arreglo = new Object[tamano];
        this.tamano = tamano;
    }

    public void agregar(TD generico) {
        Object[] aux = this.arreglo;
        this.arreglo = new Usuario[arreglo.length + 1];
        for (int i = 0; i < aux.length; i++)
            arreglo[i] = aux[i];
        arreglo[arreglo.length - 1] = generico;
    }

    public void eliminar(TD generico) {
        Object[] aux = this.arreglo;
        boolean flag = false;
        for (int i = 0; i < aux.length && !flag; i++) {
            if (generico.equals(aux[i])) {
                for (int j = i; j < arreglo.length - 1; j++)
                    arreglo[j] = aux[j + 1];
                arreglo[arreglo.length] = null;
                flag = true;
            }
        }
    }

    public boolean buscar(TD generico) {
        boolean result = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(generico))
                result = true;
        }
        return result;
    }

    public void editar(TD generico, int pos) {
        for (int i = 0; i < arreglo.length; i++) {
            if (i == pos) {
                arreglo[i] = generico;
            }
        }
    }


    public int getTamaño() {
        return arreglo.length;
    }

    public TD getPos(int i) {
        return (TD) arreglo[i];
    }


}
