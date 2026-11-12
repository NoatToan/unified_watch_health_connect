package com.huami.sleep.vo;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.sleep.model.BreathQualityRiskLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\bD\u0010EJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0003J}\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0001J\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006@\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006@\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:¨\u0006F"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "", "", "component1", "Lcom/huami/sleep/model/BreathQualityRiskLevel;", "component2", "component3", "", "component4", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "component5", "Lcom/huami/chart/data/XAxisData;", "component6", "Lcom/huami/chart/data/YAxisData;", "component7", "component8", "Lcom/huami/sleep/vo/SelectInfoVo;", "component9", "timeStr", "topRisk", "topRiskDesc", "topRiskDay", "chartData", "xAxisData", "yAxisData", "maxIndex", "selectInfoList", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTimeStr", "()Ljava/lang/String;", "setTimeStr", "(Ljava/lang/String;)V", "b", "Lcom/huami/sleep/model/BreathQualityRiskLevel;", "getTopRisk", "()Lcom/huami/sleep/model/BreathQualityRiskLevel;", "setTopRisk", "(Lcom/huami/sleep/model/BreathQualityRiskLevel;)V", "c", "getTopRiskDesc", "setTopRiskDesc", GoogleApiAvailabilityLight.a, LogUtil.I, "getTopRiskDay", "()I", "setTopRiskDay", "(I)V", "e", "Landroid/util/SparseArray;", "getChartData", "()Landroid/util/SparseArray;", "f", "getXAxisData", "g", "getYAxisData", "h", "getMaxIndex", "setMaxIndex", "i", "getSelectInfoList", "<init>", "(Ljava/lang/String;Lcom/huami/sleep/model/BreathQualityRiskLevel;Ljava/lang/String;ILandroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;ILandroid/util/SparseArray;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityWMScoreVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String timeStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private BreathQualityRiskLevel topRisk;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String topRiskDesc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int topRiskDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<ChartData> chartData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<XAxisData> xAxisData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<YAxisData> yAxisData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private int maxIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final SparseArray<SelectInfoVo> selectInfoList;

    public BreathQualityWMScoreVo() {
        this(null, null, null, 0, null, null, null, 0, null, 511, null);
    }

    public BreathQualityWMScoreVo(@NotNull String str, @Nullable BreathQualityRiskLevel breathQualityRiskLevel, @NotNull String str2, int i, @NotNull SparseArray<ChartData> sparseArray, @NotNull SparseArray<XAxisData> sparseArray2, @NotNull SparseArray<YAxisData> sparseArray3, int i2, @NotNull SparseArray<SelectInfoVo> sparseArray4) {
        this.timeStr = str;
        this.topRisk = breathQualityRiskLevel;
        this.topRiskDesc = str2;
        this.topRiskDay = i;
        this.chartData = sparseArray;
        this.xAxisData = sparseArray2;
        this.yAxisData = sparseArray3;
        this.maxIndex = i2;
        this.selectInfoList = sparseArray4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimeStr() {
        return this.timeStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BreathQualityRiskLevel getTopRisk() {
        return this.topRisk;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTopRiskDesc() {
        return this.topRiskDesc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTopRiskDay() {
        return this.topRiskDay;
    }

    @NotNull
    public final SparseArray<ChartData> component5() {
        return this.chartData;
    }

    @NotNull
    public final SparseArray<XAxisData> component6() {
        return this.xAxisData;
    }

    @NotNull
    public final SparseArray<YAxisData> component7() {
        return this.yAxisData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxIndex() {
        return this.maxIndex;
    }

    @NotNull
    public final SparseArray<SelectInfoVo> component9() {
        return this.selectInfoList;
    }

    @NotNull
    public final BreathQualityWMScoreVo copy(@NotNull String timeStr, @Nullable BreathQualityRiskLevel topRisk, @NotNull String topRiskDesc, int topRiskDay, @NotNull SparseArray<ChartData> chartData, @NotNull SparseArray<XAxisData> xAxisData, @NotNull SparseArray<YAxisData> yAxisData, int maxIndex, @NotNull SparseArray<SelectInfoVo> selectInfoList) {
        return new BreathQualityWMScoreVo(timeStr, topRisk, topRiskDesc, topRiskDay, chartData, xAxisData, yAxisData, maxIndex, selectInfoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityWMScoreVo)) {
            return false;
        }
        BreathQualityWMScoreVo breathQualityWMScoreVo = (BreathQualityWMScoreVo) other;
        return Intrinsics.areEqual(this.timeStr, breathQualityWMScoreVo.timeStr) && this.topRisk == breathQualityWMScoreVo.topRisk && Intrinsics.areEqual(this.topRiskDesc, breathQualityWMScoreVo.topRiskDesc) && this.topRiskDay == breathQualityWMScoreVo.topRiskDay && Intrinsics.areEqual(this.chartData, breathQualityWMScoreVo.chartData) && Intrinsics.areEqual(this.xAxisData, breathQualityWMScoreVo.xAxisData) && Intrinsics.areEqual(this.yAxisData, breathQualityWMScoreVo.yAxisData) && this.maxIndex == breathQualityWMScoreVo.maxIndex && Intrinsics.areEqual(this.selectInfoList, breathQualityWMScoreVo.selectInfoList);
    }

    @NotNull
    public final SparseArray<ChartData> getChartData() {
        return this.chartData;
    }

    public final int getMaxIndex() {
        return this.maxIndex;
    }

    @NotNull
    public final SparseArray<SelectInfoVo> getSelectInfoList() {
        return this.selectInfoList;
    }

    @NotNull
    public final String getTimeStr() {
        return this.timeStr;
    }

    @Nullable
    public final BreathQualityRiskLevel getTopRisk() {
        return this.topRisk;
    }

    public final int getTopRiskDay() {
        return this.topRiskDay;
    }

    @NotNull
    public final String getTopRiskDesc() {
        return this.topRiskDesc;
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
        int iHashCode = this.timeStr.hashCode() * 31;
        BreathQualityRiskLevel breathQualityRiskLevel = this.topRisk;
        return ((((((((((((((iHashCode + (breathQualityRiskLevel == null ? 0 : breathQualityRiskLevel.hashCode())) * 31) + this.topRiskDesc.hashCode()) * 31) + this.topRiskDay) * 31) + this.chartData.hashCode()) * 31) + this.xAxisData.hashCode()) * 31) + this.yAxisData.hashCode()) * 31) + this.maxIndex) * 31) + this.selectInfoList.hashCode();
    }

    public final void setMaxIndex(int i) {
        this.maxIndex = i;
    }

    public final void setTimeStr(@NotNull String str) {
        this.timeStr = str;
    }

    public final void setTopRisk(@Nullable BreathQualityRiskLevel breathQualityRiskLevel) {
        this.topRisk = breathQualityRiskLevel;
    }

    public final void setTopRiskDay(int i) {
        this.topRiskDay = i;
    }

    public final void setTopRiskDesc(@NotNull String str) {
        this.topRiskDesc = str;
    }

    @NotNull
    public String toString() {
        return "BreathQualityWMScoreVo(timeStr=" + this.timeStr + ", topRisk=" + this.topRisk + ", topRiskDesc=" + this.topRiskDesc + ", topRiskDay=" + this.topRiskDay + ", chartData=" + this.chartData + ", xAxisData=" + this.xAxisData + ", yAxisData=" + this.yAxisData + ", maxIndex=" + this.maxIndex + ", selectInfoList=" + this.selectInfoList + ")";
    }

    public /* synthetic */ BreathQualityWMScoreVo(String str, BreathQualityRiskLevel breathQualityRiskLevel, String str2, int i, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, int i2, SparseArray sparseArray4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : breathQualityRiskLevel, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? new SparseArray() : sparseArray, (i3 & 32) != 0 ? new SparseArray() : sparseArray2, (i3 & 64) != 0 ? new SparseArray() : sparseArray3, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? new SparseArray() : sparseArray4);
    }
}
