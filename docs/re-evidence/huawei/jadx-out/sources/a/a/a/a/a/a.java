package a.a.a.a.a;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f11b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f12c = true;

    public static void c(String str, String str2) {
        if (f11b) {
            Log.w(str, a(str2, new Object[0]));
        }
    }

    public static void b(String str, String str2) {
        if (f10a) {
            Log.i(str, a(str2, new Object[0]));
        }
    }

    public static void a(String str, String str2) {
        if (f12c) {
            Log.e(str, a(str2, new Object[0]));
        }
    }

    public static String a(String str, Object... objArr) {
        if (objArr.length == 0) {
            return str;
        }
        try {
            return String.format(Locale.ENGLISH, str, objArr);
        } catch (IllegalFormatException unused) {
            Log.e("LogUtil", "Print log format catch IllegalFormatException.");
            return str;
        }
    }
}
