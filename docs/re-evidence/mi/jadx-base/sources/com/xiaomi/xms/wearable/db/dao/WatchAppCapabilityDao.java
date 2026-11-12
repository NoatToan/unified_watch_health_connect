package com.xiaomi.xms.wearable.db.dao;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/xms/wearable/db/dao/WatchAppCapabilityDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppCapability;", "findByPackageName", "packageName", "", "insertAll", "", "watchCapabilities", "", "findAll", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WatchAppCapabilityDao extends BaseDao<WatchAppCapability> {
    @Query("SELECT * FROM watch_app_capability")
    @NotNull
    List<WatchAppCapability> findAll();

    @Query("SELECT * FROM watch_app_capability WHERE packageName=:packageName")
    @Nullable
    WatchAppCapability findByPackageName(@NotNull String packageName);

    @Insert
    void insertAll(@NotNull List<WatchAppCapability> watchCapabilities);
}
