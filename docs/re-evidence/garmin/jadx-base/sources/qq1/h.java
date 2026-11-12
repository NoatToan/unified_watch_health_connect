package qq1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.q;
import c2.t0;
import c2.u;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import f72.rb;
import h4.r;
import h5.e0;
import i3.s5;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import l72.y0;
import m92.h0;
import nq1.k;
import ns.p;
import o4.d0;
import o62.s0;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u62.o5;
import w02.b0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:109:0x0286  */
    /* JADX WARN: Code duplicated, block: B:136:0x032b  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:173:0x0437  */
    /* JADX WARN: Code duplicated, block: B:175:0x043e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0454  */
    /* JADX WARN: Code duplicated, block: B:183:0x045e  */
    /* JADX WARN: Code duplicated, block: B:186:0x047b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0482  */
    /* JADX WARN: Code duplicated, block: B:191:0x048e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0491  */
    /* JADX WARN: Code duplicated, block: B:194:0x0494  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:200:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:202:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    public static final void a(a0 a0Var, k kVar, m mVar, int i14) {
        int i15;
        float f14;
        List arrayList;
        float fDoubleValue;
        float fDoubleValue2;
        float fMax;
        Double d14;
        Double d15;
        float f15;
        float f16;
        float f17;
        float f18;
        l lVar;
        List list;
        long j8;
        List list2;
        List list3;
        h0.e.a aVar;
        List list4;
        h0.e.C2226e c2226e;
        boolean zR;
        Object objQ;
        List list5;
        Collection collection;
        List list6;
        boolean zR2;
        Object objQ2;
        i53.c<ae0.h> cVar;
        Object objA;
        boolean zR3;
        Object objQ3;
        Object next;
        List list7;
        i53.c<Integer> cVar2;
        i53.c<Integer> cVar3;
        i53.c<Integer> cVar4;
        int iNextIndex;
        Double d16;
        o0 o0VarE = mVar.E(813771596);
        int i16 = (o0VarE.B(kVar) ? 32 : 16) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarA = a0Var.a(x2.f(r.S, 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).j().e();
            long jC = sn.a.c(o0VarE);
            long jD = am.j.d(o0VarE);
            d92.b.f58625c.getClass();
            float fG = b0.g(j92.b.f97899b.f97917b, o0VarE);
            float f19 = fG / 2;
            gl.c.f77766a.getClass();
            long jD2 = gl.c.a(o0VarE).d();
            long jT = v.h.t(o0VarE);
            long j14 = d92.b.a(o0VarE).f().f63508c;
            float f22 = 14;
            g6.f.a aVar3 = g6.f.f75994b;
            Float fValueOf = (kVar == null || (d16 = kVar.f126952c) == null) ? null : Float.valueOf((float) d16.doubleValue());
            if (kVar == null || (cVar4 = kVar.f126956g) == null) {
                f14 = 0.0f;
                arrayList = j0.f134944a;
            } else {
                ListIterator<Integer> listIterator = cVar4.listIterator(cVar4.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous() != null) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                for (Integer num : cVar4) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        x.q();
                        throw null;
                    }
                    Integer num2 = num;
                    h0.e.a aVar4 = i17 <= iNextIndex ? new h0.e.a(i17, num2 != null ? num2.intValue() : 0.0f) : null;
                    if (aVar4 != null) {
                        arrayList2.add(aVar4);
                    }
                    i17 = i18;
                    iNextIndex = iNextIndex;
                }
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                f14 = 0.0f;
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    h0.e.a aVar5 = (h0.e.a) it.next();
                    f14 += aVar5.f117347b;
                    arrayList3.add(new h0.e.a(aVar5.f117346a, f14));
                }
                arrayList = new ArrayList(arrayList3);
            }
            if (kVar == null || (cVar3 = kVar.f126957h) == null) {
                if (kVar != null || (d15 = kVar.f126952c) == null) {
                    fDoubleValue = 0.0f;
                } else {
                    fDoubleValue = (float) d15.doubleValue();
                }
                if (kVar != null || (d14 = kVar.f126951b) == null) {
                    fDoubleValue2 = 0.0f;
                } else {
                    fDoubleValue2 = (float) d14.doubleValue();
                }
                fMax = Float.max(fDoubleValue, fDoubleValue2);
            } else {
                if (!cVar3.isEmpty()) {
                    Iterator<Integer> it3 = cVar3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (it3.next() != null) {
                                if (kVar != null) {
                                    fDoubleValue = 0.0f;
                                } else {
                                    fDoubleValue = 0.0f;
                                }
                                if (kVar != null) {
                                    fDoubleValue2 = 0.0f;
                                } else {
                                    fDoubleValue2 = 0.0f;
                                }
                                fMax = Float.max(fDoubleValue, fDoubleValue2);
                            }
                        }
                    }
                }
                Double d17 = kVar.f126952c;
                fMax = Float.max(d17 != null ? (float) d17.doubleValue() : 0.0f, f14);
            }
            boolean zL = o0VarE.l(jC) | o0VarE.i(fMax);
            Object objQ4 = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (zL) {
                objQ4 = new s5(jC, fMax, 4);
                o0VarE.K(objQ4);
            } else {
                aVar6.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new s5(jC, fMax, 4);
                    o0VarE.K(objQ4);
                }
            }
            l lVar2 = (l) objQ4;
            boolean zB = o0VarE.B(fValueOf) | o0VarE.l(jE) | o0VarE.i(fMax) | o0VarE.i(fG) | o0VarE.i(f19);
            Object objQ5 = o0VarE.q();
            if (zB) {
                float f24 = fMax;
                objQ5 = new f71.c(fValueOf, jE, f24, fG, f19, 1);
                f15 = f24;
                f16 = fG;
                f17 = f19;
                o0VarE.K(objQ5);
            } else {
                aVar6.getClass();
                if (objQ5 == m.a.f135155b) {
                    float f25 = fMax;
                    objQ5 = new f71.c(fValueOf, jE, f25, fG, f19, 1);
                    f15 = f25;
                    f16 = fG;
                    f17 = f19;
                    o0VarE.K(objQ5);
                } else {
                    f15 = fMax;
                    f16 = fG;
                    f17 = f19;
                }
            }
            l lVar3 = (l) objQ5;
            boolean zL2 = o0VarE.l(jD) | o0VarE.r(arrayList) | o0VarE.i(1441.0f) | o0VarE.i(f15);
            Object objQ6 = o0VarE.q();
            if (zL2) {
                objQ6 = new g(jD, arrayList, f15);
                o0VarE.K(objQ6);
            } else {
                aVar6.getClass();
                if (objQ6 == m.a.f135155b) {
                    objQ6 = new g(jD, arrayList, f15);
                    o0VarE.K(objQ6);
                }
            }
            l lVar4 = (l) objQ6;
            d92.b.f58623a.getClass();
            long jD3 = d92.b.a(o0VarE).f().d();
            if (kVar == null || (cVar2 = kVar.f126957h) == null) {
                f18 = f14;
                lVar = lVar3;
                list = j0.f134944a;
            } else {
                ArrayList arrayList4 = new ArrayList();
                int i19 = 0;
                for (Integer num3 : cVar2) {
                    int i24 = i19 + 1;
                    if (i19 < 0) {
                        x.q();
                        throw null;
                    }
                    Integer num4 = num3;
                    float f26 = f14;
                    h0.e.a aVar7 = num4 != null ? new h0.e.a(i19, num4.intValue()) : null;
                    if (aVar7 != null) {
                        arrayList4.add(aVar7);
                    }
                    i19 = i24;
                    f14 = f26;
                    lVar3 = lVar3;
                }
                f18 = f14;
                lVar = lVar3;
                list = arrayList4;
            }
            boolean zL3 = o0VarE.l(jD3) | o0VarE.i(f16) | o0VarE.i(f17) | o0VarE.r(list) | o0VarE.i(1441.0f) | o0VarE.i(f15);
            Object objQ7 = o0VarE.q();
            if (zL3) {
                List list8 = list;
                objQ7 = new f21.j0(jD3, f16, f17, list8, f15);
                j8 = jD3;
                list2 = list8;
                o0VarE.K(objQ7);
            } else {
                aVar6.getClass();
                if (objQ7 == m.a.f135155b) {
                    List list9 = list;
                    objQ7 = new f21.j0(jD3, f16, f17, list9, f15);
                    j8 = jD3;
                    list2 = list9;
                    o0VarE.K(objQ7);
                } else {
                    list2 = list;
                    j8 = jD3;
                }
            }
            l lVar5 = (l) objQ7;
            if (fValueOf == null || f18 < fValueOf.floatValue()) {
                list3 = list2;
            } else {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!s.b(((h0.e.a) next).f117347b, fValueOf));
                aVar = (h0.e.a) next;
                if (aVar != null) {
                    Unit unit = Unit.INSTANCE;
                    list4 = list2;
                } else {
                    ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                    h0.e.a aVar8 = null;
                    h0.e.a aVar9 = null;
                    List list10 = list2;
                    while (listIterator2.hasPrevious() && (aVar8 == null || aVar9 == null)) {
                        h0.e.a aVar10 = (h0.e.a) listIterator2.previous();
                        List list11 = list10;
                        if (aVar10.f117347b < fValueOf.floatValue()) {
                            aVar8 = aVar10;
                        } else {
                            aVar9 = aVar10;
                        }
                        list10 = list11;
                    }
                    list7 = list10;
                    list3 = list7;
                    list3 = list7;
                    if (aVar8 != null && aVar9 != null) {
                        float f27 = aVar8.f117346a;
                        float f28 = aVar9.f117346a;
                        float f29 = aVar8.f117347b;
                        float f34 = aVar9.f117347b;
                        aVar = new h0.e.a((((fValueOf.floatValue() - f29) * f28) + ((f34 - fValueOf.floatValue()) * f27)) / (f34 - f29), fValueOf.floatValue());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                if (aVar == null) {
                    list4 = list7;
                    o0VarE.C(1421928050);
                    o0VarE.g0(false);
                    c2226e = null;
                } else {
                    list4 = list7;
                    o0VarE.C(1421928051);
                    o92.e eVar = o92.e.CIRCLE;
                    float f35 = yz1.s.f200414a;
                    h0.e.C2226e c2226e2 = new h0.e.C2226e(aVar, new o92.b(eVar, jD2, new o92.a(jT, 5.0f, null), null), n5.c.a(R.drawable.ic_chackmark, o0VarE, 0), j14, f22, null);
                    o0VarE.g0(false);
                    c2226e = c2226e2;
                }
                zR = o0VarE.r(c2226e) | o0VarE.i(1441.0f) | o0VarE.i(f15);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new l02.l(c2226e, f15, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar6.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new l02.l(c2226e, f15, 2);
                        o0VarE.K(objQ);
                    }
                }
                l lVar6 = (l) objQ;
                list5 = list4;
                collection = arrayList;
                if (!list5.isEmpty()) {
                    collection = list5;
                }
                list6 = (List) collection;
                if (!list4.isEmpty()) {
                    jD = j8;
                }
                zR2 = o0VarE.r(list6) | o0VarE.l(jD) | o0VarE.i(1441.0f) | o0VarE.i(f15);
                objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new g(list6, jD, f15);
                    o0VarE.K(objQ2);
                } else {
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new g(list6, jD, f15);
                        o0VarE.K(objQ2);
                    }
                }
                l lVar7 = (l) objQ2;
                if (kVar != null) {
                    cVar = kVar.f126958i;
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    o0VarE.C(1424122447);
                    o0VarE.g0(false);
                    objA = null;
                } else {
                    o0VarE.C(323034098);
                    objA = ae0.g.a(cVar, o0VarE);
                    o0VarE.g0(false);
                }
                if (objA == null) {
                    objA = j0.f134944a;
                }
                zR3 = o0VarE.r(objA) | o0VarE.i(f15);
                objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new l02.l(objA, f15, 3);
                    o0VarE.K(objQ3);
                } else {
                    aVar6.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new l02.l(objA, f15, 3);
                        o0VarE.K(objQ3);
                    }
                }
                i53.f fVarA = i53.a.a(lVar2, lVar, lVar4, lVar5, lVar7, (l) objQ3, lVar6);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                i15 = 0;
                m92.r.b(c2.l.C(x2.d(r.S, 1.0f), 0.0f, 12, 0.0f, j92.b.f97899b.f97917b, 5), fVarA, null, null, false, gl1.y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, null, null, null, o0VarE, 0, 0, 2012);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            aVar = null;
            list4 = list3;
            if (aVar == null) {
                list4 = list7;
                o0VarE.C(1421928050);
                o0VarE.g0(false);
                c2226e = null;
            } else {
                list4 = list7;
                o0VarE.C(1421928051);
                o92.e eVar2 = o92.e.CIRCLE;
                float f36 = yz1.s.f200414a;
                h0.e.C2226e c2226e3 = new h0.e.C2226e(aVar, new o92.b(eVar2, jD2, new o92.a(jT, 5.0f, null), null), n5.c.a(R.drawable.ic_chackmark, o0VarE, 0), j14, f22, null);
                o0VarE.g0(false);
                c2226e = c2226e3;
            }
            zR = o0VarE.r(c2226e) | o0VarE.i(1441.0f) | o0VarE.i(f15);
            objQ = o0VarE.q();
            if (zR) {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l02.l(c2226e, f15, 2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new l02.l(c2226e, f15, 2);
                o0VarE.K(objQ);
            }
            l lVar8 = (l) objQ;
            list5 = list4;
            collection = arrayList;
            if (!list5.isEmpty()) {
                collection = list5;
            }
            list6 = (List) collection;
            if (!list4.isEmpty()) {
                jD = j8;
            }
            zR2 = o0VarE.r(list6) | o0VarE.l(jD) | o0VarE.i(1441.0f) | o0VarE.i(f15);
            objQ2 = o0VarE.q();
            if (zR2) {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new g(list6, jD, f15);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new g(list6, jD, f15);
                o0VarE.K(objQ2);
            }
            l lVar9 = (l) objQ2;
            if (kVar != null) {
                cVar = kVar.f126958i;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                o0VarE.C(1424122447);
                o0VarE.g0(false);
                objA = null;
            } else {
                o0VarE.C(323034098);
                objA = ae0.g.a(cVar, o0VarE);
                o0VarE.g0(false);
            }
            if (objA == null) {
                objA = j0.f134944a;
            }
            zR3 = o0VarE.r(objA) | o0VarE.i(f15);
            objQ3 = o0VarE.q();
            if (zR3) {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new l02.l(objA, f15, 3);
                    o0VarE.K(objQ3);
                }
            } else {
                objQ3 = new l02.l(objA, f15, 3);
                o0VarE.K(objQ3);
            }
            i53.f fVarA2 = i53.a.a(lVar2, lVar, lVar4, lVar5, lVar9, (l) objQ3, lVar8);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            i15 = 0;
            m92.r.b(c2.l.C(x2.d(r.S, 1.0f), 0.0f, 12, 0.0f, j92.b.f97899b.f97917b, 5), fVarA2, null, null, false, gl1.y.Q(o0VarE, R.string.common_no_data), 0.0f, 0.0f, null, null, null, o0VarE, 0, 0, 2012);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            i15 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(a0Var, kVar, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(k kVar, m mVar, int i14) {
        String strP;
        o0 o0VarE = mVar.E(-556951515);
        int i15 = (o0VarE.B(kVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(1640509366);
            String upperCase = null;
            Double d14 = kVar != null ? kVar.f126951b : null;
            Double d15 = kVar != null ? kVar.f126952c : null;
            if (d14 != null && d15 != null) {
                double dDoubleValue = d15.doubleValue();
                double dDoubleValue2 = d14.doubleValue();
                if (dDoubleValue2 >= dDoubleValue) {
                    o0VarE.C(-1993721880);
                    double dFloor = Math.floor(dDoubleValue2 / dDoubleValue);
                    if (dFloor == 1.0d) {
                        strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1034141786, R.string.lbl_goal_met, o0VarE, false);
                    } else {
                        o0VarE.C(-1993544963);
                        String str = NumberFormat.getIntegerInstance().format(dFloor);
                        str.getClass();
                        strP = gl1.y.P(R.string.lbl_placeholder_goal, new Object[]{gl1.y.P(R.string.lbl_placeholder_multiplier, new Object[]{str}, o0VarE)}, o0VarE);
                        o0VarE.g0(false);
                    }
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    upperCase = strP.toUpperCase(locale);
                    upperCase.getClass();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1993170266);
                    o0VarE.g0(false);
                }
                Unit unit = Unit.INSTANCE;
            }
            o0VarE.g0(false);
            r rVarA = l4.k.a(r.S, upperCase == null ? 0.0f : 1.0f);
            float f14 = 12;
            g6.f.a aVar = g6.f.f75994b;
            r rVarC = c2.l.C(rVarA, 0.0f, f14, 0.0f, f14, 5);
            if (upperCase == null) {
                upperCase = "";
            }
            d92.b.f58623a.getClass();
            es1.c.a(rVarC, upperCase, 0L, ((d0) d92.b.a(o0VarE).e().f63501f.getF182175a()).f128833a, o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(kVar, i14);
        }
    }

    public static final void c(r rVar, k kVar, e23.a<Unit> aVar, m mVar, int i14) {
        r rVar2;
        int i15;
        e23.a<Unit> aVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(2018710506);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            z3.e eVarC = z3.f.c(-1748421447, new f(kVar), o0VarE);
            yz1.d dVar = kVar != null ? kVar.f126950a : null;
            f12.l.f68084a.getClass();
            String strQ = gl1.y.Q(o0VarE, f12.l.a.a().B3() ? R.string.lbl_pushes : R.string.steps_steps);
            t tVar = t.H0;
            o0Var = o0VarE;
            yz1.s.c(rVar2, dVar, strQ, null, t.b(tVar), tVar.e(null, o0VarE, 1), 0.0f, 0, null, 0.0f, null, null, eVarC, aVar2, o0Var, i15 & 14, ((i15 << 3) & 7168) | 384, 4040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, kVar, aVar, i14, 1);
        }
    }

    public static final void d(r rVar, k kVar, e23.a<Unit> aVar, m mVar, int i14) {
        r rVar2;
        int i15;
        o0 o0Var;
        u4.d dVarA;
        o0 o0VarE = mVar.E(-578733729);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            f12.l.a aVar2 = f12.l.f68084a;
            aVar2.getClass();
            String strQ = gl1.y.Q(o0VarE, f12.l.a.a().B3() ? R.string.lbl_no_pushes_today : R.string.lbl_no_steps_today);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_time_to_get_moving);
            yz1.d dVar = kVar != null ? kVar.f126950a : null;
            aVar2.getClass();
            String strQ3 = gl1.y.Q(o0VarE, f12.l.a.a().B3() ? R.string.lbl_pushes : R.string.steps_steps);
            aVar2.getClass();
            if (f12.l.a.a().B3()) {
                s62.a.f157643a.getClass();
                dVarA = o5.a(t62.a.f162797a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = rb.a(t62.c.f162799a);
            }
            u4.d dVar2 = dVarA;
            gl.c.f77766a.getClass();
            o0Var = o0VarE;
            yz1.s.d(rVar2, dVar, strQ3, strQ, strQ2, dVar2, d0.a(gl.c.a(o0VarE).c()), 0.0f, null, 0.0f, aVar, null, null, o0Var, i15 & 14, ((i15 << 3) & 7168) | 196608, 24448);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, kVar, aVar, i14, 0);
        }
    }

    public static final void e(k kVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1897845959);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarX = x2.x(x2.f(r.S, 1.0f), null, 3);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            t0.a(rVarC, c2.j.f22698h, c2.j.f22696f, null, 0, 0, z3.f.c(99482206, new s0(kVar, 11), o0VarE), o0VarE, 1573296, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(kVar, i14, 14);
        }
    }

    public static final void f(a0 a0Var, k kVar, m mVar, int i14) {
        a0 a0Var2;
        Double d14;
        o0 o0VarE = mVar.E(769823334);
        int i15 = (o0VarE.B(kVar) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String formattedValue = new yz.k(DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b))).getFormattedValue(0.0f);
            double dDoubleValue = (kVar == null || (d14 = kVar.f126955f) == null) ? 0.0d : d14.doubleValue();
            a0Var2 = a0Var;
            h02.b.a(a0Var2, formattedValue, null, null, o0VarE, 3462);
            if (dDoubleValue >= 2.0d) {
                o0VarE.C(-1317873735);
                e(kVar, o0VarE, (i15 >> 3) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1317840100);
                o0VarE.g0(false);
            }
        } else {
            a0Var2 = a0Var;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(a0Var2, kVar, i14, 2);
        }
    }

    public static final void g(a0 a0Var, k kVar, m mVar, int i14) {
        String strB;
        String strB2;
        Double d14;
        Double d15;
        o0 o0VarE = mVar.E(-2117886642);
        int i15 = (o0VarE.B(kVar) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.no_value);
            String strQ2 = gl1.y.Q(o0VarE, R.string.no_data_label);
            if (kVar == null || (d15 = kVar.f126951b) == null) {
                strB = null;
            } else {
                double dDoubleValue = d15.doubleValue();
                l3.f23124b.getClass();
                strB = l3.a.B(dDoubleValue);
            }
            if (kVar == null || (d14 = kVar.f126952c) == null) {
                strB2 = null;
            } else {
                double dDoubleValue2 = d14.doubleValue();
                l3.f23124b.getClass();
                strB2 = l3.a.B(dDoubleValue2);
            }
            l22.a aVar = new l22.a(context);
            l3.f23124b.getClass();
            p pVar = new p(aVar, false, false, l3.f23130h, null, 22, null);
            String strC = u00.b.c(pVar, kVar != null ? kVar.f126953d : null, 0, 6);
            String strC2 = u00.b.c(pVar, kVar != null ? kVar.f126953d : null, 0, 2);
            String str = strB == null ? strQ : strB;
            if (strB == null) {
                strB = strQ2;
            }
            String str2 = strB2 == null ? strQ : strB2;
            if (strB2 == null) {
                strB2 = strQ2;
            }
            String strQ3 = gl1.y.Q(o0VarE, R.string.steps_step_goal_label);
            if (strC == null) {
                strC = strQ;
            }
            if (strC2 == null) {
                strC2 = strQ2;
            }
            h02.d.a(a0Var, str, strB, str2, strB2, strQ3, strC, strC2, gl1.y.Q(o0VarE, R.string.steps_steps_distance), o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(a0Var, kVar, i14, 1);
        }
    }
}
