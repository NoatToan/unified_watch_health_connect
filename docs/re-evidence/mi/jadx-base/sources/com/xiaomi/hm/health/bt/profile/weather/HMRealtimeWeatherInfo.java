package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMRealtimeWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public Calendar pubTime = null;
    private int uvi = -1;
    private int weather = -1;
    private int temprature = 255;
    private String weatherDescription = null;

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public int getTemprature() {
        return this.temprature;
    }

    public int getUvi() {
        return this.uvi;
    }

    public int getWeather() {
        return this.weather;
    }

    public String getWeatherDescription() {
        return this.weatherDescription;
    }

    public void setPubTime(Calendar calendar) {
        this.pubTime = calendar;
    }

    public void setTemprature(int i) {
        this.temprature = i;
    }

    public void setUvi(int i) {
        this.uvi = i;
    }

    public void setWeather(int i) {
        this.weather = i;
    }

    public void setWeatherDescription(String str) {
        this.weatherDescription = str;
    }

    public String toString() {
        return "HMRealtimeWeatherInfo{pubTime=" + this.pubTime + ", weather=" + this.weather + ", temprature=" + this.temprature + ", weatherDescription='" + this.weatherDescription + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
