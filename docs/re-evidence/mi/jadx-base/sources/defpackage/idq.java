package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class idq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f21037a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String a(ContentResolver contentResolver, Uri uri) throws Throwable {
        int columnIndex;
        Cursor cursor = null;
        string = null;
        string = null;
        String string = null;
        if (!h(uri)) {
            if (i(uri)) {
                return uri.getPath();
            }
            return null;
        }
        try {
            Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) != -1) {
                        string = cursorQuery.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery == null) {
                return string;
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri c(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean d(Uri uri) {
        return "data".equals(b(uri));
    }

    public static boolean e(Uri uri) {
        return "asset".equals(b(uri));
    }

    public static boolean f(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean g(Uri uri) {
        return h(uri) && MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE.equals(uri.getAuthority()) && !uri.getPath().startsWith(f21037a.getPath());
    }

    public static boolean h(Uri uri) {
        return MiuiCursorConstants.CONTENT.equals(b(uri));
    }

    public static boolean i(Uri uri) {
        return "file".equals(b(uri));
    }

    public static boolean j(Uri uri) {
        return "res".equals(b(uri));
    }

    public static boolean k(Uri uri) {
        String strB = b(uri);
        return Constants.URI_SCHEME.equals(strB) || "http".equals(strB);
    }

    public static boolean l(Uri uri) {
        return "android.resource".equals(b(uri));
    }

    public static URL m(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
