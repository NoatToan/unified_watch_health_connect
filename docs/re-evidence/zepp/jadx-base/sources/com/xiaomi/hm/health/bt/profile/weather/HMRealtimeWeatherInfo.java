package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMRealtimeWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public Calendar pubTime = null;
    private int a = -1;
    private int b = -1;
    private int c = 255;
    private String d = null;

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public int getTemprature() {
        return this.c;
    }

    public int getUvi() {
        return this.a;
    }

    public int getWeather() {
        return this.b;
    }

    public String getWeatherDescription() {
        return this.d;
    }

    public void setPubTime(Calendar pubTime) {
        this.pubTime = pubTime;
    }

    public void setTemprature(int temprature) {
        this.c = temprature;
    }

    public void setUvi(int uvi) {
        this.a = uvi;
    }

    public void setWeather(int weather) {
        this.b = weather;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.d = weatherDescription;
    }

    public String toString() {
        return "HMRealtimeWeatherInfo{pubTime=" + this.pubTime + ", weather=" + this.b + ", temprature=" + this.c + ", weatherDescription='" + this.d + "'}";
    }
}
