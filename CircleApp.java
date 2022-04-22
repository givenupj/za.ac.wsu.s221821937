import za.ac.wsu.s221821937.Circle;

public class CircleApp {
    public static void main(String[] args) {
        Circle object1 = new Circle();
        object1.setx(44);
        object1.sety(7);
        object1.setRadius((float) 7.254);

        Circle object2 = new Circle();
        object2.setx(7);
        object2.sety(8);
        object2.setRadius((float) 4.4);

        Circle object3 = new Circle();
        object3.setx(5);
        object3.sety(6);
        object3.setRadius((float) 2.555);

        System.out.println("X = " +object1.getx() +"\t"+
                            "Y = " +object1.gety() +"\t"+
                            "Radius = " +object1.getRadius() +"\t"+
                            "CalculatedArea = " +object1.getCalculatedArea() +"\t"+
                            "CalculatedDiameter = " +object1.getCalculatedDiameter() +"\t"+
                            "CalculatedCircumference = " +object1.getCalculatedCircumference());
        System.out.println("\n");

        System.out.println("X = " +object2.getx() +"\t"+
                            "Y = " +object2.gety() +"\t"+
                            "Radius = " +object2.getRadius() +"\t"+
                            "CalculatedArea = " +object2.getCalculatedArea() +"\t"+
                            "CalculatedDiameter = " +object2.getCalculatedDiameter() +"\t"+
                            "CalculatedCircumference = " +object2.getCalculatedCircumference());
        System.out.println("\n");

        System.out.println("X = " +object3.getx() +"\t"+
                            "Y = " +object3.gety() +"\t"+
                            "Radius = " +object3.getRadius() +"\t"+
                            "CalculatedArea = " +object3.getCalculatedArea() +"\t"+
                            "CalculatedDiameter = " +object3.getCalculatedDiameter() +"\t"+
                            "CalculatedCircumference = " +object3.getCalculatedCircumference());
                }

}
