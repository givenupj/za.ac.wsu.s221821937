package za.ac.wsu.s221821937;

public class Circle {
        private int x;
        private int y;
        private float Radius;

        public void setx(int X){
                x=X;
        }
        public void sety(int Y){
                y=Y;
        }
public void setRadius(float radius){
        if(radius>0){
        this.Radius=radius;
        }
        else{
        System.out.println("You have entered an invalid number, Enter a positive digit greater than zero");
        }
        }
public int getx(){

                return x;
        }
public int gety(){return y;
        }
public float getRadius(){
        return Radius;
        }
public float getCalculatedArea(){
        return (float) Math.PI*(getRadius()*getRadius());
        }
public float getCalculatedDiameter(){
        return (float) (2*getRadius());
        }
public float getCalculatedCircumference(){
        return(float)  (2*Math.PI*getRadius());
        }
}

