package j0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private u() {
    }

    public static void a() {
        k7.h.f(b(), "Not in application's main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void c(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            k7.h.f(new Handler(Looper.getMainLooper()).post(runnable), "Unable to post to main thread");
        }
    }
}
