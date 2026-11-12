package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001JB\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/ILactateThresholdRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyLactateThresholdReport;", "getLactateThresholdGroup", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ILactateThresholdRepository extends IRepository<DailyPhysicalStatusReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull ILactateThresholdRepository iLactateThresholdRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iLactateThresholdRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyPhysicalStatusReport> getDailyReportListSync(@NotNull ILactateThresholdRepository iLactateThresholdRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iLactateThresholdRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getLactateThresholdGroup$default(ILactateThresholdRepository iLactateThresholdRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iLactateThresholdRepository.getLactateThresholdGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLactateThresholdGroup");
        }

        @Nullable
        public static DailyPhysicalStatusReport getReport(@NotNull ILactateThresholdRepository iLactateThresholdRepository, @Nullable String str, long j) {
            return (DailyPhysicalStatusReport) IRepository.DefaultImpls.getReport(iLactateThresholdRepository, str, j);
        }
    }

    @Nullable
    Object getLactateThresholdGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<LactateThresholdItem>>> continuation);
}
