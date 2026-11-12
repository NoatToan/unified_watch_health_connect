package com.xiaomi.fit.fitness.export.data.distribute;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/distribute/DailyHrDistribute;", "", "<init>", "()V", "smoothDuration", "", "getSmoothDuration", "()I", "setSmoothDuration", "(I)V", "warmUpDuration", "getWarmUpDuration", "setWarmUpDuration", "fatBurningDuration", "getFatBurningDuration", "setFatBurningDuration", "aerobicDuration", "getAerobicDuration", "setAerobicDuration", "anaerobicDuration", "getAnaerobicDuration", "setAnaerobicDuration", "extremeDuration", "getExtremeDuration", "setExtremeDuration", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DailyHrDistribute {

    /* JADX INFO: renamed from: aerobicDuration, reason: from kotlin metadata and from toString */
    private int aerobic;

    /* JADX INFO: renamed from: anaerobicDuration, reason: from kotlin metadata and from toString */
    private int anaerobic;

    /* JADX INFO: renamed from: extremeDuration, reason: from kotlin metadata and from toString */
    private int extreme;

    /* JADX INFO: renamed from: fatBurningDuration, reason: from kotlin metadata and from toString */
    private int fatBurn;

    /* JADX INFO: renamed from: smoothDuration, reason: from kotlin metadata and from toString */
    private int smooth;

    /* JADX INFO: renamed from: warmUpDuration, reason: from kotlin metadata and from toString */
    private int warmUp;

    /* JADX INFO: renamed from: getAerobicDuration, reason: from getter */
    public final int getAerobic() {
        return this.aerobic;
    }

    /* JADX INFO: renamed from: getAnaerobicDuration, reason: from getter */
    public final int getAnaerobic() {
        return this.anaerobic;
    }

    /* JADX INFO: renamed from: getExtremeDuration, reason: from getter */
    public final int getExtreme() {
        return this.extreme;
    }

    /* JADX INFO: renamed from: getFatBurningDuration, reason: from getter */
    public final int getFatBurn() {
        return this.fatBurn;
    }

    /* JADX INFO: renamed from: getSmoothDuration, reason: from getter */
    public final int getSmooth() {
        return this.smooth;
    }

    /* JADX INFO: renamed from: getWarmUpDuration, reason: from getter */
    public final int getWarmUp() {
        return this.warmUp;
    }

    public final void setAerobicDuration(int i) {
        this.aerobic = i;
    }

    public final void setAnaerobicDuration(int i) {
        this.anaerobic = i;
    }

    public final void setExtremeDuration(int i) {
        this.extreme = i;
    }

    public final void setFatBurningDuration(int i) {
        this.fatBurn = i;
    }

    public final void setSmoothDuration(int i) {
        this.smooth = i;
    }

    public final void setWarmUpDuration(int i) {
        this.warmUp = i;
    }

    @NotNull
    public String toString() {
        return "DailyHrDistribute(smooth=" + this.smooth + ", warmUp=" + this.warmUp + ", fatBurn=" + this.fatBurn + ", aerobic=" + this.aerobic + ", anaerobic=" + this.anaerobic + ", extreme=" + this.extreme + ")";
    }
}
