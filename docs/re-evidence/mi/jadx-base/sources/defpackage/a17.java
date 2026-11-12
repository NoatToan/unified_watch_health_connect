package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class a17 {
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return false;
        } finally {
            a(cursorQuery);
        }
    }

    public static String c(Context context, Uri uri) {
        return g(context, uri, "_display_name", null);
    }

    public static String d(Context context, Uri uri) {
        return g(context, uri, "mime_type", null);
    }

    public static String e(Context context, Uri uri) {
        String strD = d(context, uri);
        if ("vnd.android.document/directory".equals(strD)) {
            return null;
        }
        return strD;
    }

    public static boolean f(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(d(context, uri));
    }

    public static String g(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            return str2;
        } finally {
            a(cursorQuery);
        }
    }
}
