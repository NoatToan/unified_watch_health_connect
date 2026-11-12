package com.huami.bodymeasurements.temperature.model.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0011\u001a\u00020\u0005H'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\u0013"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/SingleTempEntity;", "data", "", "insertOrUpdateSingleTemp", "", "userId", "getLatestSingleTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestSingleTempFlow", "", "start", "end", "getSingleTempBetweenTimestamp", "getSingleTempAll", WorkoutExercises.CLEAN, "getUnSyncSingleTempList", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface SingleTempDao {
    @Query("delete from SingleTemp")
    void clean();

    @Query("select * from SingleTemp where userId=:userId order by timestamp desc limit 1")
    @Nullable
    SingleTempEntity getLatestSingleTemp(@NotNull String userId);

    @Query("select * from SingleTemp order by timestamp desc limit 1")
    @NotNull
    Flow<SingleTempEntity> getLatestSingleTempFlow();

    @Query("select * from SingleTemp ")
    @NotNull
    List<SingleTempEntity> getSingleTempAll();

    @Query("select * from SingleTemp where timestamp >=:start and timestamp<=:end and userId=:userId")
    @NotNull
    List<SingleTempEntity> getSingleTempBetweenTimestamp(long start, long end, @NotNull String userId);

    @Query("select * from SingleTemp where syncStatus = 0")
    @NotNull
    List<SingleTempEntity> getUnSyncSingleTempList();

    @Insert(onConflict = 1)
    void insertOrUpdateSingleTemp(@NotNull List<SingleTempEntity> data);
}
