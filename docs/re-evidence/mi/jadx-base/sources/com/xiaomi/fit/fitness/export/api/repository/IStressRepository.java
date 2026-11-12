package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH&J6\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rH&JB\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "getAllStressAbnormalRecords", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getAllDataByTime", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "startTime", "endTime", "did", "getManualStressByMonthGroup", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IStressRepository extends IRepository<DailyStressReport>, IPagingSourceRepository<StressItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IStressRepository iStressRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iStressRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ Map getAllDataByTime$default(IStressRepository iStressRepository, long j, long j2, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllDataByTime");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return iStressRepository.getAllDataByTime(j, j2, str);
        }

        @NotNull
        public static List<DailyStressReport> getDailyReportListSync(@NotNull IStressRepository iStressRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iStressRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getManualStressByMonthGroup$default(IStressRepository iStressRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iStressRepository.getManualStressByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualStressByMonthGroup");
        }

        @Nullable
        public static DailyStressReport getReport(@NotNull IStressRepository iStressRepository, @Nullable String str, long j) {
            return (DailyStressReport) IRepository.DefaultImpls.getReport(iStressRepository, str, j);
        }
    }

    @NotNull
    Map<String, List<DailyRecordItem>> getAllDataByTime(long startTime, long endTime, @Nullable String did);

    @NotNull
    PagingSource<Long, SegmentItem> getAllStressAbnormalRecords(@Nullable PagingSourceParams params);

    @Nullable
    Object getManualStressByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<StressItem>>> continuation);
}
