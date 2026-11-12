package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
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
public final class UserInteractionIntegration implements ucd, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f21419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ftc f21420b;

    @Nullable
    public SentryAndroidOptions c;
    public final boolean d;

    public UserInteractionIntegration(@NotNull Application application, @NotNull f1 f1Var) {
        this.f21419a = (Application) io.sentry.util.p.c(application, "Application is required");
        this.d = f1Var.b("androidx.core.view.GestureDetectorCompat", this.c);
    }

    public final void a(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f21420b == null || this.c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f21420b, this.c), this.c));
    }

    public final void b(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21419a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
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
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.c = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.f21420b = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        boolean z = this.c.isEnableUserInteractionBreadcrumbs() || this.c.isEnableUserInteractionTracing();
        ILogger logger = this.c.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.d) {
                sentryOptions.getLogger().c(SentryLevel.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f21419a.registerActivityLifecycleCallbacks(this);
            this.c.getLogger().c(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.k.a("UserInteraction");
        }
    }
}
