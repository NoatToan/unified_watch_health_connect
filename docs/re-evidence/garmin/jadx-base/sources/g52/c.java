package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0103  */
    public static final void a(z42.d dVar, o82.g gVar, p3.m mVar, int i14) {
        Integer numValueOf;
        Integer numValueOf2;
        z42.a.b bVar;
        Double totalPushesWeeklyAverage;
        z42.a.b bVar2;
        Double totalPushesAverage;
        Iterator<T> it;
        int i15;
        z42.e.b values;
        int iIntValue;
        Integer totalDistance;
        Iterator<T> it3;
        int i16;
        z42.e.b values2;
        int iIntValue2;
        Integer totalPushes;
        gVar.getClass();
        o0 o0VarE = mVar.E(-1077434636);
        int i17 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.k(gVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (dVar == null) {
                numValueOf = null;
            } else {
                List<z42.e> list = dVar.f202384a;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        z42.e.b values3 = ((z42.e) obj).getValues();
                        if ((values3 != null ? values3.getTotalPushes() : null) != null) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        numValueOf = null;
                    } else if (list != null) {
                        it3 = list.iterator();
                        i16 = 0;
                        while (it3.hasNext()) {
                            values2 = ((z42.e) it3.next()).getValues();
                            if (values2 != null || (totalPushes = values2.getTotalPushes()) == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = totalPushes.intValue();
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
                        values2 = ((z42.e) it3.next()).getValues();
                        if (values2 != null) {
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
                numValueOf2 = null;
            } else {
                List<z42.e> list2 = dVar.f202384a;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        z42.e.b values4 = ((z42.e) obj2).getValues();
                        if ((values4 != null ? values4.getTotalDistance() : null) != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        numValueOf2 = null;
                    } else if (list2 != null) {
                        it = list2.iterator();
                        i15 = 0;
                        while (it.hasNext()) {
                            values = ((z42.e) it.next()).getValues();
                            if (values != null || (totalDistance = values.getTotalDistance()) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = totalDistance.intValue();
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
                        values = ((z42.e) it.next()).getValues();
                        if (values != null) {
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
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d52.e(context);
                o0VarE.K(objQ);
            }
            d52.e eVar = (d52.e) objQ;
            String strC = eVar.c((dVar == null || (bVar2 = dVar.f202385b) == null || (totalPushesAverage = bVar2.getTotalPushesAverage()) == null) ? null : Integer.valueOf((int) totalPushesAverage.doubleValue()));
            String strC2 = eVar.c((dVar == null || (bVar = dVar.f202385b) == null || (totalPushesWeeklyAverage = bVar.getTotalPushesWeeklyAverage()) == null) ? null : Integer.valueOf((int) totalPushesWeeklyAverage.doubleValue()));
            b92.a aVarD = eVar.d(strC);
            b92.a aVarI = eVar.i(strC2);
            h4.r.a aVar = h4.r.S;
            Integer num = numValueOf;
            h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            z3.e eVarC = z3.f.c(-555422907, new a42.a(eVar, 27, num, numValueOf2), o0VarE);
            int i18 = (x0.f111348c << 6) | 48;
            x0Var.e(null, eVarC, o0VarE, i18, 1);
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), z3.f.c(-437477394, new a(strC, aVarD, gVar, strC2, aVarI, 0), o0VarE), o0VarE, i18, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(dVar, gVar, i14);
        }
    }
}
