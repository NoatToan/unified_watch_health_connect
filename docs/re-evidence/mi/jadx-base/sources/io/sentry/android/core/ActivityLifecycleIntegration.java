package io.sentry.android.core;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.hul;
import defpackage.hvg;
import defpackage.mvl;
import defpackage.owp;
import defpackage.qkp;
import defpackage.qwp;
import defpackage.qyc;
import defpackage.rwp;
import defpackage.ucd;
import defpackage.wzc;
import defpackage.xta;
import io.sentry.Instrumenter;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.protocol.TransactionNameSource;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements ucd, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f21370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final r0 f21371b;

    @Nullable
    public ftc c;

    @Nullable
    public SentryAndroidOptions d;
    public boolean g;

    @Nullable
    public qyc j;

    @NotNull
    public final h q;
    public boolean e = false;
    public boolean f = false;
    public boolean h = false;

    @Nullable
    public xta i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final WeakHashMap<Activity, qyc> f21372k = new WeakHashMap<>();

    @NotNull
    public final WeakHashMap<Activity, qyc> l = new WeakHashMap<>();

    @NotNull
    public hul m = new mvl(new Date(0), 0);

    @NotNull
    public final Handler n = new Handler(Looper.getMainLooper());

    @Nullable
    public Future<?> o = null;

    @NotNull
    public final WeakHashMap<Activity, wzc> p = new WeakHashMap<>();

    public ActivityLifecycleIntegration(@NotNull Application application, @NotNull r0 r0Var, @NotNull h hVar) {
        this.f21370a = (Application) io.sentry.util.p.c(application, "Application is required");
        this.f21371b = (r0) io.sentry.util.p.c(r0Var, "BuildInfoProvider is required");
        this.q = (h) io.sentry.util.p.c(hVar, "ActivityFramesTracker is required");
        if (r0Var.d() >= 29) {
            this.g = true;
        }
    }

    @NotNull
    private String Q(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public static /* synthetic */ void f0(wzc wzcVar, io.sentry.e eVar, wzc wzcVar2) {
        if (wzcVar2 == wzcVar) {
            eVar.h();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void g0(@NotNull final io.sentry.e eVar, @NotNull final wzc wzcVar) {
        eVar.y(new io.sentry.m.c() { // from class: io.sentry.android.core.n
            @Override // io.sentry.m.c
            public final void a(wzc wzcVar2) {
                ActivityLifecycleIntegration.f0(wzcVar, eVar, wzcVar2);
            }
        });
    }

    public final void E() {
        hul hulVarD = AppStartMetrics.n().i(this.d).d();
        if (!this.e || hulVarD == null) {
            return;
        }
        M(this.j, hulVarD);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r0(@Nullable qyc qycVar, @Nullable qyc qycVar2) {
        if (qycVar == null || qycVar.a()) {
            return;
        }
        qycVar.h(T(qycVar));
        hul hulVarQ = qycVar2 != null ? qycVar2.q() : null;
        if (hulVarQ == null) {
            hulVarQ = qycVar.r();
        }
        N(qycVar, hulVarQ, SpanStatus.DEADLINE_EXCEEDED);
    }

    public final void K(@Nullable qyc qycVar) {
        if (qycVar == null || qycVar.a()) {
            return;
        }
        qycVar.finish();
    }

    public final void M(@Nullable qyc qycVar, @NotNull hul hulVar) {
        N(qycVar, hulVar, null);
    }

    public final void N(@Nullable qyc qycVar, @NotNull hul hulVar, @Nullable SpanStatus spanStatus) {
        if (qycVar == null || qycVar.a()) {
            return;
        }
        if (spanStatus == null) {
            spanStatus = qycVar.getStatus() != null ? qycVar.getStatus() : SpanStatus.OK;
        }
        qycVar.f(spanStatus, hulVar);
    }

    public final void O(@Nullable qyc qycVar, @NotNull SpanStatus spanStatus) {
        if (qycVar == null || qycVar.a()) {
            return;
        }
        qycVar.n(spanStatus);
    }

    public final void P(@Nullable final wzc wzcVar, @Nullable qyc qycVar, @Nullable qyc qycVar2) {
        if (wzcVar == null || wzcVar.a()) {
            return;
        }
        O(qycVar, SpanStatus.DEADLINE_EXCEEDED);
        r0(qycVar2, qycVar);
        y();
        SpanStatus status = wzcVar.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        wzcVar.n(status);
        ftc ftcVar = this.c;
        if (ftcVar != null) {
            ftcVar.v(new hgl() { // from class: io.sentry.android.core.m
                @Override // defpackage.hgl
                public final void a(io.sentry.e eVar) {
                    this.f21544a.g0(wzcVar, eVar);
                }
            });
        }
    }

    @NotNull
    public final String R(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    @NotNull
    public final String S(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    @NotNull
    public final String T(@NotNull qyc qycVar) {
        String description = qycVar.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return qycVar.getDescription() + " - Deadline Exceeded";
    }

    @NotNull
    public final String U(@NotNull String str) {
        return str + " full display";
    }

    @NotNull
    public final String Z(@NotNull String str) {
        return str + " initial display";
    }

    public final boolean b0(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    public final boolean c0(@NotNull Activity activity) {
        return this.p.containsKey(activity);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21370a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.q.p();
    }

    public final /* synthetic */ void d0(io.sentry.e eVar, wzc wzcVar, wzc wzcVar2) {
        if (wzcVar2 == null) {
            eVar.p(wzcVar);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", wzcVar.getName());
        }
    }

    public final /* synthetic */ void o0(WeakReference weakReference, String str, wzc wzcVar) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.q.n(activity, wzcVar.i());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        xta xtaVar;
        SentryAndroidOptions sentryAndroidOptions;
        try {
            u0(bundle);
            if (this.c != null && (sentryAndroidOptions = this.d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.d.a(activity);
                this.c.v(new hgl() { // from class: io.sentry.android.core.i
                    @Override // defpackage.hgl
                    public final void a(io.sentry.e eVar) {
                        eVar.m(strA);
                    }
                });
            }
            w0(activity);
            final qyc qycVar = this.l.get(activity);
            this.h = true;
            if (this.e && qycVar != null && (xtaVar = this.i) != null) {
                xtaVar.b(new xta.a() { // from class: io.sentry.android.core.j
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(@NotNull Activity activity) {
        try {
            if (this.e) {
                O(this.j, SpanStatus.CANCELLED);
                qyc qycVar = this.f21372k.get(activity);
                qyc qycVar2 = this.l.get(activity);
                O(qycVar, SpanStatus.DEADLINE_EXCEEDED);
                r0(qycVar2, qycVar);
                y();
                y0(activity, true);
                this.j = null;
                this.f21372k.remove(activity);
                this.l.remove(activity);
            }
            this.p.remove(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(@NotNull Activity activity) {
        try {
            if (!this.g) {
                this.h = true;
                ftc ftcVar = this.c;
                if (ftcVar == null) {
                    this.m = t.a();
                } else {
                    this.m = ftcVar.i().getDateProvider().now();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.g) {
            this.h = true;
            ftc ftcVar = this.c;
            if (ftcVar == null) {
                this.m = t.a();
            } else {
                this.m = ftcVar.i().getDateProvider().now();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(@NotNull Activity activity) {
        try {
            if (this.e) {
                final qyc qycVar = this.f21372k.get(activity);
                final qyc qycVar2 = this.l.get(activity);
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    io.sentry.android.core.internal.util.k.g(viewFindViewById, new Runnable() { // from class: io.sentry.android.core.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21535a.m0(qycVar2, qycVar);
                        }
                    }, this.f21371b);
                } else {
                    this.n.post(new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21538a.n0(qycVar2, qycVar);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(@NotNull Activity activity) {
        if (this.e) {
            this.q.e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(@NotNull Activity activity) {
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.d = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.c = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        this.e = b0(this.d);
        this.i = this.d.getFullyDisplayedReporter();
        this.f = this.d.isEnableTimeToFullDisplayTracing();
        this.f21370a.registerActivityLifecycleCallbacks(this);
        this.d.getLogger().c(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.k.a("ActivityLifecycle");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void s0(@NotNull final io.sentry.e eVar, @NotNull final wzc wzcVar) {
        eVar.y(new io.sentry.m.c() { // from class: io.sentry.android.core.r
            @Override // io.sentry.m.c
            public final void a(wzc wzcVar2) {
                this.f21582a.d0(eVar, wzcVar, wzcVar2);
            }
        });
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n0(@Nullable qyc qycVar, @Nullable qyc qycVar2) {
        AppStartMetrics appStartMetricsN = AppStartMetrics.n();
        io.sentry.android.core.performance.e eVarH = appStartMetricsN.h();
        io.sentry.android.core.performance.e eVarO = appStartMetricsN.o();
        if (eVarH.p() && eVarH.o()) {
            eVarH.y();
        }
        if (eVarO.p() && eVarO.o()) {
            eVarO.y();
        }
        E();
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions == null || qycVar2 == null) {
            K(qycVar2);
            return;
        }
        hul hulVarNow = sentryAndroidOptions.getDateProvider().now();
        long millis = TimeUnit.NANOSECONDS.toMillis(hulVarNow.b(qycVar2.r()));
        Long lValueOf = Long.valueOf(millis);
        MeasurementUnit.Duration duration = MeasurementUnit.Duration.MILLISECOND;
        qycVar2.o("time_to_initial_display", lValueOf, duration);
        if (qycVar != null && qycVar.a()) {
            qycVar.g(hulVarNow);
            qycVar2.o("time_to_full_display", Long.valueOf(millis), duration);
        }
        M(qycVar2, hulVarNow);
    }

    public final void u0(@Nullable Bundle bundle) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.c != null && this.m.h() == 0) {
            this.m = this.c.i().getDateProvider().now();
        } else if (this.m.h() == 0) {
            this.m = t.a();
        }
        if (this.h || (sentryAndroidOptions = this.d) == null || sentryAndroidOptions.isEnablePerformanceV2()) {
            return;
        }
        AppStartMetrics.n().u(bundle == null ? AppStartMetrics.AppStartType.COLD : AppStartMetrics.AppStartType.WARM);
    }

    public final void v0(qyc qycVar) {
        if (qycVar != null) {
            qycVar.d().m("auto.ui.activity");
        }
    }

    public final void w0(@NotNull Activity activity) {
        hul hulVarI;
        Boolean boolValueOf;
        hul hulVar;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.c == null || c0(activity)) {
            return;
        }
        if (!this.e) {
            this.p.put(activity, hvg.s());
            io.sentry.util.y.h(this.c);
            return;
        }
        x0();
        final String strQ = Q(activity);
        io.sentry.android.core.performance.e eVarI = AppStartMetrics.n().i(this.d);
        qkp qkpVar = null;
        if (u0.n() && eVarI.p()) {
            hulVarI = eVarI.i();
            boolValueOf = Boolean.valueOf(AppStartMetrics.n().j() == AppStartMetrics.AppStartType.COLD);
        } else {
            hulVarI = null;
            boolValueOf = null;
        }
        rwp rwpVar = new rwp();
        rwpVar.n(30000L);
        if (this.d.isEnableActivityLifecycleTracingAutoFinish()) {
            rwpVar.o(this.d.getIdleTimeout());
            rwpVar.d(true);
        }
        rwpVar.r(true);
        rwpVar.q(new qwp() { // from class: io.sentry.android.core.o
            @Override // defpackage.qwp
            public final void a(wzc wzcVar) {
                this.f21556a.o0(weakReference, strQ, wzcVar);
            }
        });
        if (this.h || hulVarI == null || boolValueOf == null) {
            hulVar = this.m;
        } else {
            qkp qkpVarG = AppStartMetrics.n().g();
            AppStartMetrics.n().t(null);
            qkpVar = qkpVarG;
            hulVar = hulVarI;
        }
        rwpVar.p(hulVar);
        rwpVar.m(qkpVar != null);
        final wzc wzcVarQ = this.c.q(new owp(strQ, TransactionNameSource.COMPONENT, "ui.load", qkpVar), rwpVar);
        v0(wzcVarQ);
        if (!this.h && hulVarI != null && boolValueOf != null) {
            qyc qycVarE = wzcVarQ.e(S(boolValueOf.booleanValue()), R(boolValueOf.booleanValue()), hulVarI, Instrumenter.SENTRY);
            this.j = qycVarE;
            v0(qycVarE);
            E();
        }
        String strZ = Z(strQ);
        Instrumenter instrumenter = Instrumenter.SENTRY;
        final qyc qycVarE2 = wzcVarQ.e("ui.load.initial_display", strZ, hulVar, instrumenter);
        this.f21372k.put(activity, qycVarE2);
        v0(qycVarE2);
        if (this.f && this.i != null && this.d != null) {
            final qyc qycVarE3 = wzcVarQ.e("ui.load.full_display", U(strQ), hulVar, instrumenter);
            v0(qycVarE3);
            try {
                this.l.put(activity, qycVarE3);
                this.o = this.d.getExecutorService().a(new Runnable() { // from class: io.sentry.android.core.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21559a.r0(qycVarE3, qycVarE2);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e) {
                this.d.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
            }
        }
        this.c.v(new hgl() { // from class: io.sentry.android.core.q
            @Override // defpackage.hgl
            public final void a(io.sentry.e eVar) {
                this.f21577a.s0(wzcVarQ, eVar);
            }
        });
        this.p.put(activity, wzcVarQ);
    }

    public final void x0() {
        for (Map.Entry<Activity, wzc> entry : this.p.entrySet()) {
            P(entry.getValue(), this.f21372k.get(entry.getKey()), this.l.get(entry.getKey()));
        }
    }

    public final void y() {
        Future<?> future = this.o;
        if (future != null) {
            future.cancel(false);
            this.o = null;
        }
    }

    public final void y0(@NotNull Activity activity, boolean z) {
        if (this.e && z) {
            P(this.p.get(activity), null, null);
        }
    }
}
