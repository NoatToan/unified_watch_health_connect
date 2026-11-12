package com.huami.bodymeasurements.temperature.model.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH'J\u0016\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH'J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H'J\b\u0010\u0014\u001a\u00020\u0011H'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\nH'¨\u0006\u0016"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "", "", "timestamp", "Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "getAllDayTempByTimestamp", "start", "end", "", "userId", "", "getAllDayTempBetweenTimestamp", "getAllDayTempAll", "getLatestAllDayTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestAllDayTempFlow", "data", "", "insertOrUpdateAllDayTempList", "insertOrUpdateAllDayTemp", WorkoutExercises.CLEAN, "getUnSyncAllDayTempList", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface AllDayTempDao {
    @Query("delete from AllDayTemp")
    void clean();

    @Query("select * from AllDayTemp ")
    @NotNull
    List<AllDayTempEntity> getAllDayTempAll();

    @Query("select * from AllDayTemp where timestamp >=:start and timestamp<=:end and userId=:userId")
    @NotNull
    List<AllDayTempEntity> getAllDayTempBetweenTimestamp(long start, long end, @NotNull String userId);

    @Query("select * from AllDayTemp where timestamp =:timestamp")
    @Nullable
    AllDayTempEntity getAllDayTempByTimestamp(long timestamp);

    @Query("select * from AllDayTemp where userId=:userId order by timestamp desc limit 1")
    @Nullable
    AllDayTempEntity getLatestAllDayTemp(@NotNull String userId);

    @Query("select * from AllDayTemp order by timestamp desc limit 1")
    @NotNull
    Flow<AllDayTempEntity> getLatestAllDayTempFlow();

    @Query("select * from AllDayTemp where syncStatus = 0")
    @NotNull
    List<AllDayTempEntity> getUnSyncAllDayTempList();

    @Insert(onConflict = 1)
    void insertOrUpdateAllDayTemp(@NotNull AllDayTempEntity data);

    @Insert(onConflict = 1)
    void insertOrUpdateAllDayTempList(@NotNull List<AllDayTempEntity> data);
}
