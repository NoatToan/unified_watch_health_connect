package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMSunriseSunsetInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar pubTime = null;
    private int sunRiseHour = -1;
    private int sunRiseMinute = -1;
    private int sunSetHour = -1;
    private int sunSetMinute = -1;

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public int getSunRiseHour() {
        return this.sunRiseHour;
    }

    public int getSunRiseMinute() {
        return this.sunRiseMinute;
    }

    public int getSunSetHour() {
        return this.sunSetHour;
    }

    public int getSunSetMinute() {
        return this.sunSetMinute;
    }

    public void setPubTime(Calendar calendar) {
        this.pubTime = calendar;
    }

    public void setSunRiseHour(int i) {
        this.sunRiseHour = i;
    }

    public void setSunRiseMinute(int i) {
        this.sunRiseMinute = i;
    }

    public void setSunSetHour(int i) {
        this.sunSetHour = i;
    }

    public void setSunSetMinute(int i) {
        this.sunSetMinute = i;
    }

    public String toString() {
        return "HMSunriseSunsetInfo{pubTime=" + this.pubTime + ", sunRiseHour=" + this.sunRiseHour + ", sunRiseMinute=" + this.sunRiseMinute + ", sunSetHour=" + this.sunSetHour + ", sunSetMinute=" + this.sunSetMinute + AbstractJsonLexerKt.END_OBJ;
    }
}
