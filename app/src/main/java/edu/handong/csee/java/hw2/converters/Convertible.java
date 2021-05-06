package edu.handong.csee.java.hw2.converters;
/**
 * this public interface has the methods used in every
 * other converter
 */
public interface Convertible {
/**
 * this method will set fromValue input by user
 * @param fromValue is the value input by user
 */
    public void setFromValue(double fromValue);
/**
 * this method will load convertedValue
 * @return will return convertedValue
 */
    public double getConvertedValue();
/**
 * this method converts fromValue to convertedValue with appropriate calculations
 */
    public void convert();

}