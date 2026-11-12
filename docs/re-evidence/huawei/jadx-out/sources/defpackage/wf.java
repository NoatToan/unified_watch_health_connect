package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f51966a = false;

    public static void e(String str, String str2) {
        if (f51966a) {
            Log.i("ChipseaLib_", str + ": " + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f51966a) {
            Log.e("ChipseaLib_", str + ": " + str2);
        }
    }
}
