package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H'J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H'J:\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0011H'J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0011H'¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;)V", "insertAll", "list", "", "update", "getUnSyncedReport", "getUnSyncedList", "dataType", "", "type", "", "getUnSyncedListByTimeRange", "startTime", "", "endTime", "getSyncedByTypeAndTimeRange", "getItem", "uid", "key", "time", "sid", "getReportAssociateItem", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthConnectSyncDao {
    @Query("SELECT * FROM health_connect_sync_info WHERE `uid` = :uid AND `dataType` = :dataType AND `type` = :type AND `key`=:key AND `time` = :time AND `sid`=:sid")
    @Nullable
    HealthConnectSyncDaoEntity getItem(@NotNull String uid, int dataType, @NotNull String type, @NotNull String key, long time, @NotNull String sid);

    @Query("SELECT * FROM health_connect_sync_info WHERE `uid` = :uid AND `dataType` = 1 AND `key`=:key AND `time` = :time AND `sid`=:sid")
    @NotNull
    List<HealthConnectSyncDaoEntity> getReportAssociateItem(@NotNull String uid, @NotNull String key, long time, @NotNull String sid);

    @Query("SELECT * FROM health_connect_sync_info WHERE `dataType` = :dataType AND `type` = :type AND `time`>=:startTime AND `time` < :endTime ORDER BY `time` ASC")
    @NotNull
    List<HealthConnectSyncDaoEntity> getSyncedByTypeAndTimeRange(int dataType, @NotNull String type, long startTime, long endTime);

    @Query("SELECT * FROM health_connect_sync_info WHERE `dataType` = :dataType AND `type` = :type AND `status`=0 ")
    @NotNull
    List<HealthConnectSyncDaoEntity> getUnSyncedList(int dataType, @NotNull String type);

    @Query("SELECT * FROM health_connect_sync_info WHERE `dataType` = :dataType AND `type` = :type AND `status`=0  AND `time` >= :startTime AND `time` < :endTime ORDER BY `time` ASC")
    @NotNull
    List<HealthConnectSyncDaoEntity> getUnSyncedListByTimeRange(int dataType, @NotNull String type, long startTime, long endTime);

    @Query("SELECT * FROM health_connect_sync_info WHERE `dataType` = 1 AND `status`=0 ")
    @NotNull
    List<HealthConnectSyncDaoEntity> getUnSyncedReport();

    @Insert(onConflict = 1)
    void insert(@NotNull HealthConnectSyncDaoEntity... entity);

    @Insert(onConflict = 1)
    void insertAll(@NotNull List<HealthConnectSyncDaoEntity> list);

    @Update
    void update(@NotNull HealthConnectSyncDaoEntity... entity);
}
