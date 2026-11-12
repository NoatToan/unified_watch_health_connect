package io.sentry.backpressure;

import defpackage.dyc;
import defpackage.ftc;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ftc f21666b;
    public int c = 0;

    public a(@NotNull SentryOptions sentryOptions, @NotNull ftc ftcVar) {
        this.f21665a = sentryOptions;
        this.f21666b = ftcVar;
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.c;
    }

    public void b() {
        if (c()) {
            if (this.c > 0) {
                this.f21665a.getLogger().c(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.c = 0;
        } else {
            int i = this.c;
            if (i < 10) {
                this.c = i + 1;
                this.f21665a.getLogger().c(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.c));
            }
        }
    }

    public final boolean c() {
        return this.f21666b.e();
    }

    public final void d(int i) {
        dyc executorService = this.f21665a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        executorService.a(this, i);
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
