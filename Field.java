import greenfoot.*;

/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{

    /**
     * Constructor for objects of class Field.
     * 
     */
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(849, 500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        fox fox = new fox();
        addObject(fox, 68, 460);
        rabbit rabbit = new rabbit();
        addObject(rabbit, 756, 84);
    }
}
