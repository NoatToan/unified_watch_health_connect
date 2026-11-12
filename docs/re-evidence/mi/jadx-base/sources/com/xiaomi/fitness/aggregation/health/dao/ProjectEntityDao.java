package com.xiaomi.fitness.aggregation.health.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004H§@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004H§@¢\u0006\u0002\u0010\rJ$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H§@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00162\u0006\u0010\u0010\u001a\u00020\u0011H'J \u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0013H'J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H'J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDao;", "", "rawQueryProjectList", "", "Lcom/xiaomi/fitness/aggregation/health/entity/ProjectEntity;", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawQueryProjectListSync", "insert", "", "items", "", "([Lcom/xiaomi/fitness/aggregation/health/entity/ProjectEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "markDelete", "key", "", "list", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryLatestData", "Lkotlinx/coroutines/flow/Flow;", "queryLatestDataBefore", "time", "queryDataValid", "queryNotUpProjectReportEntityList", "queryDeletedDataList", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProjectEntityDao {
    @Delete
    @Nullable
    Object delete(@NotNull ProjectEntity[] projectEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insert(@NotNull ProjectEntity[] projectEntityArr, @NotNull Continuation<? super Unit> continuation);

    @Query("update data_project set isDeleted = 1, isUpload = 0 where key = :key and time in (:list)")
    @Nullable
    Object markDelete(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation);

    @Query("select * from data_project where key = :key ORDER BY timeInZero desc limit 1")
    @Nullable
    ProjectEntity queryDataValid(@NotNull String key);

    @Query("select * from data_project where isDeleted = 1 limit :limit")
    @Nullable
    Object queryDeletedDataList(int i, @NotNull Continuation<? super List<ProjectEntity>> continuation);

    @Query("select * from data_project where key = :key and isDeleted = 0 ORDER BY timeInZero desc limit 1")
    @NotNull
    Flow<ProjectEntity> queryLatestData(@NotNull String key);

    @Query("select * from data_project where key = :key and timeInZero < :time and isDeleted = 0 ORDER BY timeInZero desc limit 1")
    @NotNull
    Flow<ProjectEntity> queryLatestDataBefore(@NotNull String key, long time);

    @Query("select * from data_project where isUpload = 0 order by timeInZero desc limit 30")
    @NotNull
    List<ProjectEntity> queryNotUpProjectReportEntityList();

    @RawQuery
    @Nullable
    Object rawQueryProjectList(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<ProjectEntity>> continuation);

    @RawQuery
    @NotNull
    List<ProjectEntity> rawQueryProjectListSync(@NotNull SupportSQLiteQuery query);
}
