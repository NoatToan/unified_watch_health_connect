package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class bcw {
    public static void a(String str, String str2) {
    }

    public static void c(String str, String str2) {
        if (str == null) {
            return;
        }
        Log.i("CloudSyncSdk[13.3.0.303]." + str, str2);
    }

    public static void d(String str, String str2) {
        if (str == null) {
            return;
        }
        Log.e("CloudSyncSdk[13.3.0.303]." + str, str2);
    }

    public static void e(String str, String str2) {
        if (str == null) {
            return;
        }
        Log.w("CloudSyncSdk[13.3.0.303]." + str, str2);
    }
}
