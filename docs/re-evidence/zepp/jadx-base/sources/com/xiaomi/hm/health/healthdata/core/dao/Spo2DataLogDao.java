package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.devicex.injection.data.Spo2DataLogDaoApi;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2DataSyncLogEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H'J\b\u0010\b\u001a\u00020\u0005H'¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/Spo2DataLogDao;", "Lcom/huami/devicex/injection/data/Spo2DataLogDaoApi;", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2DataSyncLogEntity;", "findLast", "entity", "", Constant.METHOD_INSERT, "update", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface Spo2DataLogDao extends Spo2DataLogDaoApi {
    @Override // com.huami.devicex.injection.data.Spo2DataLogDaoApi
    @Query("delete from Spo2DataSyncLogEntity")
    void clean();

    @Override // com.huami.devicex.injection.data.Spo2DataLogDaoApi
    @Query("select * from Spo2DataSyncLogEntity  order by id desc limit 1")
    @Nullable
    Spo2DataSyncLogEntity findLast();

    @Override // com.huami.devicex.injection.data.Spo2DataLogDaoApi
    @Insert(onConflict = 1)
    void insert(@NotNull Spo2DataSyncLogEntity entity);

    @Override // com.huami.devicex.injection.data.Spo2DataLogDaoApi
    @Update
    void update(@NotNull Spo2DataSyncLogEntity entity);
}
