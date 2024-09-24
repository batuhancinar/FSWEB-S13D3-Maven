package org.example;

public class Wall {
    double width;
    double height;
    public Wall (double width, double height){
        this.width = width;
        this.height= height;
    
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width) {
        this.width = width;
        if(width < 0){
            width =0;
        }
        return width;
    }
    public double getArea(){
        return width*height;
    }
}
