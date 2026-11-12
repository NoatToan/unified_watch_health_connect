package com.xiaomi.hm.health.locweather.model;

import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class RealtimeWeatherInfo {
    private static final int m = 3900000;
    private Calendar a = null;
    private Calendar b = null;
    private int c;
    private int d;
    private String e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private boolean l;

    public static RealtimeWeatherInfo fromJsonString(String str) {
        try {
            RealtimeWeatherInfo realtimeWeatherInfo = new RealtimeWeatherInfo();
            JSONObject jSONObject = new JSONObject(str);
            long j = jSONObject.getLong("pubtime");
            long j2 = jSONObject.getLong("date");
            int i = jSONObject.getInt("currentWeather");
            int i2 = jSONObject.getInt("currentTemperature");
            String strOptString = jSONObject.optString("currentTemperatureUnit");
            float fOptDouble = (float) jSONObject.optDouble("humidity", 0.0d);
            float fOptDouble2 = (float) jSONObject.optDouble("windDirection", 0.0d);
            float fOptDouble3 = (float) jSONObject.optDouble("windSpeed", 0.0d);
            int iOptInt = jSONObject.optInt("uvi", -1);
            int iOptInt2 = jSONObject.optInt("pm25", -1);
            int iOptInt3 = jSONObject.optInt("pm10", -1);
            boolean zOptBoolean = jSONObject.optBoolean("success");
            realtimeWeatherInfo.setCurrentTemperature(i2);
            realtimeWeatherInfo.setCurrentWeather(i);
            realtimeWeatherInfo.setCurrentTemperatureUnit(strOptString);
            realtimeWeatherInfo.setHumidity(fOptDouble);
            realtimeWeatherInfo.setWindDirection(fOptDouble2);
            realtimeWeatherInfo.setWindSpeed(fOptDouble3);
            realtimeWeatherInfo.setUvi(iOptInt);
            realtimeWeatherInfo.setPm25(iOptInt2);
            realtimeWeatherInfo.setPm10(iOptInt3);
            realtimeWeatherInfo.setSuccess(zOptBoolean);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            realtimeWeatherInfo.setDate(calendar);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j);
            realtimeWeatherInfo.setPubTime(calendar2);
            return realtimeWeatherInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean expired() {
        return System.currentTimeMillis() - this.a.getTimeInMillis() >= 3900000;
    }

    public int getCurrentTemperature() {
        return this.d;
    }

    public String getCurrentTemperatureUnit() {
        return this.e;
    }

    public int getCurrentWeather() {
        return this.c;
    }

    public Calendar getDate() {
        return this.b;
    }

    public float getHumidity() {
        return this.f;
    }

    public int getPm10() {
        return this.k;
    }

    public int getPm25() {
        return this.j;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public int getUvi() {
        return this.i;
    }

    public float getWindDirection() {
        return this.g;
    }

    public float getWindSpeed() {
        return this.h;
    }

    public boolean isSuccess() {
        return this.l;
    }

    public void setCurrentTemperature(int i) {
        this.d = i;
    }

    public void setCurrentTemperatureUnit(String str) {
        this.e = str;
    }

    public void setCurrentWeather(int i) {
        this.c = i;
    }

    public void setDate(Calendar calendar) {
        this.b = calendar;
    }

    public void setHumidity(float f) {
        this.f = f;
    }

    public void setPm10(int i) {
        this.k = i;
    }

    public void setPm25(int i) {
        this.j = i;
    }

    public void setPubTime(Calendar calendar) {
        this.a = calendar;
    }

    public void setSuccess(boolean z) {
        this.l = z;
    }

    public void setUvi(int i) {
        this.i = i;
    }

    public void setWindDirection(float f) {
        this.g = f;
    }

    public void setWindSpeed(float f) {
        this.h = f;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pubtime", this.a.getTimeInMillis());
            jSONObject.put("date", this.b.getTimeInMillis());
            jSONObject.put("currentWeather", this.c);
            jSONObject.put("currentTemperature", this.d);
            jSONObject.put("currentTemperatureUnit", this.e);
            jSONObject.put("humidity", this.f);
            jSONObject.put("windDirection", this.g);
            jSONObject.put("windSpeed", this.h);
            jSONObject.put("uvi", this.i);
            jSONObject.put("pm25", this.j);
            jSONObject.put("pm10", this.k);
            jSONObject.put("success", this.l);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "RealtimeWeatherInfo{pubTime=" + WeatherLogUtilKt.wrapCalender(this.a) + ", date=" + WeatherLogUtilKt.wrapCalender(this.b) + ", currentWeather=" + this.c + ", currentTemperature=" + this.d + ", currentTemperatureUnit=" + this.e + ", humidity=" + this.f + ", windSpeed=" + this.h + ", windDirection=" + this.g + ", success=" + this.l + '}';
    }
}
