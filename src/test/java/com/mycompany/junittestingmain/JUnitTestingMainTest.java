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

/*
General Notes
- since Java 10, Java has local variable type inference:
    - Java can infer the type of "JUnitTestingMain jUnitTesting = new JUnitTestingMain();"
    - we can simply write: var jUnitTesting = new JUnitTestingMain();
- apart from assertEquals() we have:
    - assertTrue()
    - assertNotEquals() // expression that evalutes to true or false
    - assertFalse() // passes if false
    - assertNull() // passes if express is null
    - assertNotNull() // Passes if not null
- Example where our code is incorrect but our tests pass:
    - 2*2 == 4 // our code is performing multiplication not addition
    - 2+2 == 4 // this is correct
    - Because of this, you need multiple test scenarios
        - copy and paste the test method and add another scenario

 */
/**
 *
 * @author gavan
 */
public class JUnitTestingMainTest {

    public JUnitTestingMainTest() {
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

    /**
     * Test of add method, of class JUnitTestingMain.
     * Testing tutorial: https://www.youtube.com/watch?v=vZm0lHciFsQ
     * At first our unit test should test one thing.
     */
    @Test
    public void twoPlusTwoShouldEqualFour() {
        // Create instance of class.
        var jut = new JUnitTestingMain();
        int expResult = 4;
        int result = jut.add(2, 2);
        // We use assert to verify result is what we expect.
        assertEquals(expResult, result);

    }

    @Test
    public void threePlusSevenShouldEqualTen() {
        // Create instance of class.
        var jut = new JUnitTestingMain();
        int expResult = 10;
        int result = jut.add(3, 7);
        // We use assert to verify result is what we expect.
        assertEquals(expResult, result);

    }

    @Test
    public void zeroPlusZeroShouldEqualZero() {
        System.out.println("add");
        int numberA = 0;
        int numberB = 0;
        // Create instance of class.
        JUnitTestingMain jUnitTesting = new JUnitTestingMain();
        int expResult = 0;
        int result = jUnitTesting.add(numberA, numberB);
        assertEquals(expResult, result);

    }

}
