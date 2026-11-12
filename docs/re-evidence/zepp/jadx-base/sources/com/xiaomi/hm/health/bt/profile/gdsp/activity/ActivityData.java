package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class ActivityData implements Serializable {
    public static final int N = 3;
    public static final int N_HR = 4;
    private static final long serialVersionUID = 1;
    public int category;
    public int hr;
    public int intensity;
    public int steps;

    public ActivityData(byte intensity, byte steps, byte category) {
        this.intensity = 0;
        this.steps = 0;
        this.category = 0;
        this.hr = 254;
        this.intensity = intensity;
        this.steps = steps;
        this.category = category;
    }

    public byte[] getBytes() {
        return new byte[]{(byte) this.category, (byte) this.intensity, (byte) this.steps};
    }

    public int getSize() {
        return 3;
    }

    @NonNull
    public String toString() {
        return "ActivityData [intensity=" + this.intensity + ", steps=" + this.steps + ", category=" + this.category + "]";
    }

    public ActivityData(byte intensity, int steps, byte category) {
        this.intensity = 0;
        this.steps = 0;
        this.category = 0;
        this.hr = 254;
        this.intensity = intensity;
        this.steps = steps;
        this.category = category;
    }

    public ActivityData(byte intensity, int steps, byte category, int hr) {
        this(intensity, steps, category);
        this.hr = hr;
    }
}
