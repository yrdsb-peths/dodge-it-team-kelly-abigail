import greenfoot.*; 

public class Pumpkin extends Actor
{
    public void act()
    {
        move(-3);
        
        if(getX() <= 0)
        {
            resetPumpkin();
        }
    }
    
    public void resetPumpkin()
    {
        int x = Greenfoot.getRandomNumber(3);
        
        if(x == 0)
        {
            setLocation(600, 60);
        }
        else if (x == 1)
        {
            setLocation(600, 200);
        }
        else
        {
            setLocation(600, 350);
        }
    }
}
