/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPal;

import ManejoArchivos.ManejoDeArchivos;

/**
 *
 * @author Alumno Mañana
 */
public class PPal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
    }
    
}
