/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junittestingmain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Note: never combine multiple scenarios into a single test method. Each
 * scenario must have its own test method.
 *
 * @author gavan
 */
public class GraderTest {

    public GraderTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /*
    Scenarios:
    - <0 - exception
    - 59 = 'F' x
    - 60 = 'D' x
    - 69 = 'D' x
    - 70 = 'C' x
    - 79 = 'C' x
    - 80 = 'B' x
    - 89 = 'B' x
    - 90 = 'A' x
    - 100 = 'A' x
    - 101 = 'A'

     */
    /**
     * Test of determineLetterGrade method, of class Grader.
     */
    @Test
    public void fiftyNineShouldReturnF() {
        int numberGrade = 59;
        Grader instance = new Grader();
        char expResult = 'F';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void sixtyShouldReturnD() {
        int numberGrade = 60;
        Grader instance = new Grader();
        char expResult = 'D';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void sixtyNineShouldReturnD() {
        int numberGrade = 69;
        Grader instance = new Grader();
        char expResult = 'D';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void seventyNineShouldReturnC() {
        int numberGrade = 79;
        Grader instance = new Grader();
        char expResult = 'C';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void eightyNineShouldReturnC() {
        int numberGrade = 89;
        Grader instance = new Grader();
        char expResult = 'B';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void ninetyShouldReturnA() {
        int numberGrade = 90;
        Grader instance = new Grader();
        char expResult = 'A';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void negativeOneShouldReturnIllegalArgumentException() {
        int numberGrade = -1;
        Grader instance = new Grader();
        // Note: how we test exception is thrown.
        assertThrows(IllegalArgumentException.class, () -> {
            instance.determineLetterGrade(numberGrade);
        });

    }

    @Test
    public void eightyShouldReturnB() {
        int numberGrade = 80;
        Grader instance = new Grader();
        char expResult = 'B';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }

    @Test
    public void seventyShouldReturnB() {
        int numberGrade = 70;
        Grader instance = new Grader();
        char expResult = 'C';
        char result = instance.determineLetterGrade(numberGrade);
        assertEquals(expResult, result);

    }
}
