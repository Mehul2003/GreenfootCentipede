import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Centipede here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Centipede extends Actor
{
    /**
     * Act - do whatever the Centipede wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 5;
    GreenfootImage img = getImage();
    int w2 = img.getWidth()/2;
    public void act() 
    {
        setLocation(getX() + dx, getY());
        if (getWorld().getWidth() < getX() + w2) {
            turn(90);
            move(20);
            turn(90);
            dx = -dx;
        }
        else if (getX() - w2 < 0) {
            turn(-90);
            move(20);
            turn(-90);
            dx = -dx;
        }
    }    
}
