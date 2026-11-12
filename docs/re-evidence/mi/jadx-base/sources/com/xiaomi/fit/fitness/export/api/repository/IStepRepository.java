package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "queryStepRecordsSync", "", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "startTime", "", "endTime", "dumpStepRecord", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IStepRepository extends IRepository<DailyStepReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IStepRepository iStepRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iStepRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyStepReport> getDailyReportListSync(@NotNull IStepRepository iStepRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iStepRepository, str, j, i, i2);
        }

        @Nullable
        public static DailyStepReport getReport(@NotNull IStepRepository iStepRepository, @Nullable String str, long j) {
            return (DailyStepReport) IRepository.DefaultImpls.getReport(iStepRepository, str, j);
        }
    }

    void dumpStepRecord();

    @NotNull
    List<StepItem> queryStepRecordsSync(long startTime, long endTime);
}
