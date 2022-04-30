import student.micro.*;
import student.micro.jeroo.*;
import static org.assertj.core.api.Assertions.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
// -------------------------------------------------------------------------
/**
 *  Tests SquarePlanter.
 *  test SquarePlanter methods.
 *
 *  @author Aaron Whang (aaronw04)
 *  @version (2022.02.18)
 */
public class SquarePlanterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private SquarePlanter planter;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquarePlanterTest test object.
     */
    public SquarePlanterTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
        this.island = new Island();
        this.planter = new SquarePlanter(4);
        this.island.addObject(this.planter, 1, 1);
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Tests hopAndPickSide1 method.
     */
    public void testHopAndPlantSide()
    {
        planter.hopAndPlantSide();
        
        assertThat(planter.getX()).isEqualTo(5);
        assertThat(planter.getY()).isEqualTo(1);
        assertThat(planter.isFacing(EAST)).isTrue();
        assertThat(planter.getFlowers()).isEqualTo(12);
        assertThat(island.countFlowers()).isEqualTo(4);
    }
    /**
     * Tests plantSquare method.
     */
    public void testPlantSquare()
    {
        planter.remove();

        // create a new jeroo
        planter = new SquarePlanter(3);
        island.addObject(planter, 1, 1);

        // plant the square
        planter.plantSquare();

        // Add your assertions to check that the square was planted properly
        assertThat(planter.getX()).isEqualTo(1);
        assertThat(planter.getY()).isEqualTo(1);
        assertThat(planter.isFacing(NORTH)).isTrue();
        assertThat(planter.getFlowers()).isEqualTo(0);
        assertThat(island.countFlowers()).isEqualTo(12);
    }
}
