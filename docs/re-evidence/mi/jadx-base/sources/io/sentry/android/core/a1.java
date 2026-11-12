package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.c8c;
import defpackage.ksc;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ksc f21425b;

    @NotNull
    public final ILogger c;
    public final long d;

    public static final class a implements io.sentry.hints.e, io.sentry.hints.j, io.sentry.hints.o, io.sentry.hints.h, io.sentry.hints.b, io.sentry.hints.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f21426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f21427b;

        @NotNull
        public CountDownLatch c;
        public final long d;

        @NotNull
        public final ILogger e;

        public a(long j, @NotNull ILogger iLogger) {
            reset();
            this.d = j;
            this.e = (ILogger) io.sentry.util.p.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.j
        public boolean b() {
            return this.f21426a;
        }

        @Override // io.sentry.hints.o
        public void c(boolean z) {
            this.f21427b = z;
            this.c.countDown();
        }

        @Override // io.sentry.hints.j
        public void d(boolean z) {
            this.f21426a = z;
        }

        @Override // io.sentry.hints.h
        public boolean g() {
            try {
                return this.c.await(this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                this.e.a(SentryLevel.ERROR, "Exception while awaiting on lock.", e);
                return false;
            }
        }

        @Override // io.sentry.hints.o
        public boolean isSuccess() {
            return this.f21427b;
        }

        @Override // io.sentry.hints.i
        public void reset() {
            this.c = new CountDownLatch(1);
            this.f21426a = false;
            this.f21427b = false;
        }
    }

    public a1(String str, ksc kscVar, @NotNull ILogger iLogger, long j) {
        super(str);
        this.f21424a = str;
        this.f21425b = (ksc) io.sentry.util.p.c(kscVar, "Envelope sender is required.");
        this.c = (ILogger) io.sentry.util.p.c(iLogger, "Logger is required.");
        this.d = j;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, @Nullable String str) {
        if (str == null || i != 8) {
            return;
        }
        this.c.c(SentryLevel.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i), this.f21424a, str);
        c8c c8cVarE = io.sentry.util.j.e(new a(this.d, this.c));
        this.f21425b.a(this.f21424a + File.separator + str, c8cVarE);
    }
}
