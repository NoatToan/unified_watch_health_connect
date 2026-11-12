package ky0;

import am.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107560a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.b f107561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.x0 f107562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d f107563d;

    public /* synthetic */ u0(l22.b bVar, am.x0 x0Var, i53.d dVar, int i14) {
        this.f107561b = bVar;
        this.f107562c = x0Var;
        this.f107563d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107560a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    d2.f107276a.getClass();
                    am.x0 x0Var = this.f107562c;
                    i53.f fVarB = d2.b(x0Var);
                    String strA = d2.a(ls.e.TOTAL_TIME);
                    i53.d dVar = this.f107563d;
                    i2 i2Var = (i2) dVar.get(strA);
                    v0.f(this.f107561b, dVar, fVarB, i2Var != null ? i2Var.getCount() : 0, x0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                v0.e(this.f107561b, this.f107562c, this.f107563d, (p3.m) obj, p3.p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u0(l22.b bVar, i53.d dVar, am.x0 x0Var) {
        this.f107561b = bVar;
        this.f107563d = dVar;
        this.f107562c = x0Var;
    }
}
