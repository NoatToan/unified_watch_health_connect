package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportStatisInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public int aveHr;
    public int avePace;
    public int aveStride;
    public int maxHr;

    public SportStatisInfo(int i, int i2, int i3) {
        this.aveHr = i;
        this.avePace = i2;
        this.aveStride = i3;
    }

    public int getAveHr() {
        return this.aveHr;
    }

    public int getAvePace() {
        return this.avePace;
    }

    public int getAveStride() {
        return this.aveStride;
    }

    public int getMaxHr() {
        return this.maxHr;
    }

    public void setAveHr(int i) {
        this.aveHr = i;
    }

    public void setAvePace(int i) {
        this.avePace = i;
    }

    public void setAveStride(int i) {
        this.aveStride = i;
    }

    public void setMaxHr(int i) {
        this.maxHr = i;
    }

    public String toString() {
        return "SportStatisInfo{aveHr=" + this.aveHr + ", avePace=" + this.avePace + ", aveStride=" + this.aveStride + ", maxHr=" + this.maxHr + AbstractJsonLexerKt.END_OBJ;
    }

    public SportStatisInfo(int i, int i2, int i3, int i4) {
        this.aveHr = i;
        this.avePace = i2;
        this.aveStride = i3;
        this.maxHr = i4;
    }
}
