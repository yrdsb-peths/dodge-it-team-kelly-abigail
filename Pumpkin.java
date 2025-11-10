import greenfoot.*; 

public class Pumpkin extends Actor
{
    public void act()
    {
        // moves pumpkin
        move(-3);
        
        // resets the position of the pumpkin on the right of the screen
        if(getX() <= 0)
        {
            resetPumpkin();
        }
    }
    
    public void resetPumpkin()
    {
        // moves the pumpkin up and down randomly
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
