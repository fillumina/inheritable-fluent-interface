package com.fillumina.builder;

/**
 * This class uses a <a href='https://en.wikipedia.org/wiki/Fluent_interface'>
 * fluent interface</a> to set its parameters.
 * Fluent interface allows to write code in a more natural way and is less
 * prone to confusion than using a long sequence of parameters often of the
 * same type (i.e.: {@code calculatePmi(93, 120)}).
 * Fluent interfaces are mostly used with builders.
 *
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class WrongBMICalculator {

    protected int height;
    protected int weight;

    public WrongBMICalculator height(final int value) {
        this.height = value;
        return this;
    }

    public WrongBMICalculator weight(final int value) {
        this.weight = value;
        return this;
    }

    public double calculatePmi() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
