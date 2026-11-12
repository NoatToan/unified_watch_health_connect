package mt0;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120626b;

    public /* synthetic */ g1(com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar, int i14) {
        this.f120625a = i14;
        this.f120626b = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f120625a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120626b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(667935300, new g1(qVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    androidx.lifecycle.y0<List<ot0.g>> y0Var = qVar.w6().f140744c.f120665a;
                    p13.j0 j0Var = p13.j0.f134944a;
                    p3.p1 p1VarF = o53.f0.F(y0Var, j0Var, mVar2, 48);
                    p3.p1 p1VarF2 = o53.f0.F(qVar.w6().f140744c.f120666b, j0Var, mVar2, 48);
                    List list = (List) p1VarF.getF182175a();
                    list.getClass();
                    List list2 = (List) p1VarF2.getF182175a();
                    list2.getClass();
                    pt0.o oVarW6 = qVar.w6();
                    boolean zR = mVar2.r(oVarW6);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new i1(oVarW6);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i1(oVarW6);
                            mVar2.K(objQ);
                        }
                    }
                    ut0.f.a(list, list2, (e23.l) ((k23.g) objQ), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
