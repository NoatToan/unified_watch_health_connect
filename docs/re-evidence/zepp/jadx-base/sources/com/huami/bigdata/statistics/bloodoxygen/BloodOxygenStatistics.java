package com.huami.bigdata.statistics.bloodoxygen;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractStatistics;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006%"}, d2 = {"Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenStatistics;", "Lcom/huami/bigdata/statistics/core/entity/AbstractStatistics;", "Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenDateData;", "", "component1", "component2", "", "component3", "component4", "maxValue", "minValue", "avgValue", "totalSize", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getMaxValue", "()I", "setMaxValue", "(I)V", "getMinValue", "setMinValue", LogUtil.D, "getAvgValue", "()D", "setAvgValue", "(D)V", "getTotalSize", "setTotalSize", "<init>", "(IIDI)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodOxygenStatistics extends AbstractStatistics<BloodOxygenDateData> {

    @Action(type = ActionType.AVG)
    private double avgValue;

    @Action(type = ActionType.MAX)
    private int maxValue;

    @Action(type = ActionType.MIN)
    private int minValue;

    @Action(type = ActionType.PLUS)
    private int totalSize;

    public BloodOxygenStatistics() {
        this(0, 0, 0.0d, 0, 15, null);
    }

    public /* synthetic */ BloodOxygenStatistics(int i, int i2, double d, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) == 0 ? i2 : -1, (i4 & 4) != 0 ? -1.0d : d, (i4 & 8) != 0 ? 0 : i3);
    }

    public static /* synthetic */ BloodOxygenStatistics copy$default(BloodOxygenStatistics bloodOxygenStatistics, int i, int i2, double d, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bloodOxygenStatistics.maxValue;
        }
        if ((i4 & 2) != 0) {
            i2 = bloodOxygenStatistics.minValue;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            d = bloodOxygenStatistics.avgValue;
        }
        double d2 = d;
        if ((i4 & 8) != 0) {
            i3 = bloodOxygenStatistics.totalSize;
        }
        return bloodOxygenStatistics.copy(i, i5, d2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final BloodOxygenStatistics copy(int maxValue, int minValue, double avgValue, int totalSize) {
        return new BloodOxygenStatistics(maxValue, minValue, avgValue, totalSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodOxygenStatistics)) {
            return false;
        }
        BloodOxygenStatistics bloodOxygenStatistics = (BloodOxygenStatistics) other;
        return this.maxValue == bloodOxygenStatistics.maxValue && this.minValue == bloodOxygenStatistics.minValue && Intrinsics.areEqual((Object) Double.valueOf(this.avgValue), (Object) Double.valueOf(bloodOxygenStatistics.avgValue)) && this.totalSize == bloodOxygenStatistics.totalSize;
    }

    public final double getAvgValue() {
        return this.avgValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        return (((((this.maxValue * 31) + this.minValue) * 31) + dz.a(this.avgValue)) * 31) + this.totalSize;
    }

    public final void setAvgValue(double d) {
        this.avgValue = d;
    }

    public final void setMaxValue(int i) {
        this.maxValue = i;
    }

    public final void setMinValue(int i) {
        this.minValue = i;
    }

    public final void setTotalSize(int i) {
        this.totalSize = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractStatistics
    @NotNull
    public String toString() {
        return "BloodOxygenStatistics(maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", avgValue=" + this.avgValue + ", totalSize=" + this.totalSize + ")";
    }

    public BloodOxygenStatistics(int i, int i2, double d, int i3) {
        this.maxValue = i;
        this.minValue = i2;
        this.avgValue = d;
        this.totalSize = i3;
    }
}
