package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public abstract class d implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f21714a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21715b;

    @NotNull
    public final ILogger c;

    public d(long j, @NotNull ILogger iLogger) {
        this.f21715b = j;
        this.c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void a() {
        this.f21714a.countDown();
    }

    @Override // io.sentry.hints.h
    public boolean g() {
        try {
            return this.f21714a.await(this.f21715b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.c.a(SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }
}
