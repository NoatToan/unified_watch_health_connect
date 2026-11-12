package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class RtPaceInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int cadence;
    private int pace;
    private int stride;
    private long time;

    public RtPaceInfo(long j, int i) {
        this.time = j;
        this.pace = i;
    }

    public int getCadence() {
        return this.cadence;
    }

    public int getPace() {
        return this.pace;
    }

    public int getStride() {
        return this.stride;
    }

    public long getTime() {
        return this.time;
    }

    public void setCadence(int i) {
        this.cadence = i;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public void setStride(int i) {
        this.stride = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "RtPaceInfo{time=" + this.time + ", pace=" + this.pace + AbstractJsonLexerKt.END_OBJ;
    }

    public RtPaceInfo(long j, int i, int i2, int i3) {
        this.time = j;
        this.pace = i;
        this.cadence = i2;
        this.stride = i3;
    }
}
