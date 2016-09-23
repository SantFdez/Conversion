/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion;

import ec.edu.espe.util.UnitConstants;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class JUnitTest {
    
    public JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCMtoM(){
        Conversion conv= new Conversion();
        assertEquals(45.30D,conv.convert(4530f, UnitConstants.CM, UnitConstants.M),0.0001D);
       // assertEquals(1.49f,1.5f,0.01);
    }
    
    @Test
    public void testKMtoM(){
        Conversion conv= new Conversion();
        assertEquals(5800D,conv.convert(5.8f, UnitConstants.KM, UnitConstants.M),0.001D);
       // assertEquals(1.49f,1.5f,0.01);
    }
    
    @Test
    public void testMMtoHM(){
        Conversion conv= new Conversion();
        assertEquals(53.8910D,conv.convert(5389010f, UnitConstants.MM, UnitConstants.HM),0.001D);
       // assertEquals(1.49f,1.5f,0.01);
    }
    
}
