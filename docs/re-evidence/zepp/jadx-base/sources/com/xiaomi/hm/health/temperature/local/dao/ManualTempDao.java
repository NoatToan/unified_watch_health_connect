package com.xiaomi.hm.health.temperature.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.xiaomi.hm.health.temperature.local.entity.ManualTempEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H'J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH'J\b\u0010\f\u001a\u00020\u0005H'¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/temperature/local/dao/ManualTempDao;", "", "", "Lcom/xiaomi/hm/health/temperature/local/entity/ManualTempEntity;", "data", "", "insertOrUpdateManualTempList", "getLatestManualTemp", "", "start", "end", "getManualTempBetweenTimestamp", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ManualTempDao {
    @Query("delete from ManualTemp")
    void clean();

    @Query("select * from ManualTemp order by timestamp desc limit 1")
    @Nullable
    ManualTempEntity getLatestManualTemp();

    @Query("select * from ManualTemp where timestamp >=:start and timestamp<=:end")
    @NotNull
    List<ManualTempEntity> getManualTempBetweenTimestamp(long start, long end);

    @Insert(onConflict = 1)
    void insertOrUpdateManualTempList(@NotNull List<ManualTempEntity> data);
}
