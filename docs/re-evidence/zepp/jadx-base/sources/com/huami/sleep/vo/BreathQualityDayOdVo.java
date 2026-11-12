package com.huami.sleep.vo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\bH\u0010IJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u0085\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0012HÆ\u0001J\t\u0010\u001f\u001a\u00020\u0002HÖ\u0001J\t\u0010 \u001a\u00020\rHÖ\u0001J\u0013\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006@\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\"\u0010\u0019\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u0019\u0010\u001b\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010:R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u00102R\u0019\u0010\u001d\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "", "", "component1", "", "component2", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "component3", "Lcom/huami/chart/data/XAxisData;", "component4", "Lcom/huami/chart/data/YAxisData;", "component5", "", "component6", "component7", "component8", "component9", "Landroid/util/SparseIntArray;", "component10", "timeStr", "empty", "chartData", "xAxisData", "yAxisData", "minIndex", "maxIndex", "gap", "selectInfoList", "valueInfoList", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getTimeStr", "()Ljava/lang/String;", "setTimeStr", "(Ljava/lang/String;)V", "b", "Z", "getEmpty", "()Z", "setEmpty", "(Z)V", "c", "Landroid/util/SparseArray;", "getChartData", "()Landroid/util/SparseArray;", GoogleApiAvailabilityLight.a, "getXAxisData", "e", "getYAxisData", "f", LogUtil.I, "getMinIndex", "()I", "setMinIndex", "(I)V", "g", "getMaxIndex", "setMaxIndex", "h", "getGap", "i", "getSelectInfoList", z.j, "Landroid/util/SparseIntArray;", "getValueInfoList", "()Landroid/util/SparseIntArray;", "<init>", "(Ljava/lang/String;ZLandroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;IIILandroid/util/SparseArray;Landroid/util/SparseIntArray;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityDayOdVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String timeStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean empty;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<ChartData> chartData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<XAxisData> xAxisData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<YAxisData> yAxisData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int minIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private int maxIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int gap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<String> selectInfoList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseIntArray valueInfoList;

    public BreathQualityDayOdVo() {
        this(null, false, null, null, null, 0, 0, 0, null, null, 1023, null);
    }

    public BreathQualityDayOdVo(@NotNull String str, boolean z, @NotNull SparseArray<ChartData> sparseArray, @NotNull SparseArray<XAxisData> sparseArray2, @NotNull SparseArray<YAxisData> sparseArray3, int i, int i2, int i3, @NotNull SparseArray<String> sparseArray4, @NotNull SparseIntArray sparseIntArray) {
        this.timeStr = str;
        this.empty = z;
        this.chartData = sparseArray;
        this.xAxisData = sparseArray2;
        this.yAxisData = sparseArray3;
        this.minIndex = i;
        this.maxIndex = i2;
        this.gap = i3;
        this.selectInfoList = sparseArray4;
        this.valueInfoList = sparseIntArray;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimeStr() {
        return this.timeStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SparseIntArray getValueInfoList() {
        return this.valueInfoList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEmpty() {
        return this.empty;
    }

    @NotNull
    public final SparseArray<ChartData> component3() {
        return this.chartData;
    }

    @NotNull
    public final SparseArray<XAxisData> component4() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> component5() {
        return this.yAxisData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinIndex() {
        return this.minIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaxIndex() {
        return this.maxIndex;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getGap() {
        return this.gap;
    }

    @NotNull
    public final SparseArray<String> component9() {
        return this.selectInfoList;
    }

    @NotNull
    public final BreathQualityDayOdVo copy(@NotNull String timeStr, boolean empty, @NotNull SparseArray<ChartData> chartData, @NotNull SparseArray<XAxisData> xAxisData, @NotNull SparseArray<YAxisData> yAxisData, int minIndex, int maxIndex, int gap, @NotNull SparseArray<String> selectInfoList, @NotNull SparseIntArray valueInfoList) {
        return new BreathQualityDayOdVo(timeStr, empty, chartData, xAxisData, yAxisData, minIndex, maxIndex, gap, selectInfoList, valueInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityDayOdVo)) {
            return false;
        }
        BreathQualityDayOdVo breathQualityDayOdVo = (BreathQualityDayOdVo) other;
        return Intrinsics.areEqual(this.timeStr, breathQualityDayOdVo.timeStr) && this.empty == breathQualityDayOdVo.empty && Intrinsics.areEqual(this.chartData, breathQualityDayOdVo.chartData) && Intrinsics.areEqual(this.xAxisData, breathQualityDayOdVo.xAxisData) && Intrinsics.areEqual(this.yAxisData, breathQualityDayOdVo.yAxisData) && this.minIndex == breathQualityDayOdVo.minIndex && this.maxIndex == breathQualityDayOdVo.maxIndex && this.gap == breathQualityDayOdVo.gap && Intrinsics.areEqual(this.selectInfoList, breathQualityDayOdVo.selectInfoList) && Intrinsics.areEqual(this.valueInfoList, breathQualityDayOdVo.valueInfoList);
    }

    @NotNull
    public final SparseArray<ChartData> getChartData() {
        return this.chartData;
    }

    public final boolean getEmpty() {
        return this.empty;
    }

    public final int getGap() {
        return this.gap;
    }

    public final int getMaxIndex() {
        return this.maxIndex;
    }

    public final int getMinIndex() {
        return this.minIndex;
    }

    @NotNull
    public final SparseArray<String> getSelectInfoList() {
        return this.selectInfoList;
    }

    @NotNull
    public final String getTimeStr() {
        return this.timeStr;
    }

    @NotNull
    public final SparseIntArray getValueInfoList() {
        return this.valueInfoList;
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisData() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> getYAxisData() {
        return this.yAxisData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public int hashCode() {
        int iHashCode = this.timeStr.hashCode() * 31;
        boolean z = this.empty;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((((iHashCode + r1) * 31) + this.chartData.hashCode()) * 31) + this.xAxisData.hashCode()) * 31) + this.yAxisData.hashCode()) * 31) + this.minIndex) * 31) + this.maxIndex) * 31) + this.gap) * 31) + this.selectInfoList.hashCode()) * 31) + this.valueInfoList.hashCode();
    }

    public final void setEmpty(boolean z) {
        this.empty = z;
    }

    public final void setMaxIndex(int i) {
        this.maxIndex = i;
    }

    public final void setMinIndex(int i) {
        this.minIndex = i;
    }

    public final void setTimeStr(@NotNull String str) {
        this.timeStr = str;
    }

    @NotNull
    public String toString() {
        return "BreathQualityDayOdVo(timeStr=" + this.timeStr + ", empty=" + this.empty + ", chartData=" + this.chartData + ", xAxisData=" + this.xAxisData + ", yAxisData=" + this.yAxisData + ", minIndex=" + this.minIndex + ", maxIndex=" + this.maxIndex + ", gap=" + this.gap + ", selectInfoList=" + this.selectInfoList + ", valueInfoList=" + this.valueInfoList + ")";
    }

    public /* synthetic */ BreathQualityDayOdVo(String str, boolean z, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, int i, int i2, int i3, SparseArray sparseArray4, SparseIntArray sparseIntArray, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? new SparseArray() : sparseArray, (i4 & 8) != 0 ? new SparseArray() : sparseArray2, (i4 & 16) != 0 ? new SparseArray() : sparseArray3, (i4 & 32) != 0 ? 0 : i, (i4 & 64) == 0 ? i2 : 0, (i4 & 128) != 0 ? 2 : i3, (i4 & 256) != 0 ? new SparseArray() : sparseArray4, (i4 & 512) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
