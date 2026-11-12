package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HeartRateInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int hr;
    private long time;

    public HeartRateInfo(long j, int i) {
        this.time = j;
        this.hr = i;
    }

    public int getHr() {
        return this.hr;
    }

    public long getTime() {
        return this.time;
    }

    public void setHr(int i) {
        this.hr = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "{time=" + new Date(this.time).toString() + ", hr=" + this.hr + AbstractJsonLexerKt.END_OBJ;
    }
}
