package com.huami.hmchartui.model;

import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huami/hmchartui/model/BaseChartData;", "", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "a", "Landroid/util/SparseArray;", "getXData", "()Landroid/util/SparseArray;", "setXData", "(Landroid/util/SparseArray;)V", "xData", "Lcom/huami/chart/data/YAxisData;", "b", "getYData", "setYData", "yData", "Lcom/huami/chart/data/ChartData;", "c", "getChartData", "setChartData", "chartData", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public class BaseChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SparseArray<XAxisData> xData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SparseArray<YAxisData> yData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SparseArray<ChartData> chartData;

    @Nullable
    public final SparseArray<ChartData> getChartData() {
        return this.chartData;
    }

    @Nullable
    public final SparseArray<XAxisData> getXData() {
        return this.xData;
    }

    @Nullable
    public final SparseArray<YAxisData> getYData() {
        return this.yData;
    }

    public final void setChartData(@Nullable SparseArray<ChartData> sparseArray) {
        this.chartData = sparseArray;
    }

    public final void setXData(@Nullable SparseArray<XAxisData> sparseArray) {
        this.xData = sparseArray;
    }

    public final void setYData(@Nullable SparseArray<YAxisData> sparseArray) {
        this.yData = sparseArray;
    }
}
