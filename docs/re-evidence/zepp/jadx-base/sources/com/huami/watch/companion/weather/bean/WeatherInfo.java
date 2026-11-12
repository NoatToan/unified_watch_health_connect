package com.huami.watch.companion.weather.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherInfo {
    private Alert alert;
    private String aqiLevelDescription;
    private String city;

    @SerializedName("sd")
    private String humidity;

    @SerializedName("temp")
    private int temperature;
    private long time;
    private String uv;
    private String uvIndex;
    private int weather;
    private String weatherCategory;
    private String windDirection;
    private String windDirectionUnit;
    private String windDirectionValue;

    @SerializedName("windStrength")
    private String windForce;
    private String windSpeedUnit;
    private String windSpeedValue;
    private int aqi = -1;
    private int pm25 = -1;
    private int aqiLevel = 0;
    private float windDirectionAngle = -1.0f;
    private int windForceValue = -1;
    private Forecast[] forecasts = new Forecast[0];

    public static class Alert {
        private String detail;
        private String level;
        private String time_pub;
        private String title;
        private String type;

        public String getDetail() {
            return this.detail;
        }

        public String getLevel() {
            return this.level;
        }

        public String getTime_pub() {
            return this.time_pub;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setDetail(String str) {
            this.detail = str;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public void setTime_pub(String str) {
            this.time_pub = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String toString() {
            return "Type : " + this.type + ", Title : " + this.title + ", Detail : " + this.detail + ", Level : " + this.level + ", time_pub : " + this.time_pub;
        }
    }

    public static class Forecast {
        private int day;
        private Calendar sunriseTime;
        private Calendar sunsetTime;

        @SerializedName("temp")
        private String temperature;
        public int weatherFrom;
        public int weatherTo;

        public int getDay() {
            return this.day;
        }

        public Calendar getSunriseTime() {
            return this.sunriseTime;
        }

        public Calendar getSunsetTime() {
            return this.sunsetTime;
        }

        public String getTemperature() {
            return this.temperature;
        }

        public int getWeatherFrom() {
            return this.weatherFrom;
        }

        public int getWeatherTo() {
            return this.weatherTo;
        }

        public void setDay(int i) {
            this.day = i;
        }

        public void setSunriseTime(Calendar calendar) {
            this.sunriseTime = calendar;
        }

        public void setSunsetTime(Calendar calendar) {
            this.sunsetTime = calendar;
        }

        public void setTemperature(String str) {
            this.temperature = str;
        }

        public void setWeatherFrom(int i) {
            this.weatherFrom = i;
        }

        public void setWeatherTo(int i) {
            this.weatherTo = i;
        }

        public String toString() {
            return "Day : " + this.day + ", Weather : " + this.weatherFrom + Constants.WAVE_SEPARATOR + this.weatherTo + ", SunriseTime : " + this.sunriseTime + ", SunsetTime : " + this.sunsetTime + ", Temp : " + this.temperature;
        }
    }

    public Alert getAlert() {
        return this.alert;
    }

    public int getAqi() {
        return this.aqi;
    }

    public int getAqiLevel() {
        return this.aqiLevel;
    }

    public String getAqiLevelDescription() {
        return this.aqiLevelDescription;
    }

    public String getCity() {
        return this.city;
    }

    public Forecast[] getForecasts() {
        return this.forecasts;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public int getPm25() {
        return this.pm25;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public long getTime() {
        return this.time;
    }

    public String getUv() {
        return this.uv;
    }

    public String getUvIndex() {
        return this.uvIndex;
    }

    public int getWeather() {
        return this.weather;
    }

    public String getWeatherCategory() {
        return this.weatherCategory;
    }

    public String getWindDirection() {
        return this.windDirection;
    }

    public float getWindDirectionAngle() {
        return this.windDirectionAngle;
    }

    public String getWindDirectionUnit() {
        return this.windDirectionUnit;
    }

    public String getWindDirectionValue() {
        return this.windDirectionValue;
    }

    public String getWindForce() {
        return this.windForce;
    }

    public int getWindForceValue() {
        return this.windForceValue;
    }

    public String getWindSpeedUnit() {
        return this.windSpeedUnit;
    }

    public String getWindSpeedValue() {
        return this.windSpeedValue;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public void setAqi(int i) {
        this.aqi = i;
    }

    public void setAqiLevel(int i) {
        this.aqiLevel = i;
    }

    public void setAqiLevelDescription(String str) {
        this.aqiLevelDescription = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setForecasts(Forecast[] forecastArr) {
        this.forecasts = forecastArr;
    }

    public void setHumidity(String str) {
        this.humidity = str;
    }

    public void setPm25(int i) {
        this.pm25 = i;
    }

    public void setTemperature(int i) {
        this.temperature = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setUv(String str) {
        this.uv = str;
    }

    public void setUvIndex(String str) {
        this.uvIndex = str;
    }

    public void setWeather(int i) {
        this.weather = i;
    }

    public void setWeatherCategory(String str) {
        this.weatherCategory = str;
    }

    public void setWindDirection(String str) {
        this.windDirection = str;
    }

    public void setWindDirectionAngle(float f) {
        this.windDirectionAngle = f;
    }

    public void setWindDirectionUnit(String str) {
        this.windDirectionUnit = str;
    }

    public void setWindDirectionValue(String str) {
        this.windDirectionValue = str;
    }

    public void setWindForce(String str) {
        this.windForce = str;
    }

    public void setWindForceValue(int i) {
        this.windForceValue = i;
    }

    public void setWindSpeedUnit(String str) {
        this.windSpeedUnit = str;
    }

    public void setWindSpeedValue(String str) {
        this.windSpeedValue = str;
    }

    public String toString() {
        return "<Time: " + TimeUtil.formatDateTime(this.time) + ", Weather: " + this.weather + ", WeatherCategory: '" + this.weatherCategory + "', Temperature: " + this.temperature + ", City: '" + this.city + "', Aqi: " + this.aqi + ", Pm25: " + this.pm25 + ", AqiLevel: " + this.aqiLevel + ", AqiLevelDescription: '" + this.aqiLevelDescription + "', Humidity: '" + this.humidity + "', WindDirection: '" + this.windDirection + "', WindDirectionAngle: " + this.windDirectionAngle + ", WindForce: '" + this.windForce + "', WindForceValue: " + this.windForceValue + ", Uv: '" + this.uv + "', WindDirectionUnit: '" + this.windDirectionUnit + "', WindDirectionValue: '" + this.windDirectionValue + "', WindSpeedUnit: '" + this.windSpeedUnit + "', WindSpeedValue: '" + this.windSpeedValue + "', UvIndex: '" + this.uvIndex + "', forecasts: " + Arrays.toString(this.forecasts) + ", Alert: " + this.alert + Typography.greater;
    }
}
