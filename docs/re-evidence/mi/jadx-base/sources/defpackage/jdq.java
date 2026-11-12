package defpackage;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.util.z;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class jdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f22686a;

    public static Context a() {
        Application application;
        Context context = f22686a;
        if (context != null) {
            return context;
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]);
            declaredMethod.setAccessible(true);
            application = (Application) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e) {
            StringBuilder sbA = j3s.a("getCurApplication reflect ActivityThread exception : ");
            sbA.append(e.getMessage());
            uoe.b("UriUtils", sbA.toString());
            application = null;
        }
        if (application != null) {
            f22686a = application;
            uoe.e("UriUtils", "application from ActivityThread");
            return application;
        }
        try {
            Method declaredMethod2 = Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new Class[0]);
            declaredMethod2.setAccessible(true);
            application = (Application) declaredMethod2.invoke(null, new Object[0]);
        } catch (Exception e2) {
            StringBuilder sbA2 = j3s.a("getCurApplication reflect AppGlobals exception : ");
            sbA2.append(e2.getMessage());
            uoe.b("UriUtils", sbA2.toString());
        }
        f22686a = application;
        uoe.e("UriUtils", "application from AppGlobals");
        return application;
    }

    public static InputStream b(Context context, Uri uri) {
        return context.getContentResolver().openInputStream(uri);
    }

    public static String c(Uri uri) {
        String lastPathSegment = "";
        if (MiuiCursorConstants.CONTENT.equals(uri.getScheme())) {
            Cursor cursorQuery = null;
            try {
                cursorQuery = a().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    lastPathSegment = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
        if (TextUtils.isEmpty(lastPathSegment)) {
            lastPathSegment = uri.getLastPathSegment();
        }
        StringBuilder sbA = j3s.a("parseFileNameByUri:scheme = ");
        sbA.append(uri.getScheme());
        sbA.append(" ,result = ");
        sbA.append(lastPathSegment);
        uoe.e("UriUtils", sbA.toString());
        return lastPathSegment;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    public static String d(Uri uri) {
        String mimeTypeFromExtension;
        if (MiuiCursorConstants.CONTENT.equals(uri.getScheme())) {
            mimeTypeFromExtension = a().getContentResolver().getType(uri);
        } else {
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                mimeTypeFromExtension = "";
            } else {
                String[] strArrSplit = lastPathSegment.split(z.f14007a);
                if (strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[strArrSplit.length - 1])) {
                    mimeTypeFromExtension = "";
                } else {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strArrSplit[strArrSplit.length - 1]);
                }
            }
        }
        StringBuilder sbA = j3s.a("parseMimeTypeByUri:scheme = ");
        sbA.append(uri.getScheme());
        sbA.append(" ,mimeType = ");
        sbA.append(mimeTypeFromExtension);
        uoe.e("UriUtils", sbA.toString());
        return !TextUtils.isEmpty(mimeTypeFromExtension) ? mimeTypeFromExtension : "";
    }

    public static InputStream e(Uri uri) {
        return b(a(), uri);
    }
}
