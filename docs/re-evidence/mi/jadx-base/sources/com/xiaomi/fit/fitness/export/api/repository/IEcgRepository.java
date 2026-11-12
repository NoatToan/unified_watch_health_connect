package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEcgReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H&JB\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018JB\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018JB\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "getAllEcgReport", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getInterpretedEcgReport", "getNotInterpretedEcgReport", "getTheEcgReport", "sid", "", "time", "getAllEcgByMonthGroup", "", "", "startTime", "endTime", "limit", "", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInterpretedEcgByMonthGroup", "getNotInterpretedEcgByMonthGroup", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IEcgRepository extends IRepository<DailyEcgReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IEcgRepository iEcgRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iEcgRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        public static /* synthetic */ Object getAllEcgByMonthGroup$default(IEcgRepository iEcgRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iEcgRepository.getAllEcgByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllEcgByMonthGroup");
        }

        @NotNull
        public static List<DailyEcgReport> getDailyReportListSync(@NotNull IEcgRepository iEcgRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iEcgRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getInterpretedEcgByMonthGroup$default(IEcgRepository iEcgRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iEcgRepository.getInterpretedEcgByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInterpretedEcgByMonthGroup");
        }

        public static /* synthetic */ Object getNotInterpretedEcgByMonthGroup$default(IEcgRepository iEcgRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iEcgRepository.getNotInterpretedEcgByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotInterpretedEcgByMonthGroup");
        }

        @Nullable
        public static DailyEcgReport getReport(@NotNull IEcgRepository iEcgRepository, @Nullable String str, long j) {
            return (DailyEcgReport) IRepository.DefaultImpls.getReport(iEcgRepository, str, j);
        }
    }

    @Nullable
    Object getAllEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation);

    @NotNull
    PagingSource<Long, EcgMedicalItemReport> getAllEcgReport(@Nullable PagingSourceParams params);

    @Nullable
    Object getInterpretedEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation);

    @NotNull
    PagingSource<Long, EcgMedicalItemReport> getInterpretedEcgReport(@Nullable PagingSourceParams params);

    @Nullable
    Object getNotInterpretedEcgByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<EcgMedicalItemReport>>> continuation);

    @NotNull
    PagingSource<Long, EcgMedicalItemReport> getNotInterpretedEcgReport(@Nullable PagingSourceParams params);

    @Nullable
    EcgMedicalItemReport getTheEcgReport(@NotNull String sid, long time);
}
