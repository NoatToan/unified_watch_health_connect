package io.sentry;

import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.a5n;
import defpackage.b5n;
import defpackage.c5n;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.gvg;
import defpackage.hgl;
import defpackage.hul;
import defpackage.owp;
import defpackage.ox1;
import defpackage.qkp;
import defpackage.qwp;
import defpackage.qyc;
import defpackage.rwp;
import defpackage.swp;
import defpackage.wzc;
import io.sentry.e;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.u;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class u implements wzc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a5n f21880b;

    @NotNull
    public final ftc d;

    @NotNull
    public String e;

    @Nullable
    public volatile TimerTask g;

    @Nullable
    public volatile TimerTask h;

    @Nullable
    public volatile Timer i;

    @NotNull
    public final ox1 m;

    @NotNull
    public TransactionNameSource n;

    @NotNull
    public final Instrumenter o;

    @Nullable
    public final swp q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final rwp f21882r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final io.sentry.protocol.p f21879a = new io.sentry.protocol.p();

    @NotNull
    public final List<a5n> c = new CopyOnWriteArrayList();

    @NotNull
    public c f = c.c;

    @NotNull
    public final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f21881k = new AtomicBoolean(false);

    @NotNull
    public final AtomicBoolean l = new AtomicBoolean(false);

    @NotNull
    public final Contexts p = new Contexts();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            u.this.U();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            u.this.T();
        }
    }

    public static final class c {
        public static final c c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final SpanStatus f21886b;

        public c(boolean z, @Nullable SpanStatus spanStatus) {
            this.f21885a = z;
            this.f21886b = spanStatus;
        }

        @NotNull
        public static c c(@Nullable SpanStatus spanStatus) {
            return new c(true, spanStatus);
        }

        @NotNull
        public static c d() {
            return new c(false, null);
        }
    }

    public u(@NotNull owp owpVar, @NotNull ftc ftcVar, @NotNull rwp rwpVar, @Nullable swp swpVar) {
        this.i = null;
        io.sentry.util.p.c(owpVar, "context is required");
        io.sentry.util.p.c(ftcVar, "hub is required");
        this.f21880b = new a5n(owpVar, this, ftcVar, rwpVar.h(), rwpVar);
        this.e = owpVar.t();
        this.o = owpVar.s();
        this.d = ftcVar;
        this.q = swpVar;
        this.n = owpVar.v();
        this.f21882r = rwpVar;
        if (owpVar.r() != null) {
            this.m = owpVar.r();
        } else {
            this.m = new ox1(ftcVar.i().getLogger());
        }
        if (swpVar != null) {
            swpVar.c(this);
        }
        if (rwpVar.g() == null && rwpVar.f() == null) {
            return;
        }
        this.i = new Timer(true);
        V();
        c();
    }

    public static /* synthetic */ void S(AtomicReference atomicReference, AtomicReference atomicReference2, e eVar) {
        atomicReference.set(eVar.g());
        atomicReference2.set(eVar.l());
    }

    public final void A() {
        synchronized (this.j) {
            try {
                if (this.g != null) {
                    this.g.cancel();
                    this.f21881k.set(false);
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final qyc B(@NotNull w wVar, @NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter, @NotNull c5n c5nVar) {
        if (!this.f21880b.a() && this.o.equals(instrumenter)) {
            if (this.c.size() >= this.d.i().getMaxSpans()) {
                this.d.i().getLogger().c(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                return gvg.s();
            }
            io.sentry.util.p.c(wVar, "parentSpanId is required");
            io.sentry.util.p.c(str, "operation is required");
            A();
            a5n a5nVar = new a5n(this.f21880b.E(), wVar, this, str, this.d, hulVar, c5nVar, new b5n() { // from class: xvl
                @Override // defpackage.b5n
                public final void a(a5n a5nVar2) {
                    this.f39515a.O(a5nVar2);
                }
            });
            a5nVar.h(str2);
            a5nVar.m("thread.id", String.valueOf(Thread.currentThread().getId()));
            a5nVar.m("thread.name", this.d.i().getMainThreadChecker().a() ? FaceSchema.FACE_PAGE_MAIN : Thread.currentThread().getName());
            this.c.add(a5nVar);
            swp swpVar = this.q;
            if (swpVar != null) {
                swpVar.a(a5nVar);
            }
            return a5nVar;
        }
        return gvg.s();
    }

    @NotNull
    public final qyc C(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter, @NotNull c5n c5nVar) {
        if (!this.f21880b.a() && this.o.equals(instrumenter)) {
            if (this.c.size() < this.d.i().getMaxSpans()) {
                return this.f21880b.J(str, str2, hulVar, instrumenter, c5nVar);
            }
            this.d.i().getLogger().c(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return gvg.s();
        }
        return gvg.s();
    }

    public void D(@Nullable SpanStatus spanStatus, @Nullable hul hulVar, boolean z, @Nullable c8c c8cVar) {
        hul hulVarQ = this.f21880b.q();
        if (hulVar == null) {
            hulVar = hulVarQ;
        }
        if (hulVar == null) {
            hulVar = this.d.i().getDateProvider().now();
        }
        for (a5n a5nVar : this.c) {
            if (a5nVar.y().a()) {
                a5nVar.f(spanStatus != null ? spanStatus : d().g, hulVar);
            }
        }
        this.f = c.c(spanStatus);
        if (this.f21880b.a()) {
            return;
        }
        if (!this.f21882r.l() || L()) {
            final AtomicReference atomicReference = new AtomicReference();
            final b5n b5nVarB = this.f21880b.B();
            this.f21880b.I(new b5n() { // from class: vvl
                @Override // defpackage.b5n
                public final void a(a5n a5nVar2) {
                    this.f37275a.P(b5nVarB, atomicReference, a5nVar2);
                }
            });
            this.f21880b.f(this.f.f21886b, hulVar);
            Boolean bool = Boolean.TRUE;
            j jVarA = (bool.equals(N()) && bool.equals(M())) ? this.d.i().getTransactionProfiler().a(this, (List) atomicReference.get(), this.d.i()) : null;
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.d.v(new hgl() { // from class: wvl
                @Override // defpackage.hgl
                public final void a(e eVar) {
                    this.f38410a.R(eVar);
                }
            });
            io.sentry.protocol.w wVar = new io.sentry.protocol.w(this);
            if (this.i != null) {
                synchronized (this.j) {
                    try {
                        if (this.i != null) {
                            A();
                            z();
                            this.i.cancel();
                            this.i = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z && this.c.isEmpty() && this.f21882r.g() != null) {
                this.d.i().getLogger().c(SentryLevel.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
            } else {
                wVar.o0().putAll(this.f21880b.w());
                this.d.x(wVar, l(), c8cVar, jVarA);
            }
        }
    }

    @NotNull
    public List<a5n> E() {
        return this.c;
    }

    @ApiStatus.Internal
    @NotNull
    public Contexts F() {
        return this.p;
    }

    @Nullable
    public Map<String, Object> G() {
        return this.f21880b.t();
    }

    @Nullable
    public io.sentry.metrics.d H() {
        return this.f21880b.v();
    }

    @NotNull
    public a5n I() {
        return this.f21880b;
    }

    @Nullable
    public qkp J() {
        return this.f21880b.A();
    }

    @NotNull
    public List<a5n> K() {
        return this.c;
    }

    public final boolean L() {
        ArrayList<a5n> arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (a5n a5nVar : arrayList) {
            if (!a5nVar.a() && a5nVar.q() == null) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public Boolean M() {
        return this.f21880b.F();
    }

    @Nullable
    public Boolean N() {
        return this.f21880b.G();
    }

    public final /* synthetic */ void O(a5n a5nVar) {
        swp swpVar = this.q;
        if (swpVar != null) {
            swpVar.b(a5nVar);
        }
        c cVar = this.f;
        if (this.f21882r.g() == null) {
            if (cVar.f21885a) {
                n(cVar.f21886b);
            }
        } else if (!this.f21882r.l() || L()) {
            c();
        }
    }

    public final /* synthetic */ void P(b5n b5nVar, AtomicReference atomicReference, a5n a5nVar) {
        if (b5nVar != null) {
            b5nVar.a(a5nVar);
        }
        qwp qwpVarI = this.f21882r.i();
        if (qwpVarI != null) {
            qwpVarI.a(this);
        }
        swp swpVar = this.q;
        if (swpVar != null) {
            atomicReference.set(swpVar.j(this));
        }
    }

    public final /* synthetic */ void Q(e eVar, wzc wzcVar) {
        if (wzcVar == this) {
            eVar.h();
        }
    }

    public final /* synthetic */ void R(final e eVar) {
        eVar.y(new m.c() { // from class: zvl
            @Override // io.sentry.m.c
            public final void a(wzc wzcVar) {
                this.f41718a.Q(eVar, wzcVar);
            }
        });
    }

    public final void T() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.DEADLINE_EXCEEDED;
        }
        b(status, this.f21882r.g() != null, null);
        this.l.set(false);
    }

    public final void U() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        n(status);
        this.f21881k.set(false);
    }

    public final void V() {
        Long lF = this.f21882r.f();
        if (lF != null) {
            synchronized (this.j) {
                try {
                    if (this.i != null) {
                        z();
                        this.l.set(true);
                        this.h = new b();
                        try {
                            this.i.schedule(this.h, lF.longValue());
                        } catch (Throwable th) {
                            this.d.i().getLogger().a(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                            T();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @ApiStatus.Internal
    public void W(@NotNull String str, @NotNull Number number) {
        if (this.f21880b.w().containsKey(str)) {
            return;
        }
        j(str, number);
    }

    @ApiStatus.Internal
    public void X(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        if (this.f21880b.w().containsKey(str)) {
            return;
        }
        o(str, number, measurementUnit);
    }

    @NotNull
    public qyc Y(@NotNull w wVar, @NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter, @NotNull c5n c5nVar) {
        return B(wVar, str, str2, hulVar, instrumenter, c5nVar);
    }

    @NotNull
    public qyc Z(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter, @NotNull c5n c5nVar) {
        return C(str, str2, hulVar, instrumenter, c5nVar);
    }

    @Override // defpackage.qyc
    public boolean a() {
        return this.f21880b.a();
    }

    public final void a0() {
        synchronized (this) {
            try {
                if (this.m.r()) {
                    final AtomicReference atomicReference = new AtomicReference();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    this.d.v(new hgl() { // from class: yvl
                        @Override // defpackage.hgl
                        public final void a(e eVar) {
                            u.S(atomicReference, atomicReference2, eVar);
                        }
                    });
                    this.m.G(this, (io.sentry.protocol.y) atomicReference.get(), (io.sentry.protocol.p) atomicReference2.get(), this.d.i(), J());
                    this.m.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wzc
    @NotNull
    public void b(@NotNull SpanStatus spanStatus, boolean z, @Nullable c8c c8cVar) {
        if (a()) {
            return;
        }
        hul hulVarNow = this.d.i().getDateProvider().now();
        List<a5n> list = this.c;
        ListIterator<a5n> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            a5n a5nVarPrevious = listIterator.previous();
            a5nVarPrevious.I(null);
            a5nVarPrevious.f(spanStatus, hulVarNow);
        }
        D(spanStatus, hulVarNow, z, c8cVar);
    }

    @Override // defpackage.wzc
    public void c() {
        Long lG;
        synchronized (this.j) {
            try {
                if (this.i != null && (lG = this.f21882r.g()) != null) {
                    A();
                    this.f21881k.set(true);
                    this.g = new a();
                    try {
                        this.i.schedule(this.g, lG.longValue());
                    } catch (Throwable th) {
                        this.d.i().getLogger().a(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                        U();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.qyc
    @NotNull
    public v d() {
        return this.f21880b.d();
    }

    @Override // defpackage.qyc
    @NotNull
    public qyc e(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter) {
        return Z(str, str2, hulVar, instrumenter, new c5n());
    }

    @Override // defpackage.qyc
    @ApiStatus.Internal
    public void f(@Nullable SpanStatus spanStatus, @Nullable hul hulVar) {
        D(spanStatus, hulVar, true, null);
    }

    @Override // defpackage.qyc
    public void finish() {
        n(getStatus());
    }

    @Override // defpackage.qyc
    public boolean g(@NotNull hul hulVar) {
        return this.f21880b.g(hulVar);
    }

    @Override // defpackage.qyc
    @Nullable
    public String getDescription() {
        return this.f21880b.getDescription();
    }

    @Override // defpackage.wzc
    @NotNull
    public String getName() {
        return this.e;
    }

    @Override // defpackage.qyc
    @Nullable
    public SpanStatus getStatus() {
        return this.f21880b.getStatus();
    }

    @Override // defpackage.qyc
    public void h(@Nullable String str) {
        if (this.f21880b.a()) {
            this.d.i().getLogger().c(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f21880b.h(str);
        }
    }

    @Override // defpackage.wzc
    @NotNull
    public io.sentry.protocol.p i() {
        return this.f21879a;
    }

    @Override // defpackage.qyc
    public void j(@NotNull String str, @NotNull Number number) {
        this.f21880b.j(str, number);
    }

    @Override // defpackage.wzc
    @NotNull
    public TransactionNameSource k() {
        return this.n;
    }

    @Override // defpackage.qyc
    @Nullable
    public y l() {
        if (!this.d.i().isTraceSampling()) {
            return null;
        }
        a0();
        return this.m.H();
    }

    @Override // defpackage.qyc
    public void m(@NotNull String str, @NotNull Object obj) {
        if (this.f21880b.a()) {
            this.d.i().getLogger().c(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f21880b.m(str, obj);
        }
    }

    @Override // defpackage.qyc
    public void n(@Nullable SpanStatus spanStatus) {
        f(spanStatus, null);
    }

    @Override // defpackage.qyc
    public void o(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        this.f21880b.o(str, number, measurementUnit);
    }

    @Override // defpackage.wzc
    @Nullable
    public a5n p() {
        ArrayList arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((a5n) arrayList.get(size)).a()) {
                return (a5n) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // defpackage.qyc
    @Nullable
    public hul q() {
        return this.f21880b.q();
    }

    @Override // defpackage.qyc
    @NotNull
    public hul r() {
        return this.f21880b.r();
    }

    public final void z() {
        synchronized (this.j) {
            try {
                if (this.h != null) {
                    this.h.cancel();
                    this.l.set(false);
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
