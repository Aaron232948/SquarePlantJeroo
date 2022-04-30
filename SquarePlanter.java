import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  Jeroo subclass.
 *  Will plant square of flowers
 *  with given number of flowers per side.
 *
 *  @author Aaron Whang (aaronw04)
 *  @version (2022.02.18)
 */
public class SquarePlanter
    extends Jeroo
{
    //~ Fields ................................................................
    private int numFlowersPerSide;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SquarePlanter object.
     * @param flowersPerSide the number of flowers you want
     * per side of the square
     */
    public SquarePlanter(int flowersPerSide)
    {
        super(4 * flowersPerSide);
        /*# Do any work to initialize your class here. */
        this.numFlowersPerSide = flowersPerSide;
    }
    /**
     * Getter method for numFLowersPerSide field.
     * @return integer value
     */
    public int getNumFlowersPerSide()
    {
        return this.numFlowersPerSide;
    }
    /**
     * Setter method for numFLowersPerSide field.
     * @param newValue sets new value for numFLowersPerSide.
     */
    public void setNumFlowersPerSide(int newValue)
    {
        this.numFlowersPerSide = newValue;
    }


    //~ Methods ...............................................................
    /**
     * Plants flowers in a square.
     */
    public void plantSquare()
    {
        this.hopAndPlantSide();
        this.turn(RIGHT);
        this.hopAndPlantSide();
        this.turn(RIGHT);
        this.hopAndPlantSide();
        this.turn(RIGHT);
        this.hopAndPlantSide();
    }
    /**
     * Plants the side of the square
     */
    public void hopAndPlantSide()
    {
        int hopCounter = 0;
        while (hopCounter < this.getNumFlowersPerSide())
        {
            this.hop();
            this.plant();
            hopCounter++;
        }
    }
}
