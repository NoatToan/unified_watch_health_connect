package zr;

import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import l72.p2;
import l72.v2;
import p005kotlin.Unit;
import p13.x;
import p3.n;
import p3.o0;
import p3.x1;
import zo1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    public static final void a(ArrayList arrayList, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(-491298805);
        int i16 = 2;
        int i17 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        boolean z15 = false;
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            int i18 = 0;
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i19 = i18 + 1;
                e23.a<Unit> aVar = null;
                if (i18 < 0) {
                    x.q();
                    throw null;
                }
                nr.f fVar = (nr.f) next;
                r rVarA = v2.a(r.S, i18 == 0 ? true : z15, new yp0.b(25), o0VarE, 6);
                z3.e eVarC = z3.f.c(465655617, new g(fVar, i16), o0VarE);
                String str = fVar.f127036b;
                e23.a<Unit> aVar2 = fVar.f127038d;
                p3.m.a aVar3 = p3.m.f135153a;
                if (str == null) {
                    o0VarE.C(165845222);
                    int i24 = i16;
                    p2 p2Var = p2.f111205a;
                    String str2 = fVar.f127035a;
                    if (aVar2 == null) {
                        o0VarE.C(166006204);
                    } else {
                        o0VarE.C(166006205);
                        boolean zB = o0VarE.B(aVar2);
                        Object objQ = o0VarE.q();
                        if (zB) {
                            objQ = new y0(aVar2, 6);
                            o0VarE.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new y0(aVar2, 6);
                                o0VarE.K(objQ);
                            }
                        }
                        aVar = (e23.a) objQ;
                    }
                    o0VarE.g0(z15);
                    boolean z16 = z15;
                    o0 o0Var = o0VarE;
                    i15 = i24;
                    p2Var.g(str2, rVarA, null, eVarC, null, false, false, aVar, o0Var, 3072, 244);
                    o0Var.g0(z16);
                    z14 = z16;
                    o0VarE = o0Var;
                } else {
                    i15 = i16;
                    o0 o0Var2 = o0VarE;
                    boolean z17 = z15;
                    o0Var2.C(166088696);
                    p2 p2Var2 = p2.f111205a;
                    String str3 = fVar.f127035a;
                    String str4 = fVar.f127036b;
                    if (aVar2 == null) {
                        o0Var2.C(166293884);
                    } else {
                        o0Var2.C(166293885);
                        boolean zB2 = o0Var2.B(aVar2);
                        Object objQ2 = o0Var2.q();
                        if (zB2) {
                            objQ2 = new y0(aVar2, 7);
                            o0Var2.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new y0(aVar2, 7);
                                o0Var2.K(objQ2);
                            }
                        }
                        aVar = (e23.a) objQ2;
                    }
                    o0Var2.g0(z17);
                    o0VarE = o0Var2;
                    z14 = z17;
                    p2Var2.h(str3, str4, null, rVarA, null, false, false, eVarC, null, null, aVar, o0VarE, 12582912, 0, 884);
                    o0VarE.g0(z14);
                }
                z15 = z14;
                i18 = i19;
                i16 = i15;
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bp0.b(arrayList, i14, 11);
        }
    }
}
