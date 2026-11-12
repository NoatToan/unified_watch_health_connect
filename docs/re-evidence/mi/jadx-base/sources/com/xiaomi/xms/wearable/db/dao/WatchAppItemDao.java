package com.xiaomi.xms.wearable.db.dao;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/xms/wearable/db/dao/WatchAppItemDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "insertAll", "", "", "list", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllByDevice", "", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "packageName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAllByDevice", "findAppItem", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WatchAppItemDao extends BaseDao<WatchAppItemEntity> {
    @Query("DELETE FROM watch_app_item WHERE did=:did")
    @Nullable
    Object deleteAllByDevice(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM watch_app_item WHERE did=:did AND packageName=:packageName")
    @Nullable
    Object deleteItem(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM watch_app_item WHERE did=:did")
    @Nullable
    Object findAllByDevice(@NotNull String str, @NotNull Continuation<? super List<WatchAppItemEntity>> continuation);

    @Query("SELECT * FROM watch_app_item WHERE packageName=:packageName AND did=:did ")
    @Nullable
    WatchAppItemEntity findAppItem(@NotNull String packageName, @NotNull String did);

    @Insert(onConflict = 1)
    @Nullable
    Object insertAll(@NotNull List<WatchAppItemEntity> list, @NotNull Continuation<? super Long[]> continuation);
}
