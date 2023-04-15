package src;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 *
 * @since 2023-04-14 Ver 1.0
 */

// Create a class StatisticsDisplay.java that implements Display
public class StatisticsDisplay implements Display {

    private final WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;
    private float temperatureTotal;
    private int numReadings;


    public StatisticsDisplay(WeatherStation ws) {
        this.ws = ws;
        this.temperatureMin = ws.getTemperature();
        this.temperatureMax = ws.getTemperature();
        this.temperatureTotal = ws.getTemperature();
        this.numReadings = 1;
    }

    /*
    It's update method should update instance variables
    temperatureMin, temperatureMax, tempRunningTotal, and numReadings
     */
    @Override
    public void update() {
        float newTemp = ws.getTemperature();

        if (newTemp < this.temperatureMin) {
            this.temperatureMin = newTemp;
        }
        if (newTemp > this.temperatureMax) {
            this.temperatureMax = newTemp;
        }
        this.temperatureTotal += newTemp;
        this.numReadings++;

        display(); // You had this called in the other update()s and it makes sense so
    }

    /*
    It's display method should print out the min, max, and average temperature values.
     */
    @Override
    public void display() {
        System.out.printf("Statistics:\nMinimum Temperature: %15.2f\nMaximum Temperature: %15.2f\n Total of Temperatures: %15.2f\nNumber of Readings: %15d", this.temperatureMin, this.temperatureMax, this.temperatureTotal, this.numReadings);
    }
}
