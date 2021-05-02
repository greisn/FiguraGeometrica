/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Circulo extends FiguraGeometrica {
    private int raio;
    private int diametro;

    public Circulo() { }

    public Circulo(int raio, int diametro) {
        this.raio = raio;
        this.diametro = diametro;
    }

    public Circulo(int raio, int diametro, int area, int perimetro) {
        super(area, perimetro);
        this.raio = raio;
        this.diametro = diametro;
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        this.raio = raio;
    }

    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    //A=PI*r*r
    //PI = 3,14
    @Override
     public double calculaArea(){
         //area= 3,14 * (raio*raio);
         area=3.14 * Math.pow(raio, 2);
       return area;
    }
    
    
    //p=2.PI.r
    //PI=3,14
    @Override
    public double calculaPerimetro(){
        perimetro= (2*3.14)* raio;
       return perimetro;
    }
    
    @Override
     public void ExibeDados(){
        System.out.println("---- Dados do Circulo ----");
        System.out.println("Raio: " + getRaio());
        System.out.println("Àrea: " + this.getArea());
        System.out.println("Perímetro: " + this.getPerimetro());
                
     }  
    
    
   
    
    
    
    
}
