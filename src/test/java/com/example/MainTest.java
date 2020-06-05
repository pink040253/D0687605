package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Main}.
 *
 * @author user@example.com (Author)
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnit4.class)
public class MainTest {

    @Test(expected = Exception.class)
        public void testCheckStandard() throws Exception {
        assertEquals(1, t.checkTriangle(3, 3, 3));
    }
    @Test(expected = Exception.class)
        public void testCheckRight() throws Exception {
        assertEquals(2, t.checkTriangle(3, 4, 5));
    }
    @Test(expected = Exception.class)
        public void testCheckIsosceles() throws Exception {
        assertEquals(3, t.checkTriangle(5, 5, 3));
    }
    @Test(expected = Exception.class)
        public void testCheckTriangle1() throws Exception {
        assertEquals(0, t.checkTriangle(0, 0, 0));
    }
    @Test(expected = Exception.class)
        public void testCheckTriangle2() throws Exception {
        assertEquals(0, t.checkTriangle(-1, -1, 0));
    }
    @Test(expected = Exception.class)
        public void testCheckTriangle3() throws Exception {
        assertEquals(0, t.checkTriangle(1, 3, 2));
    }
}
