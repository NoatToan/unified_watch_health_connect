package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class s2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f33219a = false;

    static {
        try {
            Class<?> cls = Class.forName("com.xiaomi.aicr.BuildConfig");
            f33219a = ((String) cls.getField("BUILD_TYPE").get(null)).equals("debug") || ((String) cls.getField("FLAVOR").get(null)).equals("demo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int a(String str, String str2) {
        if (!f33219a) {
            return 0;
        }
        return Log.d("AiCrEngine_" + str, str2);
    }

    public static int b(String str, String str2) {
        return Log.e("AiCrEngine_" + str, str2);
    }

    public static int c(String str, String str2, Exception exc) {
        return Log.e("AiCrEngine_" + str, str2, exc);
    }

    public static int d(String str, String str2) {
        return Log.i("AiCrEngine_" + str, str2);
    }
}
