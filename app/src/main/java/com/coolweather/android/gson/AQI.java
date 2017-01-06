package com.coolweather.android.gson;

/**
 * Created by SJ on 2017/1/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
