package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class cib {
    public static void b(String str, String str2) {
        if (chm.b()) {
            Log.i("CodeValuePlatform_" + str, str2);
        }
    }

    public static void a(String str, String str2) {
        if (chm.b()) {
            Log.d("CodeValuePlatform_" + str, str2);
        }
    }

    public static void d(String str, String str2) {
        Log.e("CodeValuePlatform_" + str, str2);
    }

    public static void c(String str, String str2) {
        Log.w("CodeValuePlatform_" + str, str2);
    }
}
