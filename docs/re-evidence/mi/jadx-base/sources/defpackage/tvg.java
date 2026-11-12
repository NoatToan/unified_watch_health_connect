package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface tvg {
    @Query("select min(timestamp) as minTime, max(timestamp) as maxTime from record_noise where update_time = 0 and deleted = 0")
    TimeInfo a();

    @Query("SELECT * FROM record_noise WHERE deleted = 0 and update_time = 0 and timestamp < :timeUpper ORDER BY timestamp DESC limit :limit")
    List<yvg> b(long j, int i);

    @Delete
    void delete(List<yvg> list);
}
