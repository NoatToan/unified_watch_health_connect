package io.sentry.transport;

import defpackage.c8c;
import defpackage.iok;
import defpackage.iul;
import defpackage.jul;
import defpackage.yq5;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.clientreport.DiscardReason;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f21851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.cache.g f21852b;

    @NotNull
    public final SentryOptions c;

    @NotNull
    public final z d;

    @NotNull
    public final r e;

    @NotNull
    public final o f;

    @Nullable
    public volatile Runnable g;

    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21853a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryAsyncConnection-");
            int i = this.f21853a;
            this.f21853a = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final jul f21854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final c8c f21855b;

        @NotNull
        public final io.sentry.cache.g c;
        public final b0 d = b0.a();

        public c(@NotNull jul julVar, @NotNull c8c c8cVar, io.sentry.cache.g gVar) {
            this.f21854a = (jul) io.sentry.util.p.c(julVar, "Envelope is required.");
            this.f21855b = c8cVar;
            this.c = (io.sentry.cache.g) io.sentry.util.p.c(gVar, "EnvelopeCache is required.");
        }

        @NotNull
        public final b0 j() {
            b0 b0Var = this.d;
            this.f21854a.b().d(null);
            this.c.S(this.f21854a, this.f21855b);
            io.sentry.util.j.o(this.f21855b, io.sentry.hints.f.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    this.f21858a.k((io.sentry.hints.f) obj);
                }
            });
            if (!e.this.e.isConnected()) {
                io.sentry.util.j.p(this.f21855b, io.sentry.hints.j.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).d(true);
                    }
                }, new io.sentry.util.j.b() { // from class: io.sentry.transport.l
                    @Override // io.sentry.util.j.b
                    public final void a(Object obj, Class cls) {
                        this.f21863a.p(obj, cls);
                    }
                });
                return b0Var;
            }
            final jul julVarD = e.this.c.getClientReportRecorder().d(this.f21854a);
            try {
                julVarD.b().d(yq5.j(e.this.c.getDateProvider().now().h()));
                b0 b0VarH = e.this.f.h(julVarD);
                if (b0VarH.d()) {
                    this.c.O(this.f21854a);
                    return b0VarH;
                }
                String str = "The transport failed to send the envelope with response code " + b0VarH.c();
                e.this.c.getLogger().c(SentryLevel.ERROR, str, new Object[0]);
                if (b0VarH.c() >= 400 && b0VarH.c() != 429) {
                    io.sentry.util.j.n(this.f21855b, io.sentry.hints.j.class, new io.sentry.util.j.c() { // from class: io.sentry.transport.h
                        @Override // io.sentry.util.j.c
                        public final void accept(Object obj) {
                            this.f21859a.l(julVarD, obj);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e) {
                io.sentry.util.j.p(this.f21855b, io.sentry.hints.j.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).d(true);
                    }
                }, new io.sentry.util.j.b() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.j.b
                    public final void a(Object obj, Class cls) {
                        this.f21861a.n(julVarD, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e);
            }
        }

        public final /* synthetic */ void k(io.sentry.hints.f fVar) {
            if (!fVar.e(this.f21854a.b().a())) {
                e.this.c.getLogger().c(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.a();
                e.this.c.getLogger().c(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public final /* synthetic */ void l(jul julVar, Object obj) {
            e.this.c.getClientReportRecorder().c(DiscardReason.NETWORK_ERROR, julVar);
        }

        public final /* synthetic */ void n(jul julVar, Object obj, Class cls) {
            io.sentry.util.n.a(cls, obj, e.this.c.getLogger());
            e.this.c.getClientReportRecorder().c(DiscardReason.NETWORK_ERROR, julVar);
        }

        public final /* synthetic */ void p(Object obj, Class cls) {
            io.sentry.util.n.a(cls, obj, e.this.c.getLogger());
            e.this.c.getClientReportRecorder().c(DiscardReason.NETWORK_ERROR, this.f21854a);
        }

        public final /* synthetic */ void q(b0 b0Var, io.sentry.hints.o oVar) {
            e.this.c.getLogger().c(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(b0Var.d()));
            oVar.c(b0Var.d());
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.g = this;
            final b0 b0VarJ = this.d;
            try {
                b0VarJ = j();
                e.this.c.getLogger().c(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
                io.sentry.util.j.o(this.f21855b, io.sentry.hints.o.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.j.a
                    public final void accept(Object obj) {
                        this.f21856a.q(b0VarJ, (io.sentry.hints.o) obj);
                    }
                });
                e.this.g = null;
            } catch (Throwable th) {
                try {
                    e.this.c.getLogger().b(SentryLevel.ERROR, th, "Envelope submission failed", new Object[0]);
                    throw th;
                } catch (Throwable th2) {
                    io.sentry.util.j.o(this.f21855b, io.sentry.hints.o.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.f
                        @Override // io.sentry.util.j.a
                        public final void accept(Object obj) {
                            this.f21856a.q(b0VarJ, (io.sentry.hints.o) obj);
                        }
                    });
                    e.this.g = null;
                    throw th2;
                }
            }
        }
    }

    public e(@NotNull SentryOptions sentryOptions, @NotNull z zVar, @NotNull r rVar, @NotNull iok iokVar) {
        this(p(sentryOptions.getMaxQueueSize(), sentryOptions.getEnvelopeDiskCache(), sentryOptions.getLogger(), sentryOptions.getDateProvider()), sentryOptions, zVar, rVar, new o(sentryOptions, iokVar, zVar));
    }

    public static void J(@NotNull c8c c8cVar, final boolean z) {
        io.sentry.util.j.o(c8cVar, io.sentry.hints.o.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.o) obj).c(false);
            }
        });
        io.sentry.util.j.o(c8cVar, io.sentry.hints.j.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                ((io.sentry.hints.j) obj).d(z);
            }
        });
    }

    public static w p(int i, @NotNull final io.sentry.cache.g gVar, @NotNull final ILogger iLogger, @NotNull iul iulVar) {
        return new w(1, i, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.s(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, iulVar);
    }

    public static /* synthetic */ void s(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.j.h(cVar.f21855b, io.sentry.hints.e.class)) {
                gVar.S(cVar.f21854a, cVar.f21855b);
            }
            J(cVar.f21855b, true);
            iLogger.c(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    public final /* synthetic */ void E(io.sentry.hints.g gVar) {
        gVar.a();
        this.c.getLogger().c(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        f(false);
    }

    @Override // io.sentry.transport.q
    public boolean e() {
        return (this.d.p() || this.f21851a.a()) ? false : true;
    }

    @Override // io.sentry.transport.q
    public void f(boolean z) throws IOException {
        long flushTimeoutMillis;
        this.d.close();
        this.f21851a.shutdown();
        this.c.getLogger().c(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.c.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.c.getLogger().c(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.f21851a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.c.getLogger().c(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.f21851a.shutdownNow();
        if (this.g != null) {
            this.f21851a.getRejectedExecutionHandler().rejectedExecution(this.g, this.f21851a);
        }
    }

    @Override // io.sentry.transport.q
    @NotNull
    public z g() {
        return this.d;
    }

    @Override // io.sentry.transport.q
    public void h(long j) {
        this.f21851a.c(j);
    }

    @Override // io.sentry.transport.q
    public void u(@NotNull jul julVar, @NotNull c8c c8cVar) throws IOException {
        io.sentry.cache.g gVarE = this.f21852b;
        boolean z = false;
        if (io.sentry.util.j.h(c8cVar, io.sentry.hints.e.class)) {
            gVarE = s.e();
            this.c.getLogger().c(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        jul julVarM = this.d.m(julVar, c8cVar);
        if (julVarM == null) {
            if (z) {
                this.f21852b.O(julVar);
                return;
            }
            return;
        }
        if (io.sentry.util.j.h(c8cVar, UncaughtExceptionHandlerIntegration.a.class)) {
            julVarM = this.c.getClientReportRecorder().d(julVarM);
        }
        Future<?> futureSubmit = this.f21851a.submit(new c(julVarM, c8cVar, gVarE));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.j.o(c8cVar, io.sentry.hints.g.class, new io.sentry.util.j.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.j.a
                public final void accept(Object obj) {
                    this.f21847a.E((io.sentry.hints.g) obj);
                }
            });
        } else {
            this.c.getClientReportRecorder().c(DiscardReason.QUEUE_OVERFLOW, julVarM);
        }
    }

    public e(@NotNull w wVar, @NotNull SentryOptions sentryOptions, @NotNull z zVar, @NotNull r rVar, @NotNull o oVar) {
        this.g = null;
        this.f21851a = (w) io.sentry.util.p.c(wVar, "executor is required");
        this.f21852b = (io.sentry.cache.g) io.sentry.util.p.c(sentryOptions.getEnvelopeDiskCache(), "envelopeCache is required");
        this.c = (SentryOptions) io.sentry.util.p.c(sentryOptions, "options is required");
        this.d = (z) io.sentry.util.p.c(zVar, "rateLimiter is required");
        this.e = (r) io.sentry.util.p.c(rVar, "transportGate is required");
        this.f = (o) io.sentry.util.p.c(oVar, "httpConnection is required");
    }
}
