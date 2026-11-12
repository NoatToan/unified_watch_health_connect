package io.sentry;

import defpackage.ae8;
import defpackage.bx1;
import defpackage.c8c;
import defpackage.cyc;
import defpackage.dm1;
import defpackage.fvl;
import defpackage.gl1;
import defpackage.jok;
import defpackage.jul;
import defpackage.kvg;
import defpackage.owp;
import defpackage.ox1;
import defpackage.qyc;
import defpackage.wzc;
import defpackage.yzc;
import defpackage.ztc;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.p;
import io.sentry.protocol.Contexts;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements cyc, io.sentry.metrics.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21759b;

    @NotNull
    public final io.sentry.transport.q c;

    @NotNull
    public final ztc e;

    @NotNull
    public final b d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21758a = true;

    public static final class b implements Comparator<io.sentry.a> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull io.sentry.a aVar, @NotNull io.sentry.a aVar2) {
            return aVar.k().compareTo(aVar2.k());
        }
    }

    public p(@NotNull SentryOptions sentryOptions) {
        this.f21759b = (SentryOptions) io.sentry.util.p.c(sentryOptions, "SentryOptions is required.");
        yzc transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof kvg) {
            transportFactory = new gl1();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.c = transportFactory.a(sentryOptions, new jok(sentryOptions).a());
        this.e = sentryOptions.isEnableMetrics() ? new g(sentryOptions, this) : io.sentry.metrics.h.a();
    }

    public static /* synthetic */ void z(Session session) {
    }

    public final /* synthetic */ void A(s sVar, c8c c8cVar, Session session) {
        if (session == null) {
            this.f21759b.getLogger().c(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strD = null;
        Session.State state = sVar.x0() ? Session.State.Crashed : null;
        boolean z = Session.State.Crashed == state || sVar.y0();
        String str = (sVar.K() == null || sVar.K().l() == null || !sVar.K().l().containsKey("user-agent")) ? null : sVar.K().l().get("user-agent");
        Object objG = io.sentry.util.j.g(c8cVar);
        if (objG instanceof io.sentry.hints.a) {
            strD = ((io.sentry.hints.a) objG).d();
            state = Session.State.Abnormal;
        }
        if (session.q(state, str, z, strD) && session.m()) {
            session.c();
        }
    }

    @Nullable
    public final s B(@NotNull s sVar, @NotNull c8c c8cVar, @NotNull List<ae8> list) {
        for (ae8 ae8Var : list) {
            try {
                boolean z = ae8Var instanceof bx1;
                boolean zH = io.sentry.util.j.h(c8cVar, io.sentry.hints.c.class);
                if (zH && z) {
                    sVar = ae8Var.a(sVar, c8cVar);
                } else if (!zH && !z) {
                    sVar = ae8Var.a(sVar, c8cVar);
                }
            } catch (Throwable th) {
                this.f21759b.getLogger().b(SentryLevel.ERROR, th, "An exception occurred while processing event by processor: %s", ae8Var.getClass().getName());
            }
            if (sVar == null) {
                this.f21759b.getLogger().c(SentryLevel.DEBUG, "Event was dropped by a processor: %s", ae8Var.getClass().getName());
                this.f21759b.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
                break;
            }
        }
        return sVar;
    }

    @Nullable
    public final SentryReplayEvent C(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull c8c c8cVar, @NotNull List<ae8> list) {
        for (ae8 ae8Var : list) {
            try {
                sentryReplayEvent = ae8Var.c(sentryReplayEvent, c8cVar);
            } catch (Throwable th) {
                this.f21759b.getLogger().b(SentryLevel.ERROR, th, "An exception occurred while processing replay event by processor: %s", ae8Var.getClass().getName());
            }
            if (sentryReplayEvent == null) {
                this.f21759b.getLogger().c(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", ae8Var.getClass().getName());
                this.f21759b.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Replay);
                break;
            }
        }
        return sentryReplayEvent;
    }

    @Nullable
    public final io.sentry.protocol.w D(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar, @NotNull List<ae8> list) {
        for (ae8 ae8Var : list) {
            int size = wVar.q0().size();
            try {
                wVar = ae8Var.b(wVar, c8cVar);
            } catch (Throwable th) {
                this.f21759b.getLogger().b(SentryLevel.ERROR, th, "An exception occurred while processing transaction by processor: %s", ae8Var.getClass().getName());
            }
            int size2 = wVar == null ? 0 : wVar.q0().size();
            if (wVar == null) {
                this.f21759b.getLogger().c(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", ae8Var.getClass().getName());
                io.sentry.clientreport.g clientReportRecorder = this.f21759b.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
                clientReportRecorder.a(discardReason, DataCategory.Transaction);
                this.f21759b.getClientReportRecorder().b(discardReason, DataCategory.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                this.f21759b.getLogger().c(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), ae8Var.getClass().getName());
                this.f21759b.getClientReportRecorder().b(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, i);
            }
        }
        return wVar;
    }

    public final boolean E() {
        Random randomA = this.f21759b.getSampleRate() == null ? null : io.sentry.util.t.a();
        return this.f21759b.getSampleRate() == null || randomA == null || this.f21759b.getSampleRate().doubleValue() >= randomA.nextDouble();
    }

    @NotNull
    public final io.sentry.protocol.p F(@NotNull jul julVar, @Nullable c8c c8cVar) throws IOException {
        SentryOptions.c beforeEnvelopeCallback = this.f21759b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.a(julVar, c8cVar);
            } catch (Throwable th) {
                this.f21759b.getLogger().a(SentryLevel.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        if (c8cVar == null) {
            this.c.z(julVar);
        } else {
            this.c.u(julVar, c8cVar);
        }
        io.sentry.protocol.p pVarA = julVar.b().a();
        return pVarA != null ? pVarA : io.sentry.protocol.p.f21803b;
    }

    public final boolean G(@NotNull o oVar, @NotNull c8c c8cVar) {
        if (io.sentry.util.j.u(c8cVar)) {
            return true;
        }
        this.f21759b.getLogger().c(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", oVar.G());
        return false;
    }

    public final boolean H(@Nullable Session session, @Nullable Session session2) {
        if (session2 == null) {
            return false;
        }
        if (session == null) {
            return true;
        }
        Session.State stateL = session2.l();
        Session.State state = Session.State.Crashed;
        if (stateL != state || session.l() == state) {
            return session2.e() > 0 && session.e() <= 0;
        }
        return true;
    }

    public final void I(@NotNull o oVar, @NotNull Collection<io.sentry.a> collection) {
        List<io.sentry.a> listB = oVar.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.d);
    }

    @TestOnly
    @Nullable
    public Session J(@NotNull final s sVar, @NotNull final c8c c8cVar, @Nullable e eVar) {
        if (io.sentry.util.j.u(c8cVar)) {
            if (eVar != null) {
                return eVar.d(new m.b() { // from class: ful
                    @Override // io.sentry.m.b
                    public final void a(Session session) {
                        this.f18257a.A(sVar, c8cVar, session);
                    }
                });
            }
            this.f21759b.getLogger().c(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // defpackage.cyc
    @ApiStatus.Internal
    public void a(@NotNull Session session, @Nullable c8c c8cVar) {
        io.sentry.util.p.c(session, "Session is required.");
        if (session.h() == null || session.h().isEmpty()) {
            this.f21759b.getLogger().c(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            p(jul.a(this.f21759b.getSerializer(), session, this.f21759b.getSdkVersion()), c8cVar);
        } catch (IOException e) {
            this.f21759b.getLogger().a(SentryLevel.ERROR, "Failed to capture session.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    @Override // defpackage.cyc
    @NotNull
    public io.sentry.protocol.p b(@NotNull s sVar, @Nullable e eVar, @Nullable c8c c8cVar) {
        s sVar2;
        y yVarL;
        y yVar;
        io.sentry.util.p.c(sVar, "SentryEvent is required.");
        if (c8cVar == null) {
            c8cVar = new c8c();
        }
        if (G(sVar, c8cVar)) {
            m(eVar, c8cVar);
        }
        ILogger logger = this.f21759b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "Capturing event: %s", sVar.G());
        Throwable thO = sVar.O();
        if (thO != null && this.f21759b.containsIgnoredExceptionForType(thO)) {
            this.f21759b.getLogger().c(sentryLevel, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f21759b.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
            return io.sentry.protocol.p.f21803b;
        }
        if (G(sVar, c8cVar) && (sVar = o(sVar, eVar, c8cVar)) == null) {
            this.f21759b.getLogger().c(sentryLevel, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.p.f21803b;
        }
        s sVarB = B(sVar, c8cVar, this.f21759b.getEventProcessors());
        if (sVarB != null && (sVarB = t(sVarB, c8cVar)) == null) {
            this.f21759b.getLogger().c(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
            this.f21759b.getClientReportRecorder().a(DiscardReason.BEFORE_SEND, DataCategory.Error);
        }
        if (sVarB == null) {
            return io.sentry.protocol.p.f21803b;
        }
        Session sessionD = eVar != null ? eVar.d(new m.b() { // from class: eul
            @Override // io.sentry.m.b
            public final void a(Session session) {
                p.z(session);
            }
        }) : null;
        Session sessionJ = (sessionD == null || !sessionD.m()) ? J(sVarB, c8cVar, eVar) : null;
        if (E()) {
            sVar2 = sVarB;
        } else {
            this.f21759b.getLogger().c(sentryLevel, "Event %s was dropped due to sampling decision.", sVarB.G());
            this.f21759b.getClientReportRecorder().a(DiscardReason.SAMPLE_RATE, DataCategory.Error);
            sVar2 = null;
        }
        boolean zH = H(sessionD, sessionJ);
        if (sVar2 == null && !zH) {
            this.f21759b.getLogger().c(sentryLevel, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.p.f21803b;
        }
        io.sentry.protocol.p pVarF = io.sentry.protocol.p.f21803b;
        if (sVar2 != null && sVar2.G() != null) {
            pVarF = sVar2.G();
        }
        boolean zH2 = io.sentry.util.j.h(c8cVar, io.sentry.hints.c.class);
        if (sVar2 != null && !zH2 && (sVar2.y0() || sVar2.x0())) {
            this.f21759b.getReplayController().captureReplay(Boolean.valueOf(sVar2.x0()));
        }
        try {
            if (zH2) {
                if (sVar2 != null) {
                    yVarL = ox1.b(sVar2, this.f21759b).H();
                    yVar = yVarL;
                } else {
                    yVar = null;
                }
            } else if (eVar != null) {
                wzc wzcVarJ = eVar.j();
                yVarL = wzcVarJ != null ? wzcVarJ.l() : io.sentry.util.y.g(eVar, this.f21759b).i();
                yVar = yVarL;
            } else {
                yVar = null;
            }
            jul julVarR = r(sVar2, sVar2 != null ? y(c8cVar) : null, sessionJ, yVar, null);
            c8cVar.c();
            if (julVarR != null) {
                pVarF = F(julVarR, c8cVar);
            }
        } catch (SentryEnvelopeException e) {
            e = e;
            this.f21759b.getLogger().b(SentryLevel.WARNING, e, "Capturing event %s failed.", pVarF);
            pVarF = io.sentry.protocol.p.f21803b;
        } catch (IOException e2) {
            e = e2;
            this.f21759b.getLogger().b(SentryLevel.WARNING, e, "Capturing event %s failed.", pVarF);
            pVarF = io.sentry.protocol.p.f21803b;
        }
        if (eVar != null) {
            x(eVar, c8cVar);
        }
        return pVarF;
    }

    @Override // defpackage.cyc
    @NotNull
    public io.sentry.protocol.p c(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable e eVar, @Nullable c8c c8cVar) {
        y yVarL;
        io.sentry.util.p.c(sentryReplayEvent, "SessionReplay is required.");
        if (c8cVar == null) {
            c8cVar = new c8c();
        }
        if (G(sentryReplayEvent, c8cVar)) {
            q(sentryReplayEvent, eVar);
        }
        ILogger logger = this.f21759b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "Capturing session replay: %s", sentryReplayEvent.G());
        io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        io.sentry.protocol.p pVarG = sentryReplayEvent.G() != null ? sentryReplayEvent.G() : pVar;
        SentryReplayEvent sentryReplayEventC = C(sentryReplayEvent, c8cVar, this.f21759b.getEventProcessors());
        if (sentryReplayEventC != null && (sentryReplayEventC = u(sentryReplayEventC, c8cVar)) == null) {
            this.f21759b.getLogger().c(sentryLevel, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f21759b.getClientReportRecorder().a(DiscardReason.BEFORE_SEND, DataCategory.Replay);
        }
        if (sentryReplayEventC == null) {
            return pVar;
        }
        if (eVar != null) {
            try {
                wzc wzcVarJ = eVar.j();
                yVarL = wzcVarJ != null ? wzcVarJ.l() : io.sentry.util.y.g(eVar, this.f21759b).i();
            } catch (IOException e) {
                this.f21759b.getLogger().b(SentryLevel.WARNING, e, "Capturing event %s failed.", pVarG);
                return io.sentry.protocol.p.f21803b;
            }
        } else {
            yVarL = null;
        }
        jul julVarS = s(sentryReplayEventC, c8cVar.g(), yVarL, io.sentry.util.j.h(c8cVar, io.sentry.hints.c.class));
        c8cVar.c();
        this.c.u(julVarS, c8cVar);
        return pVarG;
    }

    @Override // defpackage.cyc
    @NotNull
    public io.sentry.protocol.p d(@NotNull io.sentry.protocol.w wVar, @Nullable y yVar, @Nullable e eVar, @Nullable c8c c8cVar, @Nullable j jVar) {
        io.sentry.protocol.w wVarD;
        io.sentry.util.p.c(wVar, "Transaction is required.");
        c8c c8cVar2 = c8cVar == null ? new c8c() : c8cVar;
        if (G(wVar, c8cVar2)) {
            m(eVar, c8cVar2);
        }
        ILogger logger = this.f21759b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "Capturing transaction: %s", wVar.G());
        io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        io.sentry.protocol.p pVarG = wVar.G() != null ? wVar.G() : pVar;
        if (G(wVar, c8cVar2)) {
            wVarD = (io.sentry.protocol.w) n(wVar, eVar);
            if (wVarD != null && eVar != null) {
                wVarD = D(wVarD, c8cVar2, eVar.q());
            }
            if (wVarD == null) {
                this.f21759b.getLogger().c(sentryLevel, "Transaction was dropped by applyScope", new Object[0]);
            }
        } else {
            wVarD = wVar;
        }
        if (wVarD != null) {
            wVarD = D(wVarD, c8cVar2, this.f21759b.getEventProcessors());
        }
        if (wVarD == null) {
            this.f21759b.getLogger().c(sentryLevel, "Transaction was dropped by Event processors.", new Object[0]);
            return pVar;
        }
        int size = wVarD.q0().size();
        io.sentry.protocol.w wVarV = v(wVarD, c8cVar2);
        int size2 = wVarV == null ? 0 : wVarV.q0().size();
        if (wVarV == null) {
            this.f21759b.getLogger().c(sentryLevel, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.g clientReportRecorder = this.f21759b.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.BEFORE_SEND;
            clientReportRecorder.a(discardReason, DataCategory.Transaction);
            this.f21759b.getClientReportRecorder().b(discardReason, DataCategory.Span, size + 1);
            return pVar;
        }
        if (size2 < size) {
            int i = size - size2;
            this.f21759b.getLogger().c(sentryLevel, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            this.f21759b.getClientReportRecorder().b(DiscardReason.BEFORE_SEND, DataCategory.Span, i);
        }
        try {
            jul julVarR = r(wVarV, w(y(c8cVar2)), null, yVar, jVar);
            c8cVar2.c();
            return julVarR != null ? F(julVarR, c8cVar2) : pVarG;
        } catch (SentryEnvelopeException | IOException e) {
            this.f21759b.getLogger().b(SentryLevel.WARNING, e, "Capturing transaction %s failed.", pVarG);
            return io.sentry.protocol.p.f21803b;
        }
    }

    @Override // defpackage.cyc
    public boolean e() {
        return this.c.e();
    }

    @Override // defpackage.cyc
    public void f(boolean z) {
        long shutdownTimeoutMillis;
        this.f21759b.getLogger().c(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        try {
            this.e.close();
        } catch (IOException e) {
            this.f21759b.getLogger().a(SentryLevel.WARNING, "Failed to close the metrics aggregator.", e);
        }
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f21759b.getShutdownTimeoutMillis();
            } catch (IOException e2) {
                this.f21759b.getLogger().a(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e2);
            }
        }
        h(shutdownTimeoutMillis);
        this.c.f(z);
        for (ae8 ae8Var : this.f21759b.getEventProcessors()) {
            if (ae8Var instanceof Closeable) {
                try {
                    ((Closeable) ae8Var).close();
                } catch (IOException e3) {
                    this.f21759b.getLogger().c(SentryLevel.WARNING, "Failed to close the event processor {}.", ae8Var, e3);
                }
            }
        }
        this.f21758a = false;
    }

    @Override // defpackage.cyc
    @Nullable
    public io.sentry.transport.z g() {
        return this.c.g();
    }

    @Override // defpackage.cyc
    public void h(long j) {
        this.c.h(j);
    }

    @Override // io.sentry.metrics.c
    @NotNull
    public io.sentry.protocol.p i(@NotNull io.sentry.metrics.a aVar) {
        io.sentry.protocol.p pVarL = l(new jul(new q(new io.sentry.protocol.p(), this.f21759b.getSdkVersion(), null), Collections.singleton(fvl.z(aVar))));
        return pVarL != null ? pVarL : io.sentry.protocol.p.f21803b;
    }

    public final void m(@Nullable e eVar, @NotNull c8c c8cVar) {
        if (eVar != null) {
            c8cVar.b(eVar.w());
        }
    }

    @NotNull
    public final <T extends o> T n(@NotNull T t, @Nullable e eVar) {
        if (eVar != null) {
            if (t.K() == null) {
                t.a0(eVar.getRequest());
            }
            if (t.Q() == null) {
                t.f0(eVar.g());
            }
            if (t.N() == null) {
                t.e0(new HashMap(eVar.e()));
            } else {
                for (Map.Entry<String, String> entry : eVar.e().entrySet()) {
                    if (!t.N().containsKey(entry.getKey())) {
                        t.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.B() == null) {
                t.R(new ArrayList(eVar.b()));
            } else {
                I(t, eVar.b());
            }
            if (t.H() == null) {
                t.X(new HashMap(eVar.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : eVar.getExtras().entrySet()) {
                    if (!t.H().containsKey(entry2.getKey())) {
                        t.H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Contexts contextsC = t.C();
            for (Map.Entry<String, Object> entry3 : new Contexts(eVar.f()).entrySet()) {
                if (!contextsC.containsKey(entry3.getKey())) {
                    contextsC.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    @Nullable
    public final s o(@NotNull s sVar, @Nullable e eVar, @NotNull c8c c8cVar) {
        if (eVar == null) {
            return sVar;
        }
        n(sVar, eVar);
        if (sVar.v0() == null) {
            sVar.G0(eVar.t());
        }
        if (sVar.q0() == null) {
            sVar.A0(eVar.s());
        }
        if (eVar.getLevel() != null) {
            sVar.B0(eVar.getLevel());
        }
        qyc span = eVar.getSpan();
        if (sVar.C().getTrace() == null) {
            if (span == null) {
                sVar.C().setTrace(owp.q(eVar.v()));
            } else {
                sVar.C().setTrace(span.d());
            }
        }
        return B(sVar, c8cVar, eVar.q());
    }

    @Override // defpackage.cyc
    @ApiStatus.Internal
    @NotNull
    public io.sentry.protocol.p p(@NotNull jul julVar, @Nullable c8c c8cVar) {
        io.sentry.util.p.c(julVar, "SentryEnvelope is required.");
        if (c8cVar == null) {
            c8cVar = new c8c();
        }
        try {
            c8cVar.c();
            return F(julVar, c8cVar);
        } catch (IOException e) {
            this.f21759b.getLogger().a(SentryLevel.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.p.f21803b;
        }
    }

    @NotNull
    public final SentryReplayEvent q(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable e eVar) {
        if (eVar != null) {
            if (sentryReplayEvent.K() == null) {
                sentryReplayEvent.a0(eVar.getRequest());
            }
            if (sentryReplayEvent.Q() == null) {
                sentryReplayEvent.f0(eVar.g());
            }
            if (sentryReplayEvent.N() == null) {
                sentryReplayEvent.e0(new HashMap(eVar.e()));
            } else {
                for (Map.Entry<String, String> entry : eVar.e().entrySet()) {
                    if (!sentryReplayEvent.N().containsKey(entry.getKey())) {
                        sentryReplayEvent.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Contexts contextsC = sentryReplayEvent.C();
            for (Map.Entry<String, Object> entry2 : new Contexts(eVar.f()).entrySet()) {
                if (!contextsC.containsKey(entry2.getKey())) {
                    contextsC.put(entry2.getKey(), entry2.getValue());
                }
            }
            qyc span = eVar.getSpan();
            if (sentryReplayEvent.C().getTrace() == null) {
                if (span == null) {
                    sentryReplayEvent.C().setTrace(owp.q(eVar.v()));
                } else {
                    sentryReplayEvent.C().setTrace(span.d());
                }
            }
        }
        return sentryReplayEvent;
    }

    @Nullable
    public final jul r(@Nullable o oVar, @Nullable List<dm1> list, @Nullable Session session, @Nullable y yVar, @Nullable j jVar) throws SentryEnvelopeException, IOException {
        io.sentry.protocol.p pVar;
        ArrayList arrayList = new ArrayList();
        if (oVar != null) {
            arrayList.add(fvl.y(this.f21759b.getSerializer(), oVar));
            pVar = oVar.G();
        } else {
            pVar = null;
        }
        if (session != null) {
            arrayList.add(fvl.C(this.f21759b.getSerializer(), session));
        }
        if (jVar != null) {
            arrayList.add(fvl.A(jVar, this.f21759b.getMaxTraceFileSize(), this.f21759b.getSerializer()));
            if (pVar == null) {
                pVar = new io.sentry.protocol.p(jVar.B());
            }
        }
        if (list != null) {
            Iterator<dm1> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fvl.w(this.f21759b.getSerializer(), this.f21759b.getLogger(), it.next(), this.f21759b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new jul(new q(pVar, this.f21759b.getSdkVersion(), yVar), arrayList);
    }

    @NotNull
    public final jul s(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable l lVar, @Nullable y yVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fvl.B(this.f21759b.getSerializer(), this.f21759b.getLogger(), sentryReplayEvent, lVar, z));
        return new jul(new q(sentryReplayEvent.G(), this.f21759b.getSdkVersion(), yVar), arrayList);
    }

    @Nullable
    public final s t(@NotNull s sVar, @NotNull c8c c8cVar) {
        SentryOptions.d beforeSend = this.f21759b.getBeforeSend();
        if (beforeSend == null) {
            return sVar;
        }
        try {
            return beforeSend.a(sVar, c8cVar);
        } catch (Throwable th) {
            this.f21759b.getLogger().a(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    @Nullable
    public final SentryReplayEvent u(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull c8c c8cVar) {
        this.f21759b.getBeforeSendReplay();
        return sentryReplayEvent;
    }

    @Nullable
    public final io.sentry.protocol.w v(@NotNull io.sentry.protocol.w wVar, @NotNull c8c c8cVar) {
        this.f21759b.getBeforeSendTransaction();
        return wVar;
    }

    @Nullable
    public final List<dm1> w(@Nullable List<dm1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (dm1 dm1Var : list) {
            if (dm1Var.j()) {
                arrayList.add(dm1Var);
            }
        }
        return arrayList;
    }

    public final void x(@NotNull e eVar, @NotNull c8c c8cVar) {
        wzc wzcVarJ = eVar.j();
        if (wzcVarJ == null || !io.sentry.util.j.h(c8cVar, io.sentry.hints.p.class)) {
            return;
        }
        Object objG = io.sentry.util.j.g(c8cVar);
        if (!(objG instanceof io.sentry.hints.f)) {
            wzcVarJ.b(SpanStatus.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objG).f(wzcVarJ.i());
            wzcVarJ.b(SpanStatus.ABORTED, false, c8cVar);
        }
    }

    @Nullable
    public final List<dm1> y(@NotNull c8c c8cVar) {
        List<dm1> listF = c8cVar.f();
        dm1 dm1VarH = c8cVar.h();
        if (dm1VarH != null) {
            listF.add(dm1VarH);
        }
        dm1 dm1VarJ = c8cVar.j();
        if (dm1VarJ != null) {
            listF.add(dm1VarJ);
        }
        dm1 dm1VarI = c8cVar.i();
        if (dm1VarI != null) {
            listF.add(dm1VarI);
        }
        return listF;
    }
}
