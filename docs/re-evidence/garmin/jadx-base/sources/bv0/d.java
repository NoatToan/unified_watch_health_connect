package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0.f f21285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc.f f21287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f21288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f21289f;

    public /* synthetic */ d(gv0.d dVar, yu0.f fVar, sc.f fVar2, e23.a aVar, e23.a aVar2) {
        this.f21284a = 3;
        this.f21286c = dVar;
        this.f21285b = fVar;
        this.f21287d = fVar2;
        this.f21288e = aVar;
        this.f21289f = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0236  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f21284a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a.u) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    gv0.d dVar = this.f21286c;
                    boolean zR = mVar.r(dVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new n(dVar, 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n(dVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    sc.f fVar = this.f21287d;
                    boolean zR2 = mVar.r(fVar);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new o(fVar, 0);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new o(fVar, 0);
                            mVar.K(objQ2);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ2;
                    boolean zR3 = mVar.r(fVar);
                    e23.a aVar3 = this.f21288e;
                    boolean zB = zR3 | mVar.B(aVar3) | mVar.r(dVar);
                    e23.a aVar4 = this.f21289f;
                    boolean zB2 = zB | mVar.B(aVar4);
                    Object objQ3 = mVar.q();
                    if (zB2) {
                        c cVar = new c(fVar, aVar3, dVar, aVar4, 4);
                        mVar.K(cVar);
                        objQ3 = cVar;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            c cVar2 = new c(fVar, aVar3, dVar, aVar4, 4);
                            mVar.K(cVar2);
                            objQ3 = cVar2;
                        }
                    }
                    cv0.i.b(this.f21285b, dVar, lVar, aVar2, (e23.a) objQ3, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a.r) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    gv0.d dVar2 = this.f21286c;
                    boolean zR4 = mVar2.r(dVar2);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new n(dVar2, 1);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new n(dVar2, 1);
                            mVar2.K(objQ4);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    sc.f fVar2 = this.f21287d;
                    boolean zR5 = mVar2.r(fVar2);
                    e23.a aVar5 = this.f21288e;
                    boolean zB3 = zR5 | mVar2.B(aVar5) | mVar2.r(dVar2);
                    e23.a aVar6 = this.f21289f;
                    boolean zB4 = zB3 | mVar2.B(aVar6);
                    Object objQ5 = mVar2.q();
                    if (zB4) {
                        c cVar3 = new c(fVar2, aVar5, dVar2, aVar6, 6);
                        mVar2.K(cVar3);
                        objQ5 = cVar3;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            c cVar4 = new c(fVar2, aVar5, dVar2, aVar6, 6);
                            mVar2.K(cVar4);
                            objQ5 = cVar4;
                        }
                    }
                    cv0.f.a(384, (e23.a) objQ5, lVar2, dVar2, mVar2, this.f21285b);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a.s) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    sc.f fVar3 = this.f21287d;
                    boolean zR6 = mVar3.r(fVar3);
                    Object objQ6 = mVar3.q();
                    if (zR6) {
                        objQ6 = new o(fVar3, 6);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new o(fVar3, 6);
                            mVar3.K(objQ6);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ6;
                    boolean zR7 = mVar3.r(fVar3);
                    Object objQ7 = mVar3.q();
                    if (zR7) {
                        objQ7 = new o(fVar3, 7);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new o(fVar3, 7);
                            mVar3.K(objQ7);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ7;
                    boolean zR8 = mVar3.r(fVar3);
                    e23.a aVar9 = this.f21288e;
                    boolean zB5 = zR8 | mVar3.B(aVar9);
                    gv0.d dVar3 = this.f21286c;
                    boolean zR9 = zB5 | mVar3.r(dVar3);
                    e23.a aVar10 = this.f21289f;
                    boolean zB6 = zR9 | mVar3.B(aVar10);
                    Object objQ8 = mVar3.q();
                    if (zB6) {
                        c cVar5 = new c(fVar3, aVar9, dVar3, aVar10, 11);
                        mVar3.K(cVar5);
                        objQ8 = cVar5;
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            c cVar6 = new c(fVar3, aVar9, dVar3, aVar10, 11);
                            mVar3.K(cVar6);
                            objQ8 = cVar6;
                        }
                    }
                    dv0.g.a(this.f21285b, dVar3, aVar7, aVar8, (e23.a) objQ8, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a.C0300a) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    gv0.d dVar4 = this.f21286c;
                    boolean zR10 = mVar4.r(dVar4);
                    Object objQ9 = mVar4.q();
                    if (zR10) {
                        objQ9 = new n(dVar4, 2);
                        mVar4.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new n(dVar4, 2);
                            mVar4.K(objQ9);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ9;
                    sc.f fVar4 = this.f21287d;
                    boolean zR11 = mVar4.r(fVar4);
                    e23.a aVar11 = this.f21288e;
                    boolean zB7 = zR11 | mVar4.B(aVar11) | mVar4.r(dVar4);
                    e23.a aVar12 = this.f21289f;
                    boolean zB8 = zB7 | mVar4.B(aVar12);
                    Object objQ10 = mVar4.q();
                    if (zB8) {
                        objQ10 = new c(fVar4, aVar11, dVar4, aVar12, 8);
                        mVar4.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new c(fVar4, aVar11, dVar4, aVar12, 8);
                            mVar4.K(objQ10);
                        }
                    }
                    cv0.d.a(0, (e23.a) objQ10, lVar3, dVar4, mVar4, this.f21285b);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(yu0.f fVar, gv0.d dVar, sc.f fVar2, e23.a aVar, e23.a aVar2, int i14) {
        this.f21284a = i14;
        this.f21285b = fVar;
        this.f21286c = dVar;
        this.f21287d = fVar2;
        this.f21288e = aVar;
        this.f21289f = aVar2;
    }
}
