package com.huami.femalehealth.logiclib.db.dao;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH'J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH'J.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH'J.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\b\u0010\u0015\u001a\u00020\u0004H'¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/HistoryDao;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", BraceletHandler.H5_PARAM_BACK_KEY_HISTORY, "", Constant.METHOD_INSERT, "", "insertAll", "Landroidx/paging/DataSource$Factory;", "", "findAll", "findEndingAll", "year", "month", "", "offsetDateTime", "findByMonth", "findEndingByMonth", "Lcom/huami/femalehealth/logiclib/db/dao/HistoryBean;", "testHistory2Date", "findAllEntity", "deleteAll", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public interface HistoryDao {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ DataSource.Factory findByMonth$default(HistoryDao historyDao, int i, int i2, long j, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findByMonth");
            }
            if ((i3 & 4) != 0) {
                j = MenstruationHistory.INSTANCE.getOffsetDateTime();
            }
            return historyDao.findByMonth(i, i2, j);
        }

        public static /* synthetic */ DataSource.Factory findEndingByMonth$default(HistoryDao historyDao, int i, int i2, long j, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findEndingByMonth");
            }
            if ((i3 & 4) != 0) {
                j = MenstruationHistory.INSTANCE.getOffsetDateTime();
            }
            return historyDao.findEndingByMonth(i, i2, j);
        }
    }

    @Query("delete From MenstruationHistory")
    void deleteAll();

    @Query("SELECT * FROM MenstruationHistory ORDER BY menstrualPeriod DESC")
    @NotNull
    DataSource.Factory<Integer, MenstruationHistory> findAll();

    @Query("SELECT * FROM MenstruationHistory")
    @NotNull
    List<MenstruationHistory> findAllEntity();

    @Query("SELECT * FROM MenstruationHistory WHERE CAST(strftime('%Y',datetime((menstrualPeriod + :offsetDateTime)/1000, 'unixepoch')) AS int) = :year And CAST(strftime('%m',datetime((menstrualPeriod + :offsetDateTime)/1000, 'unixepoch')) AS int) = :month")
    @NotNull
    DataSource.Factory<Integer, MenstruationHistory> findByMonth(int year, int month, long offsetDateTime);

    @Query("SELECT * FROM MenstruationHistory WHERE isEnd = 1 ORDER BY menstrualPeriod DESC")
    @NotNull
    DataSource.Factory<Integer, MenstruationHistory> findEndingAll();

    @Query("SELECT * FROM MenstruationHistory WHERE CAST(strftime('%Y',datetime((menstrualPeriod + :offsetDateTime)/1000, 'unixepoch')) AS int) = :year And CAST(strftime('%m',datetime((menstrualPeriod + :offsetDateTime)/1000, 'unixepoch')) AS int) = :month And isEnd = 1")
    @NotNull
    DataSource.Factory<Integer, MenstruationHistory> findEndingByMonth(int year, int month, long offsetDateTime);

    @Insert(onConflict = 5)
    void insert(@NotNull MenstruationHistory history);

    @Insert(onConflict = 5)
    void insertAll(@NotNull List<MenstruationHistory> history);

    @Query("SELECT CAST(strftime('%Y',datetime(menstrualPeriod/1000, 'unixepoch')) AS int) as year,CAST(strftime('%m',datetime(menstrualPeriod/1000, 'unixepoch')) AS int) as month , CAST(strftime('%d',datetime(menstrualPeriod/1000, 'unixepoch')) AS string) as day , CAST(strftime('%H %M %S %s',datetime(menstrualPeriod/1000, 'unixepoch')) AS string) as time FROM MenstruationHistory where id > 0")
    @NotNull
    List<HistoryBean> testHistory2Date();
}
