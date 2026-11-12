package com.huami.heartrate.repository.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\r\"\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'¨\u0006\u0014"}, d2 = {"Lcom/huami/heartrate/repository/db/HeartRateDao;", "", "", "userId", "", "type", "state", "", "from", "to", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "getHeartRateByUserId", "", "users", "", "insertManualHeartRate", "([Lcom/huami/heartrate/repository/entity/HeartRateEntity;)V", "deleteHeartRateByUserId", "queryEarliestHeartRateByUserId", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public interface HeartRateDao {
    @Query("DELETE FROM HEART_RATE WHERE userId = :userId AND type = :type AND time between :from and :to AND state = :state")
    void deleteHeartRateByUserId(@NotNull String userId, int type, int state, long from, long to);

    @Query("SELECT * FROM HEART_RATE WHERE userId = :userId AND type = :type AND time between :from and :to AND state != :state Order by time Desc")
    @NotNull
    List<HeartRateEntity> getHeartRateByUserId(@NotNull String userId, int type, int state, long from, long to);

    @Insert
    void insertManualHeartRate(@NotNull HeartRateEntity... users);

    @Query("SELECT * FROM HEART_RATE WHERE userId = :userId AND type = :type AND state != :state Order by time ASC LIMIT 1")
    @NotNull
    HeartRateEntity queryEarliestHeartRateByUserId(@NotNull String userId, int type, int state);
}
