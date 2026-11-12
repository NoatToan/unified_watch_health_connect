package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.exception.ExceptionMechanismException;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class AnrIntegration implements ucd, Closeable {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static c e;

    @NotNull
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21374b = false;

    @NotNull
    public final Object c = new Object();

    @Nullable
    public SentryOptions d;

    public static final class a implements io.sentry.hints.a, io.sentry.hints.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21375a;

        public a(boolean z) {
            this.f21375a = z;
        }

        @Override // io.sentry.hints.a
        @Nullable
        public Long b() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f21375a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(@NotNull Context context) {
        this.f21373a = u0.a(context);
    }

    @NotNull
    public final Throwable c(boolean z, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.g gVar = new io.sentry.protocol.g();
        gVar.j("ANR");
        return new ExceptionMechanismException(gVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.c) {
            this.f21374b = true;
        }
        synchronized (f) {
            try {
                c cVar = e;
                if (cVar != null) {
                    cVar.interrupt();
                    e = null;
                    SentryOptions sentryOptions = this.d;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().c(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void d(ftc ftcVar, SentryAndroidOptions sentryAndroidOptions) {
        synchronized (this.c) {
            try {
                if (!this.f21374b) {
                    o(ftcVar, sentryAndroidOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(@NotNull final ftc ftcVar, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.k.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21461a.d(ftcVar, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().a(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    @TestOnly
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void l(@NotNull ftc ftcVar, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(q0.a().b());
        io.sentry.s sVar = new io.sentry.s(c(zEquals, sentryAndroidOptions, applicationNotResponding));
        sVar.B0(SentryLevel.ERROR);
        ftcVar.t(sVar, io.sentry.util.j.e(new a(zEquals)));
    }

    public final void o(@NotNull final ftc ftcVar, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        synchronized (f) {
            try {
                if (e == null) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    SentryLevel sentryLevel = SentryLevel.DEBUG;
                    logger.c(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    c cVar = new c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new c.a() { // from class: io.sentry.android.core.g0
                        @Override // io.sentry.android.core.c.a
                        public final void a(ApplicationNotResponding applicationNotResponding) {
                            this.f21465a.l(ftcVar, sentryAndroidOptions, applicationNotResponding);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f21373a);
                    e = cVar;
                    cVar.start();
                    sentryAndroidOptions.getLogger().c(sentryLevel, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ucd
    public final void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.d = (SentryOptions) io.sentry.util.p.c(sentryOptions, "SentryOptions is required");
        m(ftcVar, (SentryAndroidOptions) sentryOptions);
    }
}
