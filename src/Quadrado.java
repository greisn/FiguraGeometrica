/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Quadrado extends FiguraGeometrica {
    
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;

    public Quadrado() { }

    public Quadrado(int lado1, int lado2, int lado3, int lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public Quadrado(int lado1, int lado2, int lado3, int lado4, int area, int perimetro) {
        super(area, perimetro);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    /**
     * @return the lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public int getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    /**
     * @return the lado4
     */
    public int getLado4() {
        return lado4;
    }

    /**
     * @param lado4 the lado4 to set
     */
    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
    
     @Override
     public double calculaArea(){
         
         area= getLado1() * getLado2();
       return area;
    }
    
    @Override
    public double calculaPerimetro(){
        perimetro= getLado1() + getLado2()+ getLado3()+ getLado4();
       return perimetro;
    }
    
    @Override
     public void ExibeDados(){
        System.out.println("---- Dados do Quadrado ----");
        System.out.println("Lado1: " + getLado1());
        System.out.println("Lado2: " + getLado2());
        System.out.println("Lado3: " + getLado3());
        System.out.println("Lado4: " + getLado4());
        System.out.println("Àrea: " + this.getArea());
        System.out.println("Perímetro: " + this.getPerimetro());
                
     }  
      
    
}
