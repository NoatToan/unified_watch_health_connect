package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.body;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001JB\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJB\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IExtraDataRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyExtraDataReport;", "getLightValueList", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBodyMomentumList", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IExtraDataRepository extends IRepository<DailyPhysicalStatusReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IExtraDataRepository iExtraDataRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iExtraDataRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ Object getBodyMomentumList$default(IExtraDataRepository iExtraDataRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iExtraDataRepository.getBodyMomentumList(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBodyMomentumList");
        }

        @NotNull
        public static List<DailyPhysicalStatusReport> getDailyReportListSync(@NotNull IExtraDataRepository iExtraDataRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iExtraDataRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getLightValueList$default(IExtraDataRepository iExtraDataRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iExtraDataRepository.getLightValueList(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLightValueList");
        }

        @Nullable
        public static DailyPhysicalStatusReport getReport(@NotNull IExtraDataRepository iExtraDataRepository, @Nullable String str, long j) {
            return (DailyPhysicalStatusReport) IRepository.DefaultImpls.getReport(iExtraDataRepository, str, j);
        }
    }

    @Nullable
    Object getBodyMomentumList(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<body>>> continuation);

    @Nullable
    Object getLightValueList(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<LightValueItem>>> continuation);
}
