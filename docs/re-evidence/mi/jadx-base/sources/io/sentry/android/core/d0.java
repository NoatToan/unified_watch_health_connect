package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.dyc;
import defpackage.sqh;
import defpackage.unc;
import defpackage.wzc;
import defpackage.xzc;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements xzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f21451b;

    @Nullable
    public final String c;
    public final boolean d;
    public final int e;

    @NotNull
    public final dyc f;

    @NotNull
    public final r0 g;
    public boolean h;
    public int i;

    @NotNull
    public final io.sentry.android.core.internal.util.t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public io.sentry.k f21452k;

    @Nullable
    public b0 l;
    public long m;
    public long n;

    @NotNull
    public Date o;

    public d0(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull r0 r0Var, @NotNull io.sentry.android.core.internal.util.t tVar) {
        this(context, r0Var, tVar, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    public static /* synthetic */ List f() throws Exception {
        return io.sentry.android.core.internal.util.f.a().c();
    }

    @Override // defpackage.xzc
    @Nullable
    public synchronized io.sentry.j a(@NotNull wzc wzcVar, @Nullable List<sqh> list, @NotNull SentryOptions sentryOptions) {
        return h(wzcVar.getName(), wzcVar.i().toString(), wzcVar.d().k().toString(), false, list, sentryOptions);
    }

    @Override // defpackage.xzc
    public synchronized void b(@NotNull wzc wzcVar) {
        if (this.i > 0 && this.f21452k == null) {
            this.f21452k = new io.sentry.k(wzcVar, Long.valueOf(this.m), Long.valueOf(this.n));
        }
    }

    @Override // defpackage.xzc
    public void close() {
        io.sentry.k kVar = this.f21452k;
        if (kVar != null) {
            h(kVar.i(), this.f21452k.h(), this.f21452k.j(), true, null, unc.a().i());
        } else {
            int i = this.i;
            if (i != 0) {
                this.i = i - 1;
            }
        }
        b0 b0Var = this.l;
        if (b0Var != null) {
            b0Var.f();
        }
    }

    @Nullable
    public final ActivityManager.MemoryInfo d() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f21450a.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f21451b.c(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            this.f21451b.a(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public final void e() {
        if (this.h) {
            return;
        }
        this.h = true;
        if (!this.d) {
            this.f21451b.c(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.c;
        if (str == null) {
            this.f21451b.c(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.e;
        if (i <= 0) {
            this.f21451b.c(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.l = new b0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.e, this.j, this.f, this.f21451b, this.g);
        }
    }

    @SuppressLint({"NewApi"})
    public final boolean g() {
        b0.c cVarJ;
        b0 b0Var = this.l;
        if (b0Var == null || (cVarJ = b0Var.j()) == null) {
            return false;
        }
        this.m = cVarJ.f21439a;
        this.n = cVarJ.f21440b;
        this.o = cVarJ.c;
        return true;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public final synchronized io.sentry.j h(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @Nullable List<sqh> list, @NotNull SentryOptions sentryOptions) {
        try {
            if (this.l == null) {
                return null;
            }
            if (this.g.d() < 22) {
                return null;
            }
            io.sentry.k kVar = this.f21452k;
            if (kVar != null && kVar.h().equals(str2)) {
                int i = this.i;
                if (i > 0) {
                    this.i = i - 1;
                }
                this.f21451b.c(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.i != 0) {
                    io.sentry.k kVar2 = this.f21452k;
                    if (kVar2 != null) {
                        kVar2.k(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.n));
                    }
                    return null;
                }
                b0.b bVarG = this.l.g(false, list);
                if (bVarG == null) {
                    return null;
                }
                long j = bVarG.f21437a - this.m;
                ArrayList arrayList = new ArrayList(1);
                io.sentry.k kVar3 = this.f21452k;
                if (kVar3 != null) {
                    arrayList.add(kVar3);
                }
                this.f21452k = null;
                this.i = 0;
                ActivityManager.MemoryInfo memoryInfoD = d();
                String string = memoryInfoD != null ? Long.toString(memoryInfoD.totalMem) : "0";
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((io.sentry.k) it.next()).k(Long.valueOf(bVarG.f21437a), Long.valueOf(this.m), Long.valueOf(bVarG.f21438b), Long.valueOf(this.n));
                    arrayList = arrayList;
                }
                return new io.sentry.j(bVarG.c, this.o, arrayList, str, str2, str3, Long.toString(j), this.g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[0], new Callable() { // from class: io.sentry.android.core.c0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return d0.f();
                    }
                }, this.g.b(), this.g.c(), this.g.e(), this.g.f(), string, sentryOptions.getProguardUuid(), sentryOptions.getRelease(), sentryOptions.getEnvironment(), (bVarG.e || z) ? "timeout" : "normal", bVarG.d);
            }
            this.f21451b.c(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.xzc
    public boolean isRunning() {
        return this.i != 0;
    }

    @Override // defpackage.xzc
    public synchronized void start() {
        try {
            if (this.g.d() < 22) {
                return;
            }
            e();
            int i = this.i + 1;
            this.i = i;
            if (i == 1 && g()) {
                this.f21451b.c(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.i--;
                this.f21451b.c(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public d0(@NotNull Context context, @NotNull r0 r0Var, @NotNull io.sentry.android.core.internal.util.t tVar, @NotNull ILogger iLogger, @Nullable String str, boolean z, int i, @NotNull dyc dycVar) {
        this.h = false;
        this.i = 0;
        this.l = null;
        this.f21450a = (Context) io.sentry.util.p.c(u0.a(context), "The application context is required");
        this.f21451b = (ILogger) io.sentry.util.p.c(iLogger, "ILogger is required");
        this.j = (io.sentry.android.core.internal.util.t) io.sentry.util.p.c(tVar, "SentryFrameMetricsCollector is required");
        this.g = (r0) io.sentry.util.p.c(r0Var, "The BuildInfoProvider is required.");
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = (dyc) io.sentry.util.p.c(dycVar, "The ISentryExecutorService is required.");
        this.o = yq5.c();
    }
}
