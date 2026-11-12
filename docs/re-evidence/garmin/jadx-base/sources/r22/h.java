package r22;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f149663b;

    public /* synthetic */ h(zc.d dVar, int i14) {
        this.f149662a = i14;
        this.f149663b = dVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f149662a;
        zc.d dVar = this.f149663b;
        e2.d dVar2 = (e2.d) obj;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar = (p3.m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        switch (i14) {
            case 0:
                dVar2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.badges.service.model.q qVar = (com.garmin.android.apps.connectmobile.badges.service.model.q) dVar.a(iIntValue);
                    if (qVar == null) {
                        return Unit.INSTANCE;
                    }
                    k.a(qVar, mVar, com.garmin.android.apps.connectmobile.badges.service.model.q.f30654j);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                dVar2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    pe0.e eVar = (pe0.e) dVar.a(iIntValue);
                    if (eVar instanceof pe0.e.b) {
                        mVar.C(-1235355285);
                        vd0.t0.b(((pe0.e.b) eVar).f137419a, mVar, 0);
                        mVar.f();
                    } else if (eVar instanceof pe0.e.a) {
                        mVar.C(-1235352069);
                        vd0.t0.a((pe0.e.a) eVar, mVar, 0);
                        mVar.f();
                    } else {
                        if (eVar != null) {
                            throw n23.j.m(mVar, -1235358311);
                        }
                        mVar.C(-1235350238);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
