package com.xiaomi.hm.health.locweather.model;

import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AqiInfo {
    private static final int d = 3900000;
    private Calendar a = null;
    private int b = -1;
    private boolean c;

    public static AqiInfo fromJsonString(String str) {
        try {
            AqiInfo aqiInfo = new AqiInfo();
            JSONObject jSONObject = new JSONObject(str);
            long j = jSONObject.getLong("pubtime");
            int i = jSONObject.getInt("aqi");
            boolean zOptBoolean = jSONObject.optBoolean("success");
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            aqiInfo.setPubTime(calendar);
            aqiInfo.setSuccess(zOptBoolean);
            aqiInfo.setAqi(i);
            return aqiInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean expired() {
        return System.currentTimeMillis() - this.a.getTimeInMillis() >= 3900000;
    }

    public int getAqi() {
        return this.b;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public boolean isSuccess() {
        return this.c;
    }

    public void setAqi(int i) {
        this.b = i;
    }

    public void setPubTime(Calendar calendar) {
        this.a = calendar;
    }

    public void setSuccess(boolean z) {
        this.c = z;
    }

    public String toJsonString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pubtime", this.a.getTimeInMillis());
            jSONObject.put("aqi", this.b);
            jSONObject.put("success", this.c);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return "AqiInfo{pubTime=" + WeatherLogUtilKt.wrapCalender(this.a) + ", aqi=" + this.b + ", success=" + this.c + '}';
    }
}
