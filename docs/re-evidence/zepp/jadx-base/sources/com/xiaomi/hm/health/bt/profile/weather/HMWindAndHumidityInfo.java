package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMWindAndHumidityInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar a;
    private String b;
    private String c;
    private int d = -1;
    private int e = -1;
    private float f = -1.0f;

    public HMWindAndHumidityInfo(String windDesc, String humidityDesc) {
        this.b = windDesc;
        this.c = humidityDesc;
    }

    public int getHumidity() {
        return this.e;
    }

    public String getHumidityDesc() {
        return this.c;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public String getWindDesc() {
        return this.b;
    }

    public float getWindDirection() {
        return this.f;
    }

    public int getWindLevel() {
        return this.d;
    }

    public void setHumidity(int humidity) {
        this.e = humidity;
    }

    public void setHumidityDesc(String humidityDesc) {
        this.c = humidityDesc;
    }

    public void setPubTime(Calendar pubTime) {
        this.a = pubTime;
    }

    public void setWindDesc(String windDesc) {
        this.b = windDesc;
    }

    public void setWindDirection(float windDirection) {
        this.f = windDirection;
    }

    public void setWindLevel(int windLevel) {
        this.d = windLevel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMRealtimeAqi{pubTime=");
        Calendar calendar = this.a;
        sb.append(calendar == null ? null : calendar.getTime());
        sb.append(", windDesc=");
        sb.append(this.b);
        sb.append(", humidityDesc='");
        sb.append(this.c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
