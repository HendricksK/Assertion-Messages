/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.calculator.Configuration;

import cputgroup3a.calculator.Service.CalculatorService;
import cputgroup3a.calculator.Service.Impl.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author kurvin
 */
@Configuration 
public class AppConfig {
    @Bean(name="calculator")
    public CalculatorService getServicenew(){
        return new CalculatorServiceImpl();
    }
}
