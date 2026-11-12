package com.huami.sleep.service;

import android.util.SparseArray;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H'J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002H'J\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002H'J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0002H&J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0002H&J)\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/service/SleepService;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/service/SleepData;", "getLatestSleepData", "Lcom/huami/sleep/service/SleepChanges;", "getSleepChanges", "Lcom/huami/sleep/service/SleepChartData;", "getSleepChartData", "Landroid/util/SparseArray;", "Lcom/huami/sleep/service/ChartPoint;", "getHeartRateChartData", "Lcom/huami/sleep/service/SleepDurationInLast7Days;", "getSleepDurationInLast7DaysChartData", "Lcom/huami/sleep/service/ServiceSleepInfo;", "getSleepInfo", "", "queryTimeStamp", "fetchIntoSleepTimeStampByTimeStamp", "(J)Ljava/lang/Long;", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "fetchTodaySleepInfoWithTonality", "Lkotlin/Pair;", "fetchMainSleepFallAndWakeTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exitService", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public interface SleepService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void exitService(@NotNull SleepService sleepService) {
        }
    }

    void exitService();

    @Nullable
    Long fetchIntoSleepTimeStampByTimeStamp(long queryTimeStamp);

    @Nullable
    Object fetchMainSleepFallAndWakeTimestamp(long j, @NotNull Continuation<? super Pair<Long, Long>> continuation);

    @NotNull
    Flow<SleepWithTonalityInfo> fetchTodaySleepInfoWithTonality();

    @Deprecated(message = "sleep-service/1.2.1后全面废弃，使用@{getSleepInfo}统一获取")
    @NotNull
    Flow<SparseArray<ChartPoint>> getHeartRateChartData();

    @Deprecated(message = "sleep-service/1.2.1后全面废弃，使用@{getSleepInfo}统一获取")
    @NotNull
    Flow<SleepData> getLatestSleepData();

    @Deprecated(message = "sleep-service/1.2.1后全面废弃，使用@{getSleepInfo}统一获取")
    @NotNull
    Flow<SleepChanges> getSleepChanges();

    @Deprecated(message = "sleep-service/1.2.1后全面废弃，使用@{getSleepInfo}统一获取")
    @NotNull
    Flow<SleepChartData> getSleepChartData();

    @Deprecated(message = "sleep-service/1.2.1后全面废弃，使用@{getSleepInfo}统一获取")
    @NotNull
    Flow<SleepDurationInLast7Days> getSleepDurationInLast7DaysChartData();

    @NotNull
    Flow<ServiceSleepInfo> getSleepInfo();
}
