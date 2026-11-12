package com.huami.watch.companion.weather.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherExtenderInfo extends WeatherInfo {
    private boolean isAlert;
    private boolean isNotification;

    @SerializedName("tempFormatted")
    private String temperatureFormatted;

    @SerializedName("tempUnit")
    private String temperatureUnit;

    @SerializedName("v")
    private int version = 1;
    private int weatherCode;

    public static class Forecast extends WeatherInfo.Forecast {

        @SerializedName("tempFormatted")
        private String temperatureFormatted;

        @SerializedName("tempMax")
        private int temperatureMax;

        @SerializedName("tempMin")
        private int temperatureMin;
        private int weatherCodeFrom = -1;
        private int weatherCodeTo = -1;

        public String getTemperatureFormatted() {
            return this.temperatureFormatted;
        }

        public int getTemperatureMax() {
            return this.temperatureMax;
        }

        public int getTemperatureMin() {
            return this.temperatureMin;
        }

        public int getWeatherCodeFrom() {
            return this.weatherCodeFrom;
        }

        public int getWeatherCodeTo() {
            return this.weatherCodeTo;
        }

        public void setTemperatureFormatted(String str) {
            this.temperatureFormatted = str;
        }

        public void setTemperatureMax(int i) {
            this.temperatureMax = i;
        }

        public void setTemperatureMin(int i) {
            this.temperatureMin = i;
        }

        public void setWeatherCodeFrom(int i) {
            this.weatherCodeFrom = i;
        }

        public void setWeatherCodeTo(int i) {
            this.weatherCodeTo = i;
        }

        @Override // com.huami.watch.companion.weather.bean.WeatherInfo.Forecast
        public String toString() {
            return "Day : " + getDay() + ", Weather From : " + this.weatherFrom + "(" + this.weatherCodeFrom + ") To : " + this.weatherTo + "(" + this.weatherCodeTo + "), Temp : " + this.temperatureMin + Constants.WAVE_SEPARATOR + this.temperatureMax;
        }
    }

    public String getTemperatureFormatted() {
        return this.temperatureFormatted;
    }

    public String getTemperatureUnit() {
        return this.temperatureUnit;
    }

    public int getVersion() {
        return this.version;
    }

    public int getWeatherCode() {
        return this.weatherCode;
    }

    public boolean isAlert() {
        return this.isAlert;
    }

    public boolean isNotification() {
        return this.isNotification;
    }

    public void setIsAlert(boolean z) {
        this.isAlert = z;
    }

    public void setIsNotification(boolean z) {
        this.isNotification = z;
    }

    public void setTemperatureFormatted(String str) {
        this.temperatureFormatted = str;
    }

    public void setTemperatureUnit(String str) {
        this.temperatureUnit = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public void setWeatherCode(int i) {
        this.weatherCode = i;
    }
}
