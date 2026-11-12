package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.SentryLevel;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public FrameMetricsAggregator f21468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryAndroidOptions f21469b;

    @NotNull
    public final Map<io.sentry.protocol.p, Map<String, io.sentry.protocol.f>> c;

    @NotNull
    public final Map<Activity, b> d;

    @NotNull
    public final g1 e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21471b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.f21470a = i;
            this.f21471b = i2;
            this.c = i3;
        }
    }

    public h(@NotNull f1 f1Var, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull g1 g1Var) {
        this.f21468a = null;
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        if (f1Var.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f21468a = new FrameMetricsAggregator();
        }
        this.f21469b = sentryAndroidOptions;
        this.e = g1Var;
    }

    public synchronized void e(@NotNull final Activity activity) {
        if (h()) {
            m(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21448a.i(activity);
                }
            }, "FrameMetricsAggregator.add");
            o(activity);
        }
    }

    @Nullable
    public final b f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!h() || (frameMetricsAggregator = this.f21468a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = frameMetricsAggregator.b();
        int i3 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new b(i3, i, i2);
    }

    @Nullable
    public final b g(@NotNull Activity activity) {
        b bVarF;
        b bVarRemove = this.d.remove(activity);
        if (bVarRemove == null || (bVarF = f()) == null) {
            return null;
        }
        return new b(bVarF.f21470a - bVarRemove.f21470a, bVarF.f21471b - bVarRemove.f21471b, bVarF.c - bVarRemove.c);
    }

    @VisibleForTesting
    public boolean h() {
        return (this.f21468a == null || !this.f21469b.isEnableFramesTracking() || this.f21469b.isEnablePerformanceV2()) ? false : true;
    }

    public final /* synthetic */ void i(Activity activity) {
        this.f21468a.a(activity);
    }

    public final /* synthetic */ void j(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.f21469b.getLogger().c(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public final /* synthetic */ void k(Activity activity) {
        this.f21468a.c(activity);
    }

    public final /* synthetic */ void l() {
        this.f21468a.e();
    }

    public final void m(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.c.b().a()) {
                runnable.run();
            } else {
                this.e.b(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21459a.j(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f21469b.getLogger().c(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public synchronized void n(@NotNull final Activity activity, @NotNull io.sentry.protocol.p pVar) {
        try {
            if (h()) {
                m(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21463a.k(activity);
                    }
                }, null);
                b bVarG = g(activity);
                if (bVarG != null && (bVarG.f21470a != 0 || bVarG.f21471b != 0 || bVarG.c != 0)) {
                    io.sentry.protocol.f fVar = new io.sentry.protocol.f(Integer.valueOf(bVarG.f21470a), "none");
                    io.sentry.protocol.f fVar2 = new io.sentry.protocol.f(Integer.valueOf(bVarG.f21471b), "none");
                    io.sentry.protocol.f fVar3 = new io.sentry.protocol.f(Integer.valueOf(bVarG.c), "none");
                    HashMap map = new HashMap();
                    map.put("frames_total", fVar);
                    map.put("frames_slow", fVar2);
                    map.put("frames_frozen", fVar3);
                    this.c.put(pVar, map);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(@NotNull Activity activity) {
        b bVarF = f();
        if (bVarF != null) {
            this.d.put(activity, bVarF);
        }
    }

    public synchronized void p() {
        try {
            if (h()) {
                m(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21455a.l();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f21468a.d();
            }
            this.c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public synchronized Map<String, io.sentry.protocol.f> q(@NotNull io.sentry.protocol.p pVar) {
        if (!h()) {
            return null;
        }
        Map<String, io.sentry.protocol.f> map = this.c.get(pVar);
        this.c.remove(pVar);
        return map;
    }

    public h(@NotNull f1 f1Var, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(f1Var, sentryAndroidOptions, new g1());
    }
}
