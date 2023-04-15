package src;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 *
 * @since 2023-04-14 Ver 1.0
 */

// Create a class ForecastDisplay.java that implements Display.
public class ForecastDisplay implements Display {

    private final WeatherStation ws;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(WeatherStation ws) {
        this.ws = ws;
        this.currentPressure = ws.getPressure();
        this.lastPressure = ws.getPressure();
    }

    /*
    It's update method should keep track of the last and current
    pressure in instance variables lastPressure and currentPressure
     */
    @Override
    public void update() {
        this.lastPressure = this.currentPressure;
        this.currentPressure = ws.getPressure();

        display(); // pretty sure it should be here
    }

    // It's display method should use the following algorithm to provide a forecast.
    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
