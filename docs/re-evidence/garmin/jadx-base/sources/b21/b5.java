package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b5 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21.g f14536b;

    public /* synthetic */ b5(m21.g gVar, int i14) {
        this.f14535a = i14;
        this.f14536b = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f14535a) {
            case 0:
                b11.a aVar = (b11.a) obj;
                aVar.getClass();
                boolean z14 = aVar instanceof b11.a.C0202a;
                m21.g gVar = this.f14536b;
                if (z14) {
                    ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new m21.o(gVar, (b11.a.C0202a) aVar, null), 3);
                } else if (aVar instanceof b11.a.b) {
                    ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new m21.p(gVar, (b11.a.b) aVar, null), 3);
                } else {
                    if (!(aVar instanceof b11.a.c)) {
                        lc.u0.r();
                        return null;
                    }
                    ge1.b.T(androidx.lifecycle.v1.a(gVar), null, null, new m21.q(gVar, (b11.a.c) aVar, null), 3);
                }
                return Unit.INSTANCE;
            case 1:
                f01.j jVar = (f01.j) obj;
                jVar.getClass();
                this.f14536b.R4(jVar);
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj;
                str.getClass();
                this.f14536b.N4(str, k21.a.ALL);
                return Unit.INSTANCE;
            case 3:
                b11.l lVar = (b11.l) obj;
                lVar.getClass();
                this.f14536b.P4(lVar);
                return Unit.INSTANCE;
            case 4:
                b11.l lVar2 = (b11.l) obj;
                lVar2.getClass();
                this.f14536b.P4(lVar2);
                return Unit.INSTANCE;
            case 5:
                b11.l lVar3 = (b11.l) obj;
                lVar3.getClass();
                this.f14536b.P4(lVar3);
                return Unit.INSTANCE;
            case 6:
                b11.l lVar4 = (b11.l) obj;
                lVar4.getClass();
                this.f14536b.P4(lVar4);
                return Unit.INSTANCE;
            default:
                b11.l lVar5 = (b11.l) obj;
                lVar5.getClass();
                this.f14536b.P4(lVar5);
                return Unit.INSTANCE;
        }
    }
}
