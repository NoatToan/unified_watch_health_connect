package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMRealtimeAqi implements Serializable {
    private static final long serialVersionUID = 1;
    private Calendar pubTime = null;
    private int aqi = -1;
    private String aqiDescription = null;

    public int getAqi() {
        return this.aqi;
    }

    public String getAqiDescription() {
        return this.aqiDescription;
    }

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public void setAqi(int i) {
        this.aqi = i;
    }

    public void setAqiDescription(String str) {
        this.aqiDescription = str;
    }

    public void setPubTime(Calendar calendar) {
        this.pubTime = calendar;
    }

    public String toString() {
        return "HMRealtimeAqi{pubTime=" + this.pubTime + ", aqi=" + this.aqi + ", aqiDescription='" + this.aqiDescription + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
