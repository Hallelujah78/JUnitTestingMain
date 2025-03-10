/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.junittestingmain;

/**
 *
 * @author gavan
 */
public class Grader {

    public char determineLetterGrade(int numberGrade) {

        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be 0");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

}
