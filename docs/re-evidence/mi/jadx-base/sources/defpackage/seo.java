package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface seo {
    @Query("select min(begin_time) as minTime, max(begin_time) as maxTime from record_step where update_time = 0 and deleted = 0")
    TimeInfo a();

    @Query("select * from record_step where ((end_time >= :beginTime and end_time < :endTime) or (begin_time < :endTime and end_time > :endTime)) and update_time = 0 and deleted = 0 order by begin_time desc ")
    List<b2c> b(long j, long j2);

    @Delete
    void delete(List<b2c> list);
}
