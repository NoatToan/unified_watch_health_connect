package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\n\u001a\u00020\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH'J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\fH'J\"\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000eH'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001b\u001a\u00020\u001cH'J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH'J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\fH'J\b\u0010\u001f\u001a\u00020\u000eH'J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u0012H'J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\fH'J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\fH'J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\fH'J\b\u0010\n\u001a\u00020\u0003H'J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\r\u001a\u00020\u000eH'J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH'¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportDao;", "", "insertAll", "", "report", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "([Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;)V", "updateAll", "records", "deleteAll", "getByTime", "", "startTime", "", "endTime", "getByKey", "key", "", "getByCategory", "category", "getRecordBefore", "getNotUploadRecord", "getSpecialSportReport", "sid", "time", "getDeletedReportList", "limit", "", "getRecentOneData", "getCategoriesNotUpload", "getStartSec0TZNotUpload", "getUnUploadAndUndelete", "getUnUploadDeletedUnCount", "getUnUploadUnCount", "observerRecentCount", "Lkotlinx/coroutines/flow/Flow;", "queryPagedSportEntity", "upperTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportReportDao {
    @TestOnly
    @Query("DELETE FROM sport_report")
    void deleteAll();

    @Delete
    void deleteAll(@NotNull SportReportEntity... records);

    @Query("SELECT * FROM sport_report WHERE category = :category AND timeIn0Tz >= :startTime AND timeIn0Tz < :endTime AND isDeleted = 0 ORDER BY time DESC")
    @NotNull
    List<SportReportEntity> getByCategory(@NotNull String category, long startTime, long endTime);

    @Query("SELECT * FROM sport_report WHERE `key` = :key AND timeIn0Tz >= :startTime AND timeIn0Tz < :endTime AND isDeleted = 0 ORDER BY time DESC")
    @NotNull
    List<SportReportEntity> getByKey(@NotNull String key, long startTime, long endTime);

    @Query("SELECT * FROM sport_report WHERE timeIn0Tz >= :startTime AND timeIn0Tz < :endTime AND isDeleted = 0 ORDER BY time DESC")
    @NotNull
    List<SportReportEntity> getByTime(long startTime, long endTime);

    @Query("select distinct category from sport_report where isUpload = 0 and isDeleted = 0")
    @NotNull
    List<String> getCategoriesNotUpload();

    @Query("SELECT * FROM sport_report WHERE isDeleted = 1 LIMIT :limit")
    @NotNull
    List<SportReportEntity> getDeletedReportList(int limit);

    @Query("SELECT * FROM sport_report WHERE isUpload = 0")
    @NotNull
    List<SportReportEntity> getNotUploadRecord();

    @Query("SELECT * FROM sport_report WHERE isDeleted = 0 AND time < :endTime ORDER BY time desc LIMIT 1")
    @Nullable
    SportReportEntity getRecentOneData(long endTime);

    @Query("SELECT * FROM sport_report WHERE category= :category AND timeIn0Tz <= :endTime AND isDeleted = 0 ORDER BY time DESC")
    @NotNull
    List<SportReportEntity> getRecordBefore(@NotNull String category, long endTime);

    @Query("SELECT * FROM sport_report WHERE `key` = :key AND sid = :sid AND time = :time")
    @Nullable
    SportReportEntity getSpecialSportReport(@NotNull String sid, @NotNull String key, long time);

    @Query("select min(timeIn0Tz) from sport_report where isUpload = 0 and isDeleted = 0")
    long getStartSec0TZNotUpload();

    @Query("SELECT * FROM sport_report WHERE isUpload = 0 and isDeleted = 0")
    @NotNull
    List<SportReportEntity> getUnUploadAndUndelete();

    @Query("SELECT * FROM sport_report WHERE isUpload = 0 and category = :category and isDeleted = 0")
    @NotNull
    List<SportReportEntity> getUnUploadAndUndelete(@NotNull String category);

    @Query("SELECT * FROM sport_report WHERE isUpload = 0 and isDeleted = 1 and offlineCounted = 0")
    @NotNull
    List<SportReportEntity> getUnUploadDeletedUnCount();

    @Query("SELECT * FROM sport_report WHERE isUpload = 0 and offlineCounted = 0 and isDeleted = 0")
    @NotNull
    List<SportReportEntity> getUnUploadUnCount();

    @Insert(onConflict = 1)
    void insertAll(@NotNull SportReportEntity... report);

    @Query("select count(*) FROM sport_report WHERE timeIn0Tz >= :startTime AND isDeleted = 0")
    @NotNull
    Flow<Integer> observerRecentCount(long startTime);

    @Query("select * from sport_report where timeIn0Tz < :upperTime order by timeIn0Tz desc limit :limit")
    @NotNull
    List<SportReportEntity> queryPagedSportEntity(long upperTime, int limit);

    @Update
    void updateAll(@NotNull SportReportEntity... records);
}
