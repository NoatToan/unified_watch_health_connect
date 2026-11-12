package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41548a = 3;

    public static void a(String str, String str2) {
        g(j(str), 3);
    }

    public static void b(String str, String str2, Throwable th) {
        g(j(str), 3);
    }

    public static void c(String str, String str2) {
        g(j(str), 6);
    }

    public static void d(String str, String str2, Throwable th) {
        g(j(str), 6);
    }

    public static void e(String str, String str2) {
        g(j(str), 4);
    }

    public static boolean f(String str) {
        return g(j(str), 3);
    }

    public static boolean g(String str, int i) {
        return f41548a <= i || Log.isLoggable(str, i);
    }

    public static void h() {
        f41548a = 3;
    }

    public static void i(@IntRange(from = 3, to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i) {
        f41548a = i;
    }

    public static String j(String str) {
        return str;
    }

    public static void k(String str, String str2) {
        g(j(str), 5);
    }

    public static void l(String str, String str2, Throwable th) {
        g(j(str), 5);
    }
}
