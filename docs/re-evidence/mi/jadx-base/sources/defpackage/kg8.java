package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface kg8 {
    @Query("select min(begin_time) as minTime, max(begin_time) as maxTime from record_exercise where update_time = 0 and deleted = 0")
    TimeInfo a();

    @Query("select * from record_exercise where ((end_time >= :beginTime and end_time < :endTime) or (begin_time < :endTime and end_time > :endTime)) and update_time = 0 and deleted = 0 order by begin_time desc")
    List<ExerciseRecord> b(long j, long j2);

    @Delete
    void delete(List<ExerciseRecord> list);
}
