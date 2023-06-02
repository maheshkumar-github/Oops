   public class oops
{
    public static void main(String[] args) {
       Fan2 f1=new Fan2();
       Fan2 f2=new Fan2();
       Fan2 f3=new Fan2();
    //    f1.Speed();
    //    f1.starting();
    //    f2.stopping();
    f1.sound();
        
    }

    
}
class Fan2{
    String brand="LG";
    int price=1000;
    int blades=4;
    String color="black";
    
    void starting(){
        System.out.println("Fan is  Starting......");
    }
    void stopping(){
        System.out.println("Fan is Stopping>>>>");
    }
    void Speed(){
        System.out.println("very fast!!!!!");
    }
    void sound(){
        System.out.println("NOISELESS");
    }

}


    
