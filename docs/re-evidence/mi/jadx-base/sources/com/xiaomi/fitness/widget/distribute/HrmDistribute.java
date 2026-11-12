package com.xiaomi.fitness.widget.distribute;

import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/widget/distribute/HrmDistribute;", "", "warmUpDuration", "", "fatBurningDuration", "aerobicDuration", "anaerobicDuration", "extremeDuration", "<init>", "(IIIII)V", "getWarmUpDuration", "()I", "getFatBurningDuration", "getAerobicDuration", "getAnaerobicDuration", "getExtremeDuration", "sumDuration", "getSumDuration", "extremePer", "getExtremePer", "anaerobicPer", "getAnaerobicPer", "aerobicPer", "getAerobicPer", "fatPer", "getFatPer", "warmPer", "getWarmPer", "createPercentage", "percentValue", "sum", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HrmDistribute {
    private final int aerobicDuration;
    private final int anaerobicDuration;
    private final int extremeDuration;
    private final int fatBurningDuration;
    private final int warmUpDuration;

    public HrmDistribute(int i, int i2, int i3, int i4, int i5) {
        this.warmUpDuration = i;
        this.fatBurningDuration = i2;
        this.aerobicDuration = i3;
        this.anaerobicDuration = i4;
        this.extremeDuration = i5;
    }

    public static /* synthetic */ HrmDistribute copy$default(HrmDistribute hrmDistribute, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = hrmDistribute.warmUpDuration;
        }
        if ((i6 & 2) != 0) {
            i2 = hrmDistribute.fatBurningDuration;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = hrmDistribute.aerobicDuration;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = hrmDistribute.anaerobicDuration;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = hrmDistribute.extremeDuration;
        }
        return hrmDistribute.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWarmUpDuration() {
        return this.warmUpDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFatBurningDuration() {
        return this.fatBurningDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAerobicDuration() {
        return this.aerobicDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAnaerobicDuration() {
        return this.anaerobicDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExtremeDuration() {
        return this.extremeDuration;
    }

    @NotNull
    public final HrmDistribute copy(int warmUpDuration, int fatBurningDuration, int aerobicDuration, int anaerobicDuration, int extremeDuration) {
        return new HrmDistribute(warmUpDuration, fatBurningDuration, aerobicDuration, anaerobicDuration, extremeDuration);
    }

    public final int createPercentage(int percentValue, int sum) {
        return MathKt__MathJVMKt.roundToInt((percentValue * 100.0f) / sum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrmDistribute)) {
            return false;
        }
        HrmDistribute hrmDistribute = (HrmDistribute) other;
        return this.warmUpDuration == hrmDistribute.warmUpDuration && this.fatBurningDuration == hrmDistribute.fatBurningDuration && this.aerobicDuration == hrmDistribute.aerobicDuration && this.anaerobicDuration == hrmDistribute.anaerobicDuration && this.extremeDuration == hrmDistribute.extremeDuration;
    }

    public final int getAerobicDuration() {
        return this.aerobicDuration;
    }

    public final int getAerobicPer() {
        return createPercentage(this.aerobicDuration, getSumDuration());
    }

    public final int getAnaerobicDuration() {
        return this.anaerobicDuration;
    }

    public final int getAnaerobicPer() {
        return createPercentage(this.anaerobicDuration, getSumDuration());
    }

    public final int getExtremeDuration() {
        return this.extremeDuration;
    }

    public final int getExtremePer() {
        return createPercentage(this.extremeDuration, getSumDuration());
    }

    public final int getFatBurningDuration() {
        return this.fatBurningDuration;
    }

    public final int getFatPer() {
        return createPercentage(this.fatBurningDuration, getSumDuration());
    }

    public final int getSumDuration() {
        return this.warmUpDuration + this.fatBurningDuration + this.aerobicDuration + this.anaerobicDuration + this.extremeDuration;
    }

    public final int getWarmPer() {
        return createPercentage(this.warmUpDuration, getSumDuration());
    }

    public final int getWarmUpDuration() {
        return this.warmUpDuration;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.warmUpDuration) * 31) + Integer.hashCode(this.fatBurningDuration)) * 31) + Integer.hashCode(this.aerobicDuration)) * 31) + Integer.hashCode(this.anaerobicDuration)) * 31) + Integer.hashCode(this.extremeDuration);
    }

    @NotNull
    public String toString() {
        return "HrmDistribute(warmUpDuration=" + this.warmUpDuration + ", fatBurningDuration=" + this.fatBurningDuration + ", aerobicDuration=" + this.aerobicDuration + ", anaerobicDuration=" + this.anaerobicDuration + ", extremeDuration=" + this.extremeDuration + ")";
    }
}
