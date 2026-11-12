package com.huami.sleep.service;

import java.util.Date;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/huami/sleep/service/BreathQualityService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/service/SleepBreathInfo;", "getLatestSleepBreathScore", "Ljava/util/Date;", "date", "Lcom/huami/sleep/service/ODChartData;", "getODChartData", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public interface BreathQualityService {
    @NotNull
    Flow<SleepBreathInfo> getLatestSleepBreathScore();

    @NotNull
    Flow<ODChartData> getODChartData(@NotNull Date date);
}
