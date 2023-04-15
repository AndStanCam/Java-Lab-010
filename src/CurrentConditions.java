package src;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 *
 * @since 2023-04-14 Ver 1.0
 */

// Create a class CurrentConditions.java that implements Display
public class CurrentConditions implements Display {


    private final WeatherStation ws;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditions(WeatherStation ws) {
        // is this what is supposed to go here?
        this.ws = ws;
    }

    /*
     It's update method should update its temperature, humidity, and pressure instance
     variables from its WeatherStation instance then call the display() method.
     */
    @Override
    public void update() {
        this.temperature = this.ws.getTemperature();
        this.humidity = this.ws.getHumidity();
        this.pressure = this.ws.getPressure();

        this.display();
    }

    /*
    It's display method should simply print out in a well
    formatted message of this object's: Temperature, Humidity, and Pressure.
     */
    @Override
    public void display() {
        System.out.printf("Current Conditions:\nTemperature: %15.2f\nHumidity: %15.2f\nPressure: %15.2f", this.temperature, this.humidity, this.pressure);
    }
}
