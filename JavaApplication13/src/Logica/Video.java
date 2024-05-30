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
public class Video {
    private String nombre;//nombre del video
    private String duracion;//duracion del video
    private String genero;//genero del video
    private String Artista;//artista del video
    private int azar = 1;//numero de posicion en la lista del video

    public Video(String nombre, String duracion, String genero, String Artista) {//contructor base
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.Artista = Artista;
    }

    public Video(Video v) {//constructor copia
        this.nombre = v.getNombre();
        this.duracion = v.getDuracion();
        this.genero = v.getGenero();
        this.Artista = v.getArtista();
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {//metodo que devuelve el nombre del video
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {//metodo que modifica el nombre del video
        this.nombre = nombre;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {//metodo que devuelve la duracion del video
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {//metodo que modifica la duracion del video
        this.duracion = duracion;
    }

    /**
     * @return the genero
     */
    public String getGenero() {//metodo que devuelve el genero del video
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {//metodo que modifica el genero del video
        this.genero = genero;
    }

    /**
     * @return the Artista
     */
    public String getArtista() {//metodo que devuelve el artista del video
        return Artista;
    }

    /**
     * @param Artista the Artista to set
     */
    public void setArtista(String Artista) {//metodo que modifica el artista del video
        this.Artista = Artista;
    }
    
    public int getAzar() {//metodo que devuelve la posicion del video en la lista
        return azar;
    }

    public void setAzar(int azar) {//metodo que modifica la posicion del video en la lista
        this.azar = azar;
    }

    @Override
    public String toString() {//metodo que convierte la clase en string
        return  "nombre=" + nombre + ", duracion=" + duracion + ", genero=" + genero + ", Artista=" + Artista;
    }
}
