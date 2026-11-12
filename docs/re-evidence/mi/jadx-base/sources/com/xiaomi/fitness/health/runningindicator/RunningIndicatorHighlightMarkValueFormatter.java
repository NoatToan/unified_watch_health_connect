package com.xiaomi.fitness.health.runningindicator;

import com.xiaomi.fit.fitness.export.utils.SportLevelComputeUtils;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.gv5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorHighlightMarkValueFormatter;", "Lgv5;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningIndicatorHighlightMarkValueFormatter extends gv5 {
    public RunningIndicatorHighlightMarkValueFormatter() {
        super(0);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        return barEntry.getY() > 0.0f ? String.valueOf(barEntry.getY()) + gv5.CONNECT_VALUE_STR + RunningIndicatorUtil.INSTANCE.getRunningAbilityLevelName(Integer.valueOf(SportLevelComputeUtils.INSTANCE.computeRunningAbilityIndexLevel(barEntry.getY()))) + gv5.CONNECT_STR + TimeDateUtil.getDateYYYYMMddLocalFormat(barEntry.timestamp * ((long) 1000)) : "";
    }
}
