package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class AppLifecycleIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @TestOnly
    @Nullable
    public volatile LifecycleWatcher f21384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SentryAndroidOptions f21385b;

    @NotNull
    public final g1 c;

    public AppLifecycleIntegration() {
        this(new g1());
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void l(@NotNull ftc ftcVar) {
        SentryAndroidOptions sentryAndroidOptions = this.f21385b;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f21384a = new LifecycleWatcher(ftcVar, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f21385b.isEnableAutoSessionTracking(), this.f21385b.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this.f21384a);
            this.f21385b.getLogger().c(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            io.sentry.util.k.a("AppLifecycle");
        } catch (Throwable th) {
            this.f21384a = null;
            this.f21385b.getLogger().a(SentryLevel.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21384a == null) {
            return;
        }
        if (io.sentry.android.core.internal.util.c.b().a()) {
            d();
        } else {
            this.c.b(new Runnable() { // from class: io.sentry.android.core.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21558a.d();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void d() {
        LifecycleWatcher lifecycleWatcher = this.f21384a;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.f21385b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f21384a = null;
    }

    @Override // defpackage.ucd
    public void register(@NotNull final ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.f21385b = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f21385b.isEnableAutoSessionTracking()));
        this.f21385b.getLogger().c(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f21385b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f21385b.isEnableAutoSessionTracking() || this.f21385b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
                if (io.sentry.android.core.internal.util.c.b().a()) {
                    l(ftcVar);
                } else {
                    this.c.b(new Runnable() { // from class: io.sentry.android.core.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21561a.l(ftcVar);
                        }
                    });
                }
            } catch (ClassNotFoundException e) {
                sentryOptions.getLogger().a(SentryLevel.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e);
            } catch (IllegalStateException e2) {
                sentryOptions.getLogger().a(SentryLevel.ERROR, "AppLifecycleIntegration could not be installed", e2);
            }
        }
    }

    public AppLifecycleIntegration(@NotNull g1 g1Var) {
        this.c = g1Var;
    }
}
