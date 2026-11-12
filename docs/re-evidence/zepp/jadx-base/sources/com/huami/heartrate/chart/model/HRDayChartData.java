package com.huami.heartrate.chart.model;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/huami/heartrate/chart/model/HRDayChartData;", "", "", "component1", "component2", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "component3", "Lcom/huami/chart/data/YAxisData;", "component4", "Lcom/huami/chart/data/ChartDataList;", "component5", "yMin", "yMax", "xData", "yData", "chartDataList", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getYMin", "()F", "setYMin", "(F)V", "b", "getYMax", "setYMax", "c", "Landroid/util/SparseArray;", "getXData", "()Landroid/util/SparseArray;", GoogleApiAvailabilityLight.a, "getYData", "e", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "()Lcom/huami/chart/data/ChartDataList;", "<init>", "(FFLandroid/util/SparseArray;Landroid/util/SparseArray;Lcom/huami/chart/data/ChartDataList;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HRDayChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private float yMin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private float yMax;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<XAxisData> xData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<YAxisData> yData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final ChartDataList chartDataList;

    public HRDayChartData(float f, float f2, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList) {
        this.yMin = f;
        this.yMax = f2;
        this.xData = sparseArray;
        this.yData = sparseArray2;
        this.chartDataList = chartDataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HRDayChartData copy$default(HRDayChartData hRDayChartData, float f, float f2, SparseArray sparseArray, SparseArray sparseArray2, ChartDataList chartDataList, int i, Object obj) {
        if ((i & 1) != 0) {
            f = hRDayChartData.yMin;
        }
        if ((i & 2) != 0) {
            f2 = hRDayChartData.yMax;
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            sparseArray = hRDayChartData.xData;
        }
        SparseArray sparseArray3 = sparseArray;
        if ((i & 8) != 0) {
            sparseArray2 = hRDayChartData.yData;
        }
        SparseArray sparseArray4 = sparseArray2;
        if ((i & 16) != 0) {
            chartDataList = hRDayChartData.chartDataList;
        }
        return hRDayChartData.copy(f, f3, sparseArray3, sparseArray4, chartDataList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getYMin() {
        return this.yMin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getYMax() {
        return this.yMax;
    }

    @NotNull
    public final SparseArray<XAxisData> component3() {
        return this.xData;
    }

    @NotNull
    public final SparseArray<YAxisData> component4() {
        return this.yData;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChartDataList getChartDataList() {
        return this.chartDataList;
    }

    @NotNull
    public final HRDayChartData copy(float yMin, float yMax, @NotNull SparseArray<XAxisData> xData, @NotNull SparseArray<YAxisData> yData, @NotNull ChartDataList chartDataList) {
        return new HRDayChartData(yMin, yMax, xData, yData, chartDataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HRDayChartData)) {
            return false;
        }
        HRDayChartData hRDayChartData = (HRDayChartData) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.yMin), (Object) Float.valueOf(hRDayChartData.yMin)) && Intrinsics.areEqual((Object) Float.valueOf(this.yMax), (Object) Float.valueOf(hRDayChartData.yMax)) && Intrinsics.areEqual(this.xData, hRDayChartData.xData) && Intrinsics.areEqual(this.yData, hRDayChartData.yData) && Intrinsics.areEqual(this.chartDataList, hRDayChartData.chartDataList);
    }

    @NotNull
    public final ChartDataList getChartDataList() {
        return this.chartDataList;
    }

    @NotNull
    public final SparseArray<XAxisData> getXData() {
        return this.xData;
    }

    @NotNull
    public final SparseArray<YAxisData> getYData() {
        return this.yData;
    }

    public final float getYMax() {
        return this.yMax;
    }

    public final float getYMin() {
        return this.yMin;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.yMin) * 31) + Float.floatToIntBits(this.yMax)) * 31) + this.xData.hashCode()) * 31) + this.yData.hashCode()) * 31) + this.chartDataList.hashCode();
    }

    public final void setYMax(float f) {
        this.yMax = f;
    }

    public final void setYMin(float f) {
        this.yMin = f;
    }

    @NotNull
    public String toString() {
        return "HRDayChartData(yMin=" + this.yMin + ", yMax=" + this.yMax + ", xData=" + this.xData + ", yData=" + this.yData + ", chartDataList=" + this.chartDataList + ")";
    }
}
