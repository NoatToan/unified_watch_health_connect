package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class GpsPoint implements Serializable {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_PAUSE = 2;
    public static final int STATE_RESUME = 3;
    private static final long serialVersionUID = 1;
    private int pace;
    private long time;
    private double latitude = 0.0d;
    private double longitude = 0.0d;
    private double altitude = 0.0d;
    private int state = 1;

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getPace() {
        return this.pace;
    }

    public int getState() {
        return this.state;
    }

    public long getTime() {
        return this.time;
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "GpsPoint{latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", state=" + this.state + ", time=" + this.time + ", pace=" + this.pace + AbstractJsonLexerKt.END_OBJ;
    }
}
