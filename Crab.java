import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        move(4);
        if(Greenfoot.isKeyDown("up"))
        {
           setRotation(270);
        }
        
         if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        
          if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        
         if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        
        if (isTouching(Gusano.class))
        {
            removeTouching(Gusano.class);
            Greenfoot.playSound("eating.wav");
        }
        
        if (isTouching(Langosta.class))
        {
            Label perdiste = new Label ("Perdiste una vida", 30);
            getWorld().addObject(perdiste, 250,250);
            
            
        }
        
    }    
    
    
}
