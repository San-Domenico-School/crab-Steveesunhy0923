import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    private void prepareScene()
    {
        // instantiate new objects
        addPlayer();
        addFood();
        addEnemy();
        System.out.println(Math.sqrt(16));
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Greenfoot.getRandomNumber(10));
        System.out.println(Greenfoot.getRandomNumber(10));
        System.out.println(Greenfoot.getRandomNumber(10));
        
        
        Lobster lobster = new Lobster();
        addObject(lobster, 500, 300);
        
        for (int i = 0; i < 8; i++) {
            Worm worm = new Worm();
            addObject(worm, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }

    }
    private void addPlayer() 
    {
        Crab crab = new Crab();

        
        addObject(crab, 400, 100);
        
    
    }
    private void addFood()
    {
        System.out.println("Food added.");
    }
    private void addEnemy()
    {
        System.out.println("Enemy added.");
    }

        
}