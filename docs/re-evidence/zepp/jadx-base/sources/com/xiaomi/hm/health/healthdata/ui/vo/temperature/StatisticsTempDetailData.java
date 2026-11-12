package com.xiaomi.hm.health.healthdata.ui.vo.temperature;

import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/StatisticsTempDetailData;", "", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "component1", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "component2", "chartData", "statisticsInfo", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "b", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "getStatisticsInfo", "()Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StatisticsTempDetailData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<BarChartVo<Number>> chartData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final TempStatisticsInfo statisticsInfo;

    public StatisticsTempDetailData(@NotNull List<BarChartVo<Number>> list, @NotNull TempStatisticsInfo tempStatisticsInfo) {
        this.chartData = list;
        this.statisticsInfo = tempStatisticsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatisticsTempDetailData copy$default(StatisticsTempDetailData statisticsTempDetailData, List list, TempStatisticsInfo tempStatisticsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statisticsTempDetailData.chartData;
        }
        if ((i & 2) != 0) {
            tempStatisticsInfo = statisticsTempDetailData.statisticsInfo;
        }
        return statisticsTempDetailData.copy(list, tempStatisticsInfo);
    }

    @NotNull
    public final List<BarChartVo<Number>> component1() {
        return this.chartData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TempStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    @NotNull
    public final StatisticsTempDetailData copy(@NotNull List<BarChartVo<Number>> chartData, @NotNull TempStatisticsInfo statisticsInfo) {
        return new StatisticsTempDetailData(chartData, statisticsInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsTempDetailData)) {
            return false;
        }
        StatisticsTempDetailData statisticsTempDetailData = (StatisticsTempDetailData) other;
        return Intrinsics.areEqual(this.chartData, statisticsTempDetailData.chartData) && Intrinsics.areEqual(this.statisticsInfo, statisticsTempDetailData.statisticsInfo);
    }

    @NotNull
    public final List<BarChartVo<Number>> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final TempStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public int hashCode() {
        return (this.chartData.hashCode() * 31) + this.statisticsInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatisticsTempDetailData(chartData=" + this.chartData + ", statisticsInfo=" + this.statisticsInfo + ")";
    }
}
