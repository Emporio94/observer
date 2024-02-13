import java.util.ArrayList;
import java.util.List;

class WeatherData{
    private float rain;
    private float windSpeed;


    

    public WeatherData(){
  
    }

    public void setRain(float rain){
        this.rain = rain;
    }

    public float getRain(){
        return rain;
    }


    public void setWindSpeed(float windSpeed){
        this.windSpeed = windSpeed;
    
    }

    public float getWindSpeed(){
        return windSpeed;
    }

    public String toString(){
        return "rain: " + rain;
    }

}
