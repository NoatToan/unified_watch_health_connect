package com.huami.restheartrate.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.restheartrate.entity.MaxHeartEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH'J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH'¨\u0006\u0010"}, d2 = {"Lcom/huami/restheartrate/room/MaxHeartDao;", "", "", "Lcom/huami/restheartrate/entity/MaxHeartEntity;", "data", "", "insertMaxHeart", "([Lcom/huami/restheartrate/entity/MaxHeartEntity;)V", "", "userId", "date", "getMaxHeartByDate", "startDate", "endDate", "", "getMaxHeartBetweenDate", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public interface MaxHeartDao {
    @Query("select * from max_heart_rate where userId=:userId and date>=:startDate and date<=:endDate")
    @NotNull
    List<MaxHeartEntity> getMaxHeartBetweenDate(@NotNull String userId, @NotNull String startDate, @NotNull String endDate);

    @Query("select * from max_heart_rate where userId=:userId and date=:date")
    @Nullable
    MaxHeartEntity getMaxHeartByDate(@NotNull String userId, @NotNull String date);

    @Insert(onConflict = 1)
    void insertMaxHeart(@NotNull MaxHeartEntity... data);
}
