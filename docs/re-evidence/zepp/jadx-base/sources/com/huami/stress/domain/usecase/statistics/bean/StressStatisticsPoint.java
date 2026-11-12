package com.huami.stress.domain.usecase.statistics.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/stress/domain/usecase/statistics/bean/StressStatisticsPoint;", "", "", "component1", "", "component2", "component3", "time", "maxValue", "minValue", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getMaxValue", "()I", "c", "getMinValue", "<init>", "(JII)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StressStatisticsPoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int maxValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int minValue;

    public StressStatisticsPoint(long j, int i, int i2) {
        this.time = j;
        this.maxValue = i;
        this.minValue = i2;
    }

    public static /* synthetic */ StressStatisticsPoint copy$default(StressStatisticsPoint stressStatisticsPoint, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = stressStatisticsPoint.time;
        }
        if ((i3 & 2) != 0) {
            i = stressStatisticsPoint.maxValue;
        }
        if ((i3 & 4) != 0) {
            i2 = stressStatisticsPoint.minValue;
        }
        return stressStatisticsPoint.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final StressStatisticsPoint copy(long time, int maxValue, int minValue) {
        return new StressStatisticsPoint(time, maxValue, minValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressStatisticsPoint)) {
            return false;
        }
        StressStatisticsPoint stressStatisticsPoint = (StressStatisticsPoint) other;
        return this.time == stressStatisticsPoint.time && this.maxValue == stressStatisticsPoint.maxValue && this.minValue == stressStatisticsPoint.minValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((b.a(this.time) * 31) + this.maxValue) * 31) + this.minValue;
    }

    @NotNull
    public String toString() {
        return "StressStatisticsPoint(time=" + this.time + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ')';
    }
}
