package LOGICA;

import CLASES.*;

public class Metodo 
{
    //metodo para pruebas, no esta activado por defecto
    public static void llenartodo()
    {
        ExpandirVector(50);
        
        for(int i = 0; i<50; i++)
        {
            Pelicula pelicula = new Pelicula(i, "test", "test", i);
            Vector.VectorPeliculas[i] = pelicula;
        }
    }
    
    
    //este metodo determina si el tamaño del vector es valido
    public static Boolean TamañoEsValido( String Tamaño )
    {
        Boolean valido = null;
        int TamañoNum = 0;
                
        try
        {
            //primero se verifica que el valor sea numerico
            TamañoNum = Integer.parseInt(Tamaño);
        }
        catch(Exception e)
        {
            valido = false;
        }
        
        //se verifica que el tamaño sea mayor que 0
        if( TamañoNum > 0 )
        {
            valido = true;
        }
        else
        {
            valido = false;
        }
        
        return valido;
    }
    
    //este metodo expande el vector estatico original (creado en clases vector)para que tenga el tamaño que el usuario desee
    //en caso de que exista un vector diferente de 0 se le preguntara al usuario si desea eliminarlo
    public static void ExpandirVector( int NumeroDeElementos )
    {
        Pelicula[] NuevoVector = new Pelicula[NumeroDeElementos]; 
        Vector.VectorPeliculas = NuevoVector;
    }    
    
    //Metodo que verifica la valides de los atributos a insertar en el objeto pelicula
    public static Boolean FormularioEsValido( String Identificador, String Nombre, String Director, String Duracion )
    {
        Boolean valido = true;
        int IdentificadorNum = 0;
        int DuracionNum = 0;
        
        //se verifica que los datos no esten vacios
        if(Identificador == "" || Nombre == "" || Director == "" || Duracion == "")
        {
            valido = false;
        }
        
        //se verifica que el identificador y la duracion sean numericos
        try
        {
            IdentificadorNum = Integer.parseInt(Identificador);
            DuracionNum = Integer.parseInt(Duracion);
            
            //se verifica que el identificador no exista
            if(IdentificacionYaExiste(IdentificadorNum) == true )
            {
                valido = false;
            }    
        }
        catch(Exception e)
        {
            valido = false;
        }
                
        return valido;
    
    }
        
    //se verifica que el atributo identificacion en el objeto no este repetido.
    public static Boolean IdentificacionYaExiste(int IdentificadorNuevo)
    {
        Boolean existe = false;
        int IdentificadorOriginal = 0;
        
        for (int i = 0; i < Vector.VectorPeliculas.length; i++)
        {
            if(Vector.VectorPeliculas[i] != null)
            {
                IdentificadorOriginal = Vector.VectorPeliculas[i].getIdentificador();
                if(IdentificadorOriginal == IdentificadorNuevo)
                {
                    existe = true;
                }
            }
        }
        
        return existe;
    }
    
    //Se inserta un nuevo objeto pelicula en el vector conforme a la logica LIFO
    public static Boolean Apilar(String Identificador, String Nombre, String Director, String Duracion)
    {
        Boolean Exito = true;
        int IdentificadorNum = Integer.parseInt(Identificador);
        int DuracionNum = Integer.parseInt(Duracion);
        
        Pelicula pelicula = new Pelicula(IdentificadorNum, Nombre, Director, DuracionNum);
        
        int EspacioVacio = ObtenerUltimaPosicionNula();
        
        if(EspacioVacio != -1)
        {
            Vector.VectorPeliculas[EspacioVacio] = pelicula;
        }
        else
        {
            Exito = false;
        }
        
        return Exito;
    }
    
