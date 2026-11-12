package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/SyncLogDao;", "", "", "userId", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "date", "Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "query", "syncLog", "", Constant.METHOD_INSERT, "", "clear", "", "ifRowExists", "core_release"}, k = 1, mv = {1, 5, 1})
public interface SyncLogDao {
    @Query("DELETE FROM sync_log WHERE userId = :userId")
    void clear(@NotNull String userId);

    @Query("SELECT EXISTS(SELECT * FROM sync_log WHERE userId = :userId AND type = :type)")
    boolean ifRowExists(@NotNull String userId, @NotNull BloodOxygen.SubType type);

    @Insert(onConflict = 1)
    long insert(@NotNull SyncLog syncLog);

    @Query("SELECT * FROM sync_log WHERE userId = :userId AND type = :type AND date = :date")
    @Nullable
    SyncLog query(@NotNull String userId, @NotNull BloodOxygen.SubType type, @NotNull String date);
}
