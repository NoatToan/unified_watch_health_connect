package com.xiaomi.fit.fitness.export.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/export/utils/DailyBloodSugarDistribute;", "", "lowPercent", "", "normalPercent", "highPercent", "extraLowPercent", "extraHighPercent", "<init>", "(IIIII)V", "getLowPercent", "()I", "setLowPercent", "(I)V", "getNormalPercent", "setNormalPercent", "getHighPercent", "setHighPercent", "getExtraLowPercent", "setExtraLowPercent", "getExtraHighPercent", "setExtraHighPercent", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyBloodSugarDistribute {
    private int extraHighPercent;
    private int extraLowPercent;
    private int highPercent;
    private int lowPercent;
    private int normalPercent;

    public DailyBloodSugarDistribute() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ DailyBloodSugarDistribute copy$default(DailyBloodSugarDistribute dailyBloodSugarDistribute, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = dailyBloodSugarDistribute.lowPercent;
        }
        if ((i6 & 2) != 0) {
            i2 = dailyBloodSugarDistribute.normalPercent;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = dailyBloodSugarDistribute.highPercent;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = dailyBloodSugarDistribute.extraLowPercent;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = dailyBloodSugarDistribute.extraHighPercent;
        }
        return dailyBloodSugarDistribute.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLowPercent() {
        return this.lowPercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNormalPercent() {
        return this.normalPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHighPercent() {
        return this.highPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExtraLowPercent() {
        return this.extraLowPercent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExtraHighPercent() {
        return this.extraHighPercent;
    }

    @NotNull
    public final DailyBloodSugarDistribute copy(int lowPercent, int normalPercent, int highPercent, int extraLowPercent, int extraHighPercent) {
        return new DailyBloodSugarDistribute(lowPercent, normalPercent, highPercent, extraLowPercent, extraHighPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyBloodSugarDistribute)) {
            return false;
        }
        DailyBloodSugarDistribute dailyBloodSugarDistribute = (DailyBloodSugarDistribute) other;
        return this.lowPercent == dailyBloodSugarDistribute.lowPercent && this.normalPercent == dailyBloodSugarDistribute.normalPercent && this.highPercent == dailyBloodSugarDistribute.highPercent && this.extraLowPercent == dailyBloodSugarDistribute.extraLowPercent && this.extraHighPercent == dailyBloodSugarDistribute.extraHighPercent;
    }

    public final int getExtraHighPercent() {
        return this.extraHighPercent;
    }

    public final int getExtraLowPercent() {
        return this.extraLowPercent;
    }

    public final int getHighPercent() {
        return this.highPercent;
    }

    public final int getLowPercent() {
        return this.lowPercent;
    }

    public final int getNormalPercent() {
        return this.normalPercent;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.lowPercent) * 31) + Integer.hashCode(this.normalPercent)) * 31) + Integer.hashCode(this.highPercent)) * 31) + Integer.hashCode(this.extraLowPercent)) * 31) + Integer.hashCode(this.extraHighPercent);
    }

    public final void setExtraHighPercent(int i) {
        this.extraHighPercent = i;
    }

    public final void setExtraLowPercent(int i) {
        this.extraLowPercent = i;
    }

    public final void setHighPercent(int i) {
        this.highPercent = i;
    }

    public final void setLowPercent(int i) {
        this.lowPercent = i;
    }

    public final void setNormalPercent(int i) {
        this.normalPercent = i;
    }

    @NotNull
    public String toString() {
        return "lowPercent=" + this.lowPercent + ", normalPercent=" + this.normalPercent + ", highPercent=" + this.highPercent;
    }

    public DailyBloodSugarDistribute(int i, int i2, int i3, int i4, int i5) {
        this.lowPercent = i;
        this.normalPercent = i2;
        this.highPercent = i3;
        this.extraLowPercent = i4;
        this.extraHighPercent = i5;
    }

    public /* synthetic */ DailyBloodSugarDistribute(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
