package com.xiaomi.hm.health.healthdata.ui.vo.stress;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.model.Stress;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107R.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/DayStressDetailData;", "", "", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "a", "Ljava/util/List;", "getBarChartData", "()Ljava/util/List;", "setBarChartData", "(Ljava/util/List;)V", "barChartData", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "b", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "getBarChartBuilder", "()Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "setBarChartBuilder", "(Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;)V", "barChartBuilder", "Lcom/huami/stress/domain/model/Stress;", "c", "getChartData", "setChartData", "chartData", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getFrequency", "()I", "setFrequency", "(I)V", "frequency", "Lcom/huami/stress/domain/model/SingleStress;", "e", "getManualStressData", "setManualStressData", "manualStressData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "f", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "getStatisticsInfo", "()Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "setStatisticsInfo", "(Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;)V", "statisticsInfo", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "g", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "getLevelRatio", "()Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "setLevelRatio", "(Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;)V", "levelRatio", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DayStressDetailData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BarChartBuilder<Number> barChartBuilder;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<BarChartVo<Number>> barChartData = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<Stress> chartData = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int frequency = 5;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<SingleStress> manualStressData = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private StressStatisticsInfo statisticsInfo = new StressStatisticsInfo(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private StressLevelRatio levelRatio = new StressLevelRatio(0, 0, 0, 0, 0, 31, null);

    @Nullable
    public final BarChartBuilder<Number> getBarChartBuilder() {
        return this.barChartBuilder;
    }

    @NotNull
    public final List<BarChartVo<Number>> getBarChartData() {
        return this.barChartData;
    }

    @NotNull
    public final List<Stress> getChartData() {
        return this.chartData;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final StressLevelRatio getLevelRatio() {
        return this.levelRatio;
    }

    @NotNull
    public final List<SingleStress> getManualStressData() {
        return this.manualStressData;
    }

    @NotNull
    public final StressStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    public final void setBarChartBuilder(@Nullable BarChartBuilder<Number> barChartBuilder) {
        this.barChartBuilder = barChartBuilder;
    }

    public final void setBarChartData(@NotNull List<BarChartVo<Number>> list) {
        this.barChartData = list;
    }

    public final void setChartData(@NotNull List<Stress> list) {
        this.chartData = list;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public final void setLevelRatio(@NotNull StressLevelRatio stressLevelRatio) {
        this.levelRatio = stressLevelRatio;
    }

    public final void setManualStressData(@NotNull List<SingleStress> list) {
        this.manualStressData = list;
    }

    public final void setStatisticsInfo(@NotNull StressStatisticsInfo stressStatisticsInfo) {
        this.statisticsInfo = stressStatisticsInfo;
    }
}
