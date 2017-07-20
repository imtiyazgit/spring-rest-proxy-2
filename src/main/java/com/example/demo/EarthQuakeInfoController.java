package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EarthQuakeInfoController {

    @RequestMapping("/greeting")
    public FeaturesJson features() {
        String url = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_hour.geojson";
        RestTemplate restTemplate = new RestTemplate();
        FeaturesJson featuresJson = restTemplate.getForObject(url, FeaturesJson.class);

        return featuresJson;
    }
}
