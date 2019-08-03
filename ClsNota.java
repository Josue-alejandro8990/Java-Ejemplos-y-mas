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
public class ClsNota {
    public String seleccion (int n){
        String nota ="";
        switch(n){
            case 0:
                nota = "do";
                break;
            case 1:
                nota = "re";
                break;
            case 2:
                nota = "mi";
                break;  
            case 3:
                nota = "fa";
                break;    
             case 4:
                nota = "sol";
                break; 
             case 5:
                nota = "la";
                break;    
             case 6:
                nota = "si";
                break;    
        }
        
        return nota;
    }
}
