package com.example.taschenrechner.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorControllerTest {

    @Test
    void addTwoPositiveIntegers(){
        //Arrange
        calculatorController controller= new calculatorController();
        int a = 5;
        int b = 2;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(7,result);
    }

    @Test
    void addTwoNegativeIntegers(){
        //Arrange
        calculatorController controller= new calculatorController();
        int a = -15;
        int b = -5;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(-20,result);
    }

    @Test
    void addOneNegativeAndOnePositiveInteger(){
        //Arrange
        calculatorController controller= new calculatorController();
        int a = 7;
        int b = -5;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(2,result);
    }



}