    //este metodo itera a traves de todo el vector hasta encontrar un espacio vacio
    public static int ObtenerUltimaPosicionNula()
    {
        int UltimaPosicionNula = 0;
        
        //recorremos el vector
        for (int i = 0; i < Vector.VectorPeliculas.length; i++)
        {
            //si es diferente de nulo se incrementa el iterador
            if(Vector.VectorPeliculas[i] != null)
            {
                UltimaPosicionNula = UltimaPosicionNula + 1;
            }
            else if(Vector.VectorPeliculas[i] == null)
            {
                //si se llega a un valor nulo se rompe el ciclo para dejar de contar.
                break;
            }
            
            //si el iterador es del tamaño del arreglo entonces el vector esta lleno
            //se asigna valor -1 y se rompe el ciclo.
            if(UltimaPosicionNula >= Vector.VectorPeliculas.length)
            {
                UltimaPosicionNula = -1;
                break;
            }
        }
        
        return UltimaPosicionNula;
    }
    
    //este metodo itera atraves de todo el vector para contar todas las peliculas
    public static int CantidadDePeliculasEnVector()
    {
        int CantidadDePeliculas = 0;
        
        //recorremos el vector
        for (int i = 0; i < Vector.VectorPeliculas.length; i++)
        {
            //si es diferente de nulo se incrementa el iterador
            if(Vector.VectorPeliculas[i] != null)
            {
                CantidadDePeliculas = CantidadDePeliculas + 1;
            }
            else if(Vector.VectorPeliculas[i] == null)
            {
                //si se llega a un valor nulo se rompe el ciclo para dejar de contar.
                break;
            }
        }
        
        return CantidadDePeliculas;
    }
    
    //Se recibe un objeto por parametro y se remueve del arreglo conforme a logica LIFO.
    public static void Desapilar()
    {
        int Posicion = Metodo.CantidadDePeliculasEnVector();

        try
        {
            Vector.VectorPeliculas[Posicion - 1] = null;
        }
        catch(Exception e)
        {
            Vector.VectorPeliculas[Posicion] = null;
        }
    }
    
    //Determina si el vector esta vacio o no
    public static Boolean VectorEstaVacio()
    {
        Boolean Vacio = true;
        
        //recorremos el vector
        for (int i = 0; i < Vector.VectorPeliculas.length; i++)
        {
            //si es diferente de nulo entonces no esta vacio.
            if(Vector.VectorPeliculas[i] != null)
            {
                Vacio = false;
                break;
            }
        }
        
        return Vacio;
    }
    
    //Este metodo setea todos los valores del vector en nulo
    public static void EliminarTodo()
    {
        //recorremos el vector
        for (int i = 0; i < Vector.VectorPeliculas.length; i++)
        {
            //si es diferente de nulo se setea a nulo.
            if(Vector.VectorPeliculas[i] != null)
            {
                Vector.VectorPeliculas[i] = null;
            }
        }
    }
    
    //el usuario digita una posicion y se debe devolver el objeto en esa posicion
    public static Pelicula ObtenerObjetoEnPosicion( String Posicion )
    {
        Pelicula PeliculaCopia = new Pelicula();
         
        if (PosicionEsValida(Posicion) == true) 
        {
            int PosicionNum = Integer.parseInt(Posicion);
            //Se crea una copia del objeto
            PeliculaCopia = Vector.VectorPeliculas[PosicionNum];
        }
        else
        {
            PeliculaCopia = null;
        }
         
        return PeliculaCopia;
    }
    
    //metodo que complementa a ObtenerObjetoEnPosicion
    //determina si hay datos en la posicion digitada, o esta es mas grande o menor que el tamaño del vector
    public static Boolean PosicionEsValida( String Posicion )
    {
        Boolean Valido = true;
        
        
        try
        {
            //se determina si la posicion recibida es numerica
            //produce excepcion
            int PosicionNum = Integer.parseInt(Posicion);
        
            //se determina si la posicion recibida es mayor que el tamaño del vector o menor que 0
            if(PosicionNum > Vector.VectorPeliculas.length || PosicionNum < 0)
            {
                Valido = false;
            }
            //se determina que exista informacion en la posicion del vector
            else if(Vector.VectorPeliculas[PosicionNum] == null)
            {
                Valido = false;
            }
        }
        catch(Exception e)
        {
            Valido = false;
        }
                
        return Valido;
    }
    
}
