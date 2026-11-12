package com.xiaomi.fitness.repo.trainingload;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.api.repository.ITrainingLoadRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00110\u000bH\u0010¢\u0006\u0002\b\u0012J0\u0010\u0013\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/repo/trainingload/TrainingLoadRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/ITrainingLoadRepository;", "<init>", "()V", "tlBiz", "Lcom/xiaomi/fitness/repo/trainingload/TrainingLoadBiz;", "DAY_28", "", "mergeReportList", "", "sid", "", CloudContract.COL_VIEW_TAG, "reportList", "dateRangeList", "Lkotlin/Pair;", "mergeReportList$fitness_data_core_chinaProductRelease", "mergeTargetReport", "startTimestamp", "srcReportList", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingLoadRepository extends BaseRepository<DailyTrainingLoadReport> implements ITrainingLoadRepository {

    @NotNull
    private final TrainingLoadBiz tlBiz = new TrainingLoadBiz();
    private final long DAY_28 = TimeUnit.DAYS.toSeconds(28);

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyTrainingLoadReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.tlBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.TRAINING_LOAD;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public List<DailyTrainingLoadReport> mergeReportList$fitness_data_core_chinaProductRelease(@Nullable String sid, @NotNull String viewTag, @NotNull List<DailyTrainingLoadReport> reportList, @NotNull List<Pair<Long, Long>> dateRangeList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        Intrinsics.checkNotNullParameter(dateRangeList, "dateRangeList");
        List<DailyTrainingLoadReport> listSingletonList = Collections.singletonList(mergeTargetReport(sid, viewTag, !dateRangeList.isEmpty() ? dateRangeList.get(0).getFirst().longValue() : 0L, reportList));
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyTrainingLoadReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyTrainingLoadReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyTrainingLoadReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        if (srcReportList.isEmpty()) {
            Intrinsics.checkNotNull(sid);
            return new DailyTrainingLoadReport(startTimestamp, sid);
        }
        if (TextUtils.equals(viewTag, "months")) {
            throw new IllegalArgumentException("TL: viewTag not be ViewTag.MONTH");
        }
        long j = startTimestamp + this.DAY_28;
        Intrinsics.checkNotNull(sid);
        DailyTrainingLoadReport dailyTrainingLoadReport = new DailyTrainingLoadReport(j, sid);
        ArrayList arrayList = new ArrayList();
        for (DailyTrainingLoadReport dailyTrainingLoadReport2 : srcReportList) {
            arrayList.add(dailyTrainingLoadReport2.toTLItem());
            if (dailyTrainingLoadReport2.getTime() == j) {
                dailyTrainingLoadReport.copyFrom(dailyTrainingLoadReport2);
            }
        }
        dailyTrainingLoadReport.setDayTLList(arrayList);
        return dailyTrainingLoadReport;
    }
}
