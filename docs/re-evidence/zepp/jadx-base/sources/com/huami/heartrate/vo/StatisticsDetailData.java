package com.huami.heartrate.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/vo/StatisticsDetailData;", "", "Lcom/huami/heartrate/vo/BarChartBuilder;", "component1", "Lcom/huami/heartrate/vo/StatisticsInfo;", "component2", "chartBuilder", "statisticsInfo", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/heartrate/vo/BarChartBuilder;", "getChartBuilder", "()Lcom/huami/heartrate/vo/BarChartBuilder;", "b", "Lcom/huami/heartrate/vo/StatisticsInfo;", "getStatisticsInfo", "()Lcom/huami/heartrate/vo/StatisticsInfo;", "<init>", "(Lcom/huami/heartrate/vo/BarChartBuilder;Lcom/huami/heartrate/vo/StatisticsInfo;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StatisticsDetailData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final BarChartBuilder chartBuilder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final StatisticsInfo statisticsInfo;

    public StatisticsDetailData(@NotNull BarChartBuilder barChartBuilder, @NotNull StatisticsInfo statisticsInfo) {
        this.chartBuilder = barChartBuilder;
        this.statisticsInfo = statisticsInfo;
    }

    public static /* synthetic */ StatisticsDetailData copy$default(StatisticsDetailData statisticsDetailData, BarChartBuilder barChartBuilder, StatisticsInfo statisticsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            barChartBuilder = statisticsDetailData.chartBuilder;
        }
        if ((i & 2) != 0) {
            statisticsInfo = statisticsDetailData.statisticsInfo;
        }
        return statisticsDetailData.copy(barChartBuilder, statisticsInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BarChartBuilder getChartBuilder() {
        return this.chartBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    @NotNull
    public final StatisticsDetailData copy(@NotNull BarChartBuilder chartBuilder, @NotNull StatisticsInfo statisticsInfo) {
        return new StatisticsDetailData(chartBuilder, statisticsInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsDetailData)) {
            return false;
        }
        StatisticsDetailData statisticsDetailData = (StatisticsDetailData) other;
        return Intrinsics.areEqual(this.chartBuilder, statisticsDetailData.chartBuilder) && Intrinsics.areEqual(this.statisticsInfo, statisticsDetailData.statisticsInfo);
    }

    @NotNull
    public final BarChartBuilder getChartBuilder() {
        return this.chartBuilder;
    }

    @NotNull
    public final StatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public int hashCode() {
        return (this.chartBuilder.hashCode() * 31) + this.statisticsInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatisticsDetailData(chartBuilder=" + this.chartBuilder + ", statisticsInfo=" + this.statisticsInfo + ")";
    }

    public /* synthetic */ StatisticsDetailData(BarChartBuilder barChartBuilder, StatisticsInfo statisticsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barChartBuilder, (i & 2) != 0 ? new StatisticsInfo(0, 0, 0, 7, null) : statisticsInfo);
    }
}
