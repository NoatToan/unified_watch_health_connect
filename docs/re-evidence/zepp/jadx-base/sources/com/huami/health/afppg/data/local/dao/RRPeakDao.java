package com.huami.health.afppg.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H'J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH'J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH'J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0015"}, d2 = {"Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrPeak", "", Constant.METHOD_INSERT, "", "userId", "", "timeStamp", "", "dataType", "source", "", "queryRRData", "queryLocalPath", "getUnsyncedData", "delete", "deleteBySource", "clear", "update", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface RRPeakDao {
    @Query("DELETE FROM rrpeak WHERE userId = :userId")
    @Transaction
    void clear(@NotNull String userId);

    @Query("DELETE FROM rrpeak WHERE userId = :userId AND deviceSource = :source AND generatedTime = :timeStamp")
    @Transaction
    void delete(@NotNull String userId, int source, long timeStamp);

    @Query("DELETE FROM rrpeak WHERE userId = :userId AND generatedTime = :timeStamp")
    @Transaction
    void delete(@NotNull String userId, long timeStamp);

    @Query("DELETE FROM rrpeak WHERE userId = :userId AND deviceSource = :source")
    @Transaction
    void deleteBySource(@NotNull String userId, int source);

    @Query("SELECT * FROM rrpeak WHERE userId = :userId AND synced = 0 AND rawLocalPath != 0")
    @Transaction
    @NotNull
    List<RRPeak> getUnsyncedData(@NotNull String userId);

    @Insert(onConflict = 1)
    @Transaction
    void insert(@NotNull RRPeak rrPeak);

    @Query("SELECT * FROM rrpeak WHERE userId = :userId AND generatedTime = :timeStamp")
    @Transaction
    @NotNull
    List<RRPeak> queryLocalPath(@NotNull String userId, long timeStamp);

    @Query("SELECT * FROM rrpeak WHERE userId = :userId AND generatedTime = :timeStamp")
    @Transaction
    @NotNull
    List<RRPeak> queryRRData(@NotNull String userId, long timeStamp);

    @Query("SELECT * FROM rrpeak WHERE userId = :userId AND generatedTime = :timeStamp AND deviceSource = :source")
    @Transaction
    @NotNull
    List<RRPeak> queryRRData(@NotNull String userId, long timeStamp, int source);

    @Query("SELECT * FROM rrpeak WHERE userId = :userId AND generatedTime = :timeStamp AND dataType = :dataType AND deviceSource = :source")
    @Transaction
    @NotNull
    List<RRPeak> queryRRData(@NotNull String userId, long timeStamp, int dataType, int source);

    @Update(onConflict = 1)
    @Transaction
    void update(@NotNull RRPeak rrPeak);
}
