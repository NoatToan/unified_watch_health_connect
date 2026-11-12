package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H'J\"\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH'J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H'J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H'J\b\u0010\u0013\u001a\u00020\u000eH'J\b\u0010\u0014\u001a\u00020\u000eH'J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryDao;", "", "getTotalSummary", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryEntity;", "category", "", "getTotalSummaries", "", "categories", "getSummary", "dimen", "time0TZ", "", "insertSummary", "", "summary", "updateSummary", "", "deleteSummary", "deleteTotalSummary", "clearSummary", "getSummaryByTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportSummaryDao {
    @Query("delete from sport_summary")
    void clearSummary();

    @Query("delete from sport_summary where dimen = :dimen and category = :category")
    void deleteSummary(@NotNull String category, @NotNull String dimen);

    @Query("delete from sport_summary where dimen = 'total'")
    void deleteTotalSummary();

    @Query("select * from sport_summary where category = :category and dimen = :dimen and timeIn0TZ = :time0TZ")
    @Nullable
    SportSummaryEntity getSummary(@NotNull String category, @NotNull String dimen, long time0TZ);

    @Query("select * from sport_summary where category = :category and dimen = :dimen and timeIn0TZ = :time0TZ")
    @Nullable
    SportSummaryEntity getSummaryByTime(@NotNull String category, @NotNull String dimen, long time0TZ);

    @Query("select * from sport_summary where dimen = 'total' and category in (:categories) ")
    @NotNull
    List<SportSummaryEntity> getTotalSummaries(@NotNull List<String> categories);

    @Query("select * from sport_summary where category = :category and dimen = 'total' ")
    @Nullable
    SportSummaryEntity getTotalSummary(@NotNull String category);

    @Insert(onConflict = 1)
    long insertSummary(@NotNull SportSummaryEntity summary);

    @Insert(onConflict = 1)
    void insertSummary(@NotNull List<SportSummaryEntity> summary);

    @Update
    int updateSummary(@NotNull SportSummaryEntity summary);
}
