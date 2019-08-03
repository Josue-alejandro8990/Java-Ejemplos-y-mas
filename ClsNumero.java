/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador.de.melodias;

/**
 *
 * @author dell
 */
public class ClsNumero {
    
    public int generarnumero(int rango){
        
        int numero = (int)(Math.random()*rango);
        
        return numero;
    }
}
