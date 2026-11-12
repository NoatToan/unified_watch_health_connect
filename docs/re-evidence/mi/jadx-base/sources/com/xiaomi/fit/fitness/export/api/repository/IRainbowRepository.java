package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0002H¦@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getAllDailyReport", "timeInSecond", "", "widthDetail", "", "getDailyReport", "Landroidx/lifecycle/LiveData;", "getDailyReportSync", "getDailyReportList", "", "beginInSecond", "endInSecond", "getLatestDailyReportBefore", "getTheReportDataSource", "", "report", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRainbowRepository extends IRepository<DailyGoalReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IRainbowRepository iRainbowRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iRainbowRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ DailyGoalReport getAllDailyReport$default(IRainbowRepository iRainbowRepository, long j, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllDailyReport");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iRainbowRepository.getAllDailyReport(j, z);
        }

        public static /* synthetic */ LiveData getDailyReport$default(IRainbowRepository iRainbowRepository, long j, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDailyReport");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iRainbowRepository.getDailyReport(j, z);
        }

        @NotNull
        public static List<DailyGoalReport> getDailyReportListSync(@NotNull IRainbowRepository iRainbowRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iRainbowRepository, str, j, i, i2);
        }

        @Nullable
        public static DailyGoalReport getReport(@NotNull IRainbowRepository iRainbowRepository, @Nullable String str, long j) {
            return (DailyGoalReport) IRepository.DefaultImpls.getReport(iRainbowRepository, str, j);
        }
    }

    @Nullable
    DailyGoalReport getAllDailyReport(long timeInSecond, boolean widthDetail);

    @NotNull
    LiveData<DailyGoalReport> getDailyReport(long timeInSecond, boolean widthDetail);

    @NotNull
    LiveData<List<DailyGoalReport>> getDailyReportList(long beginInSecond, long endInSecond);

    @NotNull
    DailyGoalReport getDailyReportSync(long timeInSecond);

    @NotNull
    LiveData<DailyGoalReport> getLatestDailyReportBefore(long timeInSecond);

    @Nullable
    Object getTheReportDataSource(@NotNull DailyGoalReport dailyGoalReport, @NotNull Continuation<? super List<String>> continuation);
}
