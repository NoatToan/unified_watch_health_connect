package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class ycp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Thread f40052a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (f40052a == null) {
            f40052a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f40052a;
    }
}
