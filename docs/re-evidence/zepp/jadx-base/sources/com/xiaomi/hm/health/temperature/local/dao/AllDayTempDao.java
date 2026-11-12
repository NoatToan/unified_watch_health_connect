package com.xiaomi.hm.health.temperature.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.devicex.injection.data.AllDayTempDaoApi;
import com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H'J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H'J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH'J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H'J\b\u0010\u000f\u001a\u00020\fH'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/dao/AllDayTempDao;", "Lcom/huami/devicex/injection/data/AllDayTempDaoApi;", "", "timestamp", "Lcom/xiaomi/hm/health/temperature/local/entity/AllDayTempEntity;", "getAllDayTempByTimestamp", "start", "end", "", "getAllDayTempBetweenTimestamp", "getLatestAllDayTemp", "data", "", "insertOrUpdateAllDayTempList", "insertOrUpdateAllDayTemp", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface AllDayTempDao extends AllDayTempDaoApi {
    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Query("delete from AllDayTemp")
    void clean();

    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Query("select * from AllDayTemp where timestamp >=:start and timestamp<=:end")
    @NotNull
    List<AllDayTempEntity> getAllDayTempBetweenTimestamp(long start, long end);

    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Query("select * from AllDayTemp where timestamp =:timestamp")
    @Nullable
    AllDayTempEntity getAllDayTempByTimestamp(long timestamp);

    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Query("select * from AllDayTemp order by timestamp desc limit 1")
    @Nullable
    AllDayTempEntity getLatestAllDayTemp();

    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Insert(onConflict = 1)
    void insertOrUpdateAllDayTemp(@NotNull AllDayTempEntity data);

    @Override // com.huami.devicex.injection.data.AllDayTempDaoApi
    @Insert(onConflict = 1)
    void insertOrUpdateAllDayTempList(@NotNull List<AllDayTempEntity> data);
}
