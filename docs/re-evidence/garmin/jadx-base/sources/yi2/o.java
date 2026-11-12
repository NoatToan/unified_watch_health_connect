package yi2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f197434a;

    public o(ContentResolver contentResolver) {
        this.f197434a = contentResolver;
    }

    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static String b(Cursor cursor, String str) {
        try {
            String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
            return !TextUtils.isEmpty(string) ? string.trim() : "";
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    public static Long c(Cursor cursor, String str) {
        try {
            return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
