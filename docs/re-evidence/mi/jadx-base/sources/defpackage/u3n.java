package defpackage;

import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface u3n {
    @Query("select * from snore_report where timestamp in (:timeList) and deleted = 0 and update_time = 0 order by timestamp desc")
    List<q3n> a(List<Long> list);

    @Query("delete from snore_report")
    void b();

    @Query("select min(timestamp) from snore_report where deleted = 0 and update_time = 0 ")
    long c();
}
