package com.huami.pai.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.TypeConverters;
import com.huami.pai.db.DayDateConverter;
import com.huami.pai.db.po.FitnessAge;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\r\u001a\u00020\u0005H'¨\u0006\u000e"}, d2 = {"Lcom/huami/pai/db/dao/FitnessAgeDao;", "", "", "Lcom/huami/pai/db/po/FitnessAge;", "ages", "", "insertAges", "Ljava/util/Date;", "startDate", "endDate", "Landroidx/lifecycle/LiveData;", "queryAges", "queryAllAges", "deleteAllAges", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface FitnessAgeDao {
    @Query("DELETE FROM FitnessAge")
    void deleteAllAges();

    @Insert(onConflict = 1)
    void insertAges(@NotNull List<FitnessAge> ages);

    @Query("SELECT * FROM FitnessAge WHERE date >= :startDate AND date <= :endDate ORDER BY date")
    @NotNull
    LiveData<List<FitnessAge>> queryAges(@TypeConverters({DayDateConverter.class}) @NotNull Date startDate, @TypeConverters({DayDateConverter.class}) @NotNull Date endDate);

    @Query("SELECT * FROM FitnessAge")
    @NotNull
    List<FitnessAge> queryAllAges();
}
