package w23;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c0 extends o implements t23.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f181578h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f181579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x33.c f181580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.j f181581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o43.j f181582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i43.j f181583g;

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(c0.class, "fragments", "getFragments()Ljava/util/List;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f181578h = new k23.l[]{t0Var.h(i0Var), n23.j.l(c0.class, "empty", "getEmpty()Z", 0, t0Var)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(i0 i0Var, x33.c cVar, o43.n nVar) {
        i0Var.getClass();
        cVar.getClass();
        nVar.getClass();
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        x33.d dVar = cVar.f188596a;
        super(c3153a, dVar.c() ? x33.d.f188599f : dVar.g());
        this.f181579c = i0Var;
        this.f181580d = cVar;
        this.f181581e = nVar.g(new z(this));
        this.f181582f = nVar.g(new a0(this));
        this.f181583g = new i43.j(nVar, new b0(this));
    }

    @Override // t23.n0
    public final i0 B0() {
        return this.f181579c;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.f(this, d14);
    }

    @Override // t23.n0
    public final x33.c c() {
        return this.f181580d;
    }

    @Override // t23.l
    public final t23.l d() {
        x33.c cVar = this.f181580d;
        if (cVar.f188596a.c()) {
            return null;
        }
        return this.f181579c.d0(cVar.b());
    }

    public final boolean equals(Object obj) {
        t23.n0 n0Var = obj instanceof t23.n0 ? (t23.n0) obj : null;
        return n0Var != null && p005kotlin.jvm.internal.s.g(this.f181580d, n0Var.c()) && p005kotlin.jvm.internal.s.g(this.f181579c, n0Var.B0());
    }

    public final int hashCode() {
        return this.f181580d.hashCode() + (this.f181579c.hashCode() * 31);
    }

    @Override // t23.n0
    public final i43.l i() {
        return this.f181583g;
    }

    @Override // t23.n0
    public final boolean isEmpty() {
        return ((Boolean) gl1.d.B(this.f181582f, f181578h[1])).booleanValue();
    }

    @Override // t23.n0
    public final List<t23.h0> x() {
        return (List) gl1.d.B(this.f181581e, f181578h[0]);
    }
}
