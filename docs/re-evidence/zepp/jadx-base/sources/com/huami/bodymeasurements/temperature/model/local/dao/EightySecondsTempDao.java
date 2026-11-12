package com.huami.bodymeasurements.temperature.model.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.temperature.model.local.entity.EightySecondsTempEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H'J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0011\u001a\u00020\u0005H'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0013"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/dao/EightySecondsTempDao;", "", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/EightySecondsTempEntity;", "data", "", "insertOrUpdateEightySecondsTemp", "getLatestEightySecondsTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestEightySecondsTempFlow", "", "start", "end", "", "userId", "getEightySecondsTempBetweenTimestamp", "getEightySecondsTempAll", WorkoutExercises.CLEAN, "getUnSyncEightySecondsTempList", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface EightySecondsTempDao {
    @Query("delete from EightySecondsTemp")
    void clean();

    @Query("select * from EightySecondsTemp ")
    @NotNull
    List<EightySecondsTempEntity> getEightySecondsTempAll();

    @Query("select * from EightySecondsTemp where timestamp >=:start and timestamp<=:end and userId=:userId")
    @NotNull
    List<EightySecondsTempEntity> getEightySecondsTempBetweenTimestamp(long start, long end, @NotNull String userId);

    @Query("select * from EightySecondsTemp order by timestamp desc limit 1")
    @Nullable
    EightySecondsTempEntity getLatestEightySecondsTemp();

    @Query("select * from EightySecondsTemp order by timestamp desc limit 1")
    @NotNull
    Flow<EightySecondsTempEntity> getLatestEightySecondsTempFlow();

    @Query("select * from EightySecondsTemp where syncStatus = 0")
    @NotNull
    List<EightySecondsTempEntity> getUnSyncEightySecondsTempList();

    @Insert(onConflict = 1)
    void insertOrUpdateEightySecondsTemp(@NotNull List<EightySecondsTempEntity> data);
}
