package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes20.dex */
public class yis {
    private static final boolean e = yhr.e;

    public static int b(String str, String str2) {
        if (!e) {
            return 0;
        }
        return Log.d("WearEngine_" + str, str2);
    }

    public static int a(String str, String str2) {
        return Log.i("WearEngine_" + str, str2);
    }

    public static int d(String str, String str2) {
        return Log.w("WearEngine_" + str, str2);
    }

    public static int c(String str, String str2) {
        return Log.e("WearEngine_" + str, str2);
    }
}
