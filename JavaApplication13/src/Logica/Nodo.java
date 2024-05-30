/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author 
 */
public class Nodo {
    private Video v;//informacion del nodo
    private Nodo sg;//nodo siguiente

    public Nodo() {//constructor por defecto
    }

    
    
    public Video getV() {//metodo que devuelve la informacion del nodo
        return v;
    }

    public void setV(Video v) {//metodo que permite modificar la informacion del nodo
        this.v = v;
    }

    public Nodo getSg() {//metodo que devuelve el nodo siguiente 
        return sg;
    }

    public void setSg(Nodo sg) {//metodo que permite modificar el nodo siguiente 
        this.sg = sg;
    }

    public Nodo(Video v, Nodo sg) {//constructor base
        this.v = v;
        this.v = v;
    }
    
    public Nodo(Nodo n){//constructor por defecto
        this.v = n.getV();
        this.sg = n.getSg();
    }

    @Override
    public String toString() {//convierte el nodo en string
        return v.toString();
    }
}
