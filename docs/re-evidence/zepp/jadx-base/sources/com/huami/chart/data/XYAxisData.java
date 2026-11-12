package com.huami.chart.data;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/chart/data/XYAxisData;", "", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "component1", "Lcom/huami/chart/data/YAxisData;", "component2", "xAxisDatas", "yAxisDatas", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroid/util/SparseArray;", "getXAxisDatas", "()Landroid/util/SparseArray;", "b", "getYAxisDatas", "<init>", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XYAxisData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<XAxisData> xAxisDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<YAxisData> yAxisDatas;

    public XYAxisData(@NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2) {
        this.xAxisDatas = sparseArray;
        this.yAxisDatas = sparseArray2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XYAxisData copy$default(XYAxisData xYAxisData, SparseArray sparseArray, SparseArray sparseArray2, int i, Object obj) {
        if ((i & 1) != 0) {
            sparseArray = xYAxisData.xAxisDatas;
        }
        if ((i & 2) != 0) {
            sparseArray2 = xYAxisData.yAxisDatas;
        }
        return xYAxisData.copy(sparseArray, sparseArray2);
    }

    @NotNull
    public final SparseArray<XAxisData> component1() {
        return this.xAxisDatas;
    }

    @NotNull
    public final SparseArray<YAxisData> component2() {
        return this.yAxisDatas;
    }

    @NotNull
    public final XYAxisData copy(@NotNull SparseArray<XAxisData> xAxisDatas, @NotNull SparseArray<YAxisData> yAxisDatas) {
        return new XYAxisData(xAxisDatas, yAxisDatas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XYAxisData)) {
            return false;
        }
        XYAxisData xYAxisData = (XYAxisData) other;
        return Intrinsics.areEqual(this.xAxisDatas, xYAxisData.xAxisDatas) && Intrinsics.areEqual(this.yAxisDatas, xYAxisData.yAxisDatas);
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisDatas() {
        return this.xAxisDatas;
    }

    @NotNull
    public final SparseArray<YAxisData> getYAxisDatas() {
        return this.yAxisDatas;
    }

    public int hashCode() {
        return (this.xAxisDatas.hashCode() * 31) + this.yAxisDatas.hashCode();
    }

    @NotNull
    public String toString() {
        return "XYAxisData(xAxisDatas=" + this.xAxisDatas + ", yAxisDatas=" + this.yAxisDatas + ")";
    }
}
