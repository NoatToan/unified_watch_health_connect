package com.huami.stress.domain.service;

import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.statistics.bean.StressStatistics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/stress/domain/service/StressStatisticsService;", "", "Lcom/huami/stress/domain/model/AllDayStress;", "allDayStress", "", "Lcom/huami/stress/domain/model/SingleStress;", "singleDayStress", "Lcom/huami/stress/domain/usecase/statistics/bean/StressStatistics;", "statisticsStressByDay", "statisticsStressByWeek", "statisticsStressByMonth", "statisticsStressByYear", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class StressStatisticsService {

    @NotNull
    public static final StressStatisticsService INSTANCE = new StressStatisticsService();

    private StressStatisticsService() {
    }

    @NotNull
    public final StressStatistics statisticsStressByDay(@Nullable AllDayStress allDayStress, @NotNull List<SingleStress> singleDayStress) {
        return new StressStatistics(CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, 0);
    }

    @NotNull
    public final StressStatistics statisticsStressByMonth(@Nullable AllDayStress allDayStress, @NotNull List<SingleStress> singleDayStress) {
        return new StressStatistics(CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, 0);
    }

    @NotNull
    public final StressStatistics statisticsStressByWeek(@Nullable AllDayStress allDayStress, @NotNull List<SingleStress> singleDayStress) {
        return new StressStatistics(CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, 0);
    }

    @NotNull
    public final StressStatistics statisticsStressByYear(@Nullable AllDayStress allDayStress, @NotNull List<SingleStress> singleDayStress) {
        return new StressStatistics(CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, 0);
    }
}
