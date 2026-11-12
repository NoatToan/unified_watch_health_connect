package com.huami.phn.core.source.impl.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.phn.core.model.PHNProjectRecord;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH'J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH'J\u0016\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000eH'J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H'¨\u0006\u0011"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNProjectRecordDao;", "", "", "Lcom/huami/phn/core/model/PHNProjectRecord;", "data", "", "insertOrUpdateRecords", "clearAll", "", "timestamp", "queryPHNProject", "", "limit", "queryUnSyncedPHNProject", "Lkotlinx/coroutines/flow/Flow;", "queryLatestPHNProjectAsFlow", "queryOldestPHNProject", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface PHNProjectRecordDao {
    @Query("DELETE FROM phn_project")
    @Transaction
    void clearAll();

    @Insert(onConflict = 1)
    @Transaction
    void insertOrUpdateRecords(@NotNull List<PHNProjectRecord> data);

    @Query("SELECT * FROM phn_project ORDER BY timestamp DESC limit 1")
    @NotNull
    Flow<List<PHNProjectRecord>> queryLatestPHNProjectAsFlow();

    @Query("SELECT * FROM phn_project ORDER BY timestamp ASC limit 1")
    @Nullable
    PHNProjectRecord queryOldestPHNProject();

    @Query("SELECT * FROM phn_project WHERE timestamp = :timestamp")
    @NotNull
    PHNProjectRecord queryPHNProject(long timestamp);

    @Query("SELECT * FROM phn_project WHERE timestamp >= :timestamp ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNProjectRecord> queryPHNProject(int limit, long timestamp);

    @Query("SELECT * FROM phn_project WHERE timestamp >= :timestamp AND synced = 0 ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNProjectRecord> queryUnSyncedPHNProject(int limit, long timestamp);
}
