package fn1;

import c2.a0;
import i3.kc;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72227a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f72228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f72229c;

    public /* synthetic */ o(a0 a0Var, z3.e eVar, int i14) {
        this.f72228b = a0Var;
        this.f72229c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72227a;
        z3.e eVar = this.f72229c;
        a0 a0Var = this.f72228b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    eVar.invoke(a0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                kc.a(a0Var, eVar, mVar, p0.t(55));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(z3.e eVar, a0 a0Var) {
        this.f72229c = eVar;
        this.f72228b = a0Var;
    }
}
