package com.xiaomi.fit.fitness.db.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\tH§@¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseDao;", "", "insert", "", "entity", "", "Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseEntity;", "([Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryGlucoseList", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CgmGlucoseDao {
    @Delete
    @Nullable
    Object delete(@NotNull List<CgmGlucoseEntity> list, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insert(@NotNull CgmGlucoseEntity[] cgmGlucoseEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM cgm_glucose limit :limit")
    @Nullable
    Object queryGlucoseList(int i, @NotNull Continuation<? super List<CgmGlucoseEntity>> continuation);
}
