package com.xiaomi.hm.health.bt.profile.weight;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class OFMeasurement {
    public static final int FLAG_MEASURED = 2;
    public static final int FLAG_MEASURING = 1;
    public int flag;
    public int time;

    public OFMeasurement() {
        this.flag = 1;
        this.time = 0;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getTime() {
        return this.time;
    }

    public boolean isFinish() {
        return this.flag == 2;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public String toString() {
        return "OFMeasurement{flag=" + this.flag + ", time=" + this.time + AbstractJsonLexerKt.END_OBJ;
    }

    public OFMeasurement(int i, int i2) {
        this.flag = i;
        this.time = i2;
    }
}
