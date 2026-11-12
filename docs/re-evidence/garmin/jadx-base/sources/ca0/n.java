package ca0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f26350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f26351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f26352e;

    public /* synthetic */ n(e23.a aVar, lc.m0 m0Var, e23.a aVar2, s1 s1Var) {
        this.f26348a = 3;
        this.f26350c = aVar;
        this.f26349b = m0Var;
        this.f26351d = aVar2;
        this.f26352e = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x036c  */
    /* JADX WARN: Code duplicated, block: B:112:0x038e  */
    /* JADX WARN: Code duplicated, block: B:131:0x042a  */
    /* JADX WARN: Code duplicated, block: B:136:0x044b  */
    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e  */
    /* JADX WARN: Code duplicated, block: B:42:0x017c  */
    /* JADX WARN: Code duplicated, block: B:47:0x019f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0205  */
    /* JADX WARN: Code duplicated, block: B:59:0x0223  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:69:0x025f  */
    /* JADX WARN: Code duplicated, block: B:74:0x027d  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0053  */
    /* JADX WARN: Code duplicated, block: B:93:0x0308  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Integer num;
        j90.o oVarA;
        j90.o oVarA2;
        int i14 = this.f26348a;
        int i15 = 7;
        e23.a aVar = this.f26351d;
        p3.m.a aVar2 = p3.m.f135153a;
        s1 s1Var = this.f26352e;
        lc.m0 m0Var = this.f26349b;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                ga0.a aVarC = h0.c(vVar, aVar, s1Var, m0Var, mVar);
                i0.p pVar = (i0.p) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(i0.p.class));
                List<Integer> list = pVar.f26277b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    zb0.s0.a aVar3 = zb0.s0.f203651c;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    aVar3.getClass();
                    zb0.s0 s0VarA = zb0.s0.a.a(numValueOf, null);
                    if (s0VarA != null) {
                        arrayList.add(s0VarA);
                    }
                }
                String str = pVar.f26276a;
                z80.f fVar = (z80.f) s9.c.c(aVarC.f76605n, mVar).getF182175a();
                int iIntValue2 = (fVar == null || (num = fVar.f203044b) == null) ? 0 : num.intValue();
                boolean zR = mVar.r(aVarC);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new o(aVarC, 0);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new o(aVarC, 0);
                        mVar.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zR2 = mVar.r(m0Var) | mVar.r(aVarC);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new p(m0Var, aVarC, 0);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new p(m0Var, aVarC, 0);
                        mVar.K(objQ2);
                    }
                }
                ra0.c.b(iIntValue2, arrayList, str, lVar, (e23.a) objQ2, this.f26350c, mVar, 0);
                p3.x1 x1Var2 = p3.n.f135158a;
                break;
            case 1:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar2.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                ga0.a aVarC2 = h0.c(vVar2, aVar, s1Var, m0Var, mVar2);
                z80.f fVar2 = (z80.f) s9.c.c(aVarC2.f76605n, mVar2).getF182175a();
                if (fVar2 == null || (oVarA = j90.p.a(fVar2)) == null) {
                    j90.o.f97845c.getClass();
                    oVarA = j90.o.LEFT;
                }
                j90.o oVar = oVarA;
                boolean zR3 = mVar2.r(aVarC2);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new o(aVarC2, 3);
                    mVar2.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new o(aVarC2, 3);
                        mVar2.K(objQ3);
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                boolean zR4 = mVar2.r(m0Var) | mVar2.r(aVarC2);
                Object objQ4 = mVar2.q();
                if (zR4) {
                    objQ4 = new p(m0Var, aVarC2, 4);
                    mVar2.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new p(m0Var, aVarC2, 4);
                        mVar2.K(objQ4);
                    }
                }
                oa0.j.b(oVar, lVar2, (e23.a) objQ4, this.f26350c, mVar2, 0);
                break;
            case 2:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                p3.x1 x1Var4 = p3.n.f135158a;
                ga0.a aVarC3 = h0.c(vVar3, aVar, s1Var, m0Var, mVar3);
                z80.f fVar3 = (z80.f) s9.c.c(aVarC3.f76605n, mVar3).getF182175a();
                if (fVar3 == null || (oVarA2 = j90.p.a(fVar3)) == null) {
                    j90.o.f97845c.getClass();
                    oVarA2 = j90.o.LEFT_WRIST;
                }
                j90.o oVar2 = oVarA2;
                boolean zR5 = mVar3.r(aVarC3);
                Object objQ5 = mVar3.q();
                if (zR5) {
                    objQ5 = new o(aVarC3, 4);
                    mVar3.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new o(aVarC3, 4);
                        mVar3.K(objQ5);
                    }
                }
                e23.l lVar3 = (e23.l) objQ5;
                boolean zR6 = mVar3.r(m0Var) | mVar3.r(aVarC3);
                Object objQ6 = mVar3.q();
                if (zR6) {
                    objQ6 = new p(m0Var, aVarC3, 5);
                    mVar3.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new p(m0Var, aVarC3, 5);
                        mVar3.K(objQ6);
                    }
                }
                oa0.i.b(oVar2, lVar3, (e23.a) objQ6, this.f26350c, mVar3, 0);
                break;
            case 3:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                p3.x1 x1Var5 = p3.n.f135158a;
                e23.a aVar4 = this.f26350c;
                ga0.a aVarC4 = h0.c(vVar4, aVar4, s1Var, m0Var, mVar4);
                pa0.i iVarD = h0.d(vVar4, aVar4, m0Var, mVar4);
                String str2 = ((q90.c) aVar4.invoke()).f143495c.f111521f;
                pa0.h hVar = (pa0.h) s9.c.c(iVarD.f136740e, mVar4).getF182175a();
                boolean zR7 = mVar4.r(m0Var) | mVar4.r(aVarC4);
                Object objQ7 = mVar4.q();
                if (zR7) {
                    objQ7 = new p(m0Var, aVarC4, 8);
                    mVar4.K(objQ7);
                } else {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new p(m0Var, aVarC4, 8);
                        mVar4.K(objQ7);
                    }
                }
                e23.a aVar5 = (e23.a) objQ7;
                boolean zR8 = mVar4.r(m0Var);
                Object objQ8 = mVar4.q();
                if (zR8) {
                    objQ8 = new aa2.m(m0Var, 20);
                    mVar4.K(objQ8);
                } else {
                    aVar2.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new aa2.m(m0Var, 20);
                        mVar4.K(objQ8);
                    }
                }
                e23.a aVar6 = (e23.a) objQ8;
                boolean zR9 = mVar4.r(iVarD);
                Object objQ9 = mVar4.q();
                if (zR9) {
                    objQ9 = new w(iVarD);
                    mVar4.K(objQ9);
                } else {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new w(iVarD);
                        mVar4.K(objQ9);
                    }
                }
                e23.l lVar4 = (e23.l) ((k23.g) objQ9);
                boolean zR10 = mVar4.r(iVarD);
                Object objQ10 = mVar4.q();
                if (zR10) {
                    objQ10 = new x(iVarD);
                    mVar4.K(objQ10);
                } else {
                    aVar2.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new x(iVarD);
                        mVar4.K(objQ10);
                    }
                }
                e23.a aVar7 = (e23.a) ((k23.g) objQ10);
                boolean zR11 = mVar4.r(iVarD);
                Object objQ11 = mVar4.q();
                if (zR11) {
                    objQ11 = new y(iVarD);
                    mVar4.K(objQ11);
                } else {
                    aVar2.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new y(iVarD);
                        mVar4.K(objQ11);
                    }
                }
                pa0.g.b(hVar, str2, aVar5, aVar6, lVar4, aVar7, (e23.a) ((k23.g) objQ11), this.f26351d, mVar4, 0);
                break;
            case 4:
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar5.getClass();
                p3.x1 x1Var6 = p3.n.f135158a;
                ga0.a aVarC5 = h0.c(vVar5, aVar, s1Var, m0Var, mVar5);
                pa0.i iVarD2 = h0.d(vVar5, aVar, m0Var, mVar5);
                List<j90.g> list2 = ((pa0.h) s9.c.c(iVarD2.f136740e, mVar5).getF182175a()).f136732a;
                boolean zR12 = mVar5.r(iVarD2);
                Object objQ12 = mVar5.q();
                if (zR12) {
                    objQ12 = new z(iVarD2);
                    mVar5.K(objQ12);
                } else {
                    aVar2.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new z(iVarD2);
                        mVar5.K(objQ12);
                    }
                }
                e23.l lVar5 = (e23.l) ((k23.g) objQ12);
                boolean zR13 = mVar5.r(m0Var);
                Object objQ13 = mVar5.q();
                if (zR13) {
                    objQ13 = new aa2.m(m0Var, 18);
                    mVar5.K(objQ13);
                } else {
                    aVar2.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new aa2.m(m0Var, 18);
                        mVar5.K(objQ13);
                    }
                }
                e23.a aVar8 = (e23.a) objQ13;
                boolean zR14 = mVar5.r(m0Var) | mVar5.r(aVarC5);
                Object objQ14 = mVar5.q();
                if (zR14) {
                    objQ14 = new p(m0Var, aVarC5, 7);
                    mVar5.K(objQ14);
                } else {
                    aVar2.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new p(m0Var, aVarC5, 7);
                        mVar5.K(objQ14);
                    }
                }
                pa0.e.b(list2, lVar5, aVar8, (e23.a) objQ14, this.f26350c, mVar5, 0);
                break;
            case 5:
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar6);
                p3.x1 x1Var7 = p3.n.f135158a;
                ga0.a aVarC6 = h0.c(vVar6, aVar, s1Var, m0Var, mVar6);
                h90.a aVar9 = ((i0.a) lc.w.a(vVar6, p005kotlin.jvm.internal.s0.f105811a.b(i0.a.class))).f26250a;
                long j8 = aVarC6.f76592a.f143493a;
                boolean zR15 = mVar6.r(m0Var) | mVar6.r(aVarC6);
                Object objQ15 = mVar6.q();
                if (zR15) {
                    objQ15 = new p(m0Var, aVarC6, 1);
                    mVar6.K(objQ15);
                } else {
                    aVar2.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new p(m0Var, aVarC6, 1);
                        mVar6.K(objQ15);
                    }
                }
                ia0.a.b(j8, aVar9, (e23.a) objQ15, this.f26350c, mVar6, 0);
                break;
            default:
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar7.getClass();
                p3.x1 x1Var8 = p3.n.f135158a;
                ga0.a aVarC7 = h0.c(vVar7, aVar, s1Var, m0Var, mVar7);
                na0.r rVarB = h0.b(vVar7, aVar, m0Var, mVar7);
                na0.q qVar = (na0.q) s9.c.c(rVarB.f125179d, mVar7).getF182175a();
                boolean zR16 = mVar7.r(rVarB);
                Object objQ16 = mVar7.q();
                if (zR16) {
                    objQ16 = new c62.m1(rVarB, i15);
                    mVar7.K(objQ16);
                } else {
                    aVar2.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new c62.m1(rVarB, i15);
                        mVar7.K(objQ16);
                    }
                }
                e23.p pVar2 = (e23.p) objQ16;
                boolean zR17 = mVar7.r(rVarB);
                Object objQ17 = mVar7.q();
                if (zR17) {
                    objQ17 = new u(rVarB, 0);
                    mVar7.K(objQ17);
                } else {
                    aVar2.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new u(rVarB, 0);
                        mVar7.K(objQ17);
                    }
                }
                e23.a aVar10 = (e23.a) objQ17;
                boolean zR18 = mVar7.r(m0Var) | mVar7.r(aVarC7);
                Object objQ18 = mVar7.q();
                if (zR18) {
                    objQ18 = new p(m0Var, aVarC7, 6);
                    mVar7.K(objQ18);
                } else {
                    aVar2.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new p(m0Var, aVarC7, 6);
                        mVar7.K(objQ18);
                    }
                }
                e23.a aVar11 = (e23.a) objQ18;
                boolean zR19 = mVar7.r(m0Var);
                Object objQ19 = mVar7.q();
                if (zR19) {
                    objQ19 = new aa2.m(m0Var, 17);
                    mVar7.K(objQ19);
                } else {
                    aVar2.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new aa2.m(m0Var, 17);
                        mVar7.K(objQ19);
                    }
                }
                na0.m.b(qVar, pVar2, aVar10, aVar11, (e23.a) objQ19, this.f26350c, mVar7, 0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(lc.m0 m0Var, e23.a aVar, e23.a aVar2, s1 s1Var, int i14) {
        this.f26348a = i14;
        this.f26349b = m0Var;
        this.f26350c = aVar;
        this.f26351d = aVar2;
        this.f26352e = s1Var;
    }
}
