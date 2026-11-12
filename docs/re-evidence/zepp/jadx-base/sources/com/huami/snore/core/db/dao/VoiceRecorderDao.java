package com.huami.snore.core.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.tekartik.sqflite.Constant;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000e\"\u00020\u0003H'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\t2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u000e\"\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H'J#\u0010\u0018\u001a\u00020\t2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000e\"\u00020\u0003H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u001b\u001a\u00020\u0010H'¨\u0006\u001c"}, d2 = {"Lcom/huami/snore/core/db/dao/VoiceRecorderDao;", "", "", "Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "findAllData", "Ljava/util/Date;", "startTime", "endTime", "Landroidx/paging/DataSource$Factory;", "", "loadWithinTimeData", "loadWithinTimeDataList", "Landroidx/lifecycle/LiveData;", "getCountWithinTimeData", "", "entity", "", Constant.METHOD_INSERT, "([Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;)V", "", "filePath", "delete", "([Ljava/lang/String;)I", "deleteWithinTimeData", "update", "([Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;)I", "findByStartTime", WorkoutExercises.CLEAN, "snore_release"}, k = 1, mv = {1, 5, 1})
public interface VoiceRecorderDao {
    @Query("delete from voice_recorder_table")
    void clean();

    @Query("DELETE FROM voice_recorder_table WHERE file_path = :filePath ")
    int delete(@NotNull String... filePath);

    @Query("DELETE FROM voice_recorder_table where start_time>=:startTime and start_time<=:endTime ")
    int deleteWithinTimeData(@NotNull Date startTime, @NotNull Date endTime);

    @Query("select * from voice_recorder_table a order by a.start_time desc")
    @NotNull
    List<VoiceRecorderEntity> findAllData();

    @Query("select * from voice_recorder_table where start_time=:startTime")
    @NotNull
    List<VoiceRecorderEntity> findByStartTime(@NotNull Date startTime);

    @Query("select count(*)  from voice_recorder_table where start_time>=:startTime and start_time<=:endTime  order by start_time")
    @NotNull
    LiveData<Integer> getCountWithinTimeData(@NotNull Date startTime, @NotNull Date endTime);

    @Insert(onConflict = 1)
    void insert(@NotNull VoiceRecorderEntity... entity);

    @Query("select * from voice_recorder_table where start_time>=:startTime and start_time<=:endTime  order by start_time desc")
    @NotNull
    DataSource.Factory<Integer, VoiceRecorderEntity> loadWithinTimeData(@NotNull Date startTime, @NotNull Date endTime);

    @Query("select * from voice_recorder_table where start_time>=:startTime and start_time<=:endTime  order by start_time desc")
    @NotNull
    List<VoiceRecorderEntity> loadWithinTimeDataList(@NotNull Date startTime, @NotNull Date endTime);

    @Update
    int update(@NotNull VoiceRecorderEntity... entity);
}
