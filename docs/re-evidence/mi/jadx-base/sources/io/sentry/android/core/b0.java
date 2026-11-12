package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.dyc;
import defpackage.lpf;
import defpackage.m05;
import defpackage.sqh;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final File f21433b;
    public final int c;

    @Nullable
    public String f;

    @NotNull
    public final io.sentry.android.core.internal.util.t g;

    @NotNull
    public final r0 l;

    @NotNull
    public final dyc m;

    @NotNull
    public final ILogger n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21432a = 0;

    @Nullable
    public Future<?> d = null;

    @Nullable
    public File e = null;

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> h = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> i = new ArrayDeque<>();

    @NotNull
    public final ArrayDeque<io.sentry.profilemeasurements.b> j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, io.sentry.profilemeasurements.a> f21434k = new HashMap();
    public boolean o = false;

    public class a implements io.sentry.android.core.internal.util.t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f21435a = 0.0f;

        public a() {
        }

        @Override // io.sentry.android.core.internal.util.t.b
        public void e(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
            long jNanoTime = ((j2 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - b0.this.f21432a;
            if (jNanoTime < 0) {
                return;
            }
            if (z2) {
                b0.this.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j3)));
            } else if (z) {
                b0.this.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j3)));
            }
            if (f != this.f21435a) {
                this.f21435a = f;
                b0.this.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f)));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21438b;

        @NotNull
        public final File c;

        @NotNull
        public final Map<String, io.sentry.profilemeasurements.a> d;
        public final boolean e;

        public b(long j, long j2, boolean z, @NotNull File file, @NotNull Map<String, io.sentry.profilemeasurements.a> map) {
            this.f21437a = j;
            this.c = file;
            this.f21438b = j2;
            this.d = map;
            this.e = z;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21440b;

        @NotNull
        public final Date c;

        public c(long j, long j2, @NotNull Date date) {
            this.f21439a = j;
            this.f21440b = j2;
            this.c = date;
        }
    }

    public b0(@NotNull String str, int i, @NotNull io.sentry.android.core.internal.util.t tVar, @NotNull dyc dycVar, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        this.f21433b = new File((String) io.sentry.util.p.c(str, "TracesFilesDirPath is required"));
        this.c = i;
        this.n = (ILogger) io.sentry.util.p.c(iLogger, "Logger is required");
        this.m = (dyc) io.sentry.util.p.c(dycVar, "ExecutorService is required.");
        this.g = (io.sentry.android.core.internal.util.t) io.sentry.util.p.c(tVar, "SentryFrameMetricsCollector is required");
        this.l = (r0) io.sentry.util.p.c(r0Var, "The BuildInfoProvider is required.");
    }

    public synchronized void f() {
        try {
            Future<?> future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            if (this.o) {
                g(true, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public synchronized b g(boolean z, @Nullable List<sqh> list) {
        if (!this.o) {
            this.n.c(SentryLevel.WARNING, "Profiler not running", new Object[0]);
            return null;
        }
        if (this.l.d() < 21) {
            return null;
        }
        try {
            Debug.stopMethodTracing();
        } catch (Throwable th) {
            try {
                this.n.a(SentryLevel.ERROR, "Error while stopping profiling: ", th);
            } catch (Throwable th2) {
                this.o = false;
                throw th2;
            }
        }
        this.o = false;
        this.g.n(this.f);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (this.e == null) {
            this.n.c(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
            return null;
        }
        if (!this.i.isEmpty()) {
            this.f21434k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
        }
        if (!this.j.isEmpty()) {
            this.f21434k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
        }
        if (!this.h.isEmpty()) {
            this.f21434k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
        }
        i(list);
        Future<?> future = this.d;
        if (future != null) {
            future.cancel(true);
            this.d = null;
        }
        return new b(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.f21434k);
    }

    public final /* synthetic */ void h() {
        g(true, null);
    }

    @SuppressLint({"NewApi"})
    public final void i(@Nullable List<sqh> list) {
        if (this.l.d() < 21) {
            return;
        }
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f21432a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (sqh sqhVar : list) {
                        m05 m05VarC = sqhVar.c();
                        lpf lpfVarD = sqhVar.d();
                        if (m05VarC != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(m05VarC.b()) + jElapsedRealtimeNanos), Double.valueOf(m05VarC.a())));
                        }
                        if (lpfVarD != null && lpfVarD.b() > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(lpfVarD.a()) + jElapsedRealtimeNanos), Long.valueOf(lpfVarD.b())));
                        }
                        if (lpfVarD != null && lpfVarD.c() > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(lpfVarD.a()) + jElapsedRealtimeNanos), Long.valueOf(lpfVarD.c())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f21434k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f21434k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f21434k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public synchronized c j() {
        int i = this.c;
        if (i == 0) {
            this.n.c(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
            return null;
        }
        if (this.o) {
            this.n.c(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        if (this.l.d() < 21) {
            return null;
        }
        this.e = new File(this.f21433b, UUID.randomUUID() + ".trace");
        this.f21434k.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.f = this.g.m(new a());
        try {
            this.d = this.m.a(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21423a.h();
                }
            }, 30000L);
        } catch (RejectedExecutionException e) {
            this.n.a(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
        }
        this.f21432a = SystemClock.elapsedRealtimeNanos();
        Date dateC = yq5.c();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
            this.o = true;
            return new c(this.f21432a, elapsedCpuTime, dateC);
        } catch (Throwable th) {
            g(false, null);
            this.n.a(SentryLevel.ERROR, "Unable to start a profile: ", th);
            this.o = false;
            return null;
        }
    }
}
