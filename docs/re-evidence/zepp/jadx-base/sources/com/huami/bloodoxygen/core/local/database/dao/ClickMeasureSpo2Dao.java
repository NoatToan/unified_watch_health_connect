package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H'J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H'J\u0016\u0010\u0010\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J,\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H'J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H'J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u001d"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/ClickMeasureSpo2Dao;", "", "", "userId", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "getShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getShouldUploadFlow", "from", "to", "getRangeLatestFlow", "getLatest", "getLatestFlow", "clickSpo2", "", Constant.METHOD_INSERT, "clickSpo2List", "", "getFlow", "query", "", "clear", "", "min", "max", "clearInvalid", "", "getIfRawExistsFlow", "core_release"}, k = 1, mv = {1, 5, 1})
public interface ClickMeasureSpo2Dao {
    @Query("DELETE FROM click_measured_spo2 WHERE userId = :userId")
    void clear(@NotNull String userId);

    @Query("DELETE FROM click_measured_spo2 WHERE userId = :userId AND (spo2 < :min OR spo2 > :max)")
    void clearInvalid(@NotNull String userId, int min, int max);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId AND date BETWEEN :from AND :to ORDER BY date")
    @NotNull
    Flow<List<ClickMeasuredSpo2>> getFlow(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT EXISTS (SELECT * FROM click_measured_spo2 WHERE userId = :userId)")
    @NotNull
    Flow<Boolean> getIfRawExistsFlow(@NotNull String userId);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId ORDER BY date DESC LIMIT 1")
    @Nullable
    ClickMeasuredSpo2 getLatest(@NotNull String userId);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId ORDER BY date DESC LIMIT 1")
    @NotNull
    Flow<ClickMeasuredSpo2> getLatestFlow(@NotNull String userId);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId AND date BETWEEN :from AND :to ORDER BY date DESC LIMIT 1")
    @NotNull
    Flow<ClickMeasuredSpo2> getRangeLatestFlow(@NotNull String userId, @NotNull String from, @NotNull String to);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId AND uploaded = 0")
    @NotNull
    List<ClickMeasuredSpo2> getShouldUpload(@NotNull String userId);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId AND uploaded = 0")
    @NotNull
    Flow<List<ClickMeasuredSpo2>> getShouldUploadFlow(@NotNull String userId);

    @Insert(onConflict = 1)
    long insert(@NotNull ClickMeasuredSpo2 clickSpo2);

    @Insert(onConflict = 1)
    @NotNull
    long[] insert(@NotNull List<ClickMeasuredSpo2> clickSpo2List);

    @Query("SELECT * FROM click_measured_spo2 WHERE userId = :userId AND date BETWEEN :from AND :to ORDER BY date")
    @NotNull
    List<ClickMeasuredSpo2> query(@NotNull String userId, @NotNull String from, @NotNull String to);
}
