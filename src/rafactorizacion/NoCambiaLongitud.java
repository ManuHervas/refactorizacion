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
public class NoCambiaLongitud {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado


//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

    public void Visualizar(int i, int[] vector, int longitud ) {
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

    
    
    

}
