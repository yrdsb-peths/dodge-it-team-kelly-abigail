import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Pumpkin pumpkin = new Pumpkin();
        addObject(pumpkin, 600, 100);
    }
}
