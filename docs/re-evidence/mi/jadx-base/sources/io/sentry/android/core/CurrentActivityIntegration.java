package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class CurrentActivityIntegration implements ucd, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f21387a;

    public CurrentActivityIntegration(@NotNull Application application) {
        this.f21387a = (Application) io.sentry.util.p.c(application, "Application is required");
    }

    public final void a(@NotNull Activity activity) {
        if (v0.c().b() == activity) {
            v0.c().a();
        }
    }

    public final void b(@NotNull Activity activity) {
        v0.c().d(activity);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21387a.unregisterActivityLifecycleCallbacks(this);
        v0.c().a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(activity);
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.f21387a.registerActivityLifecycleCallbacks(this);
    }
}
