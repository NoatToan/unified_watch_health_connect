package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface jao {
    @Query("SELECT min(timestamp) as minTime, max(timestamp) as maxTime FROM stand_record WHERE update_time = 0 AND deleted = 0")
    TimeInfo a();

    @Delete
    void delete(List<iao> list);

    @Query("SELECT * FROM stand_record WHERE timestamp BETWEEN :startTime And :endTime AND deleted = 0 and update_time = 0 ORDER BY timestamp DESC")
    List<iao> queryStandRecords(long j, long j2);
}
