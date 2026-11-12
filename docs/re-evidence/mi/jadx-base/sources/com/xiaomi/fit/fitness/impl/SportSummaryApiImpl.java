package com.xiaomi.fit.fitness.impl;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0002\u0010\fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0013J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/SportSummaryApiImpl;", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "repository", "Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;", "<init>", "(Lcom/xiaomi/fitness/repo/summary/SportSummaryRepo;)V", "dao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "getDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "getStartSec", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "", "", "getTotalSummary", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "category", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSummary", "dimen", "mills", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSummaryApiImpl implements SportSummaryApi {

    @NotNull
    private final SportSummaryRepo repository;

    public SportSummaryApiImpl(@NotNull SportSummaryRepo repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    private final SportSummaryDao getDao() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt != null && RegionExtKt.isRegionSelected(regionExtKt)) {
            return FitnessSummaryDatabase.INSTANCE.getInstance().sportSummaryDao();
        }
        FitnessLogUtils.i("SRecordApi", "summaryDao: region not selected");
        return null;
    }

    @Override // com.xiaomi.fit.fitness.export.api.SportSummaryApi
    @Nullable
    public Object getCategories(@NotNull Continuation<? super List<String>> continuation) {
        return this.repository.getCategories();
    }

    @Override // com.xiaomi.fit.fitness.export.api.SportSummaryApi
    @Nullable
    public Object getStartSec(@NotNull Continuation<? super Long> continuation) {
        return Boxing.boxLong(this.repository.getStartSec());
    }

    @Override // com.xiaomi.fit.fitness.export.api.SportSummaryApi
    @Nullable
    public SportSummary getSummary(@NotNull String category, @NotNull String dimen, long mills) {
        SportSummaryEntity summaryByTime;
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(dimen, "dimen");
        long j = mills / 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(j, FitnessDateUtils.getCurrentTZOffsetInSec(), 0);
        StringBuilder sb = new StringBuilder();
        sb.append("getSummary: sec = ");
        sb.append(j);
        sb.append(", sec0TZ = ");
        sb.append(jChangeToDestZeroTimeOneDay);
        SportSummaryDao dao = getDao();
        if (dao == null || (summaryByTime = dao.getSummaryByTime(category, dimen, jChangeToDestZeroTimeOneDay)) == null) {
            return null;
        }
        return summaryByTime.getSummary();
    }

    @Override // com.xiaomi.fit.fitness.export.api.SportSummaryApi
    @Nullable
    public Object getTotalSummary(@NotNull String str, @NotNull Continuation<? super SportSummary> continuation) {
        return this.repository.getTotalSummary(str);
    }

    @Override // com.xiaomi.fit.fitness.export.api.SportSummaryApi
    @Nullable
    public Object getTotalSummary(@NotNull List<String> list, @NotNull Continuation<? super List<? extends SportSummary>> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("getSummary: categories = ");
        sb.append(list);
        return this.repository.getTotalSummary(list);
    }
}
