package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.r0;
import io.sentry.android.core.u0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class t implements Application.ActivityLifecycleCallbacks {
    public static final long n = TimeUnit.SECONDS.toNanos(1);
    public static final long o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f21530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<Window> f21531b;

    @NotNull
    public final ILogger c;

    @Nullable
    public Handler d;

    @Nullable
    public WeakReference<Window> e;

    @NotNull
    public final Map<String, b> f;
    public boolean g;
    public final c h;

    @Nullable
    public Window.OnFrameMetricsAvailableListener i;

    @Nullable
    public Choreographer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Field f21532k;
    public long l;
    public long m;

    public class a implements c {
    }

    @ApiStatus.Internal
    public interface b {
        void e(long j, long j2, long j3, long j4, boolean z, boolean z2, float f);
    }

    @ApiStatus.Internal
    public interface c {
        @RequiresApi(api = 24)
        default void a(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, @Nullable Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        @RequiresApi(api = 24)
        default void b(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @SuppressLint({"NewApi"})
    public t(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        this(context, iLogger, r0Var, new a());
    }

    public static boolean g(long j) {
        return j > o;
    }

    public static boolean h(long j, long j2) {
        return j > j2;
    }

    public static /* synthetic */ void i(ILogger iLogger, Thread thread, Throwable th) {
        iLogger.a(SentryLevel.ERROR, "Error during frames measurements.", th);
    }

    @RequiresApi(api = 24)
    public final long d(@NotNull FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    public final long e(@NotNull FrameMetrics frameMetrics) {
        return this.f21530a.d() >= 26 ? frameMetrics.getMetric(10) : f();
    }

    public long f() {
        Field field;
        Choreographer choreographer = this.j;
        if (choreographer == null || (field = this.f21532k) == null) {
            return -1L;
        }
        try {
            Long l = (Long) field.get(choreographer);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public final /* synthetic */ void j(ILogger iLogger) {
        try {
            this.j = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    public final /* synthetic */ void k(r0 r0Var, Window window, FrameMetrics frameMetrics, int i) {
        long jNanoTime = System.nanoTime();
        float refreshRate = r0Var.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        long j = n;
        long jD = d(frameMetrics);
        long jMax = Math.max(0L, jD - ((long) (j / refreshRate)));
        long jE = e(frameMetrics);
        if (jE < 0) {
            jE = jNanoTime - jD;
        }
        long jMax2 = Math.max(jE, this.m);
        if (jMax2 == this.l) {
            return;
        }
        this.l = jMax2;
        this.m = jMax2 + jD;
        boolean zH = h(jD, (long) (j / (refreshRate - 1.0f)));
        boolean z = zH && g(jD);
        Iterator<b> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().e(jMax2, this.m, jD, jMax, zH, z, refreshRate);
            jD = jD;
        }
    }

    public final void l(@NotNull Window window) {
        WeakReference<Window> weakReference = this.e;
        if (weakReference == null || weakReference.get() != window) {
            this.e = new WeakReference<>(window);
            p();
        }
    }

    @Nullable
    public String m(@NotNull b bVar) {
        if (!this.g) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        this.f.put(string, bVar);
        p();
        return string;
    }

    public void n(@Nullable String str) {
        if (this.g) {
            if (str != null) {
                this.f.remove(str);
            }
            WeakReference<Window> weakReference = this.e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f.isEmpty()) {
                return;
            }
            o(window);
        }
    }

    @SuppressLint({"NewApi"})
    public final void o(@NotNull Window window) {
        if (this.f21531b.contains(window)) {
            if (this.f21530a.d() >= 24) {
                try {
                    this.h.b(window, this.i);
                } catch (Exception e) {
                    this.c.a(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", e);
                }
            }
            this.f21531b.remove(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        l(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        o(activity.getWindow());
        WeakReference<Window> weakReference = this.e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.e = null;
    }

    @SuppressLint({"NewApi"})
    public final void p() {
        WeakReference<Window> weakReference = this.e;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.g || this.f21531b.contains(window) || this.f.isEmpty() || this.f21530a.d() < 24 || this.d == null) {
            return;
        }
        this.f21531b.add(window);
        this.h.a(window, this.i, this.d);
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public t(@NotNull Context context, @NotNull final ILogger iLogger, @NotNull final r0 r0Var, @NotNull c cVar) {
        this.f21531b = new CopyOnWriteArraySet();
        this.f = new ConcurrentHashMap();
        this.g = false;
        this.l = 0L;
        this.m = 0L;
        Context context2 = (Context) io.sentry.util.p.c(u0.a(context), "The context is required");
        this.c = (ILogger) io.sentry.util.p.c(iLogger, "Logger is required");
        this.f21530a = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
        this.h = (c) io.sentry.util.p.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && r0Var.d() >= 24) {
            this.g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.q
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    t.i(iLogger, thread, th);
                }
            });
            handlerThread.start();
            this.d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21526a.j(iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f21532k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                iLogger.a(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.s
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    this.f21528a.k(r0Var, window, frameMetrics, i);
                }
            };
        }
    }
}
