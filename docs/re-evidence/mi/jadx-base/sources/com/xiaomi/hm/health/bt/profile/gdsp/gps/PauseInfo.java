package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class PauseInfo implements Serializable {
    public static final int PAUSE_AUTO = 3;
    public static final int PAUSE_MANUAL = 2;
    private static final long serialVersionUID = 1;
    private int offset;
    private long time;
    private int gpsPauseIndex = -1;
    private int gpsResumeIndex = -1;
    private int type = 2;

    public PauseInfo(long j, int i) {
        this.time = j;
        this.offset = i;
    }

    public int getGpsPauseIndex() {
        return this.gpsPauseIndex;
    }

    public int getGpsResumeIndex() {
        return this.gpsResumeIndex;
    }

    public int getOffset() {
        return this.offset;
    }

    public long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }

    public void setGpsPauseIndex(int i) {
        this.gpsPauseIndex = i;
    }

    public void setGpsResumeIndex(int i) {
        this.gpsResumeIndex = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "PauseInfo{time=" + this.time + ", gpsPauseIndex=" + this.gpsPauseIndex + ", gpsResumeIndex=" + this.gpsResumeIndex + ", type=" + this.type + ", offset=" + this.offset + AbstractJsonLexerKt.END_OBJ;
    }
}
