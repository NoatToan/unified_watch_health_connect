package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u0006*"}, d2 = {"Lcom/huami/mifit/sportlib/model/PeakIndexTimeValue;", "", "Lcom/huami/mifit/sportlib/model/ChartDataType;", "component1", "", "component2", "", "component3", "component4", "component5", "dataType", "minIndexTime", "minValue", "maxIndexTime", "maxValue", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/mifit/sportlib/model/ChartDataType;", "getDataType", "()Lcom/huami/mifit/sportlib/model/ChartDataType;", "J", "getMinIndexTime", "()J", "setMinIndexTime", "(J)V", "F", "getMinValue", "()F", "setMinValue", "(F)V", "getMaxIndexTime", "setMaxIndexTime", "getMaxValue", "setMaxValue", "<init>", "(Lcom/huami/mifit/sportlib/model/ChartDataType;JFJF)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PeakIndexTimeValue {

    @NotNull
    private final ChartDataType dataType;
    private long maxIndexTime;
    private float maxValue;
    private long minIndexTime;
    private float minValue;

    public PeakIndexTimeValue(@NotNull ChartDataType chartDataType, long j, float f, long j2, float f2) {
        this.dataType = chartDataType;
        this.minIndexTime = j;
        this.minValue = f;
        this.maxIndexTime = j2;
        this.maxValue = f2;
    }

    public static /* synthetic */ PeakIndexTimeValue copy$default(PeakIndexTimeValue peakIndexTimeValue, ChartDataType chartDataType, long j, float f, long j2, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            chartDataType = peakIndexTimeValue.dataType;
        }
        if ((i & 2) != 0) {
            j = peakIndexTimeValue.minIndexTime;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            f = peakIndexTimeValue.minValue;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            j2 = peakIndexTimeValue.maxIndexTime;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            f2 = peakIndexTimeValue.maxValue;
        }
        return peakIndexTimeValue.copy(chartDataType, j3, f3, j4, f2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChartDataType getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMinIndexTime() {
        return this.minIndexTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMaxIndexTime() {
        return this.maxIndexTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    @NotNull
    public final PeakIndexTimeValue copy(@NotNull ChartDataType dataType, long minIndexTime, float minValue, long maxIndexTime, float maxValue) {
        return new PeakIndexTimeValue(dataType, minIndexTime, minValue, maxIndexTime, maxValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeakIndexTimeValue)) {
            return false;
        }
        PeakIndexTimeValue peakIndexTimeValue = (PeakIndexTimeValue) other;
        return this.dataType == peakIndexTimeValue.dataType && this.minIndexTime == peakIndexTimeValue.minIndexTime && Intrinsics.areEqual((Object) Float.valueOf(this.minValue), (Object) Float.valueOf(peakIndexTimeValue.minValue)) && this.maxIndexTime == peakIndexTimeValue.maxIndexTime && Intrinsics.areEqual((Object) Float.valueOf(this.maxValue), (Object) Float.valueOf(peakIndexTimeValue.maxValue));
    }

    @NotNull
    public final ChartDataType getDataType() {
        return this.dataType;
    }

    public final long getMaxIndexTime() {
        return this.maxIndexTime;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final long getMinIndexTime() {
        return this.minIndexTime;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        return (((((((this.dataType.hashCode() * 31) + b.a(this.minIndexTime)) * 31) + Float.floatToIntBits(this.minValue)) * 31) + b.a(this.maxIndexTime)) * 31) + Float.floatToIntBits(this.maxValue);
    }

    public final void setMaxIndexTime(long j) {
        this.maxIndexTime = j;
    }

    public final void setMaxValue(float f) {
        this.maxValue = f;
    }

    public final void setMinIndexTime(long j) {
        this.minIndexTime = j;
    }

    public final void setMinValue(float f) {
        this.minValue = f;
    }

    @NotNull
    public String toString() {
        return "PeakIndexTimeValue(dataType=" + this.dataType + ", minIndexTime=" + this.minIndexTime + ", minValue=" + this.minValue + ", maxIndexTime=" + this.maxIndexTime + ", maxValue=" + this.maxValue + ")";
    }
}
