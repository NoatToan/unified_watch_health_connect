package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OdiEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaEventEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.OsaProcessEntity;
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.PSpo2Entity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0006\u001a\u00020\u0005H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'J\b\u0010\t\u001a\u00020\u0005H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H'J\b\u0010\f\u001a\u00020\u0005H'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H'J\b\u0010\u000f\u001a\u00020\u0005H'J\b\u0010\u0010\u001a\u00020\u0005H\u0017¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/Spo2Dao;", "", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/PSpo2Entity;", "getPSpo2NotUploaded", "", "clearPSpo2", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaProcessEntity;", "getOsaProcessNotUploaded", "clearOsaProcess", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OsaEventEntity;", "getOsaEventNotUploaded", "clearOsaEvent", "Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/OdiEntity;", "getOdiNotUploaded", "clearOdi", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface Spo2Dao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Transaction
        public static void clean(@NotNull Spo2Dao spo2Dao) {
            spo2Dao.clearPSpo2();
            spo2Dao.clearOsaProcess();
            spo2Dao.clearOsaEvent();
            spo2Dao.clearOdi();
        }
    }

    @Transaction
    void clean();

    @Query("DELETE FROM OdiEntity")
    void clearOdi();

    @Query("DELETE FROM OsaEventEntity")
    void clearOsaEvent();

    @Query("DELETE FROM OsaProcessEntity")
    void clearOsaProcess();

    @Query("DELETE FROM PSpo2Entity")
    void clearPSpo2();

    @Query("SELECT * FROM OdiEntity WHERE upload =0")
    @NotNull
    List<OdiEntity> getOdiNotUploaded();

    @Query("SELECT * FROM OsaEventEntity WHERE upload =0")
    @NotNull
    List<OsaEventEntity> getOsaEventNotUploaded();

    @Query("SELECT * FROM OsaProcessEntity WHERE upload =0")
    @NotNull
    List<OsaProcessEntity> getOsaProcessNotUploaded();

    @Query("SELECT * FROM PSpo2Entity WHERE upload =0")
    @NotNull
    List<PSpo2Entity> getPSpo2NotUploaded();
}
