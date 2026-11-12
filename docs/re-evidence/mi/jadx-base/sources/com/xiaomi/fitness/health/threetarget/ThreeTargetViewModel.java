package com.xiaomi.fitness.health.threetarget;

import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.base.BasicDataViewModel;
import defpackage.gmf;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00052\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00170\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010\u001d\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ThreeTargetViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getRainbowRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "", "beginInSecond", "endInSecond", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "triggerFetchRainbowReportList", "(JJ)Landroidx/lifecycle/LiveData;", "endTime", "reqRecentRegularReport", "(J)Landroidx/lifecycle/LiveData;", "startTime", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "getMHIntensityWeekReportList", "(J)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "getStandWeekReportList", "Lgmf;", "Lkotlin/Pair;", "", "liveDataMerger", "", "requestWeekReportSummary", "(JLgmf;)V", "report", "", "getTheDataSource", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ThreeTargetViewModel extends BasicDataViewModel {
    private final IRainbowRepository getRainbowRepo() {
        return getRepoProvider().getRainbowRepository();
    }

    @NotNull
    public final List<DailyMHStrengthReport> getMHIntensityWeekReportList(long startTime) {
        List dailyReportListSync = getRepoProvider().getRepositoryByType(HomeDataType.MH_STRENGTH).getDailyReportListSync(null, startTime, 0, 6);
        Intrinsics.checkNotNull(dailyReportListSync, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport>");
        return dailyReportListSync;
    }

    @NotNull
    public final List<DailyStandReport> getStandWeekReportList(long startTime) {
        List dailyReportListSync = getRepoProvider().getRepositoryByType(HomeDataType.VALID_STAND).getDailyReportListSync(null, startTime, 0, 6);
        Intrinsics.checkNotNull(dailyReportListSync, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport>");
        return dailyReportListSync;
    }

    @Nullable
    public final Object getTheDataSource(@NotNull DailyGoalReport dailyGoalReport, @NotNull Continuation<? super List<String>> continuation) {
        return getRainbowRepo().getTheReportDataSource(dailyGoalReport, continuation);
    }

    @NotNull
    public final LiveData<DailyGoalReport> reqRecentRegularReport(long endTime) {
        return getRainbowRepo().getLatestDailyReportBefore(endTime);
    }

    public final void requestWeekReportSummary(long startTime, @NotNull final gmf<Pair<Integer, Integer>> liveDataMerger) {
        Intrinsics.checkNotNullParameter(liveDataMerger, "liveDataMerger");
        final LiveData<S> reportList$default = IRepository.DefaultImpls.getReportList$default(getRepoProvider().getRepositoryByType(HomeDataType.STEP), null, "weeks", startTime, 0, 0, false, 32, null);
        final LiveData<S> reportList$default2 = IRepository.DefaultImpls.getReportList$default(getRepoProvider().getRepositoryByType(HomeDataType.CALORIE), null, "weeks", startTime, 0, 0, false, 32, null);
        final LiveData<S> reportList$default3 = IRepository.DefaultImpls.getReportList$default(getRepoProvider().getRepositoryByType(HomeDataType.MH_STRENGTH), null, "weeks", startTime, 0, 0, false, 32, null);
        final LiveData<S> reportList$default4 = IRepository.DefaultImpls.getReportList$default(getRepoProvider().getRepositoryByType(HomeDataType.VALID_STAND), null, "weeks", startTime, 0, 0, false, 32, null);
        liveDataMerger.addSource(reportList$default, new ThreeTargetViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.health.threetarget.ThreeTargetViewModel.requestWeekReportSummary.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends DailyBasicReport>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends DailyBasicReport> list) {
                int avgStepsPerDay = 0;
                if (!list.isEmpty()) {
                    DailyBasicReport dailyBasicReport = list.get(0);
                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport");
                    avgStepsPerDay = ((DailyStepReport) dailyBasicReport).getAvgStepsPerDay();
                }
                liveDataMerger.setValue(new Pair<>(1, Integer.valueOf(avgStepsPerDay)));
                liveDataMerger.removeSource(reportList$default);
            }
        }));
        liveDataMerger.addSource(reportList$default2, new ThreeTargetViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.health.threetarget.ThreeTargetViewModel.requestWeekReportSummary.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends DailyBasicReport>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends DailyBasicReport> list) {
                int avgCaloriePerDay = 0;
                if (!list.isEmpty()) {
                    DailyBasicReport dailyBasicReport = list.get(0);
                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport");
                    avgCaloriePerDay = ((DailyCalorieReport) dailyBasicReport).getAvgCaloriePerDay();
                }
                liveDataMerger.setValue(new Pair<>(2, Integer.valueOf(avgCaloriePerDay)));
                liveDataMerger.removeSource(reportList$default2);
            }
        }));
        liveDataMerger.addSource(reportList$default3, new ThreeTargetViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.health.threetarget.ThreeTargetViewModel.requestWeekReportSummary.3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends DailyBasicReport>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends DailyBasicReport> list) {
                int avgStrengthPerDay = 0;
                if (!list.isEmpty()) {
                    DailyBasicReport dailyBasicReport = list.get(0);
                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport");
                    avgStrengthPerDay = ((DailyMHStrengthReport) dailyBasicReport).getAvgStrengthPerDay();
                }
                liveDataMerger.setValue(new Pair<>(4, Integer.valueOf(avgStrengthPerDay)));
                liveDataMerger.removeSource(reportList$default3);
            }
        }));
        liveDataMerger.addSource(reportList$default4, new ThreeTargetViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.health.threetarget.ThreeTargetViewModel.requestWeekReportSummary.4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends DailyBasicReport>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<? extends DailyBasicReport> list) {
                int avgStandPerDay = 0;
                if (!list.isEmpty()) {
                    DailyBasicReport dailyBasicReport = list.get(0);
                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport");
                    avgStandPerDay = ((DailyStandReport) dailyBasicReport).getAvgStandPerDay();
                }
                liveDataMerger.setValue(new Pair<>(3, Integer.valueOf(avgStandPerDay)));
                liveDataMerger.removeSource(reportList$default4);
            }
        }));
    }

    @NotNull
    public final LiveData<List<DailyGoalReport>> triggerFetchRainbowReportList(long beginInSecond, long endInSecond) {
        return getRainbowRepo().getDailyReportList(beginInSecond, endInSecond);
    }
}
