package com.fillumina.builder;

/**
 * This is a copy of {@link WrongBMICalculator} with the T parameter added.
 * This parameter will be used by extended classes to always return the type
 * of the extended class instead of the parent.
 *
 * @param T type of the class to be used as return type for fluent interface
 *        methods.
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class CorrectBMICalculator<T extends CorrectBMICalculator<T>> {

    // the object is immutable so setters cannot be used.
    // to avoid the confusion of a double int constructor it's better to
    // use a builder.
    protected int height;
    protected int weight;

    @SuppressWarnings("unchecked")
    public T height(final int value) {
        this.height = value;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T weight(final int value) {
        this.weight = value;
        return (T) this; // cannot be avoided
    }

    public double calculatePmi() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
