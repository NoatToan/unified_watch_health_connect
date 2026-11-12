package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface q5c {
    @Query("select min(timestamp) as minTime, max(timestamp) as maxTime from heart_rate where deleted = 0 and hrm_ype = 'HRM_ONCE' and hrm > 0 and update_time = 0 ")
    TimeInfo a();

    @Query("select * from heart_rate where deleted = 0 and hrm_ype = 'HRM_ONCE' and hrm > 0 and update_time = 0 and (device_type = 'PHONE' or device_type = 'MANUAL') and timestamp between :start and :end")
    List<f6c> b(long j, long j2);

    @Delete
    void delete(List<f6c> list);
}
