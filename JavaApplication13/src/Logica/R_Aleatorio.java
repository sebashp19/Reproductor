/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 
 */
public class R_Aleatorio {
    public List azar(Lista l){//funcion que devuelve una lista numerica
        if(l.estaVacia()) return null;//verifica si la lista de videos esta vacia
        int aux = l.size();//variable auxiliar que guarda el tamaño de la lista de videos
        List help = new LinkedList();//lista numerica
        Random r = new Random();//variable random 
        int num =r.nextInt(aux)+1;//genera numeros del 1 al tamaño de la lista de videos
        while(help.size()!=aux){//ciclo while
            num = r.nextInt(aux)+1;//genera numeros del 1 al tamaño de la lista de videos
            if(!help.contains(num)){//verifica que el número aleatorio generado no este en la lista
                help.add(num);//agrega un número a la lista 
            }
        }
        return help;//devuelve lista numerica
    }
}
