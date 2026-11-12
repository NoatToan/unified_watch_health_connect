package com.huami.chart.chart;

import com.huami.chart.data.ChartData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/chart/chart/DynamicChartData;", "", "Lcom/huami/chart/data/ChartData;", "component1", "", "component2", "a", "Lcom/huami/chart/data/ChartData;", "getData", "()Lcom/huami/chart/data/ChartData;", "data", "b", "J", "getDuration", "()J", "duration", "<init>", "(Lcom/huami/chart/data/ChartData;J)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class DynamicChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ChartData data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long duration;

    public DynamicChartData(@NotNull ChartData chartData, long j) {
        this.data = chartData;
        this.duration = j;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChartData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final ChartData getData() {
        return this.data;
    }

    public final long getDuration() {
        return this.duration;
    }
}
