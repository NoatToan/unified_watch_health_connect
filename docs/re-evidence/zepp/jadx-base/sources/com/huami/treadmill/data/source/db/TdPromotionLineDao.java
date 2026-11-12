package com.huami.treadmill.data.source.db;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.treadmill.data.TdPromotionLine;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H'J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H'J\b\u0010\u000b\u001a\u00020\u0005H'¨\u0006\f"}, d2 = {"Lcom/huami/treadmill/data/source/db/TdPromotionLineDao;", "", "", "Lcom/huami/treadmill/data/TdPromotionLine;", "lines", "", Constant.METHOD_INSERT, "Landroidx/paging/DataSource$Factory;", "", "queryLines", "queryLastLine", "deleteLins", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface TdPromotionLineDao {
    @Query("DELETE FROM tdpromotionlines ")
    void deleteLins();

    @Insert(onConflict = 1)
    void insert(@NotNull List<TdPromotionLine> lines);

    @Query("SELECT * FROM tdpromotionlines ORDER BY `index` desc limit 1 ")
    @Nullable
    TdPromotionLine queryLastLine();

    @Query("SELECT * FROM tdpromotionlines ORDER BY `index` asc ")
    @NotNull
    DataSource.Factory<Integer, TdPromotionLine> queryLines();
}
