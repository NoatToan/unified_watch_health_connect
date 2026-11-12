package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21444b;
    public final g1 c;
    public final io.sentry.transport.p d;
    public long e;
    public final long f;

    @NotNull
    public final ILogger g;
    public volatile long h;
    public final AtomicBoolean i;

    @NotNull
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f21445k;

    public interface a {
        void a(@NotNull ApplicationNotResponding applicationNotResponding);
    }

    public c(long j, boolean z, @NotNull a aVar, @NotNull ILogger iLogger, @NotNull Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long a() {
                return SystemClock.uptimeMillis();
            }
        }, j, 500L, z, aVar, iLogger, new g1(), context);
    }

    public final boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.j.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.g.a(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void e(io.sentry.transport.p pVar) {
        this.h = pVar.a();
        this.i.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f21445k.run();
        while (!isInterrupted()) {
            this.c.b(this.f21445k);
            try {
                Thread.sleep(this.e);
                if (this.d.a() - this.h > this.f) {
                    if (!this.f21443a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.g.c(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.i.set(true);
                    } else if (c() && this.i.compareAndSet(false, true)) {
                        this.f21444b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f + " ms.", this.c.a()));
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.g.c(SentryLevel.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.g.c(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }

    @TestOnly
    public c(@NotNull final io.sentry.transport.p pVar, long j, long j2, boolean z, @NotNull a aVar, @NotNull ILogger iLogger, @NotNull g1 g1Var, @NotNull Context context) {
        super("|ANR-WatchDog|");
        this.h = 0L;
        this.i = new AtomicBoolean(false);
        this.d = pVar;
        this.f = j;
        this.e = j2;
        this.f21443a = z;
        this.f21444b = aVar;
        this.g = iLogger;
        this.c = g1Var;
        this.j = context;
        this.f21445k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f21430a.e(pVar);
            }
        };
        if (j < this.e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.e * 2)));
        }
    }
}
