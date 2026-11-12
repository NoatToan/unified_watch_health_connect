package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f111271b;

    public /* synthetic */ u(e23.q qVar, int i14) {
        this.f111270a = i14;
        this.f111271b = qVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f111270a;
        e23.q qVar = this.f111271b;
        switch (i14) {
            case 0:
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                w wVar = w.f111301a;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    qVar.invoke(t2Var, mVar, Integer.valueOf(iIntValue & 14));
                } else {
                    mVar.e();
                }
                break;
            case 1:
                c2.t2 t2Var2 = (c2.t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                w wVar2 = w.f111301a;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    qVar.invoke(t2Var2, mVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                Long l14 = (Long) obj;
                l14.getClass();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                rt1.j jVar = (rt1.j) obj3;
                jVar.getClass();
                qVar.invoke(l14, bool, jVar);
                break;
            case 3:
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                qVar.invoke((Long) obj, bool2, (rt1.j) obj3);
                break;
            default:
                String str = (String) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                str.getClass();
                qVar.invoke(str, pv0.k.f141386e.get(iIntValue3), pv0.p.f141402d.get(iIntValue4));
                break;
        }
        return Unit.INSTANCE;
    }
}
