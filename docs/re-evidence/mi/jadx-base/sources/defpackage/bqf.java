package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface bqf {
    @Query("select min(date_num) as minTime, max(date_num) as maxTime from record_menstruate where deleted = 0 and update_time = 0")
    TimeInfo a();

    @Query("select * from record_menstruate where date_num between :beginTime and :endTime and update_time = 0 and deleted = 0 order by date_num desc")
    List<aqf> b(long j, long j2);

    @Query("select * from record_menstruate where deleted =0 and status = 1 order by date_num desc limit 1")
    aqf c();

    @Delete
    void delete(List<aqf> list);
}
