package com.jmcristobal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by josemanuel.cristobal on 23/08/2016.
 */
public class AppIT extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppIT( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppIT.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
