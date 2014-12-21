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

}