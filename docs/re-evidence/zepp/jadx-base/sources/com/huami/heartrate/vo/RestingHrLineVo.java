package com.huami.heartrate.vo;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.chart.data.ChartData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/vo/RestingHrLineVo;", "", "", "component1", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "component2", "end", "chartDatas", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getEnd", "()I", "b", "Landroid/util/SparseArray;", "getChartDatas", "()Landroid/util/SparseArray;", "<init>", "(ILandroid/util/SparseArray;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RestingHrLineVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int end;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<ChartData> chartDatas;

    public RestingHrLineVo(int i, @NotNull SparseArray<ChartData> sparseArray) {
        this.end = i;
        this.chartDatas = sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestingHrLineVo copy$default(RestingHrLineVo restingHrLineVo, int i, SparseArray sparseArray, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = restingHrLineVo.end;
        }
        if ((i2 & 2) != 0) {
            sparseArray = restingHrLineVo.chartDatas;
        }
        return restingHrLineVo.copy(i, sparseArray);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final SparseArray<ChartData> component2() {
        return this.chartDatas;
    }

    @NotNull
    public final RestingHrLineVo copy(int end, @NotNull SparseArray<ChartData> chartDatas) {
        return new RestingHrLineVo(end, chartDatas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestingHrLineVo)) {
            return false;
        }
        RestingHrLineVo restingHrLineVo = (RestingHrLineVo) other;
        return this.end == restingHrLineVo.end && Intrinsics.areEqual(this.chartDatas, restingHrLineVo.chartDatas);
    }

    @NotNull
    public final SparseArray<ChartData> getChartDatas() {
        return this.chartDatas;
    }

    public final int getEnd() {
        return this.end;
    }

    public int hashCode() {
        return (this.end * 31) + this.chartDatas.hashCode();
    }

    @NotNull
    public String toString() {
        return "RestingHrLineVo(end=" + this.end + ", chartDatas=" + this.chartDatas + ")";
    }
}
