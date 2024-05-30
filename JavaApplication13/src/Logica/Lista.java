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
public class Lista {//clase lista enlazada simple 
    private Nodo inicio;//nodo inicio de la lista

    public Lista() {//contrutor por defecto
    }
   

    public Nodo getInicio() {//metodo que devuelve el primer nodo
        return inicio;
    }

    public void setInicio(Nodo inicio) {//metodo que permite modificar el primer nodo
        this.inicio = inicio;
    }

    public Lista(Nodo primero) {//contructor base
        this.inicio = primero;
    }

    public Lista(Lista L) {//constructor copia
        L.inicio=null;
    }
    
    public boolean estaVacia(){//metodo que verifica si la lista esta vacia
       if(inicio==null) return true;
       else return false;
    }
    
    public boolean contains(String s){//metodo que verifica si la lista contiene un video
       if(estaVacia()) return false;
       Nodo aux = inicio;
       while(aux!=null){
           if(aux.getV().getNombre().equals(s)) return true;
           aux=aux.getSg();
       }
        return false;
    }
    
    public void insertarFinal(Nodo n){//metodo que inserta un nodo en la lista al final
        if(estaVacia()){
            inicio=n;
        }
        else{
           Nodo aux = inicio;
           while(aux.getSg()!=null){
               aux=aux.getSg();
           }
           aux.setSg(n);
        }
        numero();
    }
    
    public Nodo buscar(String s){//metodo que busca un nodo en la lista
        if(contains(s)){
            Nodo aux = inicio;
            while(aux!=null){
                if(aux.getV().getNombre().equals(s)){
                    return aux;
                }
                aux=aux.getSg();
            }
        }
        return null;
    }
    
    public void eliminar (Video v){//metodo que elimina un nodo
        if(contains(v.getNombre())){
            Nodo aux=inicio;
            Nodo aux1=inicio;
            while(aux1!=null){
                if(aux.getV().getNombre().equals(v.getNombre())){
                    if(aux.getV().getNombre().equals(inicio.getV().getNombre())){
                        inicio=aux.getSg();
                        aux.setSg(null);
                        numero();
                        return;
                    }
                    else{
                        aux1.setSg(aux.getSg());
                        aux.setSg(null);
                        numero();
                        return;
                    }
                }
                aux1=aux;
                aux=aux.getSg();
            }
        }
    }
    
    public int size(){//metodo que devuelve el tamaño de la lista
        int n=0;
        if(estaVacia()) return 0;
        Nodo aux = inicio;
        while(aux!= null){
            n=aux.getV().getAzar();
            aux=aux.getSg();
        }
        return n;
    }
    
    void numero(){//metodo para enumerar los videos y poder usar el aleatorio
        Nodo aux = inicio;
        int x=1;
        while(aux!=null){
            aux.getV().setAzar(x);
            x++;
            aux=aux.getSg();
        }
    }
    
}
