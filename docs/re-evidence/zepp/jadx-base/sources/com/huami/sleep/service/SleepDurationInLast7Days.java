package com.huami.sleep.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/service/SleepDurationInLast7Days;", "", "", "component1", "", "Lcom/huami/sleep/service/ChartPoint;", "component2", "averageSleepDuration", "chartData", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getAverageSleepDuration", "()I", "b", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "<init>", "(ILjava/util/List;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepDurationInLast7Days {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int averageSleepDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ChartPoint> chartData;

    public SleepDurationInLast7Days(int i, @NotNull List<ChartPoint> list) {
        this.averageSleepDuration = i;
        this.chartData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDurationInLast7Days copy$default(SleepDurationInLast7Days sleepDurationInLast7Days, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepDurationInLast7Days.averageSleepDuration;
        }
        if ((i2 & 2) != 0) {
            list = sleepDurationInLast7Days.chartData;
        }
        return sleepDurationInLast7Days.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAverageSleepDuration() {
        return this.averageSleepDuration;
    }

    @NotNull
    public final List<ChartPoint> component2() {
        return this.chartData;
    }

    @NotNull
    public final SleepDurationInLast7Days copy(int averageSleepDuration, @NotNull List<ChartPoint> chartData) {
        return new SleepDurationInLast7Days(averageSleepDuration, chartData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDurationInLast7Days)) {
            return false;
        }
        SleepDurationInLast7Days sleepDurationInLast7Days = (SleepDurationInLast7Days) other;
        return this.averageSleepDuration == sleepDurationInLast7Days.averageSleepDuration && Intrinsics.areEqual(this.chartData, sleepDurationInLast7Days.chartData);
    }

    public final int getAverageSleepDuration() {
        return this.averageSleepDuration;
    }

    @NotNull
    public final List<ChartPoint> getChartData() {
        return this.chartData;
    }

    public int hashCode() {
        return (this.averageSleepDuration * 31) + this.chartData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepDurationInLast7Days(averageSleepDuration=" + this.averageSleepDuration + ", chartData=" + this.chartData + ")";
    }
}
