package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarMeasurePeriod;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH&JB\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014JB\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014JB\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "getTheGMIAndAGP", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheManualBloodSugarItem", "", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "period", "", "getManualBloodSugarByMonthGroup", "", "startTime", "endTime", "limit", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLowBloodSugarByMonthGroup", "getHighBloodSugarByMonthGroup", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBloodSugarRepository extends IRepository<DailyBloodSugarReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IBloodSugarRepository iBloodSugarRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iBloodSugarRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyBloodSugarReport> getDailyReportListSync(@NotNull IBloodSugarRepository iBloodSugarRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iBloodSugarRepository, str, j, i, i2);
        }

        public static /* synthetic */ Object getHighBloodSugarByMonthGroup$default(IBloodSugarRepository iBloodSugarRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iBloodSugarRepository.getHighBloodSugarByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHighBloodSugarByMonthGroup");
        }

        public static /* synthetic */ Object getLowBloodSugarByMonthGroup$default(IBloodSugarRepository iBloodSugarRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iBloodSugarRepository.getLowBloodSugarByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLowBloodSugarByMonthGroup");
        }

        public static /* synthetic */ Object getManualBloodSugarByMonthGroup$default(IBloodSugarRepository iBloodSugarRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iBloodSugarRepository.getManualBloodSugarByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getManualBloodSugarByMonthGroup");
        }

        @Nullable
        public static DailyBloodSugarReport getReport(@NotNull IBloodSugarRepository iBloodSugarRepository, @Nullable String str, long j) {
            return (DailyBloodSugarReport) IRepository.DefaultImpls.getReport(iBloodSugarRepository, str, j);
        }
    }

    @Nullable
    Object getHighBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation);

    @Nullable
    Object getLowBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation);

    @Nullable
    Object getManualBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation);

    @Nullable
    Object getTheGMIAndAGP(long j, @NotNull Continuation<? super BloodSugarGMIAndAGPResult> continuation);

    @NotNull
    List<BloodSugarItem> getTheManualBloodSugarItem(long time, @BloodSugarMeasurePeriod int period);
}
