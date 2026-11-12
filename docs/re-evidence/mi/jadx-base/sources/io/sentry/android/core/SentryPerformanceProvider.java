package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import defpackage.hvl;
import defpackage.qkp;
import defpackage.xug;
import defpackage.xzc;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.performance.AppStartMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class SentryPerformanceProvider extends z0 {
    public static final long f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Application f21410b;

    @Nullable
    public Application.ActivityLifecycleCallbacks c;

    @NotNull
    public final ILogger d;

    @NotNull
    public final r0 e;

    public class a extends io.sentry.android.core.performance.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<Activity, io.sentry.android.core.performance.b> f21411a = new WeakHashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppStartMetrics f21412b;
        public final /* synthetic */ AtomicBoolean c;

        public a(AppStartMetrics appStartMetrics, AtomicBoolean atomicBoolean) {
            this.f21412b = appStartMetrics;
            this.c = atomicBoolean;
        }

        public final /* synthetic */ void b(AtomicBoolean atomicBoolean) {
            if (atomicBoolean.compareAndSet(false, true)) {
                SentryPerformanceProvider.this.c();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
            if (this.f21412b.j() == AppStartMetrics.AppStartType.UNKNOWN) {
                this.f21412b.u(bundle == null ? AppStartMetrics.AppStartType.COLD : AppStartMetrics.AppStartType.WARM);
            }
        }

        @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f21411a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, @Nullable Bundle bundle) {
            io.sentry.android.core.performance.b bVar;
            if (this.f21412b.h().r() || (bVar = this.f21411a.get(activity)) == null) {
                return;
            }
            bVar.b().y();
            bVar.b().s(activity.getClass().getName() + ".onCreate");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            io.sentry.android.core.performance.b bVarRemove = this.f21411a.remove(activity);
            if (this.f21412b.h().r() || bVarRemove == null) {
                return;
            }
            bVarRemove.c().y();
            bVarRemove.c().s(activity.getClass().getName() + ".onStart");
            this.f21412b.c(bVarRemove);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, @Nullable Bundle bundle) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f21412b.h().r()) {
                return;
            }
            io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b();
            bVar.b().w(jUptimeMillis);
            this.f21411a.put(activity, bVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStarted(Activity activity) {
            io.sentry.android.core.performance.b bVar;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (this.f21412b.h().r() || (bVar = this.f21411a.get(activity)) == null) {
                return;
            }
            bVar.c().w(jUptimeMillis);
        }

        @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.c.get()) {
                return;
            }
            final AtomicBoolean atomicBoolean = this.c;
            io.sentry.android.core.internal.util.k.f(activity, new Runnable() { // from class: io.sentry.android.core.u1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21597a.b(atomicBoolean);
                }
            }, new r0(xug.e()));
        }
    }

    public SentryPerformanceProvider() {
        u uVar = new u();
        this.d = uVar;
        this.e = new r0(uVar);
    }

    public final void a(@NotNull AppStartMetrics appStartMetrics) {
        Context context = getContext();
        if (context == null) {
            this.d.c(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        if (this.e.d() < 21) {
            return;
        }
        File file = new File(z.d(context), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    io.sentry.n nVar = (io.sentry.n) new io.sentry.f(SentryOptions.empty()).b(bufferedReader, io.sentry.n.class);
                    if (nVar == null) {
                        this.d.c(SentryLevel.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                        bufferedReader.close();
                        return;
                    }
                    if (!nVar.f()) {
                        this.d.c(SentryLevel.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                        bufferedReader.close();
                        return;
                    }
                    qkp qkpVar = new qkp(Boolean.valueOf(nVar.g()), nVar.d(), Boolean.valueOf(nVar.e()), nVar.a());
                    appStartMetrics.t(qkpVar);
                    if (qkpVar.b().booleanValue() && qkpVar.d().booleanValue()) {
                        this.d.c(SentryLevel.DEBUG, "App start profiling started.", new Object[0]);
                        d0 d0Var = new d0(context, this.e, new io.sentry.android.core.internal.util.t(context, this.d, this.e), this.d, nVar.b(), nVar.f(), nVar.c(), new hvl());
                        appStartMetrics.s(d0Var);
                        d0Var.start();
                        bufferedReader.close();
                        return;
                    }
                    this.d.c(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                this.d.a(SentryLevel.ERROR, "App start profiling config file not found. ", e);
            } catch (Throwable th3) {
                this.d.a(SentryLevel.ERROR, "Error reading app start profiling config file. ", th3);
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @SuppressLint({"NewApi"})
    public final void b(@Nullable Context context, @NotNull AppStartMetrics appStartMetrics) {
        appStartMetrics.o().w(f);
        if (this.e.d() < 24) {
            return;
        }
        if (context instanceof Application) {
            this.f21410b = (Application) context;
        }
        if (this.f21410b == null) {
            return;
        }
        appStartMetrics.h().w(Process.getStartUptimeMillis());
        appStartMetrics.r(this.f21410b);
        a aVar = new a(appStartMetrics, new AtomicBoolean(false));
        this.c = aVar;
        this.f21410b.registerActivityLifecycleCallbacks(aVar);
    }

    @TestOnly
    public synchronized void c() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        AppStartMetrics appStartMetricsN = AppStartMetrics.n();
        appStartMetricsN.o().y();
        appStartMetricsN.h().y();
        Application application = this.f21410b;
        if (application != null && (activityLifecycleCallbacks = this.c) != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        AppStartMetrics appStartMetricsN = AppStartMetrics.n();
        b(getContext(), appStartMetricsN);
        a(appStartMetricsN);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        synchronized (AppStartMetrics.n()) {
            try {
                xzc xzcVarF = AppStartMetrics.n().f();
                if (xzcVarF != null) {
                    xzcVarF.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
