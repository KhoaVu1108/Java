
package pq1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCapitalCity method, of class Country.
     */
    @Test
    public void testGetCapitalCity() {
        System.out.println("getCapitalCity");
        Country instance = new Country();
        String expResult = "HaNoi";
        String result = instance.getCapitalCity();
        assertEquals(expResult, result, "it should show HaNoi");

    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Country instance = new Country();
        String expResult = "VietNam";
        String result = instance.getName();
        assertEquals(expResult, result,"It should show VietNam");

    }

    /**
     * Test of setName method, of class Country.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "VietNam";
        Country instance = new Country();
        instance.setName(name);

    }
    
}
