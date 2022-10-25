/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika m=new Matematika();
        m.Pertambahan(20, 20);
        m.Pengurangan(10, 5);
        m.Perkalian(10, 20);
        m.Pembagian(21, 2);
        
        MatematikaCanggih mc=new MatematikaCanggih();
        mc.Pertambahan(12.5, 28.7, 14.2);
        mc.Pertambahan(12, 28, 14);
        mc.Pertambahan(23, 34);
//        mc.Pertambahan(3.4,4.9);
    }
}
