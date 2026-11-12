package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMForecastWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar b;
    private Calendar a = null;
    private int c = -1;
    private int d = -1;
    private int e = 0;
    private int f = 0;
    private String g = null;

    public HMForecastWeatherInfo(Calendar calendar) {
        this.b = null;
        this.b = calendar;
    }

    public Calendar getCalendar() {
        return this.b;
    }

    public int getIndex() {
        Calendar calendar = this.a;
        if (calendar == null || this.b == null) {
            return -1;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        Calendar calendar3 = (Calendar) this.b.clone();
        calendar2.clear(11);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        calendar3.clear(11);
        calendar3.clear(12);
        calendar3.clear(13);
        calendar3.clear(14);
        return (int) ((calendar3.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000);
    }

    public int getMaxTemperature() {
        return this.e;
    }

    public int getMinTemperature() {
        return this.f;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public String getWeatherDescription() {
        return this.g;
    }

    public int getWeatherFrom() {
        return this.c;
    }

    public int getWeatherTo() {
        return this.d;
    }

    public void setDate(Calendar calendar) {
        this.b = calendar;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.e = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.f = minTemperature;
    }

    public void setPubTime(Calendar pubTime) {
        this.a = pubTime;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.g = weatherDescription;
    }

    public void setWeatherFrom(int weatherFrom) {
        this.c = weatherFrom;
    }

    public void setWeatherTo(int weatherTo) {
        this.d = weatherTo;
    }

    public String toString() {
        return "HMForecastWeatherInfo{pubTime=" + this.a + ", date=" + this.b + ", weatherFrom=" + this.c + ", weatherTo=" + this.d + ", maxTemperature=" + this.e + ", minTemperature=" + this.f + ", weatherDescription='" + this.g + "'}";
    }
}
