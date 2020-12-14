/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg3;

import java.util.Observable;

/**
 *
 * @author vinic
 */
public class PadrãoObeserver extends  Observable{
    private  double mudança;
    public  static PadrãoObeserver instace =null;
    private  PadrãoObeserver(){
        this.mudança =0;
    }
    public static PadrãoObeserver getInstace(){
        if(instace==null){
            instace= new PadrãoObeserver();
        }
        return  instace;
    }
    public void setMudanca(double mudanca){
        this.mudança= mudanca;
        setChanged();
        notifyObservers();
    }
    
    
    
}
