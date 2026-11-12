package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.entity.StepDetail;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ydo {
    @Query("select min(beginTime) as minTime, max(beginTime) as maxTime from step_detail where deleted = 0 and steps > 0")
    TimeInfo a();

    @Query("SELECT * FROM step_detail WHERE ((endTime >= :beginTime AND endTime <= :endTime) OR (beginTime < :endTime AND endTime > :endTime)) AND deleted = 0  AND steps > 0 ORDER BY beginTime DESC ")
    List<StepDetail> b(long j, long j2);

    @Delete
    void delete(List<StepDetail> list);
}
