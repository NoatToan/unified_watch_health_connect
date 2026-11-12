package com.xiaomi.fitness.habit.persist.dao;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.room.Query;
import com.example.habit.export.Habit;
import com.xiaomi.fitness.database.BaseDao;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/habit/persist/dao/HabitDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/example/habit/export/Habit;", "list", "", CervicalMucusRecord.Appearance.CLEAR, "", "deleteById", "typeId", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HabitDao extends BaseDao<Habit> {
    @Query("DELETE FROM habit")
    void clear();

    @Query("DELETE FROM habit WHERE typeId=:typeId")
    void deleteById(long typeId);

    @Query("SELECT * FROM habit ORDER BY type DESC")
    @NotNull
    List<Habit> list();
}
