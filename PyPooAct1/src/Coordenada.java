import java.util.*;

public class Coordenada{
    private double x;
    private double y;

    //Constructor, initialize x, y attributes to zero
    public Coordenada(){
        //fill in the code here
        
    }
    //Constructor 
    public Coordenada(double x, double y){
        //fill in the code here
        this.x = x;
        this.y = y;
    }
    //Constructor 
    public Coordenada(Coordenada c){
        //fill in the code here
    }
    //métodos setter
    void setX(double x){
        //fill in the code here
        this.x = x;
    }
    //métodos setter
    void setY(double y){
        //fill in the code here
        this.y = y;
    }
    //métodos getter
    double getX(){
        //fill in the code here
        return this.x;
    }
    //métodos getter
    double getY(){
        //fill in the code here
        return this.y;
    }
    //método de instancia que calcula la distancia euclidiana
    double distancia(Coordenada c){
        // fill in the code here
        
    }
    //método de clase que calcula la distancia euclidiana
    static double distancia(Coordenada c1, Coordenada c2){
        // fill in the code here 
    }
    //método que devuelve los valores de una coordenada en determinado formato
    String toString(){
        // fill in the code here
    }
}