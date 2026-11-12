package health.compact.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HandlerThread f36665a;

    private ThreadManager() {
    }

    static {
        HandlerThread handlerThread = new HandlerThread("logfile_thread");
        f36665a = handlerThread;
        handlerThread.start();
    }

    public static Looper c() {
        return f36665a.getLooper();
    }

    public static Handler d() {
        return new Handler(c());
    }
}
