package com.xiaomi.fitness.trail.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/trail/data/EvaluatingInfo;", "", "step", "", "distance", "intensity", "calories", "", "<init>", "(IIID)V", "getStep", "()I", "setStep", "(I)V", "getDistance", "setDistance", "getIntensity", "setIntensity", "getCalories", "()D", "setCalories", "(D)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EvaluatingInfo {
    private double calories;
    private int distance;
    private int intensity;
    private int step;

    public EvaluatingInfo(int i, int i2, int i3, double d) {
        this.step = i;
        this.distance = i2;
        this.intensity = i3;
        this.calories = d;
    }

    public static /* synthetic */ EvaluatingInfo copy$default(EvaluatingInfo evaluatingInfo, int i, int i2, int i3, double d, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = evaluatingInfo.step;
        }
        if ((i4 & 2) != 0) {
            i2 = evaluatingInfo.distance;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = evaluatingInfo.intensity;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            d = evaluatingInfo.calories;
        }
        return evaluatingInfo.copy(i, i5, i6, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getCalories() {
        return this.calories;
    }

    @NotNull
    public final EvaluatingInfo copy(int step, int distance, int intensity, double calories) {
        return new EvaluatingInfo(step, distance, intensity, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluatingInfo)) {
            return false;
        }
        EvaluatingInfo evaluatingInfo = (EvaluatingInfo) other;
        return this.step == evaluatingInfo.step && this.distance == evaluatingInfo.distance && this.intensity == evaluatingInfo.intensity && Double.compare(this.calories, evaluatingInfo.calories) == 0;
    }

    public final double getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getIntensity() {
        return this.intensity;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.step) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.intensity)) * 31) + Double.hashCode(this.calories);
    }

    public final void setCalories(double d) {
        this.calories = d;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setIntensity(int i) {
        this.intensity = i;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    @NotNull
    public String toString() {
        return "EvaluatingInfo(step=" + this.step + ", distance=" + this.distance + ", intensity=" + this.intensity + ", calories=" + this.calories + ")";
    }
}
