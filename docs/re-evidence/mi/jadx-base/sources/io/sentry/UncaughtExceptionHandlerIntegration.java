package io.sentry;

import defpackage.c8c;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.EventDropReason;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements ucd, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Thread.UncaughtExceptionHandler f21363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ftc f21364b;

    @Nullable
    public SentryOptions c;
    public boolean d;

    @NotNull
    public final a0 e;

    @ApiStatus.Internal
    public static class a extends io.sentry.hints.d implements io.sentry.hints.k, io.sentry.hints.p {
        public final AtomicReference<io.sentry.protocol.p> d;

        public a(long j, @NotNull ILogger iLogger) {
            super(j, iLogger);
            this.d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public boolean e(@Nullable io.sentry.protocol.p pVar) {
            io.sentry.protocol.p pVar2 = this.d.get();
            return pVar2 != null && pVar2.equals(pVar);
        }

        @Override // io.sentry.hints.f
        public void f(@NotNull io.sentry.protocol.p pVar) {
            this.d.set(pVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(a0.a.c());
    }

    @TestOnly
    @NotNull
    public static Throwable a(@NotNull Thread thread, @NotNull Throwable th) {
        io.sentry.protocol.g gVar = new io.sentry.protocol.g();
        gVar.i(Boolean.FALSE);
        gVar.j("UncaughtExceptionHandler");
        return new ExceptionMechanismException(gVar, th, thread);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.e.b()) {
            this.e.a(this.f21363a);
            SentryOptions sentryOptions = this.c;
            if (sentryOptions != null) {
                sentryOptions.getLogger().c(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions) {
        if (this.d) {
            sentryOptions.getLogger().c(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.d = true;
        this.f21364b = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryOptions sentryOptions2 = (SentryOptions) io.sentry.util.p.c(sentryOptions, "SentryOptions is required");
        this.c = sentryOptions2;
        ILogger logger = sentryOptions2.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.c.isEnableUncaughtExceptionHandler()));
        if (this.c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.e.b();
            if (uncaughtExceptionHandlerB != null) {
                this.c.getLogger().c(sentryLevel, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                    this.f21363a = ((UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB).f21363a;
                } else {
                    this.f21363a = uncaughtExceptionHandlerB;
                }
            }
            this.e.a(this);
            this.c.getLogger().c(sentryLevel, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            io.sentry.util.k.a("UncaughtExceptionHandler");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        SentryOptions sentryOptions = this.c;
        if (sentryOptions == null || this.f21364b == null) {
            return;
        }
        sentryOptions.getLogger().c(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.c.getFlushTimeoutMillis(), this.c.getLogger());
            s sVar = new s(a(thread, th));
            sVar.B0(SentryLevel.FATAL);
            if (this.f21364b.j() == null && sVar.G() != null) {
                aVar.f(sVar.G());
            }
            c8c c8cVarE = io.sentry.util.j.e(aVar);
            boolean zEquals = this.f21364b.t(sVar, c8cVarE).equals(io.sentry.protocol.p.f21803b);
            EventDropReason eventDropReasonF = io.sentry.util.j.f(c8cVarE);
            if ((!zEquals || EventDropReason.MULTITHREADED_DEDUPLICATION.equals(eventDropReasonF)) && !aVar.g()) {
                this.c.getLogger().c(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", sVar.G());
            }
        } catch (Throwable th2) {
            this.c.getLogger().a(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f21363a != null) {
            this.c.getLogger().c(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f21363a.uncaughtException(thread, th);
        } else if (this.c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    public UncaughtExceptionHandlerIntegration(@NotNull a0 a0Var) {
        this.d = false;
        this.e = (a0) io.sentry.util.p.c(a0Var, "threadAdapter is required.");
    }
}
