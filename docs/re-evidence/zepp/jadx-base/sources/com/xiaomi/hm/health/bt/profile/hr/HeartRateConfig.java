package com.xiaomi.hm.health.bt.profile.hr;

import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class HeartRateConfig {
    private static final int c = 2;
    private boolean a;
    private int b;

    public HeartRateConfig(boolean isSleepAuxiliary, int checkCycle) {
        this.a = isSleepAuxiliary;
        this.b = checkCycle;
    }

    @Nullable
    public static HeartRateConfig parserFrom(byte[] bytes) {
        if (bytes == null || bytes.length < 2) {
            return null;
        }
        return new HeartRateConfig((bytes[0] & 255) == 1, bytes[1] & 255);
    }

    public int getCheckCycle() {
        return this.b;
    }

    public boolean isSleepAuxiliary() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "isSleepAuxiliary:" + this.a + ",checkCycle:" + this.b;
    }
}
