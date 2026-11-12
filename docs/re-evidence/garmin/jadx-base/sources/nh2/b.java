package nh2;

import q03.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements u03.a, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126157b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f126156a = i14;
        this.f126157b = dVar;
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) throws Throwable {
        d.Companion companion = d.INSTANCE;
        d dVar = this.f126157b;
        dVar.getClass();
        dVar.f126161a.getClass();
        ge1.b.W(t13.h.f161748a, new h(dVar, c1312a, null));
    }

    @Override // u03.a
    public void run() {
        int i14 = this.f126156a;
        d dVar = this.f126157b;
        switch (i14) {
            case 0:
                d.Companion companion = d.INSTANCE;
                dVar.f126161a.getClass();
                y03.e eVar = dVar.f126162b;
                if (eVar != null) {
                    v03.c.a(eVar);
                }
                break;
            default:
                d.Companion companion2 = d.INSTANCE;
                dVar.getClass();
                dVar.f126161a.getClass();
                y03.e eVar2 = dVar.f126163c;
                if (eVar2 != null) {
                    v03.c.a(eVar2);
                }
                break;
        }
    }
}
