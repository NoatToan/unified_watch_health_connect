package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.n f135916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<n0> f135917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.j<n0> f135918d;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(o43.n nVar, e23.a<? extends n0> aVar) {
        nVar.getClass();
        aVar.getClass();
        this.f135916b = nVar;
        this.f135917c = aVar;
        this.f135918d = nVar.g(aVar);
    }

    @Override // p43.n0
    /* JADX INFO: renamed from: H0 */
    public final n0 K0(q43.f fVar) {
        fVar.getClass();
        return new s0(this.f135916b, new r0(fVar, this));
    }

    @Override // p43.h2
    public final n0 J0() {
        return this.f135918d.invoke();
    }

    @Override // p43.h2
    public final boolean K0() {
        o43.e.f fVar = (o43.e.f) this.f135918d;
        return (fVar.f129104c == o43.e.l.NOT_COMPUTED || fVar.f129104c == o43.e.l.COMPUTING) ? false : true;
    }
}
