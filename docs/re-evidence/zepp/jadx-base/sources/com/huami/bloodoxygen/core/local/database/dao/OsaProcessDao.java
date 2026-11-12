package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H'J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H'J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0012\"\u00020\u0005H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001c"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/OsaProcessDao;", "", "", "userId", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "getShouldUpload", "getShouldDelete", "osaProcesses", "", Constant.METHOD_INSERT, "from", "to", "queryOsaProcesses", "sleepDate", "queryOsaProcessesBySleepDate", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "", "OsaProcess", "", "remove", "([Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;)V", "clear", "", "getIfRawExistsFlow", "getLatest", "getLatestFlow", "core_release"}, k = 1, mv = {1, 5, 1})
public interface OsaProcessDao {
    @Query("DELETE FROM osa_process WHERE userId = :userId")
    void clear(@NotNull String userId);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND date BETWEEN :from AND :to AND toDelete = 0")
    @NotNull
    Flow<List<OsaProcess>> getFlow(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT EXISTS (SELECT * FROM osa_process WHERE userId = :userId AND toDelete = 0)")
    @NotNull
    Flow<Boolean> getIfRawExistsFlow(@NotNull String userId);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND toDelete = 0 ORDER BY date DESC LIMIT 1")
    @Nullable
    OsaProcess getLatest(@NotNull String userId);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND toDelete = 0 ORDER BY date DESC LIMIT 1")
    @NotNull
    Flow<OsaProcess> getLatestFlow(@NotNull String userId);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND toDelete = 1")
    @NotNull
    List<OsaProcess> getShouldDelete(@NotNull String userId);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND uploaded = 0 AND toDelete = 0")
    @NotNull
    List<OsaProcess> getShouldUpload(@NotNull String userId);

    @Insert(onConflict = 1)
    @NotNull
    long[] insert(@NotNull List<OsaProcess> osaProcesses);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND date BETWEEN :from AND :to AND toDelete = 0")
    @NotNull
    List<OsaProcess> queryOsaProcesses(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT * FROM osa_process WHERE userId = :userId AND sleepDate = :sleepDate")
    @NotNull
    List<OsaProcess> queryOsaProcessesBySleepDate(@NotNull String userId, @NotNull String sleepDate);

    @Delete
    void remove(@NotNull OsaProcess... OsaProcess);
}
