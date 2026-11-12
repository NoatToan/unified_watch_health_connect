package com.xiaomi.hm.health.healthdata.ui.vo.stress;

import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dR.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StatisticsStressDetailData;", "", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "a", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "setChartData", "(Ljava/util/List;)V", "chartData", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "b", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "getBarChartBuilder", "()Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "setBarChartBuilder", "(Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;)V", "barChartBuilder", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "c", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "getStatisticsInfo", "()Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "setStatisticsInfo", "(Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;)V", "statisticsInfo", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StatisticsStressDetailData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BarChartBuilder<Number> barChartBuilder;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<BarChartVo<Number>> chartData = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private StressStatisticsInfo statisticsInfo = new StressStatisticsInfo(0, 0, 0, 0, 15, null);

    @Nullable
    public final BarChartBuilder<Number> getBarChartBuilder() {
        return this.barChartBuilder;
    }

    @NotNull
    public final List<BarChartVo<Number>> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final StressStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public final void setBarChartBuilder(@Nullable BarChartBuilder<Number> barChartBuilder) {
        this.barChartBuilder = barChartBuilder;
    }

    public final void setChartData(@NotNull List<BarChartVo<Number>> list) {
        this.chartData = list;
    }

    public final void setStatisticsInfo(@NotNull StressStatisticsInfo stressStatisticsInfo) {
        this.statisticsInfo = stressStatisticsInfo;
    }
}
