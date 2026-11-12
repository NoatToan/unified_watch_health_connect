package com.huami.bodymeasurements.temperature.model.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H'J\b\u0010\u0011\u001a\u00020\u0005H'J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0016"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/dao/ManualTempDao;", "", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/ManualTempEntity;", "data", "", "insertOrUpdateManualTempList", "", "userId", "getLatestManualTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestManualTempFlow", "", "start", "end", "getManualTempBetweenTimestamp", "getManualTempAll", WorkoutExercises.CLEAN, "timeStamp", "", "delete", "getUnSyncManualTempList", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface ManualTempDao {
    @Query("delete from ManualTemp")
    void clean();

    @Query("delete from ManualTemp where timestamp=:timeStamp and userId=:userId")
    int delete(long timeStamp, @NotNull String userId);

    @Query("select * from ManualTemp where userId=:userId order by timestamp desc limit 1")
    @Nullable
    ManualTempEntity getLatestManualTemp(@NotNull String userId);

    @Query("select * from ManualTemp order by timestamp desc limit 1")
    @NotNull
    Flow<ManualTempEntity> getLatestManualTempFlow();

    @Query("select * from ManualTemp where userId=:userId")
    @NotNull
    List<ManualTempEntity> getManualTempAll(@NotNull String userId);

    @Query("select * from ManualTemp where timestamp >=:start and timestamp<=:end and userId=:userId")
    @NotNull
    List<ManualTempEntity> getManualTempBetweenTimestamp(long start, long end, @NotNull String userId);

    @Query("select * from ManualTemp where syncStatus = 0")
    @NotNull
    List<ManualTempEntity> getUnSyncManualTempList();

    @Insert(onConflict = 1)
    void insertOrUpdateManualTempList(@NotNull List<ManualTempEntity> data);
}
