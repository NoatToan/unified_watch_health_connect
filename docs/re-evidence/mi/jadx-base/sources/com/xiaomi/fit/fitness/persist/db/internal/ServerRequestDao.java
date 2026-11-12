package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.health.connect.client.records.CervicalMucusRecord;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J\"\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\nH'J \u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0003H'¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "list", "", "update", "delete", "deleteAll", "queryAllEntity", "getTheServerRequest", "requestAction", "", "persistKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServerRequestList", CervicalMucusRecord.Appearance.CLEAR, "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ServerRequestDao {
    @Query("delete from server_request")
    void clear();

    @Delete
    @Nullable
    Object delete(@NotNull ServerRequestEntity[] serverRequestEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Delete
    void deleteAll(@NotNull List<ServerRequestEntity> list);

    @Query("SELECT * FROM server_request WHERE `action` = :requestAction AND `key` = :persistKey")
    @Nullable
    Object getServerRequestList(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<ServerRequestEntity>> continuation);

    @Query("SELECT * FROM server_request WHERE `action` = :requestAction AND `key` = :persistKey")
    @Nullable
    Object getTheServerRequest(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ServerRequestEntity> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insert(@NotNull ServerRequestEntity[] serverRequestEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    void insertAll(@NotNull List<ServerRequestEntity> list);

    @Query("select * from server_request")
    @NotNull
    List<ServerRequestEntity> queryAllEntity();

    @Update
    @Nullable
    Object update(@NotNull ServerRequestEntity[] serverRequestEntityArr, @NotNull Continuation<? super Unit> continuation);
}
