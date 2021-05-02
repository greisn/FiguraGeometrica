/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public abstract class FiguraGeometrica {
    
    protected double area;
    protected double perimetro;

    public FiguraGeometrica() { }

    public FiguraGeometrica(int area, int perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
    public abstract double calculaArea();
    
    public abstract double calculaPerimetro();
    
     public abstract void ExibeDados();   
    
     
}
