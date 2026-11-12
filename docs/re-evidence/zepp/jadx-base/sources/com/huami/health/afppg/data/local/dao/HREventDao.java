package com.huami.health.afppg.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H'¨\u0006\u0010"}, d2 = {"Lcom/huami/health/afppg/data/local/dao/HREventDao;", "", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "hrEvent", "", Constant.METHOD_INSERT, "", "fromTime", "toTime", "", "query", "getUnsyncedData", "subType", "queryWithSubType", "data", "updateSyncState", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface HREventDao {
    @Query("SELECT * FROM hr_events WHERE synced = 0")
    @Transaction
    @NotNull
    List<HREventData> getUnsyncedData();

    @Insert(onConflict = 1)
    @Transaction
    void insert(@NotNull HREventData hrEvent);

    @Query("SELECT * FROM hr_events WHERE date between :fromTime and :toTime order by date desc")
    @Transaction
    @NotNull
    List<HREventData> query(@NotNull String fromTime, @NotNull String toTime);

    @Query("SELECT * FROM hr_events WHERE date between :fromTime and :toTime and subType = :subType order by date desc")
    @Transaction
    @NotNull
    List<HREventData> queryWithSubType(@NotNull String fromTime, @NotNull String toTime, @NotNull String subType);

    @Update
    @Transaction
    void updateSyncState(@NotNull HREventData data);
}
