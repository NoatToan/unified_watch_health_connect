package uu;

import c2.x2;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import r22.l2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.b f172663b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.badges.redesign.b bVar, int i14) {
        this.f172662a = i14;
        this.f172663b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f172662a;
        com.garmin.android.apps.connectmobile.badges.redesign.b bVar = this.f172663b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1779385165, new d(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar2 = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = p0.c(bVar.P, mVar2, 0);
                    float f14 = com.garmin.android.apps.connectmobile.badges.redesign.b.Y;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97917b;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 50);
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new e(bVar, 1);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(bVar, 1);
                            mVar2.K(objQ);
                        }
                    }
                    l2.a(rVarH, (e23.l) objQ, f15 * 2, z3.f.c(1015730033, new d70.f(p1VarC, f14, 7), mVar2), mVar2, 3078);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
