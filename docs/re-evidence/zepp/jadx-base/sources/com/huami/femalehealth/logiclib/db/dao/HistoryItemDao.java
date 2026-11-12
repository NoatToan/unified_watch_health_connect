package com.huami.femalehealth.logiclib.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/HistoryItemDao;", "", "", "clear", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "list", "addAllInternal", "findAll", "addAll", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public interface HistoryItemDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Transaction
        public static void addAll(@NotNull HistoryItemDao historyItemDao, @NotNull List<HistoryItemBean> list) {
            historyItemDao.clear();
            historyItemDao.addAllInternal(list);
        }
    }

    @Transaction
    void addAll(@NotNull List<HistoryItemBean> list);

    @Insert(onConflict = 1)
    void addAllInternal(@NotNull List<HistoryItemBean> list);

    @Query("DELETE  FROM  HistoryItemBean")
    void clear();

    @Query("SELECT * FROM HistoryItemBean ORDER BY menstrualPeriod DESC")
    @NotNull
    List<HistoryItemBean> findAll();
}
