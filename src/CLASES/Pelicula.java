/*
UNIVERSIDAD ESTATAL A DISTANCIA
VICERRECTORIA ACADÉMICA
ESCUELA DE CIENCIAS EXACTAS Y NATURALES
CARRERA DE INGENIERÍA INFORMÁTICA

TAREA 2
PILAS ESTATICAS EN JAVA

GRUPO 03
PROFESORA MIRIAM MORA MORALES

DAYRON ANTONY CHAVES SANDOVAL
305240018

CENTRO UNIVERSITARIO DE TURRIALBA

FECHA DE ENTREGA
11 DE ABRIL DEL 2021

PRIMER CUATRIMESTRE, 2021.
*/

package CLASES;


public class Pelicula 
{
    private int Identificador;
    private String Nombre;
    private String Director;
    private int Duracion;

    public Pelicula() {
    }

    public Pelicula(int Identificador, String Nombre, String Director, int Duracion) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.Director = Director;
        this.Duracion = Duracion;
    }
    
    
    
    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Identificador=" + Identificador + ", Nombre=" + Nombre + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
    
}
