package com.huami.bodymeasurements.temperature.view.vo;

import com.huami.bodymeasurements.temperature.view.vo.chart.TempMixLineChartBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/DayTempDetailData;", "", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "component1", "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "component2", "chartBuilder", "statisticsInfo", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "getChartBuilder", "()Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "b", "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "getStatisticsInfo", "()Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "<init>", "(Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DayTempDetailData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final TempMixLineChartBuilder chartBuilder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final TempStatisticsInfo statisticsInfo;

    public DayTempDetailData(@NotNull TempMixLineChartBuilder tempMixLineChartBuilder, @NotNull TempStatisticsInfo tempStatisticsInfo) {
        this.chartBuilder = tempMixLineChartBuilder;
        this.statisticsInfo = tempStatisticsInfo;
    }

    public static /* synthetic */ DayTempDetailData copy$default(DayTempDetailData dayTempDetailData, TempMixLineChartBuilder tempMixLineChartBuilder, TempStatisticsInfo tempStatisticsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            tempMixLineChartBuilder = dayTempDetailData.chartBuilder;
        }
        if ((i & 2) != 0) {
            tempStatisticsInfo = dayTempDetailData.statisticsInfo;
        }
        return dayTempDetailData.copy(tempMixLineChartBuilder, tempStatisticsInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TempMixLineChartBuilder getChartBuilder() {
        return this.chartBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TempStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    @NotNull
    public final DayTempDetailData copy(@NotNull TempMixLineChartBuilder chartBuilder, @NotNull TempStatisticsInfo statisticsInfo) {
        return new DayTempDetailData(chartBuilder, statisticsInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayTempDetailData)) {
            return false;
        }
        DayTempDetailData dayTempDetailData = (DayTempDetailData) other;
        return Intrinsics.areEqual(this.chartBuilder, dayTempDetailData.chartBuilder) && Intrinsics.areEqual(this.statisticsInfo, dayTempDetailData.statisticsInfo);
    }

    @NotNull
    public final TempMixLineChartBuilder getChartBuilder() {
        return this.chartBuilder;
    }

    @NotNull
    public final TempStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public int hashCode() {
        return (this.chartBuilder.hashCode() * 31) + this.statisticsInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "DayTempDetailData(chartBuilder=" + this.chartBuilder + ", statisticsInfo=" + this.statisticsInfo + ')';
    }
}
