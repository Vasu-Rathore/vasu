


/*class pen {
    String color;
    String type ; //ball pen

    public void write (){
        System.out.println("write something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}*/



/*public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color= "blue";
        pen1.type = "jel";

        pen pen2 = new pen();
        pen1.color= "black";
        pen1.type = "ball";


        pen1.printcolor();
        pen2.printcolor();

    }
}*/

class student {
    String name ;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

 public class oops {
    public static void main(String[] args) {
        
    
   student s1 = new student();
   s1.name = "vasu";
   s1.age = 21;


   student s2 = new student();
   s2.name = "radha";
   s2.age = 15;

   s1.printinfo();
   s2.printinfo();
 }
}