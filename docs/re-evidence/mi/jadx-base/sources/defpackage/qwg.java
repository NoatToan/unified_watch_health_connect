package defpackage;

import androidx.room.Insert;
import androidx.room.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface qwg {
    @Query("DELETE FROM notice WHERE notice_id = :noticeId")
    void a(String str);

    @Insert(onConflict = 1)
    void b(owg... owgVarArr);

    @Query("SELECT * FROM notice WHERE notice_id = :nid")
    owg c(String str);
}
