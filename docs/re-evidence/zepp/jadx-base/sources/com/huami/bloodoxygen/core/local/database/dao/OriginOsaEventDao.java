package com.huami.bloodoxygen.core.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaEventDao;", "", "", "userId", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "getShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getShouldUploadFlow", "osaEvent", "", Constant.METHOD_INSERT, "from", "to", "queryOriginOsaEvents", "core_release"}, k = 1, mv = {1, 5, 1})
public interface OriginOsaEventDao {
    @Query("SELECT * FROM origin_osa_event WHERE userId = :userId AND uploaded = 0")
    @NotNull
    List<OriginOsaEvent> getShouldUpload(@NotNull String userId);

    @Query("SELECT * FROM origin_osa_event WHERE userId = :userId AND uploaded = 0")
    @NotNull
    Flow<List<OriginOsaEvent>> getShouldUploadFlow(@NotNull String userId);

    @Insert(onConflict = 1)
    @NotNull
    long[] insert(@NotNull List<OriginOsaEvent> osaEvent);

    @Query("SELECT * FROM origin_osa_event WHERE userId = :userId AND date BETWEEN :from AND :to")
    @NotNull
    List<OriginOsaEvent> queryOriginOsaEvents(@NotNull String userId, @NotNull String from, @NotNull String to);
}
