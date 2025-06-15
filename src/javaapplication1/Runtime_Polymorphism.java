package javaapplication1;

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Robin b1 = new Robin(); 
        b1.sing();
       
    }
}

class Bird {
        public void sing () {
            System.out.println("Birds Singing");
   }
}

class Robin extends Bird {
    @Override
    public void sing(){
        System.out.println("Birds Robin Tweet");
    }
}