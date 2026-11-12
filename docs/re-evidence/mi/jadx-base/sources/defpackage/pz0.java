package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class pz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Executor f30920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f30921b;

    public static void a(Runnable runnable) {
        Executor executor = f30920a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            ycm.b("Airkan Executor not been init");
            throw new RuntimeException("Airkan Executor not been init");
        }
    }

    public static void b() {
        ycm.b("Airkan Executor init!");
        f30920a = Executors.newSingleThreadExecutor();
        f30921b = new Handler(Looper.getMainLooper());
    }

    public static void c(Runnable runnable, long j) {
        Handler handler = f30921b;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        } else {
            ycm.b("Airkan Handler not been init 1");
            throw new RuntimeException("Airkan handler not been init 1");
        }
    }

    public static void d(Runnable runnable) {
        Handler handler = f30921b;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        } else {
            ycm.b("Airkan Handler not been init 2");
            throw new RuntimeException("Airkan handler not been init 2");
        }
    }
}
