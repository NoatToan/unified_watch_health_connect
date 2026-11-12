package rd2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static SQLiteDatabase b() {
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            return aVarB.f144484a;
        }
        return null;
    }

    public static String c(Cursor cursor, int i14) {
        if (cursor.isNull(i14)) {
            return null;
        }
        return cursor.getString(i14);
    }
}
