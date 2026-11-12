package com.xiaomi.hm.health.bt.profile.weather;

import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMWindAndHumidityInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private String humidityDesc;
    private Calendar pubTime;
    private String windDesc;
    private int windLevel = -1;
    private int humidity = -1;
    private float windDirection = -1.0f;

    public HMWindAndHumidityInfo(String str, String str2) {
        this.windDesc = str;
        this.humidityDesc = str2;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public String getHumidityDesc() {
        return this.humidityDesc;
    }

    public Calendar getPubTime() {
        return this.pubTime;
    }

    public String getWindDesc() {
        return this.windDesc;
    }

    public float getWindDirection() {
        return this.windDirection;
    }

    public int getWindLevel() {
        return this.windLevel;
    }

    public void setHumidity(int i) {
        this.humidity = i;
    }

    public void setHumidityDesc(String str) {
        this.humidityDesc = str;
    }

    public void setPubTime(Calendar calendar) {
        this.pubTime = calendar;
    }

    public void setWindDesc(String str) {
        this.windDesc = str;
    }

    public void setWindDirection(float f) {
        this.windDirection = f;
    }

    public void setWindLevel(int i) {
        this.windLevel = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMRealtimeAqi{pubTime=");
        Calendar calendar = this.pubTime;
        sb.append(calendar == null ? null : calendar.getTime());
        sb.append(", windDesc=");
        sb.append(this.windDesc);
        sb.append(", humidityDesc='");
        sb.append(this.humidityDesc);
        sb.append('\'');
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
