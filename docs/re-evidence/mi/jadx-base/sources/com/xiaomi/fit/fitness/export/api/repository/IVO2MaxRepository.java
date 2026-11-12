package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IVO2MaxRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IVO2MaxRepository extends IRepository<DailyVo2MaxReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IVO2MaxRepository iVO2MaxRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iVO2MaxRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyVo2MaxReport> getDailyReportListSync(@NotNull IVO2MaxRepository iVO2MaxRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iVO2MaxRepository, str, j, i, i2);
        }

        @Nullable
        public static DailyVo2MaxReport getReport(@NotNull IVO2MaxRepository iVO2MaxRepository, @Nullable String str, long j) {
            return (DailyVo2MaxReport) IRepository.DefaultImpls.getReport(iVO2MaxRepository, str, j);
        }
    }
}
