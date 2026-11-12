package com.huami.sleep.service.bean;

import com.huami.chart.data.ChartData;
import com.huami.sleep.service.SleepMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/service/bean/SleepDataWithMode;", "", "Lcom/huami/sleep/service/SleepMode;", "component1", "Lcom/huami/chart/data/ChartData;", "component2", "sleepMode", "chartData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/sleep/service/SleepMode;", "getSleepMode", "()Lcom/huami/sleep/service/SleepMode;", "b", "Lcom/huami/chart/data/ChartData;", "getChartData", "()Lcom/huami/chart/data/ChartData;", "<init>", "(Lcom/huami/sleep/service/SleepMode;Lcom/huami/chart/data/ChartData;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepDataWithMode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SleepMode sleepMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ChartData chartData;

    public SleepDataWithMode(@NotNull SleepMode sleepMode, @NotNull ChartData chartData) {
        this.sleepMode = sleepMode;
        this.chartData = chartData;
    }

    public static /* synthetic */ SleepDataWithMode copy$default(SleepDataWithMode sleepDataWithMode, SleepMode sleepMode, ChartData chartData, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepMode = sleepDataWithMode.sleepMode;
        }
        if ((i & 2) != 0) {
            chartData = sleepDataWithMode.chartData;
        }
        return sleepDataWithMode.copy(sleepMode, chartData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepMode getSleepMode() {
        return this.sleepMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartData getChartData() {
        return this.chartData;
    }

    @NotNull
    public final SleepDataWithMode copy(@NotNull SleepMode sleepMode, @NotNull ChartData chartData) {
        return new SleepDataWithMode(sleepMode, chartData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDataWithMode)) {
            return false;
        }
        SleepDataWithMode sleepDataWithMode = (SleepDataWithMode) other;
        return this.sleepMode == sleepDataWithMode.sleepMode && Intrinsics.areEqual(this.chartData, sleepDataWithMode.chartData);
    }

    @NotNull
    public final ChartData getChartData() {
        return this.chartData;
    }

    @NotNull
    public final SleepMode getSleepMode() {
        return this.sleepMode;
    }

    public int hashCode() {
        return (this.sleepMode.hashCode() * 31) + this.chartData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepDataWithMode(sleepMode=" + this.sleepMode + ", chartData=" + this.chartData + ")";
    }
}
