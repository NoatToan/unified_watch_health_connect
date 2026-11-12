package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Query;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0007"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/UnitDao;", "", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "", "getIfRawExistsFlow", "core_release"}, k = 1, mv = {1, 5, 1})
public interface UnitDao {
    @Query("SELECT EXISTS(SELECT * FROM odi INNER JOIN click_measured_spo2 ON odi.userId = click_measured_spo2.userId INNER JOIN osa_event on odi.userId = osa_event.userId INNER JOIN osa_process on odi.userId = osa_process.userId WHERE odi.userId = :userId)")
    @NotNull
    Flow<Boolean> getIfRawExistsFlow(@NotNull String userId);
}
