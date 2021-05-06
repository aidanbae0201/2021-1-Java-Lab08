package edu.handong.csee.java.hw2.converters;
/**
 * this public class will trigger when "all" is typed by the user
 * this class converts the original measure to every target measure possible.
 */
public class AllConverter {
    private double fromValue;
    private double convertedValue=0.0D;
    private double convertedValue2=0.0D;
    private String targetMeasure;
    private String targetMeasure2;
    private String originalMeasure;
/**
 * this method will set fromValue from user
 * @param fromValue this is the input from user
 * @return it will return itself for method chaining purposes
 */
    public AllConverter setFromValue(double fromValue)
    {
        this.fromValue = fromValue;
        return this;
    }
/**
 * this method will set original measure from user
 * @param originalMeasure this is the measure input by user
 * @return it will return itself for method chaining purposes
 */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        
        this.originalMeasure = originalMeasure;
        return this;
    }
/**
 * this method will convert the original measure to every possible target measure
 * and print out its result.
 * @return it will return itself for method chaining purposes.
 */
    public AllConverter convertAndPrintOut()
    {
        if(this.originalMeasure.equals("KM")){
            this.targetMeasure = "M";
            this.convertedValue = this.fromValue*1000;
            this.targetMeasure2 = "MILE";
            this.convertedValue2 = this.fromValue/1.6;
            System.out.println(this.fromValue + " " + this.originalMeasure + " to " + this.convertedValue + " " + this.targetMeasure);
            System.out.println(this.fromValue + " " + this.originalMeasure + " to " + this.convertedValue2 + " " + this.targetMeasure2);
        }
        else if(this.originalMeasure.equals("TON")){
            this.targetMeasure = "KG";
            this.convertedValue = this.fromValue * 1000;
            this.targetMeasure2 = "G";
            this.convertedValue2 = this.fromValue * 1000000;
            System.out.println(this.fromValue + " " + this.originalMeasure + " to " + this.convertedValue + " " + this.targetMeasure);
            System.out.println(this.fromValue + " " + this.originalMeasure + " to " + this.convertedValue2 + " " + this.targetMeasure2);
        }
        else
            System.out.println("AllConverter cannot support the measure!");
        return this;
    }

}
