import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    // position 0 = top, 1 = middle, 2 = bottom
    int position = 0;
    public void act()
    {
        
        if (Greenfoot.mouseClicked(null)) {
            position++;
            if (position > 2) {
                // puts the hero back to the top
                position = 0;
            }
        }
        
        if (position == 0) {
            // top
            setLocation(100, 60);
        } else if (position == 1) {
            // middle
            setLocation(100, 200);
        } else if (position == 2) {
            // bottom
            setLocation(100, 350);
        }
        
    }
}
