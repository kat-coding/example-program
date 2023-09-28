package edu.greenriver.sdev.exampleprogram.controllers;

import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* This class declares any routes to HTTP resources.
*
* @author Katherine Watkins
* @version 1.0
* */

@RestController
@RequestMapping("api/v1")
public class WeatherApi
{
    /**
     * Returns data to be used in UI
     * @return some weather data (not a web page)
     */
    @GetMapping(path = "weather")
  public List<WeatherReading> getReadings()
  {
      return List.of(
              new WeatherReading("Seattle", "Sunny", 70.0, "9/26/2023"),
              new WeatherReading("Puyallup", "Rain", 62.0, "10/1/2023"),
              new WeatherReading("Olympia", "Rain", 75.0, "10/1/2023")
      );
  }

  @GetMapping(path = "temps")
    public List<Double> getAllTemps()
  {
       return List.of(70.0, 68.0, 56.0, 99.0);
  }
}
