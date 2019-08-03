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
public class GeneradorDeMelodias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsNota x = new ClsNota();
        ClsNumero y = new ClsNumero();
        
        
        for(int i = 1; i <= 28; i ++){
        String notas = x.seleccion(y.generarnumero(8));
        String notas1 = x.seleccion(y.generarnumero(8));
        String notas2 = x.seleccion(y.generarnumero(8));
        String notas3 = x.seleccion(y.generarnumero(8));
        
        System.out.print(" "+notas+" "+notas1+" "+notas2+" "+notas3+" "+"|");
        }
       
    }
    
}
