import greenfoot.*;

/**
 * Write a description of class rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Instructions.  
 * 
 * You can use these keys "j,k, and o".
 * j - jump small
 * k - jump big
 * o - turn  Note, you can only turn based on the instance variable turnAmount.
 * 
 * A jump consists of a call to move(smallJump) or move(bigJump)
 * each jump increments the currJump counter. When it reaches maxJumps it goes
 * into inRestMode. At this point in time, you start the restCycle counter.
 * 
 * Make sure you are not jumping into the edge of the world. When you get close,
 * turn 180.
 * 
 * Your job is to stay away from the fox.
 * 
 * Use GIT to make a repository for your version.  Each partner should be only
 * updating their actor code in synchs back to GIT.  Both partners can work on
 * the Field code.
 * 
 * 
 */
public class rabbit extends Actor
{
    
    private int smallJump=25;  // You can play with these two values but their sum must
    private int bigJump=50;    // be less than or equal to 75
    
    private int turnAmount=-10; // you can set this between 5 and 20. Fixed for duration of game
                               // turnAmount must be a multiple of 5.
                   
    private int maxJumps  = 4;  // Can be 1 to 5
    private int currJump =  0;  // counter to keep track of number of jumps before
                                // rabbit goes into rest mode.
    
    private int restCycle = 500; // This is the number of act cycles that
                                 // a rabbit must rest when he is in rest mode.
                                 // When in rest mode, a rabbit is completely still.
    private boolean inRestMode = false; // Set to true after maxJumps                            
    /**
     * Act - do whatever the rabbit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("d"))
        move(smallJump);
        
        if(Greenfoot.isKeyDown("f"))
        move(bigJump);
        
        if(Greenfoot.isKeyDown("a"))
        move(turnAmount);
    }    
}
