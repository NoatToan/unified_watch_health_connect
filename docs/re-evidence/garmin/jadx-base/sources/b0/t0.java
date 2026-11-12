package b0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f14053a = 3;

    private t0() {
    }

    public static boolean a(int i14, String str) {
        return f14053a <= i14 || Log.isLoggable(str, i14);
    }
}
