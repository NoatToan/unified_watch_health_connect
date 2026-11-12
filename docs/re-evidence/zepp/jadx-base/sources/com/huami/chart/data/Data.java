package com.huami.chart.data;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/chart/data/Data;", "", "Lcom/huami/chart/data/ChartDataList;", "component1", "", "component2", "()[Lcom/huami/chart/data/ChartDataList;", "mainDataList", "multiList", "copy", "(Lcom/huami/chart/data/ChartDataList;[Lcom/huami/chart/data/ChartDataList;)Lcom/huami/chart/data/Data;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/chart/data/ChartDataList;", "getMainDataList", "()Lcom/huami/chart/data/ChartDataList;", "b", "[Lcom/huami/chart/data/ChartDataList;", "getMultiList", "<init>", "(Lcom/huami/chart/data/ChartDataList;[Lcom/huami/chart/data/ChartDataList;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Data {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ChartDataList mainDataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final ChartDataList[] multiList;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Data(@NotNull ChartDataList chartDataList) {
        this(chartDataList, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public Data(@NotNull ChartDataList chartDataList, @Nullable ChartDataList[] chartDataListArr) {
        this.mainDataList = chartDataList;
        this.multiList = chartDataListArr;
    }

    public static /* synthetic */ Data copy$default(Data data, ChartDataList chartDataList, ChartDataList[] chartDataListArr, int i, Object obj) {
        if ((i & 1) != 0) {
            chartDataList = data.mainDataList;
        }
        if ((i & 2) != 0) {
            chartDataListArr = data.multiList;
        }
        return data.copy(chartDataList, chartDataListArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChartDataList getMainDataList() {
        return this.mainDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartDataList[] getMultiList() {
        return this.multiList;
    }

    @NotNull
    public final Data copy(@NotNull ChartDataList mainDataList, @Nullable ChartDataList[] multiList) {
        return new Data(mainDataList, multiList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.mainDataList, data.mainDataList) && Intrinsics.areEqual(this.multiList, data.multiList);
    }

    @NotNull
    public final ChartDataList getMainDataList() {
        return this.mainDataList;
    }

    @Nullable
    public final ChartDataList[] getMultiList() {
        return this.multiList;
    }

    public int hashCode() {
        int iHashCode = this.mainDataList.hashCode() * 31;
        ChartDataList[] chartDataListArr = this.multiList;
        return iHashCode + (chartDataListArr == null ? 0 : Arrays.hashCode(chartDataListArr));
    }

    @NotNull
    public String toString() {
        return "Data(mainDataList=" + this.mainDataList + ", multiList=" + Arrays.toString(this.multiList) + ")";
    }

    public /* synthetic */ Data(ChartDataList chartDataList, ChartDataList[] chartDataListArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chartDataList, (i & 2) != 0 ? null : chartDataListArr);
    }
}
