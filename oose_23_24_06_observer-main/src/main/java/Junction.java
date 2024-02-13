public class Junction {

    public final static int MAXSPEED = 70;
    
    protected int volumePerMinute = 0;
    protected float rain = 0;
    protected float windSpeed = 0;
    protected int number = 0;
    
    protected int motorwayDisplaySpeed = MAXSPEED;
    protected int speedAtNextJunction = MAXSPEED;

    public Junction(int number, WeatherData weatherData){
        this.number = number;
        rain = weatherData.getRain();
        windSpeed = weatherData.getWindSpeed();
    }

    public void updateTraffic(int volumePerMinute, int speed) {
        this.volumePerMinute = volumePerMinute;
        this.speedAtNextJunction = speed;
        display();
    }

    public void updateWeather(float rain, float windSpeed) {
        this.rain = rain;
        this.windSpeed = windSpeed;
        display();
    }


    public void display() {
        System.out.println(toString());
    }

    public String toString(){
        return number + " at speed " + motorwayDisplaySpeed;
    }

    
}
