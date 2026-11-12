package com.huami.mifit.sportlib.tts;

import com.huami.mifit.sportlib.utils.RunDataConversion;

/* JADX INFO: loaded from: classes11.dex */
public class DistanceVoiceInfo {
    private float a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public DistanceVoiceInfo(float f, long j, int i, int i2, int i3, boolean z, boolean z2) {
        this.a = f;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
    }

    public float getConvertDistance() {
        return RunDataConversion.convertMeterToKmOrMile(this.a, this.f);
    }

    public float getDistance() {
        return this.a;
    }

    public int getHr() {
        return this.d;
    }

    public int getPaceCost() {
        return this.c;
    }

    public int getSportType() {
        return this.e;
    }

    public long getUsedTime() {
        return this.b;
    }

    public boolean isAuto() {
        return this.g;
    }

    public boolean isMetric() {
        return this.f;
    }

    public void setDistance(float f) {
        this.a = f;
    }
}
