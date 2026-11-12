package ca0;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c1 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26141a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f26142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1 f26144d;

    public /* synthetic */ c1(e23.a aVar, lc.m0 m0Var, u1 u1Var) {
        this.f26142b = aVar;
        this.f26143c = m0Var;
        this.f26144d = u1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007e  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0117  */
    /* JADX WARN: Code duplicated, block: B:8:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f26141a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f26142b;
        r1.l lVar = (r1.l) obj;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, lVar, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                lc.m0 m0Var = this.f26143c;
                qa0.f fVarA = e1.a(vVar, aVar2, m0Var, mVar);
                p3.p1 p1VarC = s9.c.c(fVarA.f143857f, mVar);
                Boolean boolValueOf = Boolean.valueOf(((qa0.c) p1VarC.getF182175a()).f143841a);
                boolean zB = mVar.B(p1VarC) | mVar.r(fVarA) | mVar.r(m0Var);
                u1 u1Var = this.f26144d;
                boolean zB2 = zB | mVar.B(u1Var);
                Object objQ = mVar.q();
                if (zB2) {
                    d1 d1Var = new d1(fVarA, m0Var, u1Var, p1VarC, null);
                    mVar.K(d1Var);
                    objQ = d1Var;
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        d1 d1Var2 = new d1(fVarA, m0Var, u1Var, p1VarC, null);
                        mVar.K(d1Var2);
                        objQ = d1Var2;
                    }
                }
                p3.l0.e((e23.p) objQ, boolValueOf, mVar);
                da0.p.d(null, true, null, null, null, null, null, mVar, 48, 253);
                break;
            default:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                lVar.getClass();
                vVar2.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                lc.m0 m0Var2 = this.f26143c;
                qa0.f fVarA2 = e1.a(vVar2, aVar2, m0Var2, mVar2);
                p3.p1 p1VarC2 = s9.c.c(fVarA2.f143857f, mVar2);
                String str = ((q90.c) aVar2.invoke()).f143495c.f111521f;
                List<sg1.c> list = ((qa0.c) p1VarC2.getF182175a()).f143843c;
                boolean z14 = ((qa0.c) p1VarC2.getF182175a()).f143844d;
                boolean z15 = ((qa0.c) p1VarC2.getF182175a()).f143845e;
                boolean zR = mVar2.r(m0Var2);
                Object objQ2 = mVar2.q();
                if (zR) {
                    objQ2 = new u0(m0Var2, 6);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new u0(m0Var2, 6);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean zR2 = mVar2.r(fVarA2);
                Object objQ3 = mVar2.q();
                int i15 = 8;
                if (zR2) {
                    objQ3 = new c62.m1(fVarA2, i15);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c62.m1(fVarA2, i15);
                        mVar2.K(objQ3);
                    }
                }
                e23.p pVar = (e23.p) objQ3;
                u1 u1Var2 = this.f26144d;
                boolean zB3 = mVar2.B(u1Var2);
                Object objQ4 = mVar2.q();
                if (zB3) {
                    objQ4 = new c32.k(u1Var2, 8);
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new c32.k(u1Var2, 8);
                        mVar2.K(objQ4);
                    }
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR3 = mVar2.r(fVarA2);
                Object objQ5 = mVar2.q();
                if (zR3) {
                    objQ5 = new c32.k(fVarA2, 9);
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new c32.k(fVarA2, 9);
                        mVar2.K(objQ5);
                    }
                }
                qa0.h.a(str, list, z14, z15, aVar3, pVar, aVar4, (e23.a) objQ5, mVar2, 0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c1(lc.m0 m0Var, u1 u1Var, e23.a aVar) {
        this.f26143c = m0Var;
        this.f26144d = u1Var;
        this.f26142b = aVar;
    }
}
