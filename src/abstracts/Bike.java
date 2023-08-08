package abstracts;

import java.util.HashMap;

abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    public Honda(){
        System.out.println("Honda created");
    }
    void run(){System.out.println("running safely..");}
}
//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2{
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();

        Bike bike = new Bike() {
            @Override
            void run() {
                System.out.println("Run bike by abstract Object");
            }
        };

        bike.run();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread running");
            }
        });

        thread.start();

        thread.stop();


        

    }
}