package com.huami.phn.core.source.impl.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\b\u001a\u00020\u0005H'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH'J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH'J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH'J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH'¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/core/source/impl/db/PHNDailyAnaResultDao;", "", "", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "data", "", "insertIfNotExists", "insertOrUpdateResults", "clearAll", "", "limit", "", "projectId", "queryPHNResultByPlanId", "timestamp", "queryPHNResultByPlanIdAndBeforeTimeStamp", "queryUnSyncedPHNResultByPlanId", "queryAllPHNResultBeforeTimestamp", "queryAllPHNResult", "queryAllUnSyncedPHNResult", "queryOldestPHNResult", "queryOldestPHNResultByPlanId", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface PHNDailyAnaResultDao {
    @Query("DELETE FROM phn_daily_ana_result")
    @Transaction
    void clearAll();

    @Insert(onConflict = 5)
    @Transaction
    void insertIfNotExists(@NotNull List<PHNDailyAnalysisResult> data);

    @Insert(onConflict = 1)
    @Transaction
    void insertOrUpdateResults(@NotNull List<PHNDailyAnalysisResult> data);

    @Query("SELECT * FROM phn_daily_ana_result  ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryAllPHNResult(int limit);

    @Query("SELECT * FROM phn_daily_ana_result WHERE timestamp <= :timestamp ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryAllPHNResultBeforeTimestamp(int limit, long timestamp);

    @Query("SELECT * FROM phn_daily_ana_result WHERE timestamp >= :timestamp AND synced = 0 ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryAllUnSyncedPHNResult(int limit, long timestamp);

    @Query("SELECT * FROM phn_daily_ana_result  ORDER BY timestamp ASC limit 1")
    @NotNull
    List<PHNDailyAnalysisResult> queryOldestPHNResult();

    @Query("SELECT * FROM phn_daily_ana_result WHERE phnPlanId = :projectId ORDER BY timestamp ASC limit 1")
    @NotNull
    List<PHNDailyAnalysisResult> queryOldestPHNResultByPlanId(long projectId);

    @Query("SELECT * FROM phn_daily_ana_result WHERE phnPlanId = :projectId  ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryPHNResultByPlanId(int limit, long projectId);

    @Query("SELECT * FROM phn_daily_ana_result WHERE timestamp <= :timestamp AND phnPlanId = :projectId  ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryPHNResultByPlanIdAndBeforeTimeStamp(int limit, long timestamp, long projectId);

    @Query("SELECT * FROM phn_daily_ana_result WHERE timestamp >= :timestamp AND phnPlanId = :projectId AND synced = 0 ORDER BY timestamp DESC limit :limit")
    @NotNull
    List<PHNDailyAnalysisResult> queryUnSyncedPHNResultByPlanId(int limit, long timestamp, long projectId);
}
