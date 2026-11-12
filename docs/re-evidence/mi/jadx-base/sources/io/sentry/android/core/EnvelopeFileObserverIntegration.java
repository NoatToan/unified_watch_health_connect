package io.sentry.android.core;

import defpackage.ftc;
import defpackage.geh;
import defpackage.ucd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a1 f21388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ILogger f21389b;
    public boolean c = false;

    @NotNull
    public final Object d = new Object();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        @Nullable
        public String c(@NotNull SentryOptions sentryOptions) {
            return sentryOptions.getOutboxPath();
        }
    }

    @NotNull
    public static EnvelopeFileObserverIntegration b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @TestOnly
    @Nullable
    public abstract String c(@NotNull SentryOptions sentryOptions);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.d) {
            this.c = true;
        }
        a1 a1Var = this.f21388a;
        if (a1Var != null) {
            a1Var.stopWatching();
            ILogger iLogger = this.f21389b;
            if (iLogger != null) {
                iLogger.c(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    public final /* synthetic */ void d(ftc ftcVar, SentryOptions sentryOptions, String str) {
        synchronized (this.d) {
            try {
                if (!this.c) {
                    l(ftcVar, sentryOptions, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions, @NotNull String str) {
        a1 a1Var = new a1(str, new geh(ftcVar, sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis());
        this.f21388a = a1Var;
        try {
            a1Var.startWatching();
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // defpackage.ucd
    public final void register(@NotNull final ftc ftcVar, @NotNull final SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        io.sentry.util.p.c(sentryOptions, "SentryOptions is required");
        this.f21389b = sentryOptions.getLogger();
        final String strC = c(sentryOptions);
        if (strC == null) {
            this.f21389b.c(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f21389b.c(SentryLevel.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strC);
        try {
            sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21441a.d(ftcVar, sentryOptions, strC);
                }
            });
        } catch (Throwable th) {
            this.f21389b.a(SentryLevel.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}
