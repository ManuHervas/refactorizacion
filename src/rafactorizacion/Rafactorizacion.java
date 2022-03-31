/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafactorizacion;

/**
 *
 * @author Manuel
 */
public class Rafactorizacion {

    public static void main(String[] args) {
// TODO code application logsic here
        
        CambiaLongitud posicion = new CambiaLongitud();
        NoCambiaLongitud Noposicion = new NoCambiaLongitud();
        
        int longitudActual = 0;
         
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;
       
        int longitud = vector.length;
        
        posicion.setValor(10);
        posicion.modificar(vector, longitudActual, longitud, longitud, posicion);
        posicion.borrar(vector, longitudActual, longitud);
        posicion.insertar(vector, longitudActual, longitud);
        
    }

}
