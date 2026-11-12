package defpackage;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface njk {
    @Query("DELETE FROM reminder WHERE reminder_id = :remindId")
    void a(String str);

    @Insert(onConflict = 1)
    void b(mjk... mjkVarArr);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value = :timeline AND (:updateTime - last_remind_time >= remind_interval)")
    List<mjk> c(int i, long j);

    @Update
    void d(mjk mjkVar);

    @Query("SELECT * FROM REMINDER WHERE reminder_id = :remindId")
    mjk e(String str);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value = :timeline AND reminder_id = :reminderId")
    mjk f(int i, String str);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value >= :timeline")
    LiveData<List<mjk>> g(int i);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 2 AND timed_value > :timeline ORDER BY timed_value LIMIT :count")
    List<mjk> h(int i, int i2);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 1 AND event_value = :event AND (:updateTime - last_remind_time >= remind_interval)")
    List<mjk> i(String str, long j);

    @Query("SELECT * FROM reminder WHERE active = 1 AND type = 1 AND event_value = :event AND reminder_id = :reminderId")
    mjk j(String str, String str2);
}
