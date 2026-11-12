package com.huami.respiratoryrate.core.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H'J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH'J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0014"}, d2 = {"Lcom/huami/respiratoryrate/core/data/local/dao/RespRateDao;", "", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "getLatestFlow", "", "from", "to", "", "getRangeListFlow", "getRangeList", "getUnSyncListFlow", "getUnSyncList", "data", "insertOrReplace", "", "", "clear", "core_release"}, k = 1, mv = {1, 5, 1})
public interface RespRateDao {
    @Query("DELETE FROM respiratoryrate WHERE userId = :userId")
    void clear(@NotNull String userId);

    @Query("SELECT * FROM  RespiratoryRate WHERE userId = :userId ORDER BY respRateTime DESC LIMIT 1")
    @NotNull
    Flow<RespRateEntity> getLatestFlow(@NotNull String userId);

    @Query("SELECT * FROM  RespiratoryRate WHERE userId = :userId AND respRateTime BETWEEN :from AND :to ORDER BY respRateTime ASC")
    @NotNull
    List<RespRateEntity> getRangeList(@NotNull String userId, long from, long to);

    @Query("SELECT * FROM  RespiratoryRate WHERE userId = :userId AND respRateTime BETWEEN :from AND :to ORDER BY respRateTime ASC")
    @NotNull
    Flow<List<RespRateEntity>> getRangeListFlow(@NotNull String userId, long from, long to);

    @Query("SELECT * FROM  RespiratoryRate WHERE userId = :userId AND sync = 0 ORDER BY respRateTime ASC")
    @NotNull
    List<RespRateEntity> getUnSyncList(@NotNull String userId);

    @Query("SELECT * FROM  RespiratoryRate WHERE userId = :userId AND sync = 0 ORDER BY respRateTime ASC")
    @NotNull
    Flow<List<RespRateEntity>> getUnSyncListFlow(@NotNull String userId);

    @Insert(onConflict = 1)
    long insertOrReplace(@NotNull RespRateEntity data);

    @Insert(onConflict = 1)
    @NotNull
    long[] insertOrReplace(@NotNull List<RespRateEntity> data);
}
