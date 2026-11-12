package com.xiaomi.fitness.settingitem.db.dao;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingDeviceEntity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\t\u001a\u00020\bH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H'¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/dao/SettingDeviceDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingDeviceEntity;", "getSetting", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "deleteByDid", "", "deleteAll", "insertOrUpdateSettingDevice", "", "deviceInfo", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingDeviceDao extends BaseDao<SettingDeviceEntity> {
    @Query("DELETE FROM settingdevice")
    void deleteAll();

    @Query("DELETE FROM settingdevice WHERE did = :did")
    void deleteByDid(@NotNull String did);

    @Query("SELECT * FROM settingdevice WHERE did = :did AND module = :module")
    @Nullable
    SettingDeviceEntity getSetting(@NotNull String did, @NotNull String module);

    @Insert(onConflict = 1)
    long insertOrUpdateSettingDevice(@NotNull SettingDeviceEntity deviceInfo);
}
