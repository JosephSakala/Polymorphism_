
class animal{
    public void move(){
        System.out.print("Animals move");
        
    }
    public void eat(){
        System.out.println("Animals eat");
    }

}

class dog extends animal{
    public void move(){
        System.out.println("Dogs walk and run");
    }
    public void eat(){
        System.out.println("Dogs eat bones"); 
    }
}

class fish extends animal{
    public void move(){
        System.out.println("Fish swims");
    }
    public void eat(){
        System.out.println("Fish eats larva");
    }
}



public class Polymophism {

    public static void main(String []args){

        animal  obj = new animal();
        animal obj1 = new dog();
        animal obj2 = new fish();


        obj.move();
        obj.move();

        obj1.move();
        obj1.eat();

        obj2.move();
        obj2.eat();

    }
    
}
