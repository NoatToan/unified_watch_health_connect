package com.huami.bloodoxygen.ui.vo;

import android.util.SparseArray;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J3\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/ChartParams;", "", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "component1", "Lcom/huami/chart/data/YAxisData;", "component2", "Lcom/huami/chart/data/ChartDataList;", "component3", "xAxisData", "yAxisData", "chartDataList", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroid/util/SparseArray;", "getXAxisData", "()Landroid/util/SparseArray;", "b", "getYAxisData", "c", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "()Lcom/huami/chart/data/ChartDataList;", "<init>", "(Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/huami/chart/data/ChartDataList;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChartParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<XAxisData> xAxisData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<YAxisData> yAxisData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final ChartDataList chartDataList;

    public ChartParams(@NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList) {
        this.xAxisData = sparseArray;
        this.yAxisData = sparseArray2;
        this.chartDataList = chartDataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartParams copy$default(ChartParams chartParams, SparseArray sparseArray, SparseArray sparseArray2, ChartDataList chartDataList, int i, Object obj) {
        if ((i & 1) != 0) {
            sparseArray = chartParams.xAxisData;
        }
        if ((i & 2) != 0) {
            sparseArray2 = chartParams.yAxisData;
        }
        if ((i & 4) != 0) {
            chartDataList = chartParams.chartDataList;
        }
        return chartParams.copy(sparseArray, sparseArray2, chartDataList);
    }

    @NotNull
    public final SparseArray<XAxisData> component1() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> component2() {
        return this.yAxisData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChartDataList getChartDataList() {
        return this.chartDataList;
    }

    @NotNull
    public final ChartParams copy(@NotNull SparseArray<XAxisData> xAxisData, @NotNull SparseArray<YAxisData> yAxisData, @NotNull ChartDataList chartDataList) {
        return new ChartParams(xAxisData, yAxisData, chartDataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartParams)) {
            return false;
        }
        ChartParams chartParams = (ChartParams) other;
        return Intrinsics.areEqual(this.xAxisData, chartParams.xAxisData) && Intrinsics.areEqual(this.yAxisData, chartParams.yAxisData) && Intrinsics.areEqual(this.chartDataList, chartParams.chartDataList);
    }

    @NotNull
    public final ChartDataList getChartDataList() {
        return this.chartDataList;
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisData() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> getYAxisData() {
        return this.yAxisData;
    }

    public int hashCode() {
        return (((this.xAxisData.hashCode() * 31) + this.yAxisData.hashCode()) * 31) + this.chartDataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChartParams(xAxisData=" + this.xAxisData + ", yAxisData=" + this.yAxisData + ", chartDataList=" + this.chartDataList + ")";
    }
}
