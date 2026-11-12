package com.xiaomi.fitness.sport_eco_manager_export.listener;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.database.BaseDao;
import defpackage.mcn;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SCMDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lmcn;", "sportConfigModel", "", "addOrUpdateSportConfigModel", "(Lmcn;)V", "", DailyRecordKey.sportType, "getSportConfigModel", "(I)Lmcn;", "deleteSportConfigModel", "", "getAllSportConfigModel", "()Ljava/util/List;", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0})
public interface SCMDao extends BaseDao<mcn> {
    @Insert(onConflict = 1)
    void addOrUpdateSportConfigModel(@NotNull mcn sportConfigModel);

    @Delete
    void deleteSportConfigModel(@NotNull mcn sportConfigModel);

    @Query("select * from eco_scm_table")
    @NotNull
    List<mcn> getAllSportConfigModel();

    @Query("SELECT * from eco_scm_table WHERE sportType = :sportType")
    @Nullable
    mcn getSportConfigModel(int sportType);
}
