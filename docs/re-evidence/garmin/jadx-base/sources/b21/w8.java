package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w8 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f15364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s21.a0 f15365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v21.e f15367e;

    public /* synthetic */ w8(u21.u0 u0Var, s21.a0 a0Var, lc.m0 m0Var, v21.e eVar, int i14) {
        this.f15363a = i14;
        this.f15364b = u0Var;
        this.f15365c = a0Var;
        this.f15366d = m0Var;
        this.f15367e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f15363a;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f15366d;
        u21.u0 u0Var = this.f15364b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    i53.h<s21.z> hVarA4 = u0Var.A4();
                    boolean zR = mVar.r(m0Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new d7(m0Var, 1);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d7(m0Var, 1);
                            mVar.K(objQ);
                        }
                    }
                    t21.q0.b(this.f15365c, hVarA4, true, (e23.l) objQ, this.f15367e, mVar, 384, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    i53.h<s21.z> hVarA5 = u0Var.A4();
                    boolean zR2 = mVar2.r(u0Var);
                    s21.a0 a0Var = this.f15365c;
                    boolean zR3 = zR2 | mVar2.r(a0Var) | mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zR3) {
                        objQ2 = new a4.a(u0Var, 16, a0Var, m0Var);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a4.a(u0Var, 16, a0Var, m0Var);
                            mVar2.K(objQ2);
                        }
                    }
                    t21.q0.b(a0Var, hVarA5, false, (e23.l) objQ2, this.f15367e, mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
