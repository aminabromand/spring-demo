package com.example.springdemo.demopackage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoFileTest {

    DemoFile demoFile;

    @BeforeAll()
    void setUp() {
        demoFile = new DemoFile();
    }

    @Test
    void demoMethod() {
        String expectedResult = "demo";
        String result = demoFile.demoMethod();
        assertEquals(expectedResult, result);
    }
}
