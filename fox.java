import greenfoot.*;

/**
 * Write a description of class fox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Instructions:
 * 1)Fill in the logic to control the fox using the following keys:
 *   "r" set fox to run mode.  when in run mode you must reset the runCycle
 *       to 0, then keep track of it, incrementing for each act cycle until
 *       it reaches runCycle.  Once it does, or once the fox is placed out
 *       of it's running mode, the restTime is set to 0, and keeps track of 
 *       how long it is resting, incrementing the restTime after each act method.
 *       Once the restTime reaches 100, you can reset the inRestMode boolean, and
 *       allow the fox to run again.
 *       
 *   "t" turn the fox, using "turn(turnAmount)". turnAmount is in degrees and is
 *   set as a fox instance variable.  
 *   
 *   "s" you can use the s key to take the fox out of run mode. This should
 *   also put him in resting mode so that he can't immediately start running
 *   again.
 *   
 *   In the act method, manage the counters above and tests for keyboard
 *   activity.  hard code the movement using "move(foxSpeed)".
 *   
 *   If the fox hits the wall, have him turn 180 degrees.  Make sure that he
 *   doesn't jump through the wall.
 *   
 *   In each act method, use "isTouching" and "removeTouching" to test
 *   to see if the fox has caught the rabit, and if so, remove it and set the 
 *   game to over (Greenfoot.stop())
 *   
 *   In summary, you have three keys that you can use to control the fox to
 *   catch the rabbit.  Note the rabbit can jump.
 *   
 */
public class fox extends Actor
{

    private boolean running=false;
    private boolean inRestMode=false; // set to true any time a fox exits running mode
    private int restTime=100; // act cycles that a fox must rest after running
    private int foxSpeed=5;  //  this can be 5 to 25. 
                             //  when resting, must be 5, when running
                             //  can be up to 25.
    private int runCycle=10; //  max act cycles that a fox can run  
    private int turnAmount=5;   // set to anything between 1 and 15.
    
    
    /**
     * Act - do whatever the fox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("r"))
        {
            runCycle=0;
            
        }
    }    
}
