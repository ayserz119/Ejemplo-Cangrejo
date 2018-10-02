import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    
    private int gusanosComidos;
    ArrayList<Gusano>gusanos;
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        
        Crab c1= new Crab();
        Langosta L1 = new Langosta();
        
         addObject(c1, 100,50);
         addObject(L1, 500,90);
        
        //gusano g1= new gusano();
        
        gusanos=new ArrayList<Gusano>();
        Gusano g;
        
        //creamos un ciclo para crear los gusanos y agregarlos al mundo 
        
        for(int i=0; i<20; i++)
        {
            g= new Gusano();
            gusanos.add(g);
            addObject(g, Greenfoot.getRandomNumber(560)+1,Greenfoot.getRandomNumber(560)+1);
        }
        
        private void prepara(int numGusanos)
        {
            
        }
    }
}
