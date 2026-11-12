package com.xiaomi.fitness.aggregation.health.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH'J2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH'J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH'J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH'J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0019\u001a\u00020\u0015H'¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/RedDotDao;", "", "insert", "", "items", "", "Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;", "([Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;)V", "delete", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "list", "", "", "queryRedDotList", "Lkotlinx/coroutines/flow/Flow;", StatConstants.PARAM_START, StatConstants.PARAM_END, "queryRedDotDataTypeList", "queryRedDotListSync", "queryRedDotCount", "", "deleteEntity", "time", "queryRedDotNotUpcloudList", "limit", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RedDotDao {
    @Query("update red_dot set isDeleted = 1, isUpload = 0 where dataType = :dataType and timeInZero in (:list)")
    void delete(@NotNull HomeDataType dataType, @NotNull List<Long> list);

    @Delete
    void delete(@NotNull RedDotEntity... items);

    @Query("update red_dot set isDeleted = 1 where dataType = :dataType and timeInZero = :time")
    void deleteEntity(@NotNull HomeDataType dataType, long time);

    @Insert(onConflict = 1)
    void insert(@NotNull RedDotEntity... items);

    @Query("select count(*) from red_dot where dataType = :dataType and timeInZero >= :start and timeInZero < :end and isDeleted = 0")
    int queryRedDotCount(@NotNull HomeDataType dataType, long start, long end);

    @Query("select * from red_dot where dataType IN (:dataType) and timeInZero >= :start and timeInZero < :end and isDeleted = 0")
    @NotNull
    Flow<List<RedDotEntity>> queryRedDotDataTypeList(@NotNull List<? extends HomeDataType> dataType, long start, long end);

    @Query("select * from red_dot where dataType = :dataType and timeInZero >= :start and timeInZero < :end and isDeleted = 0")
    @NotNull
    Flow<List<RedDotEntity>> queryRedDotList(@NotNull HomeDataType dataType, long start, long end);

    @Query("select * from red_dot where dataType = :dataType and timeInZero >= :start and timeInZero < :end and isDeleted = 0")
    @NotNull
    List<RedDotEntity> queryRedDotListSync(@NotNull HomeDataType dataType, long start, long end);

    @Query("select * from red_dot where isUpload = 0 order by timeInZero desc limit :limit")
    @NotNull
    List<RedDotEntity> queryRedDotNotUpcloudList(int limit);
}
