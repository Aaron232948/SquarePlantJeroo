import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  Island subclass.
 *  Is the world for jeroo.
 *
 *  @author Aaron Whang (aaronw04)
 *  @version (2022.02.18)
 */
public class Lab05Island
    extends Island
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Lab05Island object.
     */
    public Lab05Island()
    {
        super();
    }


    //~ Methods ...............................................................
    /**
     * myProgram method.
     */
    public void myProgram()
    {
        SquarePlanter jarvis = new SquarePlanter(4);
        this.addObject(jarvis, 1, 1);
        jarvis.plantSquare();
    }
}
