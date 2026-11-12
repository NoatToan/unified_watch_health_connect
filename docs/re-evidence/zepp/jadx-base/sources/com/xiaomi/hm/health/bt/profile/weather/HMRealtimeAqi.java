package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMRealtimeAqi implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar a = null;
    private int b = -1;
    private String c = null;

    public int getAqi() {
        return this.b;
    }

    public String getAqiDescription() {
        return this.c;
    }

    public Calendar getPubTime() {
        return this.a;
    }

    public void setAqi(int aqi) {
        this.b = aqi;
    }

    public void setAqiDescription(String aqiDescription) {
        this.c = aqiDescription;
    }

    public void setPubTime(Calendar pubTime) {
        this.a = pubTime;
    }

    public String toString() {
        return "HMRealtimeAqi{pubTime=" + this.a + ", aqi=" + this.b + ", aqiDescription='" + this.c + "'}";
    }
}
