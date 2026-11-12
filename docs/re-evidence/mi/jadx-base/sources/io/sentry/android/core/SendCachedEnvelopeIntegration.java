package io.sentry.android.core;

import defpackage.ftc;
import defpackage.osl;
import defpackage.rsl;
import defpackage.ucd;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements ucd, IConnectionStatusProvider.a, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final rsl f21408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.util.m<Boolean> f21409b;

    @Nullable
    public IConnectionStatusProvider d;

    @Nullable
    public ftc e;

    @Nullable
    public SentryAndroidOptions f;

    @Nullable
    public osl g;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public SendCachedEnvelopeIntegration(@NotNull rsl rslVar, @NotNull io.sentry.util.m<Boolean> mVar) {
        this.f21408a = (rsl) io.sentry.util.p.c(rslVar, "SendFireAndForgetFactory is required");
        this.f21409b = mVar;
    }

    public final /* synthetic */ void b(SentryAndroidOptions sentryAndroidOptions, ftc ftcVar) {
        try {
            if (this.i.get()) {
                sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!this.h.getAndSet(true)) {
                IConnectionStatusProvider connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                this.d = connectionStatusProvider;
                connectionStatusProvider.d(this);
                this.g = this.f21408a.c(ftcVar, sentryAndroidOptions);
            }
            IConnectionStatusProvider iConnectionStatusProvider = this.d;
            if (iConnectionStatusProvider != null && iConnectionStatusProvider.b() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.z zVarG = ftcVar.g();
            if (zVarG != null && zVarG.o(DataCategory.All)) {
                sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            osl oslVar = this.g;
            if (oslVar == null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                oslVar.a();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Failed trying to send cached events.", th);
        }
    }

    public final synchronized void c(@NotNull final ftc ftcVar, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        try {
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21554a.b(sentryAndroidOptions, ftcVar);
                    }
                });
                if (this.f21409b.a().booleanValue() && this.c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i.set(true);
        IConnectionStatusProvider iConnectionStatusProvider = this.d;
        if (iConnectionStatusProvider != null) {
            iConnectionStatusProvider.c(this);
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.a
    public void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        SentryAndroidOptions sentryAndroidOptions;
        ftc ftcVar = this.e;
        if (ftcVar == null || (sentryAndroidOptions = this.f) == null) {
            return;
        }
        c(ftcVar, sentryAndroidOptions);
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        this.e = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        this.f = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        if (!this.f21408a.a(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().c(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.k.a("SendCachedEnvelope");
            c(ftcVar, this.f);
        }
    }
}
