package com.huami.watch.companion.cloud.bean;

import com.unionpay.tsmservice.data.UniteAppStatus;

/* JADX INFO: loaded from: classes16.dex */
public class CloudWeatherRealtime {
    private UnitValue humidity;
    private UnitValue temperature;
    private String uvIndex;
    private String weather = UniteAppStatus.ILLEGAL;
    private Wind wind;

    public static class UnitValue {
        private String unit;
        private String value;

        public String getUnit() {
            return this.unit;
        }

        public String getValue() {
            return this.value;
        }

        public void setUnit(String str) {
            this.unit = str;
        }

        public void setValue(String str) {
            this.value = str;
        }
    }

    public static class Wind {
        private UnitValue direction;
        private UnitValue speed;

        public UnitValue getDirection() {
            return this.direction;
        }

        public UnitValue getSpeed() {
            return this.speed;
        }

        public void setDirection(UnitValue unitValue) {
            this.direction = unitValue;
        }

        public void setSpeed(UnitValue unitValue) {
            this.speed = unitValue;
        }
    }

    public UnitValue getHumidity() {
        return this.humidity;
    }

    public UnitValue getTemperature() {
        return this.temperature;
    }

    public String getUvIndex() {
        return this.uvIndex;
    }

    public String getWeather() {
        return this.weather;
    }

    public Wind getWind() {
        return this.wind;
    }

    public void setHumidity(UnitValue unitValue) {
        this.humidity = unitValue;
    }

    public void setTemperature(UnitValue unitValue) {
        this.temperature = unitValue;
    }

    public void setUvIndex(String str) {
        this.uvIndex = str;
    }

    public void setWeather(String str) {
        this.weather = str;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
