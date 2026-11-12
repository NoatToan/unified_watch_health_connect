package com.xiaomi.hm.health.locweather.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes21.dex */
public class RealtimeWeatherInfoBean {

    @SerializedName("feelsLike")
    public UnitValue a;

    @SerializedName("humidity")
    public UnitValue b;

    @SerializedName("pressure")
    public UnitValue c;

    @SerializedName("pubTime")
    public String d;

    @SerializedName("temperature")
    public UnitValue e;

    @SerializedName("uvIndex")
    public String f;

    @SerializedName("visibility")
    public UnitValue g;

    @SerializedName("weather")
    public String h = "0";

    @SerializedName("wind")
    public Wind i;

    public static class Current {

        @SerializedName("feelsLike")
        public UnitValue a;

        @SerializedName("humidity")
        public UnitValue b;

        @SerializedName("pressure")
        public UnitValue c;

        @SerializedName("pubTime")
        public String d;

        @SerializedName("temperature")
        public UnitValue e;

        @SerializedName("value")
        public String f;

        public UnitValue getFeelsLike() {
            return this.a;
        }

        public UnitValue getHumidity() {
            return this.b;
        }

        public UnitValue getPressure() {
            return this.c;
        }

        public String getPubTime() {
            return this.d;
        }

        public UnitValue getTemperature() {
            return this.e;
        }

        public String getValue() {
            return this.f;
        }

        public void setFeelsLike(UnitValue unitValue) {
            this.a = unitValue;
        }

        public void setHumidity(UnitValue unitValue) {
            this.b = unitValue;
        }

        public void setPressure(UnitValue unitValue) {
            this.c = unitValue;
        }

        public void setPubTime(String str) {
            this.d = str;
        }

        public void setTemperature(UnitValue unitValue) {
            this.e = unitValue;
        }

        public void setValue(String str) {
            this.f = str;
        }

        public String toString() {
            return "Current{feelsLike=" + this.a + ", humidity=" + this.b + ", pressure=" + this.c + ", pubTime='" + this.d + "', temperature=" + this.e + ", value='" + this.f + "'}";
        }
    }

    public static class Wind {

        @SerializedName("direction")
        public UnitValue a;

        @SerializedName("speed")
        public UnitValue b;

        public UnitValue getDirection() {
            return this.a;
        }

        public UnitValue getSpeed() {
            return this.b;
        }

        public void setDirection(UnitValue unitValue) {
            this.a = unitValue;
        }

        public void setSpeed(UnitValue unitValue) {
            this.b = unitValue;
        }

        public String toString() {
            return "Wind{direction=" + this.a + ", speed=" + this.b + '}';
        }
    }

    public UnitValue getFeelsLike() {
        return this.a;
    }

    public UnitValue getHumidity() {
        return this.b;
    }

    public UnitValue getPressure() {
        return this.c;
    }

    public String getPubTime() {
        return this.d;
    }

    public UnitValue getTemperature() {
        return this.e;
    }

    public String getUvIndex() {
        return this.f;
    }

    public UnitValue getVisibility() {
        return this.g;
    }

    public String getWeather() {
        return this.h;
    }

    public Wind getWind() {
        return this.i;
    }

    public void setFeelsLike(UnitValue unitValue) {
        this.a = unitValue;
    }

    public void setHumidity(UnitValue unitValue) {
        this.b = unitValue;
    }

    public void setPressure(UnitValue unitValue) {
        this.c = unitValue;
    }

    public void setPubTime(String str) {
        this.d = str;
    }

    public void setTemperature(UnitValue unitValue) {
        this.e = unitValue;
    }

    public void setUvIndex(String str) {
        this.f = str;
    }

    public void setVisibility(UnitValue unitValue) {
        this.g = unitValue;
    }

    public void setWeather(String str) {
        this.h = str;
    }

    public void setWind(Wind wind) {
        this.i = wind;
    }

    public static class UnitValue {

        @SerializedName("unit")
        public String a;

        @SerializedName("value")
        public String b;

        public UnitValue() {
            this.a = "";
            this.b = "";
        }

        public String getUnit() {
            return this.a;
        }

        public String getValue() {
            return this.b;
        }

        public void setUnit(String str) {
            this.a = str;
        }

        public void setValue(String str) {
            this.b = str;
        }

        public String toString() {
            return "UnitValue{unit='" + this.a + "', value='" + this.b + "'}";
        }

        public UnitValue(String str, String str2) {
            this.a = "";
            this.b = "";
            this.a = str;
            this.b = str2;
        }
    }
}
