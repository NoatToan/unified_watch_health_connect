package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003J<\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&JN\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00100\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&JB\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00102\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "getBodyCompositionList", "Landroidx/lifecycle/LiveData;", "", "composition", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "beginInSecond", "", "zoneOffsetInSec", "", "leftOffset", "rightOffset", "", "compositions", "getWeightByMonthGroup", "startTime", "endTime", "limit", "reverse", "", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IWeightRepository extends IRepository<DailyWeightReport>, IPagingSourceRepository<WeightItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object addRecord(@NotNull IWeightRepository iWeightRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            Object objAddRecord = IRepository.DefaultImpls.addRecord(iWeightRepository, dailyRecordItem, continuation);
            return objAddRecord == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddRecord : Unit.INSTANCE;
        }

        @NotNull
        public static List<DailyWeightReport> getDailyReportListSync(@NotNull IWeightRepository iWeightRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return IRepository.DefaultImpls.getDailyReportListSync(iWeightRepository, str, j, i, i2);
        }

        @Nullable
        public static DailyWeightReport getReport(@NotNull IWeightRepository iWeightRepository, @Nullable String str, long j) {
            return (DailyWeightReport) IRepository.DefaultImpls.getReport(iWeightRepository, str, j);
        }

        public static /* synthetic */ Object getWeightByMonthGroup$default(IWeightRepository iWeightRepository, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return iWeightRepository.getWeightByMonthGroup(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWeightByMonthGroup");
        }
    }

    @NotNull
    LiveData<List<WeightItem>> getBodyCompositionList(@NotNull BodyComposition composition, long beginInSecond, int zoneOffsetInSec, int leftOffset, int rightOffset);

    @NotNull
    LiveData<Map<BodyComposition, List<WeightItem>>> getBodyCompositionList(@NotNull List<? extends BodyComposition> compositions, long beginInSecond, int zoneOffsetInSec, int leftOffset, int rightOffset);

    @Nullable
    Object getWeightByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<WeightItem>>> continuation);
}
