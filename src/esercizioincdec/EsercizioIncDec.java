/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioincdec;

/**
 *
 * @author informatica
 */
public class EsercizioIncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer c=50;
        Thread t1= new Thread( new Incrementa(50));
        Thread t2= new Thread( new Decrementa(50));
        t1.start();
        t2.start();
    }
    
}
