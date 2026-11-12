package com.xiaomi.fit.fitness.db.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\t\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J \u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/db/dao/DeviceDataSyncDao;", "", "insertAll", "", "syncEntity", "", "Lcom/xiaomi/fit/fitness/db/dao/DataSyncEntity;", "([Lcom/xiaomi/fit/fitness/db/dao/DataSyncEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAll", "delete", "get", "sid", "", "idBytes", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSyncStatusLessThan", "", "status", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForceSyncStatusLessThan", "getTheSyncStatus", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceDataSyncDao {
    @Delete
    @Nullable
    Object delete(@NotNull DataSyncEntity[] dataSyncEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM device_sync WHERE sid = :sid AND idBytes = :idBytes")
    @Nullable
    Object get(@NotNull String str, @NotNull byte[] bArr, @NotNull Continuation<? super DataSyncEntity> continuation);

    @Query("SELECT * FROM device_sync WHERE sid = :sid AND syncStatus < :status AND forceSync = 1")
    @Nullable
    Object getForceSyncStatusLessThan(@NotNull String str, @SyncStatus int i, @NotNull Continuation<? super List<DataSyncEntity>> continuation);

    @Query("SELECT * FROM device_sync WHERE sid = :sid AND syncStatus < :status")
    @Nullable
    Object getSyncStatusLessThan(@NotNull String str, @SyncStatus int i, @NotNull Continuation<? super List<DataSyncEntity>> continuation);

    @Query("SELECT * FROM device_sync WHERE sid =:sid AND idBytes = :idBytes")
    @Nullable
    Object getTheSyncStatus(@NotNull String str, @NotNull byte[] bArr, @NotNull Continuation<? super DataSyncEntity> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertAll(@NotNull DataSyncEntity[] dataSyncEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Update
    @Nullable
    Object updateAll(@NotNull DataSyncEntity[] dataSyncEntityArr, @NotNull Continuation<? super Unit> continuation);
}
