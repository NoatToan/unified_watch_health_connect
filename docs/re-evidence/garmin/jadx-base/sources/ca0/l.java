package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f26327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f26328d;

    public /* synthetic */ l(lc.m0 m0Var, e23.a aVar, s1 s1Var, int i14) {
        this.f26325a = i14;
        this.f26326b = m0Var;
        this.f26327c = aVar;
        this.f26328d = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26325a;
        p3.m.a aVar = p3.m.f135153a;
        s1 s1Var = this.f26328d;
        e23.a aVar2 = this.f26327c;
        lc.m0 m0Var = this.f26326b;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                ga0.a aVarC = h0.c(vVar, aVar2, s1Var, m0Var, mVar);
                p3.p1 p1VarC = s9.c.c(aVarC.f76599h, mVar);
                Boolean bool = (Boolean) p1VarC.getF182175a();
                bool.booleanValue();
                boolean zB = mVar.B(p1VarC) | mVar.r(m0Var) | mVar.r(aVarC);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new g0(m0Var, aVarC, p1VarC, null);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g0(m0Var, aVarC, p1VarC, null);
                        mVar.K(objQ);
                    }
                }
                p3.l0.e((e23.p) objQ, bool, mVar);
                da0.p.d(null, true, null, null, null, null, null, mVar, 48, 253);
                break;
            default:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                ga0.a aVarC2 = h0.c(vVar2, aVar2, s1Var, m0Var, mVar2);
                na0.r rVarB = h0.b(vVar2, aVar2, m0Var, mVar2);
                na0.q qVar = (na0.q) s9.c.c(rVarB.f125179d, mVar2).getF182175a();
                boolean zR = mVar2.r(rVarB);
                Object objQ2 = mVar2.q();
                if (zR) {
                    objQ2 = new b41.a(rVarB, 20);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b41.a(rVarB, 20);
                        mVar2.K(objQ2);
                    }
                }
                e23.l lVar = (e23.l) objQ2;
                boolean zR2 = mVar2.r(rVarB);
                Object objQ3 = mVar2.q();
                if (zR2) {
                    objQ3 = new u(rVarB, 1);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new u(rVarB, 1);
                        mVar2.K(objQ3);
                    }
                }
                e23.a aVar3 = (e23.a) objQ3;
                boolean zR3 = mVar2.r(m0Var) | mVar2.r(aVarC2);
                Object objQ4 = mVar2.q();
                if (zR3) {
                    objQ4 = new p(m0Var, aVarC2, 9);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new p(m0Var, aVarC2, 9);
                        mVar2.K(objQ4);
                    }
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR4 = mVar2.r(rVarB) | mVar2.r(m0Var);
                Object objQ5 = mVar2.q();
                if (zR4) {
                    objQ5 = new c42.c0(6, rVarB, m0Var);
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new c42.c0(6, rVarB, m0Var);
                        mVar2.K(objQ5);
                    }
                }
                na0.h.b(qVar, null, lVar, aVar3, aVar4, (e23.p) objQ5, mVar2, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
