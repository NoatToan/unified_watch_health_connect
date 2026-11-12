package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface u3c {
    @Query("select min(timestamp) as minTime, max(timestamp) as maxTime from record_weight where deleted = 0 and update_time = 0 and weight > 0")
    TimeInfo a();

    @Query("SELECT * FROM record_weight WHERE deleted = 0 AND weight > 0 and timestamp between :beginTime and :endTime and update_time = 0")
    List<d4c> b(long j, long j2);

    @Delete
    void delete(List<d4c> list);
}
