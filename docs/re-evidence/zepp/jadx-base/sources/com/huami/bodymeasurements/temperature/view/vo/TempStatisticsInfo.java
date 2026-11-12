package com.huami.bodymeasurements.temperature.view.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "", "", "isInValid", "", "component1", "component2", "component3", "max", "min", "avg", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "F", "getMax", "()F", "b", "getMin", "c", "getAvg", "<init>", "(FFF)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TempStatisticsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float max;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float avg;

    public TempStatisticsInfo() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public TempStatisticsInfo(float f, float f2, float f3) {
        this.max = f;
        this.min = f2;
        this.avg = f3;
    }

    public static /* synthetic */ TempStatisticsInfo copy$default(TempStatisticsInfo tempStatisticsInfo, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tempStatisticsInfo.max;
        }
        if ((i & 2) != 0) {
            f2 = tempStatisticsInfo.min;
        }
        if ((i & 4) != 0) {
            f3 = tempStatisticsInfo.avg;
        }
        return tempStatisticsInfo.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAvg() {
        return this.avg;
    }

    @NotNull
    public final TempStatisticsInfo copy(float max, float min, float avg) {
        return new TempStatisticsInfo(max, min, avg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempStatisticsInfo)) {
            return false;
        }
        TempStatisticsInfo tempStatisticsInfo = (TempStatisticsInfo) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.max), (Object) Float.valueOf(tempStatisticsInfo.max)) && Intrinsics.areEqual((Object) Float.valueOf(this.min), (Object) Float.valueOf(tempStatisticsInfo.min)) && Intrinsics.areEqual((Object) Float.valueOf(this.avg), (Object) Float.valueOf(tempStatisticsInfo.avg));
    }

    public final float getAvg() {
        return this.avg;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.max) * 31) + Float.floatToIntBits(this.min)) * 31) + Float.floatToIntBits(this.avg);
    }

    public final boolean isInValid() {
        return Float.isNaN(this.max) || Float.isNaN(this.min) || Float.isNaN(this.avg);
    }

    @NotNull
    public String toString() {
        return "TempStatisticsInfo(max=" + this.max + ", min=" + this.min + ", avg=" + this.avg + ')';
    }

    public /* synthetic */ TempStatisticsInfo(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3);
    }
}
