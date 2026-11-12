package com.xiaomi.fitness.aggregation.health.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.xiaomi.fitness.aggregation.health.entity.DailyGoalReportEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H'J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000eH'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u000eH'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000eH'J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0018H'¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/RainbowEntityDao;", "", "insert", "", "entities", "", "Lcom/xiaomi/fitness/aggregation/health/entity/RainbowReportEntity;", "([Lcom/xiaomi/fitness/aggregation/health/entity/RainbowReportEntity;)V", "update", "entity", "queryDailyGoalReportAsync", "Landroidx/lifecycle/LiveData;", "", "startTime", "", "endTime", "queryDailyGoalReport", "queryLatestDailyGoalReportBefore", "time", "queryLatestDailyGoalReportAsync", "updateRainBowDataAfterCloud", "timeInZero", "queryDailyGoalNotUploadReport", "limit", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RainbowEntityDao {
    @Insert(onConflict = 1)
    void insert(@NotNull DailyGoalReportEntity... entities);

    @Query("select * from rainbow where isUpload = 0 order by timeInZero desc limit :limit")
    @NotNull
    List<DailyGoalReportEntity> queryDailyGoalNotUploadReport(int limit);

    @Query("select * from rainbow where timeInZero = :time order by timeInZero desc limit 1")
    @Nullable
    DailyGoalReportEntity queryDailyGoalReport(long time);

    @Query("select * from rainbow where timeInZero >= :startTime and timeInZero < :endTime order by timeInZero desc")
    @NotNull
    List<DailyGoalReportEntity> queryDailyGoalReport(long startTime, long endTime);

    @Query("select * from rainbow where timeInZero >= :startTime and timeInZero < :endTime order by timeInZero desc")
    @NotNull
    LiveData<List<DailyGoalReportEntity>> queryDailyGoalReportAsync(long startTime, long endTime);

    @Query("select * from rainbow where timeInZero < :time order by timeInZero desc limit 1")
    @NotNull
    LiveData<DailyGoalReportEntity> queryLatestDailyGoalReportAsync(long time);

    @Query("select * from rainbow where timeInZero < :time order by timeInZero desc limit 1")
    @Nullable
    DailyGoalReportEntity queryLatestDailyGoalReportBefore(long time);

    @Update
    void update(@NotNull DailyGoalReportEntity entity);

    @Query("update rainbow set isUpload = 1 where timeInZero = :timeInZero")
    void updateRainBowDataAfterCloud(long timeInZero);
}
