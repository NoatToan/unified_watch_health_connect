package com.xiaomi.hm.health.bt.model;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMHrReminder {
    private boolean mEnable;
    private int mHr = 150;

    public HMHrReminder(boolean z) {
        this.mEnable = z;
    }

    public int getHr() {
        return this.mHr;
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public void setHr(int i) {
        this.mHr = i;
    }

    public byte[] toBytes() {
        return new byte[]{isEnable() ? (byte) 1 : (byte) 0, (byte) getHr()};
    }

    public String toString() {
        return "HMHrReminder{mEnable=" + this.mEnable + ", mHr=" + this.mHr + AbstractJsonLexerKt.END_OBJ;
    }
}
