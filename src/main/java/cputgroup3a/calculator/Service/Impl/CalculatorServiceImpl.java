/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.calculator.Service.Impl;

import cputgroup3a.calculator.Service.CalculatorService;

/**
 *
 * @author kurvin
 */
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b){
        System.out.println("The resulting sum of the two integer values is: " + (a+b));
        return a + b;
    }
    
    @Override
    public int devide(int a, int b){
        System.out.println("The resulting devision of the two numbers is: " + (a/b));
        return a / b;
    }
    
    @Override
    public int subtract(int a, int b){
        System.out.println("The resulting subtraction of the two numbers is: " + (a/b));
        return a - b;
    }
    
    @Override
    public double add(double a, double b){
        System.out.println("The resulting sum of the two double values is: " + (a+b));
        return a + b;
    }
    
    @Override
    public float addF(float a, float b){
        System.out.println("The resulting sum of the two float values is: " + (a+b));
        return a + b;
    }
}
