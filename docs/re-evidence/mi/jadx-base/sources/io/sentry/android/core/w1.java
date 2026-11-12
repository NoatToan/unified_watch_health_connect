package io.sentry.android.core;

import defpackage.gvg;
import defpackage.hul;
import defpackage.hvg;
import defpackage.mvl;
import defpackage.qyc;
import defpackage.uvc;
import defpackage.wzc;
import defpackage.yq5;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import miuix.animation.internal.FolmeEngine;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class w1 implements uvc, io.sentry.android.core.internal.util.t.b {
    public static final long h = TimeUnit.SECONDS.toNanos(1);
    public static final mvl i = new mvl(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21604a;

    @NotNull
    public final io.sentry.android.core.internal.util.t c;

    @Nullable
    public volatile String d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f21605b = new Object();

    @NotNull
    public final SortedSet<qyc> e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.v1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return w1.j((qyc) obj, (qyc) obj2);
        }
    });

    @NotNull
    public final ConcurrentSkipListSet<a> f = new ConcurrentSkipListSet<>();
    public long g = FolmeEngine.MAX_DELTA;

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21607b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final long g;

        public a(long j) {
            this(j, j, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull a aVar) {
            return Long.compare(this.f21607b, aVar.f21607b);
        }

        public a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
            this.f21606a = j;
            this.f21607b = j2;
            this.c = j3;
            this.d = j4;
            this.e = z;
            this.f = z2;
            this.g = j5;
        }
    }

    public w1(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull io.sentry.android.core.internal.util.t tVar) {
        this.c = tVar;
        this.f21604a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static int g(@NotNull t1 t1Var, long j, long j2, long j3) {
        long jMax = Math.max(0L, j2 - j3);
        if (!io.sentry.android.core.internal.util.t.h(jMax, j)) {
            return 0;
        }
        t1Var.a(jMax, Math.max(0L, jMax - j), true, io.sentry.android.core.internal.util.t.g(jMax));
        return 1;
    }

    public static int i(@NotNull t1 t1Var, long j, long j2) {
        long jG = j2 - t1Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j);
        }
        return 0;
    }

    public static /* synthetic */ int j(qyc qycVar, qyc qycVar2) {
        int iCompareTo = qycVar.r().compareTo(qycVar2.r());
        return iCompareTo != 0 ? iCompareTo : qycVar.d().h().toString().compareTo(qycVar2.d().h().toString());
    }

    public static long k(@NotNull hul hulVar) {
        if (hulVar instanceof mvl) {
            return hulVar.b(i);
        }
        return System.nanoTime() - (yq5.h(System.currentTimeMillis()) - hulVar.h());
    }

    @Override // defpackage.uvc
    public void a(@NotNull qyc qycVar) {
        if (!this.f21604a || (qycVar instanceof gvg) || (qycVar instanceof hvg)) {
            return;
        }
        synchronized (this.f21605b) {
            try {
                this.e.add(qycVar);
                if (this.d == null) {
                    this.d = this.c.m(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uvc
    public void b(@NotNull qyc qycVar) {
        if (!this.f21604a || (qycVar instanceof gvg) || (qycVar instanceof hvg)) {
            return;
        }
        synchronized (this.f21605b) {
            try {
                if (this.e.contains(qycVar)) {
                    h(qycVar);
                    synchronized (this.f21605b) {
                        try {
                            if (this.e.isEmpty()) {
                                clear();
                            } else {
                                this.f.headSet(new a(k(this.e.first().r()))).clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.uvc
    public void clear() {
        synchronized (this.f21605b) {
            try {
                if (this.d != null) {
                    this.c.n(this.d);
                    this.d = null;
                }
                this.f.clear();
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.android.core.internal.util.t.b
    public void e(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        if (this.f.size() > 3600) {
            return;
        }
        long j5 = (long) (h / ((double) f));
        this.g = j5;
        if (z || z2) {
            this.f.add(new a(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void h(@NotNull qyc qycVar) {
        synchronized (this.f21605b) {
            try {
                if (this.e.remove(qycVar)) {
                    hul hulVarQ = qycVar.q();
                    if (hulVarQ == null) {
                        return;
                    }
                    long jK = k(qycVar.r());
                    long jK2 = k(hulVarQ);
                    long j = jK2 - jK;
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    t1 t1Var = new t1();
                    long j3 = this.g;
                    if (!this.f.isEmpty()) {
                        for (a aVar : this.f.tailSet(new a(jK))) {
                            if (aVar.f21606a > jK2) {
                                break;
                            }
                            if (aVar.f21606a >= jK && aVar.f21607b <= jK2) {
                                t1Var.a(aVar.c, aVar.d, aVar.e, aVar.f);
                            } else if ((jK > aVar.f21606a && jK < aVar.f21607b) || (jK2 > aVar.f21606a && jK2 < aVar.f21607b)) {
                                long jMin = Math.min(aVar.d - Math.max(j2, Math.max(j2, jK - aVar.f21606a) - aVar.g), j);
                                long jMin2 = Math.min(jK2, aVar.f21607b) - Math.max(jK, aVar.f21606a);
                                t1Var.a(jMin2, jMin, io.sentry.android.core.internal.util.t.h(jMin2, aVar.g), io.sentry.android.core.internal.util.t.g(jMin2));
                            }
                            j3 = aVar.g;
                            j2 = 0;
                        }
                    }
                    long j4 = j3;
                    int iF = t1Var.f();
                    long jF = this.c.f();
                    if (jF != -1) {
                        iF = iF + g(t1Var, j4, jK2, jF) + i(t1Var, j4, j);
                    }
                    double dE = (t1Var.e() + t1Var.c()) / 1.0E9d;
                    qycVar.m("frames.total", Integer.valueOf(iF));
                    qycVar.m("frames.slow", Integer.valueOf(t1Var.d()));
                    qycVar.m("frames.frozen", Integer.valueOf(t1Var.b()));
                    qycVar.m("frames.delay", Double.valueOf(dE));
                    if (qycVar instanceof wzc) {
                        qycVar.j("frames_total", Integer.valueOf(iF));
                        qycVar.j("frames_slow", Integer.valueOf(t1Var.d()));
                        qycVar.j("frames_frozen", Integer.valueOf(t1Var.b()));
                        qycVar.j("frames_delay", Double.valueOf(dE));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
