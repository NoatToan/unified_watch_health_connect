package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J8\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "getTemperatureTrendData", "", "startTime", "", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ITemperatureTrendRepository extends IRepository<DailyBasicReport>, IPagingSourceRepository<TemperatureTrendItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull ITemperatureTrendRepository iTemperatureTrendRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iTemperatureTrendRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyBasicReport> getDailyReportListSync(@NotNull ITemperatureTrendRepository iTemperatureTrendRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iTemperatureTrendRepository, str, j, i, i2);
        }

        @Nullable
        public static DailyBasicReport getReport(@NotNull ITemperatureTrendRepository iTemperatureTrendRepository, @Nullable String str, long j) {
            return IRepository.DefaultImpls.getReport(iTemperatureTrendRepository, str, j);
        }

        public static /* synthetic */ Object getTemperatureTrendData$default(ITemperatureTrendRepository iTemperatureTrendRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iTemperatureTrendRepository.getTemperatureTrendData(j, j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTemperatureTrendData");
        }
    }

    @Nullable
    Object getTemperatureTrendData(long j, long j2, int i, boolean z, @NotNull Continuation<? super List<TemperatureTrendItem>> continuation);
}
