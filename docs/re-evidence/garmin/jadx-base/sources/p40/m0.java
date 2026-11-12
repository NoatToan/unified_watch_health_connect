package p40;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f135704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f135705c;

    public /* synthetic */ m0(f0 f0Var, f0 f0Var2, int i14) {
        this.f135703a = i14;
        this.f135704b = f0Var;
        this.f135705c = f0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f135703a;
        f0 f0Var = this.f135705c;
        f0 f0Var2 = this.f135704b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = n0.f135706b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-468992582, new m0(f0Var2, f0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = n0.f135706b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zB = mVar2.B(f0Var2);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zB) {
                        objQ = new ov1.u(f0Var2, 10);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ov1.u(f0Var2, 10);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zB2 = mVar2.B(f0Var);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new ov1.u(f0Var, 11);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ov1.u(f0Var, 11);
                            mVar2.K(objQ2);
                        }
                    }
                    l0.a(aVar2, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
