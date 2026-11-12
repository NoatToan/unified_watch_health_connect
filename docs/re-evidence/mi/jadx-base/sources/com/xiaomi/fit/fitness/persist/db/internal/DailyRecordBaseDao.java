package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J!\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H'¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H'¢\u0006\u0002\u0010\rJ!\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H'¢\u0006\u0002\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0011\u001a\u00020\u0012H'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00142\u0006\u0010\u0011\u001a\u00020\u0012H'J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "T", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "", "insertAll", "", "list", "", "updateAll", "deleteAll", "insert", "recordItem", "", "([Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;)V", "update", "delete", "getDailyRecord", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "getDailyRecordAsync", "Lkotlinx/coroutines/flow/Flow;", "getRecordSource", "", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTableName", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DailyRecordBaseDao<T extends DailyRecordBaseEntity> {
    @Delete
    void delete(@NotNull T... recordItem);

    void deleteAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @RawQuery
    @NotNull
    List<T> getDailyRecord(@NotNull SupportSQLiteQuery query);

    @RawQuery(observedEntities = {RunAbilityRecordEntity.class, BloodSugarEntity.class})
    @NotNull
    Flow<List<T>> getDailyRecordAsync(@NotNull SupportSQLiteQuery query);

    @RawQuery
    @Nullable
    Object getRecordSource(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<String>> continuation);

    @NotNull
    String getTableName();

    @Insert(onConflict = 1)
    void insert(@NotNull T... recordItem);

    void insertAll(@NotNull List<? extends DailyRecordBaseEntity> list);

    @Update
    void update(@NotNull T... recordItem);

    void updateAll(@NotNull List<? extends DailyRecordBaseEntity> list);
}
