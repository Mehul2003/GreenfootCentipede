import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mehul Tailang
 * @version 1.0
 */
public class MyWorld extends World
{
    int w = getWidth();
    int h = getHeight();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Centipede centipede = new Centipede();
        addObject(centipede, w/24, h/16);
    }
}
