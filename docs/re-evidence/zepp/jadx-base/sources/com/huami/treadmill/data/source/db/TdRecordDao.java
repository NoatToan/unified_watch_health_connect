package com.huami.treadmill.data.source.db;

import androidx.p008lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.treadmill.data.TdRecord;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\tH'¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/data/source/db/TdRecordDao;", "", "Lcom/huami/treadmill/data/TdRecord;", "tdRecord", "", Constant.METHOD_INSERT, "", "records", "delete", "Landroidx/lifecycle/LiveData;", "query", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface TdRecordDao {
    @Delete
    void delete(@NotNull List<TdRecord> records);

    @Insert(onConflict = 1)
    void insert(@NotNull TdRecord tdRecord);

    @Query("SELECT * FROM td_record")
    @NotNull
    LiveData<List<TdRecord>> query();
}
