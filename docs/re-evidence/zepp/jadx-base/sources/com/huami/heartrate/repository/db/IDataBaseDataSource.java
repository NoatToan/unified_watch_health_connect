package com.huami.heartrate.repository.db;

import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.watch.companion.dataflow.Constant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J!\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J!\u0010\u000b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001cH&J \u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH&J&\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&J,\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H&J&\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", Constant.KEY_HR_VALUE, "", "insertHeartRate", "", "heartRateList", "insertHeartRateList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHeartRate", "updateHeartRateList", "deleteHeartRateList", "", "from", "to", "queryHeartRateListByDayRange", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "end", "", "limit", "queryHeartRateListByLimit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEarliestSyncedHeartRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "earliestTime", "latestTime", "deleteSyncedHeartRate", "Lkotlinx/coroutines/flow/Flow;", "observeLatestHeartRate", "fromSecond", "toSecond", "observeHeartRateLiveDataList", "Ljava/util/Date;", "dayFrom", "dayEnd", "", "", "", "observeWholeDayHeartRate", "queryWholeDayHeartRate", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface IDataBaseDataSource {
    void deleteHeartRateList(@NotNull List<HeartRateEntity> heartRateList);

    @Nullable
    Object deleteSyncedHeartRate(long j, long j2, @NotNull Continuation<? super Unit> continuation);

    void insertHeartRate(@NotNull HeartRateEntity heartRate);

    @Nullable
    Object insertHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<List<HeartRateEntity>> observeHeartRateLiveDataList(long from, long to);

    @NotNull
    Flow<HeartRateEntity> observeLatestHeartRate();

    @NotNull
    Flow<HeartRateEntity> observeLatestHeartRate(long fromSecond, long toSecond);

    @NotNull
    Flow<Map<String, byte[]>> observeWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd);

    @Nullable
    Object queryEarliestSyncedHeartRate(@NotNull Continuation<? super HeartRateEntity> continuation);

    @Nullable
    Object queryHeartRateListByDayRange(long j, long j2, @NotNull Continuation<? super List<HeartRateEntity>> continuation);

    @Nullable
    Object queryHeartRateListByLimit(long j, int i, @NotNull Continuation<? super List<HeartRateEntity>> continuation);

    @Nullable
    Map<String, byte[]> queryWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd);

    void updateHeartRate(@NotNull HeartRateEntity heartRate);

    @Nullable
    Object updateHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation);
}
