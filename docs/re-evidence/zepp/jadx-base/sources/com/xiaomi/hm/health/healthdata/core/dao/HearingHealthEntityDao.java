package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\"\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\"\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\rJ\b\u0010\u000f\u001a\u00020\u000bH'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/HearingHealthEntityDao;", "", "", "status", "", "userId", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;", "queryEntity", "", "entity", "", Constant.METHOD_INSERT, "([Lcom/xiaomi/hm/health/healthdata/core/entity/HearingHealthEntity;)V", "update", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface HearingHealthEntityDao {
    @Query("delete from HearingHealthEntity")
    void clean();

    @Insert(onConflict = 1)
    void insert(@NotNull HearingHealthEntity... entity);

    @Query("SELECT * FROM HearingHealthEntity WHERE status =:status AND userId=:userId")
    @Nullable
    List<HearingHealthEntity> queryEntity(int status, @NotNull String userId);

    @Update
    void update(@NotNull HearingHealthEntity... entity);
}
