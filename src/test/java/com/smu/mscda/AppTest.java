package com.smu.mscda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCapitalize()
    {
        assertEquals( "EEE", App.capitilize("eee"));
    }

    @Test
    public void testMd5Hex()
    {
        assertEquals("faafc315b95987fc2b071bcd8f698b81", App.md5("HH"));
    }
}
