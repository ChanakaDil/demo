package com.example.demo.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DemoControllerTest {

    DemoController demoController;

    @Before
    public void init() {
        demoController = new DemoController();
    }

    @Test
    public void testInvalidTestCounter() {
        boolean result = demoController.testCounter(1);
        assertFalse(result);
    }

    @Test
    public void testValidTestCounter() {
        boolean result = demoController.testCounter(10);
        assertTrue(result);
    }

}
