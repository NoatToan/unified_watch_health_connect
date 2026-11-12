package ce;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static void a(int i14, String str) {
        Trace.beginAsyncSection(str, i14);
    }

    public static void b(int i14, String str) {
        Trace.endAsyncSection(str, i14);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i14, String str) {
        Trace.setCounter(str, i14);
    }
}
