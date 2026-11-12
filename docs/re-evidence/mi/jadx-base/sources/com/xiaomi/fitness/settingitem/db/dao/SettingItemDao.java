package com.xiaomi.fitness.settingitem.db.dao;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u000f\u001a\u00020\u000eH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/dao/SettingItemDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "getSettingByDid", "", "did", "", "isUpload", "", "getSettings", "getSettingByKey", RnReportConst.ApiReport.PARAM_MODULE, "key", "deleteByDid", "", "deleteAll", "insertOrUpdateSettingItem", "", "settingItemEntity", "querySettingItemsNotUpload", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingItemDao extends BaseDao<SettingItemEntity> {
    @Query("DELETE FROM settingitem")
    void deleteAll();

    @Query("DELETE FROM settingitem WHERE did = :did")
    void deleteByDid(@NotNull String did);

    @Query("SELECT * FROM settingitem WHERE did = :did AND isUpload = :isUpload")
    @Nullable
    List<SettingItemEntity> getSettingByDid(@NotNull String did, boolean isUpload);

    @Query("SELECT * FROM settingitem WHERE did = :did AND module =:module AND `key` = :key")
    @Nullable
    SettingItemEntity getSettingByKey(@NotNull String did, @NotNull String module, @NotNull String key);

    @Query("SELECT * FROM settingitem WHERE did = :did")
    @Nullable
    List<SettingItemEntity> getSettings(@NotNull String did);

    @Insert(onConflict = 1)
    long insertOrUpdateSettingItem(@NotNull SettingItemEntity settingItemEntity);

    @Query("select * from settingitem where isUpload = 0")
    @NotNull
    List<SettingItemEntity> querySettingItemsNotUpload();
}
