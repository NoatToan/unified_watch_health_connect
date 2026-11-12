package com.xiaomi.fitness.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/util/SleepTrendStaticsModel;", "", "minInWholeHour", "", "maxInWholeHour", "avgInSec", "minInSec", "maxInSec", "<init>", "(IIIII)V", "getMinInWholeHour", "()I", "getMaxInWholeHour", "getAvgInSec", "getMinInSec", "getMaxInSec", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepTrendStaticsModel {
    private final int avgInSec;
    private final int maxInSec;
    private final int maxInWholeHour;
    private final int minInSec;
    private final int minInWholeHour;

    public SleepTrendStaticsModel(int i, int i2, int i3, int i4, int i5) {
        this.minInWholeHour = i;
        this.maxInWholeHour = i2;
        this.avgInSec = i3;
        this.minInSec = i4;
        this.maxInSec = i5;
    }

    public static /* synthetic */ SleepTrendStaticsModel copy$default(SleepTrendStaticsModel sleepTrendStaticsModel, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sleepTrendStaticsModel.minInWholeHour;
        }
        if ((i6 & 2) != 0) {
            i2 = sleepTrendStaticsModel.maxInWholeHour;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = sleepTrendStaticsModel.avgInSec;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = sleepTrendStaticsModel.minInSec;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = sleepTrendStaticsModel.maxInSec;
        }
        return sleepTrendStaticsModel.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinInWholeHour() {
        return this.minInWholeHour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxInWholeHour() {
        return this.maxInWholeHour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgInSec() {
        return this.avgInSec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinInSec() {
        return this.minInSec;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxInSec() {
        return this.maxInSec;
    }

    @NotNull
    public final SleepTrendStaticsModel copy(int minInWholeHour, int maxInWholeHour, int avgInSec, int minInSec, int maxInSec) {
        return new SleepTrendStaticsModel(minInWholeHour, maxInWholeHour, avgInSec, minInSec, maxInSec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTrendStaticsModel)) {
            return false;
        }
        SleepTrendStaticsModel sleepTrendStaticsModel = (SleepTrendStaticsModel) other;
        return this.minInWholeHour == sleepTrendStaticsModel.minInWholeHour && this.maxInWholeHour == sleepTrendStaticsModel.maxInWholeHour && this.avgInSec == sleepTrendStaticsModel.avgInSec && this.minInSec == sleepTrendStaticsModel.minInSec && this.maxInSec == sleepTrendStaticsModel.maxInSec;
    }

    public final int getAvgInSec() {
        return this.avgInSec;
    }

    public final int getMaxInSec() {
        return this.maxInSec;
    }

    public final int getMaxInWholeHour() {
        return this.maxInWholeHour;
    }

    public final int getMinInSec() {
        return this.minInSec;
    }

    public final int getMinInWholeHour() {
        return this.minInWholeHour;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.minInWholeHour) * 31) + Integer.hashCode(this.maxInWholeHour)) * 31) + Integer.hashCode(this.avgInSec)) * 31) + Integer.hashCode(this.minInSec)) * 31) + Integer.hashCode(this.maxInSec);
    }

    @NotNull
    public String toString() {
        return "SleepTrendStaticsModel(minInWholeHour=" + this.minInWholeHour + ", maxInWholeHour=" + this.maxInWholeHour + ", avgInSec=" + this.avgInSec + ", minInSec=" + this.minInSec + ", maxInSec=" + this.maxInSec + ")";
    }
}
