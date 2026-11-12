package com.xiaomi.fitness.repo.runningIndex;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRunningIndicatorRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.runningIndex.RunningIndicatorRepository;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0019\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0010¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/repo/runningIndex/RunningIndicatorRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRunningIndicatorRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/runningIndex/RunningIndicatorBiz;", "getBiz", "()Lcom/xiaomi/fitness/repo/runningIndex/RunningIndicatorBiz;", "biz$delegate", "Lkotlin/Lazy;", "getReportList", "Landroidx/lifecycle/LiveData;", "", "sid", "", CloudContract.COL_VIEW_TAG, "beginInSecond", "", "leftOffset", "", "rightOffset", "syncNet", "", "mergeTargetReport", "startTimestamp", "srcReportList", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningIndicatorRepository extends BaseRepository<DailyRunningIndicatorReport> implements IRunningIndicatorRepository {

    /* JADX INFO: renamed from: biz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy biz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z1l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RunningIndicatorRepository.biz_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final RunningIndicatorBiz biz_delegate$lambda$0() {
        return new RunningIndicatorBiz();
    }

    private final RunningIndicatorBiz getBiz() {
        return (RunningIndicatorBiz) this.biz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReportList$lambda$1(RunningIndicatorRepository this$0, String str, String viewTag, BaseRepository.TimeRange timeRange, Map it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewTag, "$viewTag");
        Intrinsics.checkNotNullParameter(timeRange, "$timeRange");
        Intrinsics.checkNotNullParameter(it, "it");
        List listSingletonList = Collections.singletonList(this$0.getBiz().splitDailyReport(str, viewTag, timeRange.getStartTime(), (Map<String, ? extends List<? extends DailyRecordItem>>) it));
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyRunningIndicatorReport> getBiz$fitness_data_core_chinaProductRelease() {
        return getBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.RUNNING_INDICATOR;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository, com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public LiveData<List<DailyRunningIndicatorReport>> getReportList(@Nullable final String sid, @NotNull final String viewTag, long beginInSecond, int leftOffset, int rightOffset, boolean syncNet) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        final BaseRepository.TimeRange timeRangeDivideTimeRangeByTag = divideTimeRangeByTag(viewTag, beginInSecond, leftOffset, rightOffset);
        return Transformations.map(queryDataItemsAsync$fitness_data_core_chinaProductRelease(sid, viewTag, timeRangeDivideTimeRangeByTag.getStartTime(), timeRangeDivideTimeRangeByTag.getEndTime(), FitnessDateUtils.getCurrentTZOffsetInSec()), new Function1() { // from class: y1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningIndicatorRepository.getReportList$lambda$1(this.f39688a, sid, viewTag, timeRangeDivideTimeRangeByTag, (Map) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyRunningIndicatorReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyRunningIndicatorReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyRunningIndicatorReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        return new DailyRunningIndicatorReport(startTimestamp, null, null, null, null, 30, null);
    }
}
