/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TesteFiguraGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Quadrado q = new Quadrado();
       Retangulo r = new Retangulo();
       Circulo c = new Circulo();
       
       q.setLado1(2);
       q.setLado2(2);
       q.setLado3(2);
       q.setLado4(2);
       
       q.calculaArea();
       q.calculaPerimetro();
       q.ExibeDados();
       
        System.out.println("              ");
        
        r.setLado1(4);
        r.setLado2(8);
        r.setLado3(4);
        r.setLado4(8);
        
        r.calculaArea();
        r.calculaPerimetro();
        r.ExibeDados();
        
        System.out.println("           ");
        
        c.setRaio(8);
        c.calculaArea();
        c.calculaPerimetro();
        c.ExibeDados();
    }
    
}
