package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private HMRealtimeAqi aqiInfo;
    private String cityInfo;
    private ArrayList<HMForecastWeatherInfo> forecastInfos;
    private HMRealtimeWeatherInfo realtimeInfo;
    private HMSunriseSunsetInfo sunriseSunsetInfo;
    private HMWindAndHumidityInfo windAndHumidityInfo;
    private byte tempUnit = -1;
    private ExtensionInfo extensionInfo = null;

    public HMRealtimeAqi getAqiInfo() {
        return this.aqiInfo;
    }

    public String getCityInfo() {
        return this.cityInfo;
    }

    public ExtensionInfo getExtensionInfo() {
        return this.extensionInfo;
    }

    public ArrayList<HMForecastWeatherInfo> getForecastInfo() {
        return this.forecastInfos;
    }

    public HMRealtimeWeatherInfo getRealtimeInfo() {
        return this.realtimeInfo;
    }

    public HMSunriseSunsetInfo getSunriseSunsetInfo() {
        return this.sunriseSunsetInfo;
    }

    public byte getTempUnit() {
        return this.tempUnit;
    }

    public HMWindAndHumidityInfo getWindAndHumidityInfo() {
        return this.windAndHumidityInfo;
    }

    public void setAqiInfo(HMRealtimeAqi hMRealtimeAqi) {
        this.aqiInfo = hMRealtimeAqi;
    }

    public void setCityInfo(String str) {
        this.cityInfo = str;
    }

    public void setExtensionInfo(ExtensionInfo extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    public void setForecastInfo(ArrayList<HMForecastWeatherInfo> arrayList) {
        this.forecastInfos = arrayList;
    }

    public void setRealtimeInfo(HMRealtimeWeatherInfo hMRealtimeWeatherInfo) {
        this.realtimeInfo = hMRealtimeWeatherInfo;
    }

    public void setSunriseSunsetInfo(HMSunriseSunsetInfo hMSunriseSunsetInfo) {
        this.sunriseSunsetInfo = hMSunriseSunsetInfo;
    }

    public void setTempUnit(byte b2) {
        this.tempUnit = b2;
    }

    public void setWindAndHumidityInfo(HMWindAndHumidityInfo hMWindAndHumidityInfo) {
        this.windAndHumidityInfo = hMWindAndHumidityInfo;
    }

    public String toString() {
        return "HMWeatherInfo{aqiInfo=" + this.aqiInfo + ", forecastInfos=" + this.forecastInfos + ", realtimeInfo=" + this.realtimeInfo + ", windAndHumidity=" + this.windAndHumidityInfo + ", cityInfo='" + this.cityInfo + "', extensionInfo=" + this.extensionInfo + AbstractJsonLexerKt.END_OBJ;
    }
}
