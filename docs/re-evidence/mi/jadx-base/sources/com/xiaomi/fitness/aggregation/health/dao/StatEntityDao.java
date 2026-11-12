package com.xiaomi.fitness.aggregation.health.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.aggregation.health.entity.StatDataEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H§@¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H§@¢\u0006\u0002\u0010\fJ,\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H§@¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H'J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/StatEntityDao;", "", "rawQueryStatList", "", "Lcom/xiaomi/fitness/aggregation/health/entity/StatDataEntity;", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "items", "", "([Lcom/xiaomi/fitness/aggregation/health/entity/StatDataEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "markDelete", "tag", "", "key", "list", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryLatestData", "Lkotlinx/coroutines/flow/Flow;", "queryLatestDataSync", "queryDeletedDataList", "limit", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StatEntityDao {
    @Delete
    @Nullable
    Object delete(@NotNull StatDataEntity[] statDataEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insert(@NotNull StatDataEntity[] statDataEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Query("update stat_data set isDeleted = 1, isUpload = 0 where tag = :tag and key = :key and time in (:list)")
    @Nullable
    Object markDelete(@NotNull String str, @NotNull String str2, @NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation);

    @Query("select * from stat_data where tag = :tag and key = :key and isDeleted = 1 limit :limit")
    @Nullable
    Object queryDeletedDataList(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super List<StatDataEntity>> continuation);

    @Query("select * from stat_data where tag = :tag and key = :key and isDeleted = 0 ORDER BY timeInZero desc limit 1")
    @NotNull
    Flow<StatDataEntity> queryLatestData(@NotNull String tag, @NotNull String key);

    @Query("select * from stat_data where tag = :tag and key = :key and isDeleted = 0 ORDER BY timeInZero desc limit 1")
    @Nullable
    StatDataEntity queryLatestDataSync(@NotNull String tag, @NotNull String key);

    @RawQuery
    @Nullable
    Object rawQueryStatList(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<StatDataEntity>> continuation);
}
