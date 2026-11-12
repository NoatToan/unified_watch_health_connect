package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.d1 f135804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135805b;

    public c1(t23.d1 d1Var) {
        d1Var.getClass();
        this.f135804a = d1Var;
        this.f135805b = o13.m.a(o13.n.PUBLICATION, new b1(this));
    }

    @Override // p43.t1
    public final g2 a() {
        return g2.OUT_VARIANCE;
    }

    @Override // p43.t1
    public final boolean b() {
        return true;
    }

    @Override // p43.t1
    public final t1 c(q43.f fVar) {
        fVar.getClass();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // p43.t1
    public final n0 getType() {
        return (n0) this.f135805b.getValue();
    }
}
