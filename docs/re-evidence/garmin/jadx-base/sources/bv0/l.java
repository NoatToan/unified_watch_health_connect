package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc.f f21343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21344c;

    public /* synthetic */ l(sc.f fVar, gv0.d dVar, int i14) {
        this.f21342a = i14;
        this.f21343b = fVar;
        this.f21344c = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Long l14;
        Long l15;
        sc.j jVar;
        switch (this.f21342a) {
            case 0:
                pu0.b bVar = (pu0.b) obj;
                bVar.getClass();
                pu0.i iVar = (pu0.i) p13.h0.d0(bVar.f141191i);
                if (iVar == null || (l14 = iVar.f141260a) == null) {
                    pu0.f fVar = (pu0.f) p13.h0.d0(bVar.f141186d);
                    l14 = fVar != null ? fVar.f141220a : null;
                    if (l14 == null) {
                        pu0.h hVar = (pu0.h) p13.h0.d0(bVar.f141192j);
                        l14 = hVar != null ? hVar.f141237a : null;
                    }
                }
                String str = bVar.f141183a;
                str.getClass();
                ou0.d dVar = (ou0.d) this.f21344c.X.f150540a.getValue();
                this.f21343b.a(new a.c(str, l14, dVar != null ? dVar.f133974a : null));
                break;
            case 1:
                pu0.b bVar2 = (pu0.b) obj;
                bVar2.getClass();
                pu0.i iVar2 = (pu0.i) p13.h0.d0(bVar2.f141191i);
                if (iVar2 == null || (l15 = iVar2.f141260a) == null) {
                    pu0.f fVar2 = (pu0.f) p13.h0.d0(bVar2.f141186d);
                    l15 = fVar2 != null ? fVar2.f141220a : null;
                    if (l15 == null) {
                        pu0.h hVar2 = (pu0.h) p13.h0.d0(bVar2.f141192j);
                        l15 = hVar2 != null ? hVar2.f141237a : null;
                    }
                }
                String str2 = bVar2.f141183a;
                str2.getClass();
                ou0.d dVar2 = (ou0.d) this.f21344c.X.f150540a.getValue();
                this.f21343b.a(new a.c(str2, l15, dVar2 != null ? dVar2.f133974a : null));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    jVar = a.n.INSTANCE;
                } else {
                    gv0.d dVar3 = this.f21344c;
                    boolean zC5 = dVar3.c5();
                    ou0.d dVar4 = (ou0.d) dVar3.X.f150540a.getValue();
                    if (zC5) {
                        jVar = a.a0.INSTANCE;
                    } else {
                        jVar = gl.b.N(dVar4) ? a.j.INSTANCE : a.z.INSTANCE;
                    }
                }
                this.f21343b.a(jVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
