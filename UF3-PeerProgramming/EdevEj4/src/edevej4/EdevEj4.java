/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edevej4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Diego
 * @Version 1.0
 * @since 1.0
 *
 * 
 */
public class EdevEj4 {
    public static void main(String[] args) {
        /**Creamos una Lista de Integers e añadimos una serie de numeros */
        List<Integer> miLista = Arrays.asList(9,7,6,4,2,1,5,4,9,7,7,6,4,5,6,8);

        /**Utilizando el for-each recorremos la Lista e imprimimos el resultado por pantalla*/
        for(Integer elem : miLista){
            System.out.println(miLista.get(elem));
        }
    } 
}
