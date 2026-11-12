package io.sentry;

import defpackage.c8c;
import defpackage.dyc;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.hvg;
import defpackage.jul;
import defpackage.m9l;
import defpackage.owp;
import defpackage.qkp;
import defpackage.qyc;
import defpackage.rwp;
import defpackage.swp;
import defpackage.ucd;
import defpackage.wzc;
import defpackage.xzc;
import io.sentry.clientreport.DiscardReason;
import io.sentry.e;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ftc, io.sentry.metrics.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public volatile io.sentry.protocol.p f21708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21709b;
    public volatile boolean c;

    @NotNull
    public final x d;

    @NotNull
    public final z e;

    @NotNull
    public final Map<Throwable, io.sentry.util.q<WeakReference<qyc>, String>> f;

    @NotNull
    public final swp g;

    @NotNull
    public final io.sentry.metrics.f h;

    public d(@NotNull SentryOptions sentryOptions) {
        this(sentryOptions, A(sentryOptions));
    }

    public static x.a A(@NotNull SentryOptions sentryOptions) {
        F(sentryOptions);
        return new x.a(sentryOptions, new p(sentryOptions), new m(sentryOptions));
    }

    public static void F(@NotNull SentryOptions sentryOptions) {
        io.sentry.util.p.c(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @NotNull
    public final wzc B(@NotNull owp owpVar, @NotNull rwp rwpVar) {
        final wzc wzcVarS;
        io.sentry.util.p.c(owpVar, "transactionContext is required");
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            wzcVarS = hvg.s();
        } else if (!this.f21709b.getInstrumenter().equals(owpVar.s())) {
            this.f21709b.getLogger().c(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", owpVar.s(), this.f21709b.getInstrumenter());
            wzcVarS = hvg.s();
        } else if (this.f21709b.isTracingEnabled()) {
            rwpVar.e();
            qkp qkpVarB = this.e.b(new m9l(owpVar, null));
            owpVar.n(qkpVarB);
            u uVar = new u(owpVar, this, rwpVar, this.g);
            if (qkpVarB.d().booleanValue() && qkpVarB.b().booleanValue()) {
                xzc transactionProfiler = this.f21709b.getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.b(uVar);
                } else if (rwpVar.j()) {
                    transactionProfiler.b(uVar);
                }
            }
            wzcVarS = uVar;
        } else {
            this.f21709b.getLogger().c(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            wzcVarS = hvg.s();
        }
        if (rwpVar.k()) {
            v(new hgl() { // from class: tnc
                @Override // defpackage.hgl
                public final void a(e eVar) {
                    eVar.p(wzcVarS);
                }
            });
        }
        return wzcVarS;
    }

    public final /* synthetic */ void D(dyc dycVar) {
        dycVar.b(this.f21709b.getShutdownTimeoutMillis());
    }

    public final void d(@NotNull s sVar) {
        io.sentry.util.q<WeakReference<qyc>, String> qVar;
        qyc qycVar;
        if (!this.f21709b.isTracingEnabled() || sVar.O() == null || (qVar = this.f.get(io.sentry.util.d.a(sVar.O()))) == null) {
            return;
        }
        WeakReference<qyc> weakReferenceA = qVar.a();
        if (sVar.C().getTrace() == null && weakReferenceA != null && (qycVar = weakReferenceA.get()) != null) {
            sVar.C().setTrace(qycVar.d());
        }
        String strB = qVar.b();
        if (sVar.v0() != null || strB == null) {
            return;
        }
        sVar.G0(strB);
    }

    @Override // defpackage.ftc
    public boolean e() {
        return this.d.a().a().e();
    }

    @Override // defpackage.ftc
    public void f(boolean z) {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (ucd ucdVar : this.f21709b.getIntegrations()) {
                if (ucdVar instanceof Closeable) {
                    try {
                        ((Closeable) ucdVar).close();
                    } catch (IOException e) {
                        this.f21709b.getLogger().c(SentryLevel.WARNING, "Failed to close the integration {}.", ucdVar, e);
                    }
                }
            }
            v(new hgl() { // from class: rnc
                @Override // defpackage.hgl
                public final void a(e eVar) {
                    eVar.clear();
                }
            });
            this.f21709b.getTransactionProfiler().close();
            this.f21709b.getTransactionPerformanceCollector().close();
            final dyc executorService = this.f21709b.getExecutorService();
            if (z) {
                executorService.submit(new Runnable() { // from class: snc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33810a.D(executorService);
                    }
                });
            } else {
                executorService.b(this.f21709b.getShutdownTimeoutMillis());
            }
            this.d.a().a().f(z);
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error while closing the Hub.", th);
        }
        this.c = false;
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @Nullable
    public io.sentry.transport.z g() {
        return this.d.a().a().g();
    }

    @Override // defpackage.ftc
    public void h(long j) {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.d.a().a().h(j);
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // defpackage.ftc
    @NotNull
    public SentryOptions i() {
        return this.d.a().b();
    }

    @Override // defpackage.ftc
    public boolean isEnabled() {
        return this.c;
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @Nullable
    public wzc j() {
        if (isEnabled()) {
            return this.d.a().c().j();
        }
        this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // defpackage.ftc
    public void k() {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        x.a aVarA = this.d.a();
        m.d dVarK = aVarA.c().k();
        if (dVarK == null) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarK.b() != null) {
            aVarA.a().a(dVarK.b(), io.sentry.util.j.e(new io.sentry.hints.l()));
        }
        aVarA.a().a(dVarK.a(), io.sentry.util.j.e(new io.sentry.hints.n()));
    }

    @Override // defpackage.ftc
    public void m(@NotNull a aVar) {
        o(aVar, new c8c());
    }

    @Override // defpackage.ftc
    public void n() {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        x.a aVarA = this.d.a();
        Session sessionN = aVarA.c().n();
        if (sessionN != null) {
            aVarA.a().a(sessionN, io.sentry.util.j.e(new io.sentry.hints.l()));
        }
    }

    @Override // defpackage.ftc
    public void o(@NotNull a aVar, @Nullable c8c c8cVar) {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (aVar == null) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.d.a().c().o(aVar, c8cVar);
        }
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @NotNull
    public io.sentry.protocol.p p(@NotNull jul julVar, @Nullable c8c c8cVar) {
        io.sentry.util.p.c(julVar, "SentryEnvelope is required.");
        io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return pVar;
        }
        try {
            io.sentry.protocol.p pVarP = this.d.a().a().p(julVar, c8cVar);
            return pVarP != null ? pVarP : pVar;
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error while capturing envelope.", th);
            return pVar;
        }
    }

    @Override // defpackage.ftc
    @NotNull
    public wzc q(@NotNull owp owpVar, @NotNull rwp rwpVar) {
        return B(owpVar, rwpVar);
    }

    @Override // defpackage.ftc
    @NotNull
    public io.sentry.protocol.p s(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable c8c c8cVar) {
        io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return pVar;
        }
        try {
            x.a aVarA = this.d.a();
            return aVarA.a().c(sentryReplayEvent, aVarA.c(), c8cVar);
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error while capturing replay", th);
            return pVar;
        }
    }

    @Override // defpackage.ftc
    @NotNull
    public io.sentry.protocol.p t(@NotNull s sVar, @Nullable c8c c8cVar) {
        return z(sVar, c8cVar, null);
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    public void u(@NotNull Throwable th, @NotNull qyc qycVar, @NotNull String str) {
        io.sentry.util.p.c(th, "throwable is required");
        io.sentry.util.p.c(qycVar, "span is required");
        io.sentry.util.p.c(str, "transactionName is required");
        Throwable thA = io.sentry.util.d.a(th);
        if (this.f.containsKey(thA)) {
            return;
        }
        this.f.put(thA, new io.sentry.util.q<>(new WeakReference(qycVar), str));
    }

    @Override // defpackage.ftc
    public void v(@NotNull hgl hglVar) {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            hglVar.a(this.d.a().c());
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @NotNull
    public io.sentry.protocol.p x(@NotNull io.sentry.protocol.w wVar, @Nullable y yVar, @Nullable c8c c8cVar, @Nullable j jVar) {
        io.sentry.util.p.c(wVar, "transaction is required");
        io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return pVar;
        }
        if (!wVar.r0()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", wVar.G());
            return pVar;
        }
        if (Boolean.TRUE.equals(Boolean.valueOf(wVar.s0()))) {
            try {
                x.a aVarA = this.d.a();
                return aVarA.a().d(wVar, yVar, aVarA.c(), c8cVar, jVar);
            } catch (Throwable th) {
                this.f21709b.getLogger().a(SentryLevel.ERROR, "Error while capturing transaction with id: " + wVar.G(), th);
                return pVar;
            }
        }
        this.f21709b.getLogger().c(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", wVar.G());
        if (this.f21709b.getBackpressureMonitor().a() > 0) {
            io.sentry.clientreport.g clientReportRecorder = this.f21709b.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.BACKPRESSURE;
            clientReportRecorder.a(discardReason, DataCategory.Transaction);
            this.f21709b.getClientReportRecorder().b(discardReason, DataCategory.Span, wVar.q0().size() + 1);
            return pVar;
        }
        io.sentry.clientreport.g clientReportRecorder2 = this.f21709b.getClientReportRecorder();
        DiscardReason discardReason2 = DiscardReason.SAMPLE_RATE;
        clientReportRecorder2.a(discardReason2, DataCategory.Transaction);
        this.f21709b.getClientReportRecorder().b(discardReason2, DataCategory.Span, wVar.q0().size() + 1);
        return pVar;
    }

    public final e y(@NotNull e eVar, @Nullable hgl hglVar) {
        if (hglVar != null) {
            try {
                e eVarM881clone = eVar.m881clone();
                hglVar.a(eVarM881clone);
                return eVarM881clone;
            } catch (Throwable th) {
                this.f21709b.getLogger().a(SentryLevel.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return eVar;
    }

    @NotNull
    public final io.sentry.protocol.p z(@NotNull s sVar, @Nullable c8c c8cVar, @Nullable hgl hglVar) {
        io.sentry.protocol.p pVarB = io.sentry.protocol.p.f21803b;
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return pVarB;
        }
        if (sVar == null) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return pVarB;
        }
        try {
            d(sVar);
            x.a aVarA = this.d.a();
            pVarB = aVarA.a().b(sVar, y(aVarA.c(), hglVar), c8cVar);
            this.f21708a = pVarB;
            return pVarB;
        } catch (Throwable th) {
            this.f21709b.getLogger().a(SentryLevel.ERROR, "Error while capturing event with id: " + sVar.G(), th);
            return pVarB;
        }
    }

    public d(@NotNull SentryOptions sentryOptions, @NotNull x xVar) {
        this.f = Collections.synchronizedMap(new WeakHashMap());
        F(sentryOptions);
        this.f21709b = sentryOptions;
        this.e = new z(sentryOptions);
        this.d = xVar;
        this.f21708a = io.sentry.protocol.p.f21803b;
        this.g = sentryOptions.getTransactionPerformanceCollector();
        this.c = true;
        this.h = new io.sentry.metrics.f(this);
    }

    @Override // defpackage.ftc
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ftc m880clone() {
        if (!isEnabled()) {
            this.f21709b.getLogger().c(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new d(this.f21709b, new x(this.d));
    }

    public d(@NotNull SentryOptions sentryOptions, @NotNull x.a aVar) {
        this(sentryOptions, new x(sentryOptions.getLogger(), aVar));
    }
}
