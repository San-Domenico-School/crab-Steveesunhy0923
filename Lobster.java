import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the lobster character class.
 * 
 * @Steve Sun (your name) 
 * @version sept 26 (a version number or a date)
 */

public class Lobster extends Actor
{
    private int speed = 3;
    
    public void act()
    {
        move(speed);
        turnAtEdge();
    }
    
    // Turn when the lobster hits the edge of the scene
    public void turnAtEdge()
    {
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 45);  // Random turn angle
        }
    }
}

