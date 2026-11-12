package com.huami.watchfacesstore.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H'J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0005H'J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'J)\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/huami/watchfacesstore/room/WatchFaceDao;", "", "", "deviceId", "", "Lcom/huami/watchfacesstore/room/WatchFaceInfo;", "getWatchFaceInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", WatchFaceDetailActivity.WATCH_FACE_ID, "getWatchFaceDetailInfo", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "infos", "", "insertWatchInfo", "([Lcom/huami/watchfacesstore/room/WatchFaceInfo;)V", "", "ids", "deleteWatchFaceInfoByIds", "info", "updateWatchFaceInfo", "bgPath", "updateWatchFaceBgPath", "color", "updateWatchFaceColor", "(Ljava/lang/String;ILjava/lang/Integer;)I", "queryInfoByIds", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getWatchFaceInfoFlow", "deviceIds", "deleteWatchFaceInfoByDevice", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface WatchFaceDao {
    @Query("DELETE FROM WatchFaceInfo WHERE device_id IN (:deviceIds)")
    int deleteWatchFaceInfoByDevice(@NotNull List<String> deviceIds);

    @Query("DELETE FROM WatchFaceInfo WHERE id IN (:ids) AND device_id = :deviceId")
    int deleteWatchFaceInfoByIds(@NotNull String deviceId, @NotNull int[] ids);

    @Query("SELECT * FROM WatchFaceInfo WHERE device_id = :deviceId AND id = :watchFaceId")
    @Nullable
    Object getWatchFaceDetailInfo(@NotNull String str, int i, @NotNull Continuation<? super WatchFaceInfo> continuation);

    @Query("SELECT * FROM WatchFaceInfo WHERE device_id = :deviceId ORDER BY create_time DESC")
    @Nullable
    Object getWatchFaceInfo(@NotNull String str, @NotNull Continuation<? super List<WatchFaceInfo>> continuation);

    @Query("SELECT * FROM WatchFaceInfo WHERE device_id = :deviceId ORDER BY create_time DESC")
    @NotNull
    Flow<List<WatchFaceInfo>> getWatchFaceInfoFlow(@NotNull String deviceId);

    @Insert
    void insertWatchInfo(@NotNull WatchFaceInfo... infos);

    @Query("SELECT * FROM WatchFaceInfo WHERE device_id = :deviceId AND id IN (:ids)")
    @Nullable
    Object queryInfoByIds(@NotNull String str, @NotNull List<Integer> list, @NotNull Continuation<? super List<WatchFaceInfo>> continuation);

    @Query("UPDATE WatchFaceInfo SET bg_path = :bgPath WHERE device_id = :deviceId AND id = :watchFaceId")
    int updateWatchFaceBgPath(@NotNull String deviceId, int watchFaceId, @Nullable String bgPath);

    @Query("UPDATE WatchFaceInfo SET color = :color WHERE device_id = :deviceId AND id = :watchFaceId")
    int updateWatchFaceColor(@NotNull String deviceId, int watchFaceId, @Nullable Integer color);

    @Update(entity = WatchFaceInfo.class)
    int updateWatchFaceInfo(@NotNull WatchFaceInfo info);
}
