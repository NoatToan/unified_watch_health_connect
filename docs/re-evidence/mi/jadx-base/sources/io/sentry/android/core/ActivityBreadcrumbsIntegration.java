package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.xiaomi.fitness.devicesettings.thirdparty.PhoneStateBroadcastReceiver;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityBreadcrumbsIntegration implements ucd, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f21368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ftc f21369b;
    public boolean c;

    public ActivityBreadcrumbsIntegration(@NotNull Application application) {
        this.f21368a = (Application) io.sentry.util.p.c(application, "Application is required");
    }

    public final void a(@NotNull Activity activity, @NotNull String str) {
        if (this.f21369b == null) {
            return;
        }
        io.sentry.a aVar = new io.sentry.a();
        aVar.q("navigation");
        aVar.n("state", str);
        aVar.n(PhoneStateBroadcastReceiver.PARAMS_SCREEN, b(activity));
        aVar.m("ui.lifecycle");
        aVar.o(SentryLevel.INFO);
        c8c c8cVar = new c8c();
        c8cVar.l("android:activity", activity);
        this.f21369b.o(aVar, c8cVar);
    }

    @NotNull
    public final String b(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            this.f21368a.unregisterActivityLifecycleCallbacks(this);
            ftc ftcVar = this.f21369b;
            if (ftcVar != null) {
                ftcVar.i().getLogger().c(SentryLevel.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        a(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(@NotNull Activity activity) {
        a(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(@NotNull Activity activity) {
        a(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(@NotNull Activity activity) {
        a(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        a(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(@NotNull Activity activity) {
        a(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(@NotNull Activity activity) {
        a(activity, "stopped");
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.f21369b = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        this.c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c));
        if (this.c) {
            this.f21368a.registerActivityLifecycleCallbacks(this);
            sentryOptions.getLogger().c(sentryLevel, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.k.a("ActivityBreadcrumbs");
        }
    }
}
