package com.huami.training.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.training.api.WebConst;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.FilterTraining;
import com.huami.training.db.po.Training;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000fH'J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H'J\b\u0010\u0014\u001a\u00020\u0005H'¨\u0006\u0015"}, d2 = {"Lcom/huami/training/db/dao/FilterDao;", "", "", "Lcom/huami/training/db/po/FilterTraining;", "trainings", "", "insertFilterTrainings", "", WebConst.QueryParam.FILTER_MODE, "filterOrder", "deleteByFilterType", "Landroidx/paging/DataSource$Factory;", "", "Lcom/huami/training/db/po/Training;", "queryFilterTrainings", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/db/po/FilterMode;", "queryFilterMode", "filterModes", "insertFilterMode", "clearFilterModes", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface FilterDao {
    @Query("DELETE FROM FilterMode")
    void clearFilterModes();

    @Query("DELETE FROM FilterTraining WHERE filterMode = :filterMode AND filterOrder = :filterOrder")
    void deleteByFilterType(@NotNull String filterMode, @NotNull String filterOrder);

    @Insert(onConflict = 1)
    void insertFilterMode(@NotNull List<FilterMode> filterModes);

    @Insert(onConflict = 1)
    void insertFilterTrainings(@NotNull List<FilterTraining> trainings);

    @Query("SELECT * FROM FilterMode")
    @NotNull
    LiveData<List<FilterMode>> queryFilterMode();

    @Query("SELECT Training.id, listImage, name, difficulty, contentCount, consumption, participants, type, label FROM Training INNER JOIN FilterTraining WHERE filterMode = :filterMode AND filterOrder = :filterOrder AND Training.id = trainingId ORDER BY FilterTraining.id")
    @NotNull
    DataSource.Factory<Integer, Training> queryFilterTrainings(@NotNull String filterMode, @NotNull String filterOrder);
}
