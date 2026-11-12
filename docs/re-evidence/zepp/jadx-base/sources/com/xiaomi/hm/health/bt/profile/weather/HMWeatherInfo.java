package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class HMWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private HMRealtimeAqi b;
    private ArrayList<HMForecastWeatherInfo> c;
    private HMRealtimeWeatherInfo d;
    private String e;
    private HMWindAndHumidityInfo f;
    private HMSunriseSunsetInfo h;
    private byte a = -1;
    private ExtensionInfo g = null;

    public HMRealtimeAqi getAqiInfo() {
        return this.b;
    }

    public String getCityInfo() {
        return this.e;
    }

    public ExtensionInfo getExtensionInfo() {
        return this.g;
    }

    public ArrayList<HMForecastWeatherInfo> getForecastInfo() {
        return this.c;
    }

    public HMRealtimeWeatherInfo getRealtimeInfo() {
        return this.d;
    }

    public HMSunriseSunsetInfo getSunriseSunsetInfo() {
        return this.h;
    }

    public byte getTempUnit() {
        return this.a;
    }

    public HMWindAndHumidityInfo getWindAndHumidityInfo() {
        return this.f;
    }

    public void setAqiInfo(HMRealtimeAqi aqiInfo) {
        this.b = aqiInfo;
    }

    public void setCityInfo(String cityInfo) {
        this.e = cityInfo;
    }

    public void setExtensionInfo(ExtensionInfo extensionInfo) {
        this.g = extensionInfo;
    }

    public void setForecastInfo(ArrayList<HMForecastWeatherInfo> forecastInfos) {
        this.c = forecastInfos;
    }

    public void setRealtimeInfo(HMRealtimeWeatherInfo realtimeInfo) {
        this.d = realtimeInfo;
    }

    public void setSunriseSunsetInfo(HMSunriseSunsetInfo sunriseSunsetInfo) {
        this.h = sunriseSunsetInfo;
    }

    public void setTempUnit(byte tempUnit) {
        this.a = tempUnit;
    }

    public void setWindAndHumidityInfo(HMWindAndHumidityInfo windAndHumidityInfo) {
        this.f = windAndHumidityInfo;
    }

    public String toString() {
        return "HMWeatherInfo{aqiInfo=" + this.b + ", forecastInfos=" + this.c + ", realtimeInfo=" + this.d + ", windAndHumidity=" + this.f + ", cityInfo='" + this.e + "', extensionInfo=" + this.g + '}';
    }
}
