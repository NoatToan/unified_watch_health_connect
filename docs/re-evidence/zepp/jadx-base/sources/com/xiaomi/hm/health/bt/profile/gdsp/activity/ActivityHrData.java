package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityHrData extends ActivityData {
    public static final int N = 4;
    private int a;

    public ActivityHrData(byte intensity, byte steps, byte category, byte hr) {
        super(intensity, steps, category, hr);
        this.a = -1;
        this.a = hr;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData
    public byte[] getBytes() {
        return new byte[]{(byte) this.category, (byte) this.intensity, (byte) this.steps, (byte) this.a};
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData
    public int getSize() {
        return 4;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData
    @NonNull
    public String toString() {
        return super.toString() + " heartrate=" + this.a;
    }
}
