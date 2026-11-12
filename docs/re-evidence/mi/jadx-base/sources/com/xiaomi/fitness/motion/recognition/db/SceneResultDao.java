package com.xiaomi.fitness.motion.recognition.db;

import androidx.lifecycle.LiveData;
import androidx.room.Query;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.motion.recognition.db.entity.SceneResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/SceneResultDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "queryResults", "", "startTime", "", "endTime", "list", "", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllNoCompleteResults", "queryPossibleResults", "Landroidx/lifecycle/LiveData;", "delete", "", "actType", "", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SceneResultDao extends BaseDao<SceneResult> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object list(@NotNull SceneResultDao sceneResultDao, long j, long j2, @NotNull Continuation<? super List<SceneResult>> continuation) {
            return sceneResultDao.list(new SimpleSQLiteQuery("SELECT * FROM scene_result WHERE start >= :startTime AND `end`<=:endTime ORDER BY start"), continuation);
        }

        @Nullable
        public static Object list(@NotNull SceneResultDao sceneResultDao, @NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<SceneResult>> continuation) {
            return new ArrayList();
        }
    }

    @Query("DELETE FROM scene_result WHERE start = :startTime AND act_type=:actType")
    void delete(long startTime, int actType);

    @Nullable
    Object list(long j, long j2, @NotNull Continuation<? super List<SceneResult>> continuation);

    @Override // com.xiaomi.fitness.database.BaseDao
    @Nullable
    Object list(@NotNull SupportSQLiteQuery supportSQLiteQuery, @NotNull Continuation<? super List<SceneResult>> continuation);

    @Query("SELECT * FROM scene_result WHERE start >=:startTime AND `end` <=:endTime AND complete = 0 ORDER BY start")
    @NotNull
    List<SceneResult> queryAllNoCompleteResults(long startTime, long endTime);

    @Query("SELECT * FROM scene_result WHERE start>=:startTime AND `end` <=:endTime AND possible = 1 ORDER BY start DESC")
    @NotNull
    LiveData<List<SceneResult>> queryPossibleResults(long startTime, long endTime);

    @Query("SELECT * FROM scene_result WHERE start >= :startTime AND `end`<=:endTime ORDER BY start")
    @NotNull
    List<SceneResult> queryResults(long startTime, long endTime);
}
