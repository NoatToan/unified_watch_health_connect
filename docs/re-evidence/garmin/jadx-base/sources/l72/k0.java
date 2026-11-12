package l72;

import i3.i7;
import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f111105b;

    public /* synthetic */ k0(j0 j0Var, int i14) {
        this.f111104a = i14;
        this.f111105b = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f111104a;
        p3.m.a aVar = p3.m.f135153a;
        final j0 j0Var = this.f111105b;
        boolean z14 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    if (j0Var.f111074c != null) {
                        mVar.C(-739733412);
                        u4.d dVar = j0Var.f111074c;
                        String str = j0Var.f111072a;
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.b(dVar, str, c2.x2.q(c2.l.C(aVar2, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97904c), 0L, mVar, 0, 8);
                        mVar.f();
                    } else {
                        mVar.C(-739425892);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String str2 = j0Var.f111072a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97932i;
                    h4.r.a aVar3 = h4.r.S;
                    float f14 = 8;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(aVar3, 0.0f, f14, 0.0f, f14, 5);
                    boolean zB = mVar2.B(j0Var);
                    Object objQ = mVar2.q();
                    if (zB) {
                        final int i16 = z14 ? 1 : 0;
                        objQ = new e23.l() { // from class: l72.m0
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                p5.k0 k0Var = (p5.k0) obj3;
                                switch (i16) {
                                    case 0:
                                        k0Var.getClass();
                                        p5.h0.n(k0Var, j0Var.f111073b);
                                        break;
                                    default:
                                        k0Var.getClass();
                                        p5.h0.n(k0Var, j0Var.f111073b);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i17 = z14 ? 1 : 0;
                            objQ = new e23.l() { // from class: l72.m0
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    p5.k0 k0Var = (p5.k0) obj3;
                                    switch (i17) {
                                        case 0:
                                            k0Var.getClass();
                                            p5.h0.n(k0Var, j0Var.f111073b);
                                            break;
                                        default:
                                            k0Var.getClass();
                                            p5.h0.n(k0Var, j0Var.f111073b);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    mh.c(str2, p5.v.c((e23.l) objQ, rVarC, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131068);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    String str3 = j0Var.f111072a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97932i;
                    h4.r.a aVar5 = h4.r.S;
                    float f15 = 8;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarC2 = c2.l.C(aVar5, 0.0f, f15, 0.0f, f15, 5);
                    boolean zB2 = mVar3.B(j0Var);
                    Object objQ2 = mVar3.q();
                    if (zB2) {
                        objQ2 = new e23.l() { // from class: l72.m0
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                p5.k0 k0Var = (p5.k0) obj3;
                                switch (i15) {
                                    case 0:
                                        k0Var.getClass();
                                        p5.h0.n(k0Var, j0Var.f111073b);
                                        break;
                                    default:
                                        k0Var.getClass();
                                        p5.h0.n(k0Var, j0Var.f111073b);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.l() { // from class: l72.m0
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    p5.k0 k0Var = (p5.k0) obj3;
                                    switch (i15) {
                                        case 0:
                                            k0Var.getClass();
                                            p5.h0.n(k0Var, j0Var.f111073b);
                                            break;
                                        default:
                                            k0Var.getClass();
                                            p5.h0.n(k0Var, j0Var.f111073b);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ2);
                        }
                    }
                    mh.c(str3, p5.v.c((e23.l) objQ2, rVarC2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar3, 0, 0, 131068);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (j0Var.f111074c != null) {
                        mVar4.C(-2078553162);
                        u4.d dVar2 = j0Var.f111074c;
                        String str4 = j0Var.f111072a;
                        h4.r.a aVar7 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.b(dVar2, str4, c2.x2.q(aVar7, j92.b.f97901d.f97904c), 0L, mVar4, 0, 8);
                        mVar4.f();
                    } else {
                        mVar4.C(-2078310029);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
