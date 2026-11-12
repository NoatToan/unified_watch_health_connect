package defpackage;

import android.database.Cursor;
import com.huawei.android.hicloud.sync.c.a.b.e;

/* JADX INFO: loaded from: classes23.dex */
public class bci extends e<bcc> {
    public void e() {
        bcw.c("PreRecordOperator", "clearAll");
        try {
            a("DELETE FROM pre_records", (String[]) null);
        } catch (Exception e) {
            bcw.d("PreRecordOperator", "clearAll error " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.android.hicloud.sync.c.a.b.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bcc a(Cursor cursor) {
        bcc bccVar = new bcc();
        bccVar.d(cursor.getString(0));
        bccVar.c(cursor.getString(1));
        bccVar.e(cursor.getInt(2));
        bccVar.d(cursor.getLong(3));
        bccVar.b(cursor.getLong(4));
        bccVar.e(cursor.getString(5));
        bccVar.a(cursor.getInt(6));
        return bccVar;
    }
}
