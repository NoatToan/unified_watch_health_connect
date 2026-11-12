package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMForecastWeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar date;
    private Calendar pubTime = null;
    private int weatherFrom = -1;
    private int weatherTo = -1;
    private int maxTemperature = 0;
    private int minTemperature = 0;
    private String weatherDescription = null;

    public HMForecastWeatherInfo(Calendar calendar) {
        this.date = calendar;
    }

    public Calendar getCalendar() {
        return this.date;
    }

    public int getIndex() {
        Calendar calendar = this.pubTime;
        if (calendar == null || this.date == null) {
            return -1;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        Calendar calendar3 = (Calendar) this.date.clone();
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
        return this.maxTemperature;
    }

    public int getMinTemperature() {
        return this.minTemperature;
    }

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public String getWeatherDescription() {
        return this.weatherDescription;
    }

    public int getWeatherFrom() {
        return this.weatherFrom;
    }

    public int getWeatherTo() {
        return this.weatherTo;
    }

    public void setDate(Calendar calendar) {
        this.date = calendar;
    }

    public void setMaxTemperature(int i) {
        this.maxTemperature = i;
    }

    public void setMinTemperature(int i) {
        this.minTemperature = i;
    }

    public void setPubTime(Calendar calendar) {
        this.pubTime = calendar;
    }

    public void setWeatherDescription(String str) {
        this.weatherDescription = str;
    }

    public void setWeatherFrom(int i) {
        this.weatherFrom = i;
    }

    public void setWeatherTo(int i) {
        this.weatherTo = i;
    }

    public String toString() {
        return "HMForecastWeatherInfo{pubTime=" + this.pubTime + ", date=" + this.date + ", weatherFrom=" + this.weatherFrom + ", weatherTo=" + this.weatherTo + ", maxTemperature=" + this.maxTemperature + ", minTemperature=" + this.minTemperature + ", weatherDescription='" + this.weatherDescription + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
