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
public class TransporteMaritimo extends Transporte {
    
    private String cooperativaMaritima;
    
    
    public void establecerMaritima(String n){
        cooperativaMaritima = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 9.0 + (9.0*0.5);
    }
    
    
    public String obtenerMaritima(){
        return cooperativaMaritima;
    }

}
