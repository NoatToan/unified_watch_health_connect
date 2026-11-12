package ks2;

import q03.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hs2.d f106395b;

    public /* synthetic */ b(hs2.d dVar, int i14) {
        this.f106394a = i14;
        this.f106395b = dVar;
    }

    @Override // q03.u
    public final void c(e13.a.C1312a c1312a) {
        switch (this.f106394a) {
            case 0:
                if (this.f106395b.D(new c(c1312a)) == -1) {
                    c1312a.a(new Exception("Invalid transaction ID"));
                }
                break;
            default:
                if (this.f106395b.u(new d(c1312a)) == -1) {
                    c1312a.a(new Exception("Invalid transaction ID"));
                }
                break;
        }
    }
}
