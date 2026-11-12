package com.huami.femalehealth.logiclib.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\b\u0010\b\u001a\u00020\u0004H'¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/DeleteHistoryDao;", "", "Lcom/huami/femalehealth/logiclib/db/po/DeletedMenstruationSection;", "delRecords", "", Constant.METHOD_INSERT, "", "findAll", "clearAll", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public interface DeleteHistoryDao {
    @Query("DELETE  FROM  DeletedMenstruationSection")
    void clearAll();

    @Query("SELECT * FROM DeletedMenstruationSection")
    @NotNull
    List<DeletedMenstruationSection> findAll();

    @Insert(onConflict = 5)
    void insert(@NotNull DeletedMenstruationSection delRecords);
}
