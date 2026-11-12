package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.snore.core.cloud.api.WebConst;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH'J#\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0011\"\u00020\u0003H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\fH'J#\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0011\"\u00020\u0003H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH'J$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH'J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\fH'J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\bH'J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\bH'J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH'J\b\u0010%\u001a\u00020\u0013H'¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/UserHealthDataDao;", "", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "findAll", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "findByType", "", "userId", "Landroidx/lifecycle/LiveData;", "findByUserId", "", "id", "", "deleteById", WebConst.Param.FINDONE, "", "entity", "", Constant.METHOD_INSERT, "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)V", "time", "delete", "update", "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)I", "limit", "getTop", "getTopByLiveData", "uploadTime", "isRecordExits", "dateStr", "findInDay", "findInDayByLiveData", "begin", "end", "findBetweenUploadTime", WorkoutExercises.CLEAN, "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface UserHealthDataDao {
    @Query("delete from UserDataEntity")
    void clean();

    @Query("delete from UserDataEntity where uploadTime=:time")
    int delete(long time);

    @Query("delete from UserDataEntity where id=:id")
    int deleteById(long id);

    @Query("select * from UserDataEntity a order by a.uploadTime desc")
    @NotNull
    List<UserDataEntity> findAll();

    @Query("select * from UserDataEntity where type =:type and uploadTime between :begin and :end order by uploadTime asc")
    @NotNull
    List<UserDataEntity> findBetweenUploadTime(@NotNull HealthDataType type, long begin, long end);

    @Query("select * from UserDataEntity where type =:type order by uploadTime desc")
    @NotNull
    List<UserDataEntity> findByType(@NotNull HealthDataType type);

    @Query("select * from UserDataEntity where userId=:userId order by uploadTime desc")
    @NotNull
    LiveData<UserDataEntity> findByUserId(@NotNull String userId);

    @Query("select * from UserDataEntity where type=:type and dateStr=:dateStr order by uploadTime asc")
    @NotNull
    List<UserDataEntity> findInDay(@NotNull HealthDataType type, @NotNull String dateStr);

    @Query("select * from UserDataEntity where type=:type and dateStr=:dateStr order by uploadTime asc")
    @NotNull
    LiveData<List<UserDataEntity>> findInDayByLiveData(@NotNull HealthDataType type, @NotNull String dateStr);

    @Query("select * from UserDataEntity where id=:id limit 1")
    @Nullable
    UserDataEntity findOne(long id);

    @Query("\n        select * from UserDataEntity a \n        where a.type=:type order by a.uploadTime desc limit :limit\n    ")
    @NotNull
    List<UserDataEntity> getTop(@NotNull HealthDataType type, int limit);

    @Query("\n        select * from UserDataEntity a \n        where a.type=:type and a.uploadTime <= 1000 * strftime('%s','now') \n        order by a.uploadTime desc limit :limit\n    ")
    @NotNull
    LiveData<List<UserDataEntity>> getTopByLiveData(@NotNull HealthDataType type, int limit);

    @Insert
    void insert(@NotNull UserDataEntity... entity);

    @Query("select count(a.id) as cnt from UserDataEntity a where a.uploadTime=:uploadTime")
    int isRecordExits(long uploadTime);

    @Update
    int update(@NotNull UserDataEntity... entity);
}
