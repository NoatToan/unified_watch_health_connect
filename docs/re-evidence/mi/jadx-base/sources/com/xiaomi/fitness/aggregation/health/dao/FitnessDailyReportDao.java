package com.xiaomi.fitness.aggregation.health.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH'J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H'J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH'J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH'J,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH'J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH'J*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00172\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H'J4\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH'J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u000eH'J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH'J \u0010\u001f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH'¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "", "insert", "", "entities", "", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;", "([Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;)V", "delete", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "sid", "", "timeInZero", "", CloudContract.COL_VIEW_TAG, "timeList", "", "queryDailyReportEntity", "Landroidx/lifecycle/LiveData;", "timeInSecond", "queryDailyReportEntitySync", "queryDailyReportEntityList", "Lkotlinx/coroutines/flow/Flow;", "begin", StatConstants.PARAM_END, "queryDailyReportEntityListSync", "queryDailyReportEntityListBySid", "queryDailyReportEntityListNotUpload", "limit", "", "update", "updateTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDailyReportDao {
    @Query("update daily_report set isDeleted = 1 where dataType = :dataType and sid = :sid and timeInZero = :timeInZero and viewTag = :viewTag")
    void delete(@NotNull HomeDataType dataType, @NotNull String sid, long timeInZero, @NotNull String viewTag);

    @Query("update daily_report set isDeleted = 1 where dataType = :dataType and timeInZero in (:timeList)")
    void delete(@NotNull HomeDataType dataType, @NotNull List<Long> timeList);

    @Insert(onConflict = 1)
    void insert(@NotNull FitnessDailyReportEntity... entities);

    @Query("select * from daily_report where dataType = :dataType and timeInZero = :timeInSecond and isDeleted = 0")
    @NotNull
    LiveData<FitnessDailyReportEntity> queryDailyReportEntity(@NotNull HomeDataType dataType, long timeInSecond);

    @Query("select * from daily_report where dataType = :dataType and timeInZero >= :begin and timeInZero < :end and isDeleted = 0 order by timeInZero desc")
    @NotNull
    Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityList(@NotNull HomeDataType dataType, long begin, long end);

    @Query("select * from daily_report where dataType = :dataType and timeInZero in (:timeList) and isDeleted = 0 order by timeInZero desc")
    @NotNull
    Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityList(@NotNull HomeDataType dataType, @NotNull List<Long> timeList);

    @Query("select * from daily_report where sid = :sid and dataType = :dataType and timeInZero >= :begin and timeInZero < :end and isDeleted = 0 order by timeInZero desc")
    @NotNull
    Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityListBySid(@NotNull String sid, @NotNull HomeDataType dataType, long begin, long end);

    @Query("select * from daily_report where dataType in ('STEP','CALORIE','VALID_STAND','MH_STRENGTH','SLEEP','HR','SPO2','STRESS') and timeInZero>=:begin and isUpload = 0 order by timeInZero desc limit :limit")
    @NotNull
    List<FitnessDailyReportEntity> queryDailyReportEntityListNotUpload(int limit, long begin);

    @Query("select * from daily_report where dataType = :dataType and timeInZero >= :begin and timeInZero < :end and isDeleted = 0 order by timeInZero desc")
    @NotNull
    List<FitnessDailyReportEntity> queryDailyReportEntityListSync(@NotNull HomeDataType dataType, long begin, long end);

    @Query("select * from daily_report where dataType = :dataType and timeInZero = :timeInSecond and isDeleted = 0")
    @Nullable
    FitnessDailyReportEntity queryDailyReportEntitySync(@NotNull HomeDataType dataType, long timeInSecond);

    @Query("update daily_report set isUpload = 1 where dataType = :dataType and timeInZero = :timeInZero")
    void update(@NotNull HomeDataType dataType, long timeInZero);

    @Query("update daily_report set isUpload = 1 where dataType = :dataType and timeInZero = :timeInZero and updateTime = :updateTime")
    void update(@NotNull HomeDataType dataType, long timeInZero, long updateTime);
}
