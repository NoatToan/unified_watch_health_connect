package com.xiaomi.fitness.relative.threetarget;

import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.base.BasicDataViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J8\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/ThreeTargetRViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "getRainbowRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "triggerFetchRainbowReportList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "startTime", "", "leftOffset", "", "rightOffset", "relativeUid", "reqRecentRegularReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "endTime", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThreeTargetRViewModel extends BasicDataViewModel {
    private final IRainbowRepository getRainbowRepo() {
        return getRepoProvider().getRainbowRepository();
    }

    @NotNull
    public final LiveData<DailyGoalReport> reqRecentRegularReport(long endTime, long relativeUid) {
        return getRainbowRepo().getLatestDailyReportBefore(endTime);
    }

    @NotNull
    public final LiveData<CloudDataResult<List<DailyBasicReport>>> triggerFetchRainbowReportList(long startTime, int leftOffset, int rightOffset, long relativeUid) {
        LiveData<CloudDataResult<List<DailyGoalReport>>> relativeReportList = ((IRainbowRepository) getRepo(IRainbowRepository.class)).getRelativeReportList(relativeUid, "days", startTime, leftOffset, rightOffset);
        Intrinsics.checkNotNull(relativeReportList, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.xiaomi.fit.fitness.export.data.CloudDataResult<kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>>>");
        return relativeReportList;
    }
}
