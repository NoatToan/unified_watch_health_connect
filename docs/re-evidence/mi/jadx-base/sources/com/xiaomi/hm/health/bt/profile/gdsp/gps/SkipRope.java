package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SkipRope implements Serializable {
    private static final long serialVersionUID = 1;
    private int skipRopeFreq;
    private long time;

    public SkipRope(long j, int i) {
        this.time = j;
        this.skipRopeFreq = i;
    }

    public int getSkipRopeFreq() {
        return this.skipRopeFreq;
    }

    public long getTime() {
        return this.time;
    }

    public void setSkipRopeFreq(int i) {
        this.skipRopeFreq = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "{time=" + new Date(this.time).toString() + ", skipRopeFreq=" + this.skipRopeFreq + AbstractJsonLexerKt.END_OBJ;
    }
}
