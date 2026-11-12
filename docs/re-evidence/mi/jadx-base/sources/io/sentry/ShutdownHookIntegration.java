package io.sentry;

import defpackage.ftc;
import defpackage.ucd;
import io.sentry.ShutdownHookIntegration;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class ShutdownHookIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Runtime f21359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Thread f21360b;

    @TestOnly
    public ShutdownHookIntegration(@NotNull Runtime runtime) {
        this.f21359a = (Runtime) io.sentry.util.p.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void m(ftc ftcVar, SentryOptions sentryOptions) {
        ftcVar.h(sentryOptions.getFlushTimeoutMillis());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21360b != null) {
            d(new Runnable() { // from class: ibm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20981a.l();
                }
            });
        }
    }

    public final void d(@NotNull Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    public final /* synthetic */ void l() {
        this.f21359a.removeShutdownHook(this.f21360b);
    }

    public final /* synthetic */ void n(SentryOptions sentryOptions) {
        this.f21359a.addShutdownHook(this.f21360b);
        sentryOptions.getLogger().c(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.k.a("ShutdownHook");
    }

    @Override // defpackage.ucd
    public void register(@NotNull final ftc ftcVar, @NotNull final SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        io.sentry.util.p.c(sentryOptions, "SentryOptions is required");
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().c(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f21360b = new Thread(new Runnable() { // from class: jbm
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.m(ftcVar, sentryOptions);
                }
            });
            d(new Runnable() { // from class: kbm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23693a.n(sentryOptions);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
