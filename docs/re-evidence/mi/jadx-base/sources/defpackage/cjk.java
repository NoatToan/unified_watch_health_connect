package defpackage;

import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface cjk {
    @Query("DELETE FROM reminder_notice_mapping WHERE notice_id = :noticeId")
    void a(String str);

    @Insert(onConflict = 1)
    void b(bjk... bjkVarArr);

    @Query("SELECT * FROM reminder_notice_mapping")
    List<bjk> c();
}
