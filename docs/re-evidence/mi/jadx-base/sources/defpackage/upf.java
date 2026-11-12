package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface upf {
    @Query("select * from menstruation where date_num between :beginTime and :endTime order by date_num desc")
    List<zpf> a(long j, long j2);

    @Query("select min(date_num) from menstruation")
    long b();

    @Delete
    void delete(List<zpf> list);
}
