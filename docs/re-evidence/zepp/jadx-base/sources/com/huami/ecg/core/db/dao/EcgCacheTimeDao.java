package com.huami.ecg.core.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgCacheTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H'J\u0012\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u000b"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;", "", "", "userId", "Lcom/huami/ecg/core/db/entity/EcgCacheTime;", "getSyncTime", "syncTime", "", "updateSyncTime", "clearFriendCache", "clearCache", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public interface EcgCacheTimeDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        public static /* synthetic */ void clearCache$default(EcgCacheTimeDao ecgCacheTimeDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearCache");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            ecgCacheTimeDao.clearCache(str);
        }

        public static /* synthetic */ void clearFriendCache$default(EcgCacheTimeDao ecgCacheTimeDao, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFriendCache");
            }
            if ((i & 1) != 0) {
                str = EcgCore.INSTANCE.getWebSetting().userId();
            }
            ecgCacheTimeDao.clearFriendCache(str);
        }
    }

    @Query("delete from ecg_sync_time where userId = :userId")
    void clearCache(@NotNull String userId);

    @Query("delete from ecg_sync_time where userId != :userId")
    void clearFriendCache(@NotNull String userId);

    @Query("select * from ecg_sync_time where userId = :userId limit 1")
    @Nullable
    EcgCacheTime getSyncTime(@NotNull String userId);

    @Insert(onConflict = 1)
    void updateSyncTime(@NotNull EcgCacheTime syncTime);
}
