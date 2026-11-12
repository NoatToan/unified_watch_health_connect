package da0;

import i3.h7;
import i3.i7;
import l72.i3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f58748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f58749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.d f58750d;

    public /* synthetic */ j0(e23.l lVar, i3 i3Var, u4.d dVar, int i14) {
        this.f58747a = i14;
        this.f58748b = lVar;
        this.f58749c = i3Var;
        this.f58750d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58747a;
        p3.m.a aVar = p3.m.f135153a;
        final u4.d dVar = this.f58750d;
        final i3 i3Var = this.f58749c;
        e23.l lVar = this.f58748b;
        final int i15 = 1;
        Object[] objArr = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB = mVar.B(lVar) | mVar.r(i3Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new d0(lVar, i3Var, 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d0(lVar, i3Var, 0);
                            mVar.K(objQ);
                        }
                    }
                    boolean z14 = i3Var.f111065c;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    h7.a((e23.a) objQ, null, z14, null, null, z3.f.c(-1002428639, new e23.p() { // from class: da0.e0
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            long jC;
                            long jC2;
                            int i16 = objArr2;
                            i3 i3Var2 = i3Var;
                            switch (i16) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var2 = p3.n.f135158a;
                                        if (i3Var2.f111065c) {
                                            mVar2.C(-1261245112);
                                            d92.b.f58623a.getClass();
                                            jC = d92.b.a(mVar2).f().b();
                                        } else {
                                            mVar2.C(-1261243925);
                                            d92.b.f58623a.getClass();
                                            jC = o4.d0.c(0.5f, d92.b.a(mVar2).f().b(), 14);
                                        }
                                        mVar2.f();
                                        i7.b(dVar, i3Var2.f111067e, null, jC, mVar2, 0, 4);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar3 = (p3.m) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        o4.d0 d0Var = i3Var2.f111069g;
                                        if (d0Var == null) {
                                            mVar3.C(-1026899301);
                                            d92.b.f58623a.getClass();
                                            jC2 = d92.b.a(mVar3).f().b();
                                            mVar3.f();
                                        } else {
                                            mVar3.C(-1026900479);
                                            mVar3.f();
                                            jC2 = d0Var.f128833a;
                                        }
                                        if (!i3Var2.f111065c) {
                                            jC2 = o4.d0.c(o4.d0.e(jC2) * 0.5f, jC2, 14);
                                        }
                                        long j8 = jC2;
                                        mVar3.C(-1768901603);
                                        i7.b(dVar, i3Var2.f111067e, null, j8, mVar3, 0, 4);
                                        mVar3.f();
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 1572864, 58);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zB2 = mVar2.B(lVar) | mVar2.r(i3Var);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new d0(lVar, i3Var, 2);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new d0(lVar, i3Var, 2);
                            mVar2.K(objQ2);
                        }
                    }
                    h7.a((e23.a) objQ2, null, i3Var.f111065c, null, null, z3.f.c(-1627882412, new e23.p() { // from class: da0.e0
                        @Override // e23.p
                        public final Object invoke(Object obj3, Object obj4) {
                            long jC;
                            long jC2;
                            int i16 = i15;
                            i3 i3Var2 = i3Var;
                            switch (i16) {
                                case 0:
                                    p3.m mVar3 = (p3.m) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        if (i3Var2.f111065c) {
                                            mVar3.C(-1261245112);
                                            d92.b.f58623a.getClass();
                                            jC = d92.b.a(mVar3).f().b();
                                        } else {
                                            mVar3.C(-1261243925);
                                            d92.b.f58623a.getClass();
                                            jC = o4.d0.c(0.5f, d92.b.a(mVar3).f().b(), 14);
                                        }
                                        mVar3.f();
                                        i7.b(dVar, i3Var2.f111067e, null, jC, mVar3, 0, 4);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar4 = (p3.m) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        o4.d0 d0Var = i3Var2.f111069g;
                                        if (d0Var == null) {
                                            mVar4.C(-1026899301);
                                            d92.b.f58623a.getClass();
                                            jC2 = d92.b.a(mVar4).f().b();
                                            mVar4.f();
                                        } else {
                                            mVar4.C(-1026900479);
                                            mVar4.f();
                                            jC2 = d0Var.f128833a;
                                        }
                                        if (!i3Var2.f111065c) {
                                            jC2 = o4.d0.c(o4.d0.e(jC2) * 0.5f, jC2, 14);
                                        }
                                        long j8 = jC2;
                                        mVar4.C(-1768901603);
                                        i7.b(dVar, i3Var2.f111067e, null, j8, mVar4, 0, 4);
                                        mVar4.f();
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, 1572864, 58);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
