package com.huami.restheartrate.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.restheartrate.entity.RestHeartEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH'¨\u0006\f"}, d2 = {"Lcom/huami/restheartrate/room/RestHeartDao;", "", "", "Lcom/huami/restheartrate/entity/RestHeartEntity;", "data", "", "insertRestHeart", "([Lcom/huami/restheartrate/entity/RestHeartEntity;)V", "", "userId", "date", "getRestHeartByDate", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public interface RestHeartDao {
    @Query("select * from rest_heart_rate where userId=:userId and date=:date")
    @Nullable
    RestHeartEntity getRestHeartByDate(@NotNull String userId, @NotNull String date);

    @Insert(onConflict = 1)
    void insertRestHeart(@NotNull RestHeartEntity... data);
}
