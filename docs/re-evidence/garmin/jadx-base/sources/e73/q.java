package e73;

/* JADX INFO: loaded from: classes3.dex */
public class q extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.q f63430a = new h73.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63432c;

    public q(int i14) {
        this.f63431b = i14;
    }

    @Override // j73.a, j73.d
    public final boolean a() {
        return true;
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63430a;
    }

    @Override // j73.a, j73.d
    public final boolean e(h73.a aVar) {
        if (!this.f63432c) {
            return true;
        }
        h73.a aVar2 = (h73.a) this.f63430a.f82379a;
        if (!(aVar2 instanceof h73.p)) {
            return true;
        }
        ((h73.p) aVar2).f82378f = false;
        return true;
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        if (hVar.f63360h) {
            if (this.f63430a.f82380b == null) {
                return null;
            }
            h73.a aVarC = hVar.h().c();
            this.f63432c = (aVarC instanceof h73.t) || (aVarC instanceof h73.q);
            return j73.c.a(hVar.f63357e);
        }
        int i14 = hVar.f63359g;
        int i15 = this.f63431b;
        if (i14 >= i15) {
            return new b(-1, hVar.f63355c + i15, false);
        }
        return null;
    }
}
