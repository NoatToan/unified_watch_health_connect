package io.sentry.transport;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.hul;
import defpackage.iul;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends ThreadPoolExecutor {
    public static final long f = yq5.h(VibrateModeProgressBar.sLongToLong);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public hul f21874b;

    @NotNull
    public final ILogger c;

    @NotNull
    public final iul d;

    @NotNull
    public final a0 e;

    public static final class a<T> implements Future<T> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @NotNull TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public w(int i, int i2, @NotNull ThreadFactory threadFactory, @NotNull RejectedExecutionHandler rejectedExecutionHandler, @NotNull ILogger iLogger, @NotNull iul iulVar) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f21874b = null;
        this.e = new a0();
        this.f21873a = i2;
        this.c = iLogger;
        this.d = iulVar;
    }

    public boolean a() {
        hul hulVar = this.f21874b;
        return hulVar != null && this.d.now().b(hulVar) < f;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th) {
        try {
            super.afterExecute(runnable, th);
        } finally {
            this.e.a();
        }
    }

    public boolean b() {
        return this.e.b() < this.f21873a;
    }

    public void c(long j) {
        try {
            this.e.d(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            this.c.a(SentryLevel.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(@NotNull Runnable runnable) {
        if (b()) {
            this.e.c();
            return super.submit(runnable);
        }
        this.f21874b = this.d.now();
        this.c.c(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}
