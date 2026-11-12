package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface slb {
    @Query("select min(timestamp) as minTime, max(timestamp) as maxTime from record_head_set where update_time = 0 and deleted = 0")
    TimeInfo a();

    @Query("SELECT * FROM record_head_set WHERE deleted = 0 and update_time = 0 and end_time < :timeUpper ORDER BY end_time DESC limit :limit")
    List<xlb> b(long j, int i);

    @Delete
    void delete(List<xlb> list);
}
