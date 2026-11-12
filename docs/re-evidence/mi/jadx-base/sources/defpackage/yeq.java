package defpackage;

import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface yeq {
    @Query("select * from weight order by recordTime desc")
    List<xwf> a();

    @Query("select * from height order by recordTime desc limit 1")
    vuf b();
}
