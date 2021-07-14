/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete04;

/**
 * 
 * @author josef
 */
public class TransporteAereo extends Transporte {
    
    private String cooperativaAerea;
    
    
    public void establecerAerea(String n){
        cooperativaAerea = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 12.0 + (12.0*0.5);
    }
    
    
    public String obtenerAerea(){
        return cooperativaAerea;
    }

}
