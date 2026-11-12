package com.xiaomi.hm.health.bt.profile.hr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class HeartRateConfig {
    private static final int MIN_HR_RATE_CONFIG_LEN = 2;
    private int mCheckCycle;
    private boolean mIsSleepAuxiliary;

    public HeartRateConfig(boolean z, int i) {
        this.mIsSleepAuxiliary = z;
        this.mCheckCycle = i;
    }

    public static HeartRateConfig parserFrom(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        return new HeartRateConfig((bArr[0] & 255) == 1, bArr[1] & 255);
    }

    public int getCheckCycle() {
        return this.mCheckCycle;
    }

    public boolean isSleepAuxiliary() {
        return this.mIsSleepAuxiliary;
    }

    @NotNull
    public String toString() {
        return "isSleepAuxiliary:" + this.mIsSleepAuxiliary + ",checkCycle:" + this.mCheckCycle;
    }
}
