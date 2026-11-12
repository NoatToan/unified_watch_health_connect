package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AdjustBloodPressureItem;", "", "adjustTime", "", "adjustHr", "", "adjustHighPressure", "adjustLowPressure", "<init>", "(JIII)V", "getAdjustTime", "()J", "setAdjustTime", "(J)V", "getAdjustHr", "()I", "setAdjustHr", "(I)V", "getAdjustHighPressure", "setAdjustHighPressure", "getAdjustLowPressure", "setAdjustLowPressure", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AdjustBloodPressureItem {

    @SerializedName("calibration_systolic_pressure")
    private int adjustHighPressure;

    @SerializedName("calibration_heart_rate")
    private int adjustHr;

    @SerializedName("calibration_diastolic_pressure")
    private int adjustLowPressure;

    @SerializedName("calibration_time")
    private long adjustTime;

    public AdjustBloodPressureItem(long j, int i, int i2, int i3) {
        this.adjustTime = j;
        this.adjustHr = i;
        this.adjustHighPressure = i2;
        this.adjustLowPressure = i3;
    }

    public static /* synthetic */ AdjustBloodPressureItem copy$default(AdjustBloodPressureItem adjustBloodPressureItem, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = adjustBloodPressureItem.adjustTime;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = adjustBloodPressureItem.adjustHr;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = adjustBloodPressureItem.adjustHighPressure;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = adjustBloodPressureItem.adjustLowPressure;
        }
        return adjustBloodPressureItem.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAdjustTime() {
        return this.adjustTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAdjustHr() {
        return this.adjustHr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAdjustHighPressure() {
        return this.adjustHighPressure;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAdjustLowPressure() {
        return this.adjustLowPressure;
    }

    @NotNull
    public final AdjustBloodPressureItem copy(long adjustTime, int adjustHr, int adjustHighPressure, int adjustLowPressure) {
        return new AdjustBloodPressureItem(adjustTime, adjustHr, adjustHighPressure, adjustLowPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdjustBloodPressureItem)) {
            return false;
        }
        AdjustBloodPressureItem adjustBloodPressureItem = (AdjustBloodPressureItem) other;
        return this.adjustTime == adjustBloodPressureItem.adjustTime && this.adjustHr == adjustBloodPressureItem.adjustHr && this.adjustHighPressure == adjustBloodPressureItem.adjustHighPressure && this.adjustLowPressure == adjustBloodPressureItem.adjustLowPressure;
    }

    public final int getAdjustHighPressure() {
        return this.adjustHighPressure;
    }

    public final int getAdjustHr() {
        return this.adjustHr;
    }

    public final int getAdjustLowPressure() {
        return this.adjustLowPressure;
    }

    public final long getAdjustTime() {
        return this.adjustTime;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.adjustTime) * 31) + Integer.hashCode(this.adjustHr)) * 31) + Integer.hashCode(this.adjustHighPressure)) * 31) + Integer.hashCode(this.adjustLowPressure);
    }

    public final void setAdjustHighPressure(int i) {
        this.adjustHighPressure = i;
    }

    public final void setAdjustHr(int i) {
        this.adjustHr = i;
    }

    public final void setAdjustLowPressure(int i) {
        this.adjustLowPressure = i;
    }

    public final void setAdjustTime(long j) {
        this.adjustTime = j;
    }

    @NotNull
    public String toString() {
        return "AdjustBloodPressureItem(adjustTime=" + this.adjustTime + ", adjustHr=" + this.adjustHr + ", adjustHighPressure=" + this.adjustHighPressure + ", adjustLowPressure=" + this.adjustLowPressure + ")";
    }
}
