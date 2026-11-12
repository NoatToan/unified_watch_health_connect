package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class bir {
    public static int a(String str, String str2) {
        if (!bis.b()) {
            return -1;
        }
        return Log.w("MarketInstallService", str + ":" + str2);
    }

    public static int e(String str, String str2) {
        if (!bis.c()) {
            return -1;
        }
        return Log.i("MarketInstallService", str + ":" + str2);
    }

    public static int d(String str, String str2) {
        if (!bis.b()) {
            return -1;
        }
        return Log.e("MarketInstallService", str + ":" + str2);
    }

    public static int d(String str, String str2, Throwable th) {
        if (!bis.b()) {
            return -1;
        }
        return Log.e("MarketInstallService", str + ":" + str2, th);
    }

    public static int c(String str, String str2) {
        if (!bis.d()) {
            return -1;
        }
        return Log.d("MarketInstallService", str + ":" + str2);
    }
}
