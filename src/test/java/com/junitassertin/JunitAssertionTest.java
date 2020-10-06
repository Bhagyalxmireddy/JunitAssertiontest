package com.junitassertin;

import org.junit.Assert;
import org.junit.Test;

public class JunitAssertionTest {
    @Test
    public void assertionTests() {
        String string1 = "Junit";
        String string2 = "Junit";
        Object obj1 = new Object();
        Object obj2 = new Object();
        String string5 = null;
        int variables1 = 1;
        int variables2 = 2;
        int[] airthematicArray1 = { 1, 2, 3 };
        int[] airthematicArray2 = { 1, 2, 3 };

        Assert.assertEquals(string1,string2);
        Assert.assertSame(string1,string2);
        Assert.assertSame(obj1,obj1);
        Assert.assertNotSame(obj1,obj2);
        Assert.assertNotNull(string1);
        Assert.assertNull(string5);
        Assert.assertTrue(variables1<variables2);
        Assert.assertArrayEquals(airthematicArray1,airthematicArray2);
    }
}
