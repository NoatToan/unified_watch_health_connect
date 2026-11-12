package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&JB\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJB\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJB\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJB\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJB\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "getMonthRestHrReport", "Landroidx/lifecycle/LiveData;", "rightDayTimeStamp", "", "getAllAbnormalFibDetailPagingSource", "Landroidx/paging/PagingSource;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getAllAbnormalHrDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "getAllAbnormalHrHighDetailPagingSource", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAllAbnormalHrLowDetailPagingSource", "getManualHrByMonthGroup", "", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManualAbnormalHrHighByMonthGroup", "getManualAbnormalHrLowByMonthGroup", "getManualAbnormalFibByMonthGroup", "getLactateThresholdFibByMonthGroup", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHeartRateRepository extends IRepository<DailyHrReport>, IPagingSourceRepository<HrItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IHeartRateRepository iHeartRateRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iHeartRateRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ PagingSource getAllAbnormalFibDetailPagingSource$default(IHeartRateRepository iHeartRateRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAbnormalFibDetailPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iHeartRateRepository.getAllAbnormalFibDetailPagingSource(pagingSourceParams);
        }

        public static /* synthetic */ PagingSource getAllAbnormalHrDetailPagingSource$default(IHeartRateRepository iHeartRateRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAbnormalHrDetailPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iHeartRateRepository.getAllAbnormalHrDetailPagingSource(pagingSourceParams);
        }

        public static /* synthetic */ PagingSource getAllAbnormalHrHighDetailPagingSource$default(IHeartRateRepository iHeartRateRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAbnormalHrHighDetailPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iHeartRateRepository.getAllAbnormalHrHighDetailPagingSource(pagingSourceParams);
        }

        public static /* synthetic */ PagingSource getAllAbnormalHrLowDetailPagingSource$default(IHeartRateRepository iHeartRateRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllAbnormalHrLowDetailPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iHeartRateRepository.getAllAbnormalHrLowDetailPagingSource(pagingSourceParams);
        }

        @NotNull
        public static List<DailyHrReport> getDailyReportListSync(@NotNull IHeartRateRepository iHeartRateRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iHeartRateRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getLactateThresholdFibByMonthGroup$default(IHeartRateRepository iHeartRateRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iHeartRateRepository.getLactateThresholdFibByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLactateThresholdFibByMonthGroup");
        }

        public static /* synthetic */ Object getManualAbnormalFibByMonthGroup$default(IHeartRateRepository iHeartRateRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iHeartRateRepository.getManualAbnormalFibByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualAbnormalFibByMonthGroup");
        }

        public static /* synthetic */ Object getManualAbnormalHrHighByMonthGroup$default(IHeartRateRepository iHeartRateRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iHeartRateRepository.getManualAbnormalHrHighByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualAbnormalHrHighByMonthGroup");
        }

        public static /* synthetic */ Object getManualAbnormalHrLowByMonthGroup$default(IHeartRateRepository iHeartRateRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iHeartRateRepository.getManualAbnormalHrLowByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualAbnormalHrLowByMonthGroup");
        }

        public static /* synthetic */ Object getManualHrByMonthGroup$default(IHeartRateRepository iHeartRateRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iHeartRateRepository.getManualHrByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualHrByMonthGroup");
        }

        @Nullable
        public static DailyHrReport getReport(@NotNull IHeartRateRepository iHeartRateRepository, @Nullable String str, long j) {
            return (DailyHrReport) IRepository.DefaultImpls.getReport(iHeartRateRepository, str, j);
        }
    }

    @NotNull
    PagingSource<Long, AbnormalFibItem> getAllAbnormalFibDetailPagingSource(@Nullable PagingSourceParams params);

    @NotNull
    PagingSource<Long, AbnormalHrItem> getAllAbnormalHrDetailPagingSource(@Nullable PagingSourceParams params);

    @NotNull
    PagingSource<Long, SegmentItem> getAllAbnormalHrHighDetailPagingSource(@Nullable PagingSourceParams params);

    @NotNull
    PagingSource<Long, SegmentItem> getAllAbnormalHrLowDetailPagingSource(@Nullable PagingSourceParams params);

    @Nullable
    Object getLactateThresholdFibByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<LactateThresholdItem>>> continuation);

    @Nullable
    Object getManualAbnormalFibByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<AbnormalFibItem>>> continuation);

    @Nullable
    Object getManualAbnormalHrHighByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation);

    @Nullable
    Object getManualAbnormalHrLowByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation);

    @Nullable
    Object getManualHrByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<HrItem>>> continuation);

    @NotNull
    LiveData<DailyHrReport> getMonthRestHrReport(long rightDayTimeStamp);
}
