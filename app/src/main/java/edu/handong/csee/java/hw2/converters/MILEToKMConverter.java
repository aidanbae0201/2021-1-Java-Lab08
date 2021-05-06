package edu.handong.csee.java.hw2.converters;
/**
 * this class converts MILES to KM
 */
public class MILEToKMConverter implements Convertible{
    private double fromValue;
    private double convertedValue=0.0D;
/**
 * this method sets fromValue to the one the user inputs
 */
    public void setFromValue(double fromValue)
    {
        this.fromValue = fromValue;
    }
/**
 * this method loads the convertedValue
 */
    public double getConvertedValue()
    {
        return (this.convertedValue);
    }
/**
* this method converts fromValue to convertedValue with appropriate calculations
*/
    public void convert()
    {
        this.convertedValue = this.fromValue * 1.6;
    }
}
