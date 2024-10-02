import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    // Fields
    private int speed = 3;  // Initialize speed
    private int turnSpeed = 5;  // Initialize turn speed
    private boolean gameOver = false;

    // Movement method using Actor's move
     public void act()
    {
    
            
        handleMovement();  // Handle keyboard movement
        turnAtEdge();     // Turn when at the edge of the scene
        checkCollision(); // Check for collisions
    
    }
    

    
    
    public void turnAtEdge()
    {
        if (isAtEdge()) {
            turn(17);  // Turns a random angle when hitting an edge
        }
    }
    
    // Collision checking for Lobster and Worms
    public void checkCollision()
    {
        // Ends the game if the crab touches the lobster
        if (isTouching(Lobster.class)) {
            Greenfoot.playSound("au.wav");
            System.out.println("Game Over,you lost");
            gameOver = true;
            Greenfoot.stop();  
            
        }
        if (isTouching(Worm.class)) {
            removeTouching(Worm.class);  
            Greenfoot.playSound("slurp.wav");
            speed++;
            //check if the worm objects are all "eaten"
            if (getWorld().getObjects(Worm.class).isEmpty()) {
                Greenfoot.playSound("fanfare.wav");
                System.out.println("You Win!!");
                Greenfoot.stop();  
            }
        }
    }
    public void handleMovement() 
    {
        // Check if the "left" arrow key is pressed
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
            move(5);  // Move left
        }
        
        // Check if the "right" arrow key is pressed
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(5);  // Move right
        }
        
        // Check if the "up" arrow key is pressed
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);  // Rotate upwards
            move(5);  // Move up
        }
        
        // Check if the "down" arrow key is pressed
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);  // Rotate downwards
            move(5);  // Move down
        }
    }
}

