package com.xiaomi.fitness.repo.pai;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.api.repository.IPaiRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0010¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/repo/pai/PaiRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPaiRepository;", "<init>", "()V", "paiBiz", "Lcom/xiaomi/fitness/repo/pai/PaiBiz;", "DAY_6", "", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "srcReportList", "", "loadHrReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "timestamp", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaiRepository extends BaseRepository<DailyPaiReport> implements IPaiRepository {

    @NotNull
    private final PaiBiz paiBiz = new PaiBiz();
    private final long DAY_6 = TimeUnit.DAYS.toSeconds(6);

    private final DailyHrReport loadHrReport(long timestamp) {
        return (DailyHrReport) FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportEntitySync(HomeDataType.HR, timestamp);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyPaiReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.paiBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.PAI;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyPaiReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyPaiReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyPaiReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        if (!TextUtils.equals(viewTag, "weeks")) {
            throw new IllegalArgumentException("viewTag only be ViewTag.WEEK, but found " + viewTag);
        }
        if (srcReportList.isEmpty()) {
            Intrinsics.checkNotNull(sid);
            return new DailyPaiReport(startTimestamp, sid);
        }
        Intrinsics.checkNotNull(sid);
        DailyPaiReport dailyPaiReport = new DailyPaiReport(startTimestamp, sid);
        long j = startTimestamp + this.DAY_6;
        ArrayList arrayList = new ArrayList();
        for (DailyPaiReport dailyPaiReport2 : srcReportList) {
            arrayList.add(dailyPaiReport2.toOneDayPaiReport());
            if (dailyPaiReport2.getTime() == j) {
                dailyPaiReport.setTotalPai(dailyPaiReport2.getTotalPai());
                dailyPaiReport.setPai(dailyPaiReport2.getPai());
                dailyPaiReport.setHighZonePai(dailyPaiReport2.getHighZonePai());
                dailyPaiReport.setMediumZonePai(dailyPaiReport2.getMediumZonePai());
                dailyPaiReport.setLowZonePai(dailyPaiReport2.getLowZonePai());
            }
        }
        dailyPaiReport.setPaiList(arrayList);
        dailyPaiReport.setHrReport(loadHrReport(j));
        return dailyPaiReport;
    }
}
