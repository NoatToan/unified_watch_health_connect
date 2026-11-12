package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements ucd, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ftc f21383b;

    @Nullable
    public SentryAndroidOptions c;

    public AppComponentsBreadcrumbsIntegration(@NotNull Context context) {
        this.f21382a = (Context) io.sentry.util.p.c(u0.a(context), "Context is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f21382a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(SentryLevel.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void n(long j, @NotNull Configuration configuration) {
        if (this.f21383b != null) {
            Device.DeviceOrientation deviceOrientationA = io.sentry.android.core.internal.util.h.a(this.f21382a.getResources().getConfiguration().orientation);
            String lowerCase = deviceOrientationA != null ? deviceOrientationA.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.a aVar = new io.sentry.a(j);
            aVar.q("navigation");
            aVar.m("device.orientation");
            aVar.n("position", lowerCase);
            aVar.o(SentryLevel.INFO);
            c8c c8cVar = new c8c();
            c8cVar.l("android:configuration", configuration);
            this.f21383b.o(aVar, c8cVar);
        }
    }

    public final void l(long j, @Nullable Integer num) {
        if (this.f21383b != null) {
            io.sentry.a aVar = new io.sentry.a(j);
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    aVar.n("level", num);
                }
            }
            aVar.q("system");
            aVar.m("device.event");
            aVar.p("Low memory");
            aVar.n("action", "LOW_MEMORY");
            aVar.o(SentryLevel.WARNING);
            this.f21383b.m(aVar);
        }
    }

    public final void m(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.c.getLogger().b(SentryLevel.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    public final /* synthetic */ void o(long j) {
        l(j, null);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m(new Runnable() { // from class: io.sentry.android.core.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21546a.n(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m(new Runnable() { // from class: io.sentry.android.core.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21540a.o(jCurrentTimeMillis);
            }
        });
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m(new Runnable() { // from class: io.sentry.android.core.n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21552a.p(jCurrentTimeMillis, i);
            }
        });
    }

    public final /* synthetic */ void p(long j, int i) {
        l(j, Integer.valueOf(i));
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.f21383b = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableAppComponentBreadcrumbs()));
        if (this.c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f21382a.registerComponentCallbacks(this);
                sentryOptions.getLogger().c(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.k.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.c.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().b(SentryLevel.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}
