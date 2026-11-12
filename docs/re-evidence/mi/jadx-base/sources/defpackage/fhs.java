package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.push.Cif;
import com.xiaomi.push.i;

/* JADX INFO: loaded from: classes11.dex */
public class fhs extends ths.d {
    public String i;

    public fhs(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.i = str2;
    }

    public static fhs i(Context context, String str, Cif cif) {
        byte[] bArrE = i.e(cif);
        if (bArrE == null || bArrE.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", cif.d());
        contentValues.put("messageItem", bArrE);
        contentValues.put(q.f13858b, yfs.b(context).l());
        contentValues.put("packageName", yfs.b(context).d());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new fhs(str, contentValues, "a job build to insert message to db");
    }
}
