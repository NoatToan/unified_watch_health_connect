package com.huami.pai.db.dao;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.TypeConverters;
import com.huami.pai.db.DayDateConverter;
import com.huami.pai.db.po.Pai;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/huami/pai/db/dao/PaiDao;", "", "Lcom/huami/pai/db/po/Pai;", "pai", "", "insertPai", "Ljava/util/Date;", "day", "Landroidx/lifecycle/LiveData;", "queryPai", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PaiDao {
    @Insert(onConflict = 1)
    void insertPai(@NotNull Pai pai);

    @Query("SELECT * FROM Pai WHERE date == :day")
    @NotNull
    LiveData<Pai> queryPai(@TypeConverters({DayDateConverter.class}) @NotNull Date day);
}
