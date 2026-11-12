package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class PaceInfo {
    public static final int TYPE_KM = 0;
    public static final int TYPE_MILE = 1;
    private int gpsIndex;
    private GpsPoint gpsPoint;
    private int index;
    private int pace;
    private int type;

    public PaceInfo(int i, int i2, int i3, GpsPoint gpsPoint, int i4) {
        this.index = i;
        this.pace = i2;
        this.type = i3;
        this.gpsPoint = gpsPoint;
        this.gpsIndex = i4;
    }

    public int getGpsIndex() {
        return this.gpsIndex;
    }

    public GpsPoint getGpsPoint() {
        return this.gpsPoint;
    }

    public int getIndex() {
        return this.index;
    }

    public int getPace() {
        return this.pace;
    }

    public boolean isKmPaceInfo() {
        return this.type == 0;
    }

    public void setGpsIndex(int i) {
        this.gpsIndex = i;
    }

    public void setGpsPoint(GpsPoint gpsPoint) {
        this.gpsPoint = gpsPoint;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public String toString() {
        return "PaceInfo{index=" + this.index + ", pace=" + this.pace + ", type=" + this.type + ", gpsPoint=" + this.gpsPoint + ", gpsIndex=" + this.gpsIndex + AbstractJsonLexerKt.END_OBJ;
    }
}
