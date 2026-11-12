package com.xiaomi.fitness.aggregation.health.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH'¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDeviceListDao;", "", "insert", "", "items", "", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDeviceItemEntity;", "([Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDeviceItemEntity;)V", "delete", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "timeList", "", "", "queryDeviceList", "Lkotlinx/coroutines/flow/Flow;", StatConstants.PARAM_START, StatConstants.PARAM_END, "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDeviceListDao {
    @Query("delete from device_list where dataType = :dataType and timeInZero in (:timeList)")
    void delete(@NotNull HomeDataType dataType, @NotNull List<Long> timeList);

    @Delete
    void delete(@NotNull FitnessDeviceItemEntity... items);

    @Insert(onConflict = 1)
    void insert(@NotNull FitnessDeviceItemEntity... items);

    @Query("select * from device_list where dataType = :dataType and timeInZero >= :start and timeInZero < :end")
    @NotNull
    Flow<List<FitnessDeviceItemEntity>> queryDeviceList(@NotNull HomeDataType dataType, long start, long end);
}
