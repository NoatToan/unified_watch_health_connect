package defpackage;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class mnf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TimerTask f41985a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41986b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f41987c = false;
    private static boolean d = true;
    private static Timer e;
    private static Timer f;
    private static int h;
    private static TimerTask j;

    public static void c(int i) {
        h = i;
    }

    public static int f() {
        return h;
    }

    public static void b() {
        h++;
    }

    public static Timer d() {
        return f;
    }

    public static void c(Timer timer) {
        f = timer;
    }

    public static TimerTask e() {
        return j;
    }

    public static void c(TimerTask timerTask) {
        j = timerTask;
    }

    public static void e(boolean z) {
        d = z;
    }

    public static boolean g() {
        return d;
    }

    public static void b(boolean z) {
        f41987c = z;
    }

    public static boolean i() {
        return f41987c;
    }

    public static Timer a() {
        return e;
    }

    public static void d(Timer timer) {
        e = timer;
    }

    public static TimerTask c() {
        return f41985a;
    }

    public static void d(TimerTask timerTask) {
        f41985a = timerTask;
    }

    public static void d(final Timer timer, final TimerTask timerTask) {
        a(new Runnable() { // from class: mnj
            @Override // java.lang.Runnable
            public final void run() {
                mnf.b(timer, timerTask);
            }
        });
    }

    static /* synthetic */ void b(Timer timer, TimerTask timerTask) {
        if (timer != null) {
            timer.cancel();
        }
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public static void a(Runnable runnable) {
        synchronized (f41986b) {
            runnable.run();
        }
    }
}
