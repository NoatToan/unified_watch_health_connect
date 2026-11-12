package com.xiaomi.fit.fitness.export.api.repository;

import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0016JN\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00112\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H&JF\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00160\u00112\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001e\"\u00020\u001bH¦@¢\u0006\u0002\u0010\u001fJ0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH&¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "R", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "", "getReport", "sid", "", "time", "", "(Ljava/lang/String;J)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getDailyReportListSync", "", "beginInSecond", "leftOffset", "", "rightOffset", "getReportList", "Landroidx/lifecycle/LiveData;", CloudContract.COL_VIEW_TAG, "syncNet", "", "getRelativeReportList", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "relativeId", "addRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "(Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecord", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReportListForSummary", "endInSecond", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRepository<R extends DailyBasicReport> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static <R extends DailyBasicReport> Object addRecord(@NotNull IRepository<R> iRepository, @NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
            throw new NotImplementedError("An operation is not implemented: not implemented");
        }

        @NotNull
        public static <R extends DailyBasicReport> List<R> getDailyReportListSync(@NotNull IRepository<R> iRepository, @Nullable String str, long j, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        public static /* synthetic */ List getDailyReportListSync$default(IRepository iRepository, String str, long j, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDailyReportListSync");
            }
            if ((i3 & 1) != 0) {
                str = null;
            }
            return iRepository.getDailyReportListSync(str, j, i, i2);
        }

        @Nullable
        public static <R extends DailyBasicReport> R getReport(@NotNull IRepository<R> iRepository, @Nullable String str, long j) {
            return null;
        }

        public static /* synthetic */ DailyBasicReport getReport$default(IRepository iRepository, String str, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReport");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iRepository.getReport(str, j);
        }

        public static /* synthetic */ LiveData getReportList$default(IRepository iRepository, String str, String str2, long j, int i, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                return iRepository.getReportList((i3 & 1) != 0 ? null : str, str2, j, i, i2, (i3 & 32) != 0 ? true : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReportList");
        }
    }

    @Nullable
    Object addRecord(@NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteRecord(@NotNull DailyRecordItem[] dailyRecordItemArr, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    List<R> getDailyReportListSync(@Nullable String sid, long beginInSecond, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset);

    @NotNull
    LiveData<CloudDataResult<List<R>>> getRelativeReportList(long relativeId, @NotNull String viewTag, long beginInSecond, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset);

    @Nullable
    R getReport(@Nullable String sid, long time);

    @NotNull
    LiveData<List<R>> getReportList(@Nullable String sid, @NotNull String viewTag, long beginInSecond, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset, boolean syncNet);

    @NotNull
    List<R> getReportListForSummary(@Nullable String sid, @NotNull String viewTag, long beginInSecond, long endInSecond);
}
