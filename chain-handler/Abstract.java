import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class AbstractClass{
    AbstractClass next;

    abstract void sayHello();
}

class Hello extends AbstractClass{
    
    @Override
    public void sayHello(){
        System.out.println("HEllo");
    }
}

class World extends AbstractClass{
    
    @Override
    public void sayHello(){
        System.out.println("World");
    }
}

public class Abstract{
    public static void main(String args[]){
        List<AbstractClass> chainHandler = new ArrayList<>();
        chainHandler.add(new Hello());
        chainHandler.add(new World());
        for(AbstractClass abstractClass: chainHandler){
            abstractClass.sayHello();
        }
    }
}