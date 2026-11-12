package com.xiaomi.fitness.detail.data;

import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/detail/data/HeightDistribute;", "", "riseClimbDuration", "", "fallClimbDuration", "sumDuration", "<init>", "(III)V", "getRiseClimbDuration", "()I", "getFallClimbDuration", "getSumDuration", "flatDuration", "getFlatDuration", "flatPer", "getFlatPer", "risePer", "getRisePer", "fallPer", "getFallPer", "createPercentage", "percentValue", "sum", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeightDistribute {
    private final int fallClimbDuration;
    private final int riseClimbDuration;
    private final int sumDuration;

    public HeightDistribute(int i, int i2, int i3) {
        this.riseClimbDuration = i;
        this.fallClimbDuration = i2;
        this.sumDuration = i3;
    }

    public static /* synthetic */ HeightDistribute copy$default(HeightDistribute heightDistribute, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = heightDistribute.riseClimbDuration;
        }
        if ((i4 & 2) != 0) {
            i2 = heightDistribute.fallClimbDuration;
        }
        if ((i4 & 4) != 0) {
            i3 = heightDistribute.sumDuration;
        }
        return heightDistribute.copy(i, i2, i3);
    }

    private final int createPercentage(int percentValue, int sum) {
        return MathKt__MathJVMKt.roundToInt((percentValue * 100.0f) / sum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRiseClimbDuration() {
        return this.riseClimbDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFallClimbDuration() {
        return this.fallClimbDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSumDuration() {
        return this.sumDuration;
    }

    @NotNull
    public final HeightDistribute copy(int riseClimbDuration, int fallClimbDuration, int sumDuration) {
        return new HeightDistribute(riseClimbDuration, fallClimbDuration, sumDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightDistribute)) {
            return false;
        }
        HeightDistribute heightDistribute = (HeightDistribute) other;
        return this.riseClimbDuration == heightDistribute.riseClimbDuration && this.fallClimbDuration == heightDistribute.fallClimbDuration && this.sumDuration == heightDistribute.sumDuration;
    }

    public final int getFallClimbDuration() {
        return this.fallClimbDuration;
    }

    public final int getFallPer() {
        return createPercentage(this.fallClimbDuration, this.sumDuration);
    }

    public final int getFlatDuration() {
        return (this.sumDuration - this.riseClimbDuration) - this.fallClimbDuration;
    }

    public final int getFlatPer() {
        return createPercentage(getFlatDuration(), this.sumDuration);
    }

    public final int getRiseClimbDuration() {
        return this.riseClimbDuration;
    }

    public final int getRisePer() {
        return createPercentage(this.riseClimbDuration, this.sumDuration);
    }

    public final int getSumDuration() {
        return this.sumDuration;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.riseClimbDuration) * 31) + Integer.hashCode(this.fallClimbDuration)) * 31) + Integer.hashCode(this.sumDuration);
    }

    @NotNull
    public String toString() {
        return "HeightDistribute(riseClimbDuration=" + this.riseClimbDuration + ", fallClimbDuration=" + this.fallClimbDuration + ", sumDuration=" + this.sumDuration + ")";
    }
}
