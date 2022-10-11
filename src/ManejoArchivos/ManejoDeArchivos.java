/*
 * Nuestra clase manejo de archivos va a contener los siguientes enunciados:

    Metodo de creacion de archivo
    Metodo de guardado de Informacion en un archivo
    Eliminar información de un archivo
    Rliminar un archivo
 */
package ManejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoDeArchivos {
    
    public static void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
    }
        
    }
}
