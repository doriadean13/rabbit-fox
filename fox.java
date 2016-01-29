import greenfoot.*;
import  java.lang.Math.*;

/**

 */
public class fox extends Actor
{

    private boolean running=false;
    private boolean inRestMode=false; // set to true any time a fox exits running mode
    private int restTime=100; // act cycles that a fox must rest after running
    private int foxSpeed=5;  //  this can be 5 to 25. 
                             //  when resting, must be 5, when running
    int speed = 2;
    public boolean isAtEdge =false;
                             //  can be up to 25.
    private int runCycle=10; //  max act cycles that a fox can run  
    private int turnAmount=5;   // set to anything between 1 and 15.
    
    
    /**
     * Act - do whatever the fox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        move(speed);
        
        if(isAtEdge==true)
        {
            setLocation (0, (int)(Math.random(580)*20));
        }
        /**
        if(Greenfoot.isKeyDown("r"))
        {
            running = true;
            inRestMode=false;
            while(
            
            move(
        }
        */
    }    
}
