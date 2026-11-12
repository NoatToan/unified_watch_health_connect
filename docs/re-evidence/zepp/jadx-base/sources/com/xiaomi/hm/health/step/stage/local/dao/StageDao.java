package com.xiaomi.hm.health.step.stage.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.step.stage.local.entity.StageEntity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H'¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/local/dao/StageDao;", "", "", "Lcom/xiaomi/hm/health/step/stage/local/entity/StageEntity;", "stages", "", Constant.METHOD_INSERT, "", "userId", "getNeedUploadData", "date", "query", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface StageDao {
    @Query("SELECT * FROM activity_stage WHERE userId = :userId AND uploaded = 0")
    @NotNull
    List<StageEntity> getNeedUploadData(@NotNull String userId);

    @Insert(onConflict = 1)
    @NotNull
    long[] insert(@NotNull List<StageEntity> stages);

    @Query("SELECT * FROM activity_stage WHERE userId = :userId AND date = :date ORDER BY date DESC LIMIT 1")
    @Nullable
    StageEntity query(@NotNull String userId, @NotNull String date);
}
