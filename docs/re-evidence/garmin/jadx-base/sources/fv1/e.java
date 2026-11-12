package fv1;

import e23.p;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f73708b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f73707a = i14;
        this.f73708b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73707a;
        g gVar = this.f73708b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g.a aVar = g.f73711d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(656946308, new e(gVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g.a aVar2 = g.f73711d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = s9.c.c(gVar.v6().T, mVar2);
                    if (!s.g((gv1.a) p1VarC.getF182175a(), gVar.v6().Z)) {
                        gVar.f73713b = true;
                        androidx.fragment.app.m activity = gVar.getActivity();
                        if (activity != null) {
                            activity.invalidateOptionsMenu();
                        }
                    }
                    gv1.a aVar3 = (gv1.a) p1VarC.getF182175a();
                    if (aVar3 == null) {
                        mVar2.C(-1078179069);
                    } else {
                        mVar2.C(-1078179068);
                        gVar.u6(aVar3, mVar2, 0);
                    }
                    mVar2.f();
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
