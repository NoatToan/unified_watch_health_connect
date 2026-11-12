package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class Row implements Serializable {
    private static final long serialVersionUID = 1;
    private int strokeFreq;
    private long time;

    public Row(long j, int i) {
        this.time = j;
        this.strokeFreq = i;
    }

    public int getStrokeFreq() {
        return this.strokeFreq;
    }

    public long getTime() {
        return this.time;
    }

    public void setStrokeFreq(int i) {
        this.strokeFreq = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "{time=" + new Date(this.time).toString() + ", strokeFreq=" + this.strokeFreq + AbstractJsonLexerKt.END_OBJ;
    }
}
