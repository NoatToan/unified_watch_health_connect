package com.xiaomi.hm.health.device.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.database.entity.DeviceRecordEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H'J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/database/dao/DeviceRecordDao;", "", "", "Lcom/xiaomi/hm/health/device/database/entity/DeviceRecordEntity;", "getAllSyncedRecord", "data", "", Constant.METHOD_INSERT, "delete", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceRecordDao {
    @Delete
    void delete(@NotNull DeviceRecordEntity data);

    @Delete
    void delete(@NotNull List<DeviceRecordEntity> data);

    @Query("select * from DeviceRecord")
    @NotNull
    List<DeviceRecordEntity> getAllSyncedRecord();

    @Insert(onConflict = 1)
    void insert(@NotNull DeviceRecordEntity data);

    @Insert(onConflict = 1)
    void insert(@NotNull List<DeviceRecordEntity> data);
}
