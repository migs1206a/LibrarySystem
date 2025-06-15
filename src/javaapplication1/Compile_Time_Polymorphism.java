package javaapplication1;

public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
      calculations c1 = new calculations();
      System.out.println(c1.Multiply (2,3));
      System.out.println(c1.Multiply (2.5, 2.5));
    }
}
class calculations {
    public int  Multiply(int a, int b) {
        return a * b;
    }
    
    public double Multiply(double a, double b)   {
        return a * b;
    }
}   
       
  