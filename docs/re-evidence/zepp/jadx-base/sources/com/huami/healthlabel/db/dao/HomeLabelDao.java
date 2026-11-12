package com.huami.healthlabel.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.healthlabel.db.po.HomeLabel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\r\u001a\u00020\u0005H'¨\u0006\u000e"}, d2 = {"Lcom/huami/healthlabel/db/dao/HomeLabelDao;", "", "", "Lcom/huami/healthlabel/db/po/HomeLabel;", "labels", "", "insertLabel", "", "showHome", "queryLabel", "Landroidx/lifecycle/LiveData;", "queryAllLabel", "queryAllLabelList", "deleteAllLabel", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public interface HomeLabelDao {
    @Query("delete from home_label")
    void deleteAllLabel();

    @Insert(onConflict = 1)
    void insertLabel(@NotNull List<HomeLabel> labels);

    @Query("select * from home_label")
    @NotNull
    LiveData<List<HomeLabel>> queryAllLabel();

    @Query("select * from home_label")
    @NotNull
    List<HomeLabel> queryAllLabelList();

    @Query("select * from home_label where showInHome ==:showHome")
    @NotNull
    List<HomeLabel> queryLabel(boolean showHome);
}
