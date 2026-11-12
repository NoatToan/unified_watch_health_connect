package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMSunriseSunsetInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar a = null;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;

    public Calendar getPubTime() {
        return this.a;
    }

    public int getSunRiseHour() {
        return this.b;
    }

    public int getSunRiseMinute() {
        return this.c;
    }

    public int getSunSetHour() {
        return this.d;
    }

    public int getSunSetMinute() {
        return this.e;
    }

    public void setPubTime(Calendar pubTime) {
        this.a = pubTime;
    }

    public void setSunRiseHour(int sunRiseHour) {
        this.b = sunRiseHour;
    }

    public void setSunRiseMinute(int sunRiseMinute) {
        this.c = sunRiseMinute;
    }

    public void setSunSetHour(int sunSetHour) {
        this.d = sunSetHour;
    }

    public void setSunSetMinute(int sunSetMinute) {
        this.e = sunSetMinute;
    }

    public String toString() {
        return "HMSunriseSunsetInfo{pubTime=" + this.a + ", sunRiseHour=" + this.b + ", sunRiseMinute=" + this.c + ", sunSetHour=" + this.d + ", sunSetMinute=" + this.e + '}';
    }
}
