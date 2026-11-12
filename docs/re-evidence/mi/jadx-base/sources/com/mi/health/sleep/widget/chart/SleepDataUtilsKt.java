package com.mi.health.sleep.widget.chart;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"sleepChartStageColor", "", "Lcom/mi/health/sleep/widget/chart/SleepChartStage;", "", "getSleepChartStageColor", "()Ljava/util/Map;", "fitness-data-provider_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SleepDataUtilsKt {

    @NotNull
    private static final Map<SleepChartStage, Integer> sleepChartStageColor = MapsKt__MapsKt.mapOf(TuplesKt.to(SleepChartStage.DEEP_SLEEP, -16763649), TuplesKt.to(SleepChartStage.LIGHT_SLEEP, -11689473), TuplesKt.to(SleepChartStage.RAPID_EYE_MOVEMENT, -8530177), TuplesKt.to(SleepChartStage.AWAKE, -38339));

    @NotNull
    public static final Map<SleepChartStage, Integer> getSleepChartStageColor() {
        return sleepChartStageColor;
    }
}
