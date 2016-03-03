package com.fillumina.builder;

/**
 * Uses an improved formula to calculate a body mass index.
 *
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class WrongAdvancedBMICalculator extends WrongBMICalculator {
    private int waistCircumference;

    /**
     * <a href='https://en.wikipedia.org/wiki/Body_Shape_Index'>Wikipedia: ABSI</a>
     */
    @Override
    public double calculatePmi() {
        return waistCircumference /
                (Math.pow(super.calculatePmi(), 2.0/3.0) * Math.pow(height / 100, 1/3.2));
    }

    public WrongAdvancedBMICalculator waistCircumference(final int value) {
        this.waistCircumference = value;
        return this;
    }
}
