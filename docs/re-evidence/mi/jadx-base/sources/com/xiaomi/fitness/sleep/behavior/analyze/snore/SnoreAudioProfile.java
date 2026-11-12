package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreAudioProfile;", "", "<init>", "()V", "backgroundVolume", "", "getBackgroundVolume", "()D", "setBackgroundVolume", "(D)V", "snoreFrequency", "", "getSnoreFrequency", "()I", "setSnoreFrequency", "(I)V", "snoreMaxVolume", "getSnoreMaxVolume", "setSnoreMaxVolume", "snoreNumber", "getSnoreNumber", "setSnoreNumber", "snorePureTotalTime", "getSnorePureTotalTime", "setSnorePureTotalTime", "toString", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnoreAudioProfile {

    @SerializedName("backgroundVolume")
    private double backgroundVolume;

    @SerializedName("snoreFrequency")
    private int snoreFrequency;

    @SerializedName("snoreMaxVolume")
    private double snoreMaxVolume;

    @SerializedName("snoreNumber")
    private int snoreNumber;

    @SerializedName("snorePureTotalTime")
    private int snorePureTotalTime;

    public final double getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public final int getSnoreFrequency() {
        return this.snoreFrequency;
    }

    public final double getSnoreMaxVolume() {
        return this.snoreMaxVolume;
    }

    public final int getSnoreNumber() {
        return this.snoreNumber;
    }

    public final int getSnorePureTotalTime() {
        return this.snorePureTotalTime;
    }

    public final void setBackgroundVolume(double d) {
        this.backgroundVolume = d;
    }

    public final void setSnoreFrequency(int i) {
        this.snoreFrequency = i;
    }

    public final void setSnoreMaxVolume(double d) {
        this.snoreMaxVolume = d;
    }

    public final void setSnoreNumber(int i) {
        this.snoreNumber = i;
    }

    public final void setSnorePureTotalTime(int i) {
        this.snorePureTotalTime = i;
    }

    @NotNull
    public String toString() {
        return "backgroundVolume:" + this.backgroundVolume + ";snoreFrequency:" + this.snoreFrequency + ";snoreMaxVolume:" + this.snoreMaxVolume + ";snoreNumber:" + this.snoreNumber + ";snorePureTotalTime:" + this.snorePureTotalTime;
    }
}
