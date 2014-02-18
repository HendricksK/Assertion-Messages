/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cputgroup3a.calculator;

import cputgroup3a.calculator.Service.CalculatorService;
import cputgroup3a.calculator.Configuration.AppConfig;
import org.testng.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private static CalculatorService cs;
    private static CalculatorService cs2;

    @Test
    public void add() {
        Assert.assertEquals(cs.add(2, 5), 7);
    }

    @Test
    public void addDouble() {
        Assert.assertEquals(cs.add(26.3, 12.6), 38.9, 0.2);

    }

    @Test
    public void addDFail() {
        Assert.assertEquals(cs2.add(26.3, 12.4), 38.7, 0.1, "Addition failed: ");
    }

    @Test
    public void addFloat() {
        Assert.assertEquals(cs.addF(1000, -500), 500, 2);
    }

    @Test
    public void addFFail() {
        Assert.assertEquals(cs.addF(1000, -550), 452, 2, "Addition failed: ");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cs = (CalculatorService) ctx.getBean("calculator");
        cs2 = (CalculatorService) ctx.getBean("calculator");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        cs = null;
        cs2 = null;
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

}
