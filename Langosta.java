import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Langosta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Langosta extends Actor
{
    /**
     * Act - do whatever the Langosta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(6);
         if(Greenfoot.isKeyDown("right"))
        {
            setRotation( Greenfoot.getRandomNumber(20));
        }
        if (isTouching(Gusano.class))
        {
            removeTouching(Gusano.class);
        }
        
        if (isTouching(Gusano.class))
        {
            setLocation(250,250);
            Label perdiste= new Label ("Perdiste una vida", 30);
            getWorld().addObject(perdiste, 250, 250);
            
        }
    }    
}
