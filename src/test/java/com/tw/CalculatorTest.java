package com.tw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

  @InjectMocks
  Calculator calculator;
  @Test
  public void shouldAdd(){
    assertTrue(calculator.sum(3, 4) == 7);
  }
  @Test
  public void shouldSubtract(){
    assertTrue(calculator.subtract(5,3)==2);
  }
  @Test
  public void shouldMultiply(){
    assertTrue(calculator.multiply(3,4)==12);
  }
  @Test
  public void shouldDivide(){
    assertTrue(calculator.divide(12, 3)==4);
  }
}