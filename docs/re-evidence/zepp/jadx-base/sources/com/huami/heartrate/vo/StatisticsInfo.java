package com.huami.heartrate.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/heartrate/vo/StatisticsInfo;", "", "", "isValid", "", "component1", "component2", "component3", "maxValue", "minValue", "avgValue", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getMaxValue", "()I", "b", "getMinValue", "c", "getAvgValue", "<init>", "(III)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StatisticsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int maxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int minValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int avgValue;

    public StatisticsInfo() {
        this(0, 0, 0, 7, null);
    }

    public StatisticsInfo(int i, int i2, int i3) {
        this.maxValue = i;
        this.minValue = i2;
        this.avgValue = i3;
    }

    public static /* synthetic */ StatisticsInfo copy$default(StatisticsInfo statisticsInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = statisticsInfo.maxValue;
        }
        if ((i4 & 2) != 0) {
            i2 = statisticsInfo.minValue;
        }
        if ((i4 & 4) != 0) {
            i3 = statisticsInfo.avgValue;
        }
        return statisticsInfo.copy(i, i2, i3);
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
    public final int getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    public final StatisticsInfo copy(int maxValue, int minValue, int avgValue) {
        return new StatisticsInfo(maxValue, minValue, avgValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsInfo)) {
            return false;
        }
        StatisticsInfo statisticsInfo = (StatisticsInfo) other;
        return this.maxValue == statisticsInfo.maxValue && this.minValue == statisticsInfo.minValue && this.avgValue == statisticsInfo.avgValue;
    }

    public final int getAvgValue() {
        return this.avgValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        return (((this.maxValue * 31) + this.minValue) * 31) + this.avgValue;
    }

    public final boolean isValid() {
        return (this.maxValue == -1 || this.minValue == -1 || this.avgValue == -1) ? false : true;
    }

    @NotNull
    public String toString() {
        return "StatisticsInfo(maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", avgValue=" + this.avgValue + ")";
    }

    public /* synthetic */ StatisticsInfo(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
