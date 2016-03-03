package com.fillumina.builder;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class AdvancedBMICalculatorTest {

    @Test
    public void shouldUseAClassMethodBeforeUsingParentFluentMethod() {
        final double pmi = new WrongAdvancedBMICalculator()
                        .waistCircumference(150)
                        .height(193)
                        .weight(94)
                        .calculatePmi();
        assertEquals(17, pmi, 0.5);
    }

    @Test
    public void shouldUseAClassMethodAfterUsingParentFluentMethod() {
        final double pmi = new CorrectAdvancedBMICalculator()
                        .height(193)
                        .weight(94)
                        .waistCircumference(150) // called after parent's method
                        .calculatePmi();
        assertEquals(17, pmi, 0.5);
    }

    @Test
    public void shouldNotUseAClassMethodAfterUsingParentFluentMethod() {
        new WrongAdvancedBMICalculator().height(193).weight(94)
                //.waistCircumference(150)
                .calculatePmi();
    }
}
