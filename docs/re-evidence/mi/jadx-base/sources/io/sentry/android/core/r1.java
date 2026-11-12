package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import defpackage.cul;
import defpackage.ech;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21585a = SystemClock.uptimeMillis();

    public static void d(@NotNull SentryOptions sentryOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ucd ucdVar : sentryOptions.getIntegrations()) {
            if (z && (ucdVar instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(ucdVar);
            }
            if (z2 && (ucdVar instanceof SentryTimberIntegration)) {
                arrayList.add(ucdVar);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryOptions.getIntegrations().remove((ucd) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryOptions.getIntegrations().remove((ucd) arrayList.get(i2));
            }
        }
    }

    public static void e(@NotNull Context context, @NotNull cul.a<SentryAndroidOptions> aVar) {
        g(context, new u(), aVar);
    }

    public static void f(@NotNull Context context, @NotNull ILogger iLogger) {
        g(context, iLogger, new cul.a() { // from class: io.sentry.android.core.o1
            @Override // cul.a
            public final void a(SentryOptions sentryOptions) {
                r1.h((SentryAndroidOptions) sentryOptions);
            }
        });
    }

    @SuppressLint({"NewApi"})
    public static synchronized void g(@NotNull final Context context, @NotNull final ILogger iLogger, @NotNull final cul.a<SentryAndroidOptions> aVar) {
        try {
            try {
                try {
                    cul.q(ech.a(SentryAndroidOptions.class), new cul.a() { // from class: io.sentry.android.core.p1
                        @Override // cul.a
                        public final void a(SentryOptions sentryOptions) {
                            r1.i(iLogger, context, aVar, (SentryAndroidOptions) sentryOptions);
                        }
                    }, true);
                    ftc ftcVarO = cul.o();
                    if (u0.n()) {
                        if (ftcVarO.i().isEnableAutoSessionTracking()) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            ftcVarO.v(new hgl() { // from class: io.sentry.android.core.q1
                                @Override // defpackage.hgl
                                public final void a(io.sentry.e eVar) {
                                    r1.j(atomicBoolean, eVar);
                                }
                            });
                            if (!atomicBoolean.get()) {
                                ftcVarO.k();
                            }
                        }
                        ftcVarO.i().getReplayController().start();
                    }
                } catch (IllegalAccessException e) {
                    iLogger.a(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e);
                } catch (InvocationTargetException e2) {
                    iLogger.a(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
                }
            } catch (InstantiationException e3) {
                iLogger.a(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (NoSuchMethodException e4) {
                iLogger.a(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void h(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void i(ILogger iLogger, Context context, cul.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        f1 f1Var = new f1();
        boolean zB = f1Var.b("timber.log.Timber", sentryAndroidOptions);
        boolean z = f1Var.b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && f1Var.b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions);
        boolean z2 = zB && f1Var.b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zB2 = f1Var.b("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        r0 r0Var = new r0(iLogger);
        f1 f1Var2 = new f1();
        h hVar = new h(f1Var2, sentryAndroidOptions);
        z.k(sentryAndroidOptions, context, iLogger, r0Var);
        z.g(context, sentryAndroidOptions, r0Var, f1Var2, hVar, z, z2, zB2);
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        AppStartMetrics appStartMetricsN = AppStartMetrics.n();
        if (sentryAndroidOptions.isEnablePerformanceV2() && r0Var.d() >= 24) {
            io.sentry.android.core.performance.e eVarH = appStartMetricsN.h();
            if (eVarH.n()) {
                eVarH.w(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            appStartMetricsN.r((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.e eVarO = appStartMetricsN.o();
        if (eVarO.n()) {
            eVarO.w(f21585a);
        }
        z.f(sentryAndroidOptions, context, r0Var, f1Var2, hVar);
        d(sentryAndroidOptions, z, z2);
    }

    public static /* synthetic */ void j(AtomicBoolean atomicBoolean, io.sentry.e eVar) {
        Session sessionI = eVar.i();
        if (sessionI == null || sessionI.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }
}
