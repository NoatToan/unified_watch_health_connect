package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&JB\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014JB\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "getAllSpo2AbnormalRecords", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getManualSpo2ByMonthGroup", "", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAbnormalSpo2LowByMonthGroup", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISpo2Repository extends IRepository<DailySpo2Report>, IPagingSourceRepository<Spo2Item> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull ISpo2Repository iSpo2Repository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iSpo2Repository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ Object getAbnormalSpo2LowByMonthGroup$default(ISpo2Repository iSpo2Repository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iSpo2Repository.getAbnormalSpo2LowByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAbnormalSpo2LowByMonthGroup");
        }

        public static /* synthetic */ PagingSource getAllSpo2AbnormalRecords$default(ISpo2Repository iSpo2Repository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllSpo2AbnormalRecords");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iSpo2Repository.getAllSpo2AbnormalRecords(pagingSourceParams);
        }

        @NotNull
        public static List<DailySpo2Report> getDailyReportListSync(@NotNull ISpo2Repository iSpo2Repository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iSpo2Repository, str, j, i, i2);
        }

        public static /* synthetic */ Object getManualSpo2ByMonthGroup$default(ISpo2Repository iSpo2Repository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iSpo2Repository.getManualSpo2ByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualSpo2ByMonthGroup");
        }

        @Nullable
        public static DailySpo2Report getReport(@NotNull ISpo2Repository iSpo2Repository, @Nullable String str, long j) {
            return (DailySpo2Report) IRepository.DefaultImpls.getReport(iSpo2Repository, str, j);
        }
    }

    @Nullable
    Object getAbnormalSpo2LowByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SegmentItem>>> continuation);

    @NotNull
    PagingSource<Long, SegmentItem> getAllSpo2AbnormalRecords(@Nullable PagingSourceParams params);

    @Nullable
    Object getManualSpo2ByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<Spo2Item>>> continuation);
}
