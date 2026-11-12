package com.huami.health.afppg.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH'J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H'J\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH'J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH'J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH'J4\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH'J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH'J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH'J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001e"}, d2 = {"Lcom/huami/health/afppg/data/local/dao/AFibDao;", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "data", "", Constant.METHOD_INSERT, "", "userId", "clear", "", "source", "", "timestamp", "delete", "aFibData", "", "timestamps", "deleteByTimeStamp", "queryUnsyncedData", "fromTimestamp", "toTimestamp", "value", "getAFibData", "Lkotlinx/coroutines/flow/Flow;", "getAFibDataFlow", "timeFrom", "timeTo", "queryDataByTimestamps", "queryDataExists", "updateSyncedState", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface AFibDao {
    @Query("DELETE FROM afib WHERE userId = :userId")
    @Transaction
    void clear(@NotNull String userId);

    @Query("DELETE FROM afib WHERE userId = :userId AND deviceSource = :source")
    @Transaction
    void clear(@NotNull String userId, int source);

    @Delete
    @Transaction
    void delete(@NotNull AFibData aFibData);

    @Query("DELETE FROM afib WHERE userId = :userId AND timestamp <= :timestamp")
    @Transaction
    void delete(@NotNull String userId, long timestamp);

    @Query("DELETE FROM afib WHERE userId = :userId AND timestamp IN (:timestamps)")
    @Transaction
    void deleteByTimeStamp(@NotNull String userId, @NotNull List<Long> timestamps);

    @Query("SELECT * FROM afib WHERE userId = :userId AND date between :fromTimestamp and :toTimestamp AND value = :value order by date desc")
    @Transaction
    @NotNull
    List<AFibData> getAFibData(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp, int value);

    @Query("SELECT * FROM afib WHERE userId = :userId AND date between :fromTimestamp and :toTimestamp AND value = :value order by date desc")
    @Transaction
    @NotNull
    Flow<List<AFibData>> getAFibDataFlow(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp, int value);

    @Insert(onConflict = 5)
    @Transaction
    void insert(@NotNull AFibData data);

    @Query("SELECT * FROM afib WHERE userId = :userId AND timestamp BETWEEN :timeFrom AND :timeTo")
    @Transaction
    @NotNull
    List<AFibData> queryDataByTimestamps(@NotNull String userId, long timeFrom, long timeTo);

    @Query("SELECT * FROM afib WHERE userId = :userId AND timestamp = :timestamp ORDER BY timestamp DESC")
    @Transaction
    @NotNull
    List<AFibData> queryDataExists(@NotNull String userId, long timestamp);

    @Query("SELECT * FROM afib WHERE userId = :userId AND timestamp >= :timestamp AND synced = 0 ORDER BY timestamp DESC")
    @Transaction
    @NotNull
    List<AFibData> queryUnsyncedData(@NotNull String userId, long timestamp);

    @Update
    @Transaction
    void updateSyncedState(@NotNull AFibData data);
}
