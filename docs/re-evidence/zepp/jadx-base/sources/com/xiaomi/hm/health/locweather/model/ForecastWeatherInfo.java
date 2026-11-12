package com.xiaomi.hm.health.locweather.model;

import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ForecastWeatherInfo {
    private static final int l = 29160000;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private Calendar h;
    private Calendar i;
    private boolean k;
    private Calendar a = null;
    private Calendar b = null;
    private long j = 0;

    public static ForecastWeatherInfo fromJson(JSONObject jSONObject) {
        try {
            ForecastWeatherInfo forecastWeatherInfo = new ForecastWeatherInfo();
            long jOptLong = jSONObject.optLong("sunrise", -1L);
            long jOptLong2 = jSONObject.optLong("sunset", -1L);
            long j = jSONObject.getLong("pubtime");
            long j2 = jSONObject.getLong("date");
            int i = jSONObject.getInt("weatherFrom");
            int i2 = jSONObject.getInt("weatherTo");
            int i3 = jSONObject.getInt("temperatureFrom");
            int i4 = jSONObject.getInt("temperatureTo");
            String strOptString = jSONObject.optString("temperatureUnit");
            boolean zOptBoolean = jSONObject.optBoolean("success");
            long jOptLong3 = jSONObject.optLong("lastUpdateTime", 0L);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            forecastWeatherInfo.setDate(calendar);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j);
            forecastWeatherInfo.setPubTime(calendar2);
            if (jOptLong != -1) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(jOptLong);
                forecastWeatherInfo.setSunriseTime(calendar3);
            }
            if (jOptLong2 != -1) {
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTimeInMillis(jOptLong2);
                forecastWeatherInfo.setSunsetTime(calendar4);
            }
            forecastWeatherInfo.setWeatherFrom(i);
            forecastWeatherInfo.setWeatherTo(i2);
            forecastWeatherInfo.setTemperatureFrom(i3);
            forecastWeatherInfo.setTemperatureTo(i4);
            forecastWeatherInfo.setTemperatureUnit(strOptString);
            forecastWeatherInfo.setSuccess(zOptBoolean);
            forecastWeatherInfo.setLastUpdateTime(jOptLong3);
            return forecastWeatherInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ForecastWeatherInfo fromJsonString(String str) {
        try {
            return fromJson(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean expired() {
        return System.currentTimeMillis() - this.a.getTimeInMillis() >= 29160000;
    }

    public Calendar getDate() {
        return this.b;
    }

    public long getLastUpdateTime() {
        return this.j;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public Calendar getSunriseTime() {
        return this.h;
    }

    public Calendar getSunsetTime() {
        return this.i;
    }

    public int getTemperatureFrom() {
        return this.e;
    }

    public int getTemperatureTo() {
        return this.f;
    }

    public String getTemperatureUnit() {
        return this.g;
    }

    public int getWeatherFrom() {
        return this.c;
    }

    public int getWeatherTo() {
        return this.d;
    }

    public boolean isSuccess() {
        return this.k;
    }

    public void setDate(Calendar calendar) {
        this.b = calendar;
    }

    public void setLastUpdateTime(long j) {
        this.j = j;
    }

    public void setPubTime(Calendar calendar) {
        this.a = calendar;
    }

    public void setSuccess(boolean z) {
        this.k = z;
    }

    public void setSunriseTime(Calendar calendar) {
        this.h = calendar;
    }

    public void setSunsetTime(Calendar calendar) {
        this.i = calendar;
    }

    public void setTemperatureFrom(int i) {
        this.e = i;
    }

    public void setTemperatureTo(int i) {
        this.f = i;
    }

    public void setTemperatureUnit(String str) {
        this.g = str;
    }

    public void setWeatherFrom(int i) {
        this.c = i;
    }

    public void setWeatherTo(int i) {
        this.d = i;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            Calendar calendar = this.h;
            long timeInMillis = -1;
            jSONObject.put("sunrise", calendar == null ? -1L : calendar.getTimeInMillis());
            Calendar calendar2 = this.i;
            if (calendar2 != null) {
                timeInMillis = calendar2.getTimeInMillis();
            }
            jSONObject.put("sunset", timeInMillis);
            jSONObject.put("pubtime", this.a.getTimeInMillis());
            jSONObject.put("date", this.b.getTimeInMillis());
            jSONObject.put("weatherFrom", this.c);
            jSONObject.put("weatherTo", this.d);
            jSONObject.put("temperatureFrom", this.e);
            jSONObject.put("temperatureTo", this.f);
            jSONObject.put("temperatureUnit", this.g);
            jSONObject.put("success", this.k);
            jSONObject.put("lastUpdateTime", this.j);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        if (json == null) {
            return null;
        }
        return json.toString();
    }

    public String toString() {
        return "ForecastWeatherInfo{pubTime=" + WeatherLogUtilKt.wrapCalender(this.a) + ", date=" + WeatherLogUtilKt.wrapCalender(this.b) + ", weatherFrom=" + this.c + ", weatherTo=" + this.d + ", temperatureFrom=" + this.e + ", temperatureTo=" + this.f + ", temperatureUnit=" + this.g + ", sunriseTime = " + WeatherLogUtilKt.wrapCalender(this.h) + ", sunsetTime = " + WeatherLogUtilKt.wrapCalender(this.i) + ", success=" + this.k + '}';
    }
}
