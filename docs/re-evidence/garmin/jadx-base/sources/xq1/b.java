package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import f21.v;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:39:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jq1.d dVar, o82.g gVar, p3.m mVar, int i14) {
        Integer numValueOf;
        String strF;
        String strF2;
        String strF3;
        jq1.a.d dVar2;
        Double d14;
        jq1.a.d dVar3;
        Double d15;
        Iterator<T> it;
        int i15;
        Integer numValueOf2;
        jq1.e.d dVar4;
        int iIntValue;
        Integer num;
        Iterator<T> it3;
        int i16;
        jq1.e.d dVar5;
        int iIntValue2;
        Integer num2;
        gVar.getClass();
        o0 o0VarE = mVar.E(-498794276);
        int i17 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.k(gVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(new pq1.d(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (dVar == null) {
                numValueOf = null;
            } else {
                List<jq1.e> list = dVar.f99993a;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        jq1.e.d dVar6 = ((jq1.e) obj).f99996b;
                        if ((dVar6 != null ? dVar6.f99999b : null) != null) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        numValueOf = null;
                    } else if (list != null) {
                        it3 = list.iterator();
                        i16 = 0;
                        while (it3.hasNext()) {
                            dVar5 = ((jq1.e) it3.next()).f99996b;
                            if (dVar5 != null || (num2 = dVar5.f99999b) == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = num2.intValue();
                            }
                            i16 += iIntValue2;
                        }
                        numValueOf = Integer.valueOf(i16);
                    } else {
                        numValueOf = null;
                    }
                } else if (list != null) {
                    it3 = list.iterator();
                    i16 = 0;
                    while (it3.hasNext()) {
                        dVar5 = ((jq1.e) it3.next()).f99996b;
                        if (dVar5 != null) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = 0;
                        }
                        i16 += iIntValue2;
                    }
                    numValueOf = Integer.valueOf(i16);
                } else {
                    numValueOf = null;
                }
            }
            if (dVar == null) {
                strF = ((pq1.d) p1Var.getF182175a()).f();
            } else {
                List<jq1.e> list2 = dVar.f99993a;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        jq1.e.d dVar7 = ((jq1.e) obj2).f99996b;
                        if ((dVar7 != null ? dVar7.f99998a : null) != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        numValueOf2 = null;
                    } else if (list2 != null) {
                        it = list2.iterator();
                        i15 = 0;
                        while (it.hasNext()) {
                            dVar4 = ((jq1.e) it.next()).f99996b;
                            if (dVar4 != null || (num = dVar4.f99998a) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = num.intValue();
                            }
                            i15 += iIntValue;
                        }
                        numValueOf2 = Integer.valueOf(i15);
                    } else {
                        numValueOf2 = null;
                    }
                } else if (list2 != null) {
                    it = list2.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        dVar4 = ((jq1.e) it.next()).f99996b;
                        if (dVar4 != null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = 0;
                        }
                        i15 += iIntValue;
                    }
                    numValueOf2 = Integer.valueOf(i15);
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue3 = numValueOf2.intValue();
                    ((pq1.d) p1Var.getF182175a()).getClass();
                    strF = pq1.d.b(iIntValue3);
                } else {
                    strF = ((pq1.d) p1Var.getF182175a()).f();
                }
            }
            String strA = ((pq1.d) p1Var.getF182175a()).a(numValueOf, ((pq1.d) p1Var.getF182175a()).f());
            String strD = ((pq1.d) p1Var.getF182175a()).d(numValueOf);
            if (dVar == null || (dVar3 = dVar.f99994b) == null || (d15 = dVar3.f99976a) == null) {
                strF2 = ((pq1.d) p1Var.getF182175a()).f();
            } else {
                double dDoubleValue = d15.doubleValue();
                ((pq1.d) p1Var.getF182175a()).getClass();
                strF2 = pq1.d.b((int) dDoubleValue);
            }
            if (gVar != o82.g.f130853f || dVar == null || (dVar2 = dVar.f99994b) == null || (d14 = dVar2.f99977b) == null) {
                strF3 = ((pq1.d) p1Var.getF182175a()).f();
            } else {
                double dDoubleValue2 = d14.doubleValue();
                ((pq1.d) p1Var.getF182175a()).getClass();
                strF3 = pq1.d.b((int) dDoubleValue2);
            }
            b92.a aVarC = ((pq1.d) p1Var.getF182175a()).c(strF2);
            b92.a aVarI = ((pq1.d) p1Var.getF182175a()).i(strF3);
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            z3.e eVarC = z3.f.c(-827316691, new v(strF, strA, strD, 4), o0VarE);
            int i18 = (x0.f111348c << 6) | 48;
            x0Var.e(null, eVarC, o0VarE, i18, 1);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z3.f.c(1481085910, new g52.a(strF2, aVarC, gVar, strF3, aVarI, 1), o0VarE), o0VarE, i18, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(dVar, gVar, i14, 21);
        }
    }
}
