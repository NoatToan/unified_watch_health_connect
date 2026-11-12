package defpackage;

import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface szm {
    @Query("SELECT min(begin_time) as minTime, max(begin_time) as maxTime FROM record_sleep WHERE deleted=0 AND update_time = 0")
    TimeInfo a();

    @Query("delete from record_sleep")
    void b();

    @Query("SELECT * FROM record_sleep WHERE deleted=0 AND end_time BETWEEN :startTime AND :endTime AND update_time = 0 and stage > 0 order by end_time desc")
    List<yzm> c(long j, long j2);

    @Query("SELECT * FROM record_sleep WHERE deleted=0 AND end_time >= :time and segEnd = 1 AND update_time = 0 and stage > 0 order by end_time asc limit 1 ")
    yzm d(long j);
}
