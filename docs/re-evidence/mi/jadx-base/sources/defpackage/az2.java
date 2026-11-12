package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface az2 {
    @Query("select min(timestamp) as minTime, max(timestamp) as maxTime from record_blood_pressure where update_time = 0 and deleted = 0")
    TimeInfo a();

    @Query("SELECT * FROM record_blood_pressure WHERE timestamp BETWEEN :begin And :end AND deleted = 0 and update_time = 0 ORDER BY timestamp DESC")
    List<wz2> b(long j, long j2);

    @Delete
    void delete(List<wz2> list);
}
