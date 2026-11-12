package defpackage;

import io.sentry.Instrumenter;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.metrics.d;
import io.sentry.protocol.f;
import io.sentry.protocol.p;
import io.sentry.u;
import io.sentry.util.m;
import io.sentry.v;
import io.sentry.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a5n implements qyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public hul f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public hul f654b;

    @NotNull
    public final v c;

    @NotNull
    public final u d;

    @Nullable
    public Throwable e;

    @NotNull
    public final ftc f;
    public boolean g;

    @NotNull
    public final AtomicBoolean h;

    @NotNull
    public final c5n i;

    @Nullable
    public b5n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f655k;

    @NotNull
    public final Map<String, f> l;

    @NotNull
    public final m<d> m;

    public a5n(@NotNull p pVar, @Nullable w wVar, @NotNull u uVar, @NotNull String str, @NotNull ftc ftcVar, @Nullable hul hulVar, @NotNull c5n c5nVar, @Nullable b5n b5nVar) {
        this.g = false;
        this.h = new AtomicBoolean(false);
        this.f655k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
        this.m = new m<>(new m.a() { // from class: z4n
            @Override // io.sentry.util.m.a
            public final Object a() {
                return a5n.H();
            }
        });
        this.c = new v(pVar, new w(), str, wVar, uVar.J());
        this.d = (u) io.sentry.util.p.c(uVar, "transaction is required");
        this.f = (ftc) io.sentry.util.p.c(ftcVar, "hub is required");
        this.i = c5nVar;
        this.j = b5nVar;
        if (hulVar != null) {
            this.f653a = hulVar;
        } else {
            this.f653a = ftcVar.i().getDateProvider().now();
        }
    }

    public static /* synthetic */ d H() {
        return new d();
    }

    @Nullable
    public qkp A() {
        return this.c.g();
    }

    @Nullable
    public b5n B() {
        return this.j;
    }

    @NotNull
    public w C() {
        return this.c.h();
    }

    public Map<String, String> D() {
        return this.c.j();
    }

    @NotNull
    public p E() {
        return this.c.k();
    }

    @Nullable
    public Boolean F() {
        return this.c.e();
    }

    @Nullable
    public Boolean G() {
        return this.c.f();
    }

    public void I(@Nullable b5n b5nVar) {
        this.j = b5nVar;
    }

    @NotNull
    public qyc J(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter, @NotNull c5n c5nVar) {
        return this.g ? gvg.s() : this.d.Y(this.c.h(), str, str2, hulVar, instrumenter, c5nVar);
    }

    public final void K(@NotNull hul hulVar) {
        this.f653a = hulVar;
    }

    @Override // defpackage.qyc
    public boolean a() {
        return this.g;
    }

    @Override // defpackage.qyc
    @NotNull
    public v d() {
        return this.c;
    }

    @Override // defpackage.qyc
    public void f(@Nullable SpanStatus spanStatus, @Nullable hul hulVar) {
        hul hulVar2;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        this.c.o(spanStatus);
        if (hulVar == null) {
            hulVar = this.f.i().getDateProvider().now();
        }
        this.f654b = hulVar;
        if (this.i.c() || this.i.b()) {
            hul hulVarR = null;
            hul hulVarQ = null;
            for (a5n a5nVar : this.d.I().C().equals(C()) ? this.d.E() : u()) {
                if (hulVarR == null || a5nVar.r().d(hulVarR)) {
                    hulVarR = a5nVar.r();
                }
                if (hulVarQ == null || (a5nVar.q() != null && a5nVar.q().c(hulVarQ))) {
                    hulVarQ = a5nVar.q();
                }
            }
            if (this.i.c() && hulVarR != null && this.f653a.d(hulVarR)) {
                K(hulVarR);
            }
            if (this.i.b() && hulVarQ != null && ((hulVar2 = this.f654b) == null || hulVar2.c(hulVarQ))) {
                g(hulVarQ);
            }
        }
        Throwable th = this.e;
        if (th != null) {
            this.f.u(th, this, this.d.getName());
        }
        b5n b5nVar = this.j;
        if (b5nVar != null) {
            b5nVar.a(this);
        }
        this.g = true;
    }

    @Override // defpackage.qyc
    public void finish() {
        n(this.c.i());
    }

    @Override // defpackage.qyc
    public boolean g(@NotNull hul hulVar) {
        if (this.f654b == null) {
            return false;
        }
        this.f654b = hulVar;
        return true;
    }

    @Override // defpackage.qyc
    @Nullable
    public String getDescription() {
        return this.c.a();
    }

    @Override // defpackage.qyc
    @Nullable
    public SpanStatus getStatus() {
        return this.c.i();
    }

    @Override // defpackage.qyc
    public void h(@Nullable String str) {
        this.c.l(str);
    }

    @Override // defpackage.qyc
    public void j(@NotNull String str, @NotNull Number number) {
        if (a()) {
            this.f.i().getLogger().c(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new f(number, null));
        if (this.d.I() != this) {
            this.d.W(str, number);
        }
    }

    @Override // defpackage.qyc
    public void m(@NotNull String str, @NotNull Object obj) {
        this.f655k.put(str, obj);
    }

    @Override // defpackage.qyc
    public void n(@Nullable SpanStatus spanStatus) {
        f(spanStatus, this.f.i().getDateProvider().now());
    }

    @Override // defpackage.qyc
    public void o(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        if (a()) {
            this.f.i().getLogger().c(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new f(number, measurementUnit.apiName()));
        if (this.d.I() != this) {
            this.d.X(str, number, measurementUnit);
        }
    }

    @Override // defpackage.qyc
    @Nullable
    public hul q() {
        return this.f654b;
    }

    @Override // defpackage.qyc
    @NotNull
    public hul r() {
        return this.f653a;
    }

    @NotNull
    public Map<String, Object> t() {
        return this.f655k;
    }

    @NotNull
    public final List<a5n> u() {
        ArrayList arrayList = new ArrayList();
        for (a5n a5nVar : this.d.K()) {
            if (a5nVar.z() != null && a5nVar.z().equals(C())) {
                arrayList.add(a5nVar);
            }
        }
        return arrayList;
    }

    @NotNull
    public d v() {
        return this.m.a();
    }

    @NotNull
    public Map<String, f> w() {
        return this.l;
    }

    @NotNull
    public String x() {
        return this.c.b();
    }

    @NotNull
    public c5n y() {
        return this.i;
    }

    @Nullable
    public w z() {
        return this.c.d();
    }

    public a5n(@NotNull owp owpVar, @NotNull u uVar, @NotNull ftc ftcVar, @Nullable hul hulVar, @NotNull c5n c5nVar) {
        this.g = false;
        this.h = new AtomicBoolean(false);
        this.f655k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
        this.m = new m<>(new m.a() { // from class: z4n
            @Override // io.sentry.util.m.a
            public final Object a() {
                return a5n.H();
            }
        });
        this.c = (v) io.sentry.util.p.c(owpVar, "context is required");
        this.d = (u) io.sentry.util.p.c(uVar, "sentryTracer is required");
        this.f = (ftc) io.sentry.util.p.c(ftcVar, "hub is required");
        this.j = null;
        if (hulVar != null) {
            this.f653a = hulVar;
        } else {
            this.f653a = ftcVar.i().getDateProvider().now();
        }
        this.i = c5nVar;
    }
}
