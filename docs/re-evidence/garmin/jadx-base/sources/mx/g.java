package mx;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import f72.k;
import gl1.y;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.h6;
import kotlin.t1;
import m92.h0;
import o13.p;
import o4.d0;
import o4.g1;
import o4.v1;
import o70.t;
import p005kotlin.Unit;
import p13.j0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s1.n0;
import s1.y0;
import s5.i0;
import s5.s0;
import s5.t0;
import s5.x0;
import yz1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static final void a(r rVar, gx.b bVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        Integer num;
        o0 o0VarE = mVar.E(1128466899);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.gcm_body_battery_lbl_body_battery);
            if (bVar == null || (num = bVar.f80009d) == null) {
                strJ = null;
            } else {
                int iIntValue = num.intValue();
                strJ = iIntValue > 5 ? String.valueOf(iIntValue) : "5";
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2124944089, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(2124938850);
                o0VarE.g0(false);
            }
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new mi0.i(16);
                o0VarE.K(objQ);
            }
            r rVarC = v.c((l) objQ, rVar, true);
            yz1.d dVar = bVar != null ? bVar.f80006a : null;
            t tVar = t.f130065i;
            o0Var = o0VarE;
            s.c(rVarC, dVar, strQ, null, t.b(tVar), tVar.e(null, o0VarE, 1), 0.0f, 0, null, 0.0f, null, null, z3.f.c(417720745, new mw0.i(2, strJ, (Object) bVar), o0VarE), aVar, o0Var, 0, ((i15 << 3) & 7168) | 384, 4040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(rVar, bVar, aVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    public static final void b(r rVar, yz1.d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-184424453);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.gcm_body_battery_lbl_body_battery);
            String strQ2 = y.Q(o0VarE, R.string.lbl_bb_genesis_track_level);
            String strQ3 = y.Q(o0VarE, R.string.lbl_bb_first_time_usage_explanation);
            s62.a.f157643a.getClass();
            u4.d dVarA = k.a(t62.c.f162799a);
            f02.c.f67726a.getClass();
            gl.c.f77766a.getClass();
            d0 d0VarA = d0.a(gl.c.a(o0VarE).c());
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l71.g(context, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l71.g(context, 7);
                    o0VarE.K(objQ);
                }
            }
            s.d(rVar, dVar, strQ, strQ2, strQ3, dVarA, d0VarA, 0.0f, null, 0.0f, aVar, (e23.a) objQ, null, o0VarE, i15 & 126, (i15 << 3) & 7168, 40832);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.m(rVar, dVar, aVar, i14, 2);
        }
    }

    public static final void c(r rVar, yz1.d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2095033096);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.gcm_body_battery_lbl_body_battery);
            String strQ2 = y.Q(o0VarE, R.string.msg_not_enough_data);
            String strQ3 = y.Q(o0VarE, R.string.lbl_body_battery_accurate_reading_on_device);
            s62.a.f157643a.getClass();
            u4.d dVarA = k.a(t62.c.f162799a);
            f02.c.f67726a.getClass();
            gl.c.f77766a.getClass();
            s.d(rVar, dVar, strQ, strQ2, strQ3, dVarA, d0.a(gl.c.a(o0VarE).c()), 0.0f, null, 0.0f, aVar, null, null, o0VarE, i15 & 126, ((i15 << 3) & 7168) | 196608, 24448);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.m(rVar, dVar, aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:185:0x056c  */
    /* JADX WARN: Code duplicated, block: B:210:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:215:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:220:0x0701  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(a0 a0Var, String str, gx.b bVar, m mVar, int i14) {
        gx.b bVar2;
        Object objValueOf;
        Object next;
        List listA;
        o0 o0Var;
        int i15;
        long j8;
        o0 o0Var2;
        h0.e.a aVar;
        h0.e.a aVar2;
        Integer numValueOf;
        Integer numValueOf2;
        String formattedValue;
        Integer num;
        ArrayList arrayList;
        i53.c<Integer> cVar;
        i53.c<Integer> cVar2;
        i53.c<Integer> cVar3;
        Integer num2;
        Integer num3;
        Integer num4;
        String strValueOf;
        Integer num5;
        Object obj = 0;
        o0 o0VarE = mVar.E(281249192);
        int i16 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(bVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (bVar == null || (num5 = bVar.f80008c) == null || (objValueOf = String.valueOf(num5.intValue())) == null) {
                objValueOf = obj;
            }
            String strP = y.P(R.string.lbl_string_with_positive_sign, new Object[]{objValueOf}, o0VarE);
            String strQ = y.Q(o0VarE, R.string.gcm_body_battery_lbl_charged);
            if (bVar != null && (num4 = bVar.f80007b) != null && (strValueOf = String.valueOf(num4.intValue())) != null) {
                obj = strValueOf;
            }
            h02.d.a(a0Var, str, y.P(R.string.msg_value_out_of_100, new Object[]{str}, o0VarE), strP, String.valueOf((bVar == null || (num3 = bVar.f80008c) == null) ? 0 : num3.intValue()), strQ, y.P(R.string.lbl_string_with_negative_sign, new Object[]{obj}, o0VarE), String.valueOf((bVar == null || (num2 = bVar.f80007b) == null) ? 0 : num2.intValue()), y.Q(o0VarE, R.string.gcm_body_battery_lbl_drained), o0VarE, i16 & 126, 0);
            List listG = (bVar == null || (cVar3 = bVar.f80011f) == null) ? null : c02.a.g(cVar3);
            if (listG == null) {
                listG = j0.f134944a;
            }
            List list = listG;
            List listG2 = (bVar == null || (cVar2 = bVar.f80012g) == null) ? null : c02.a.g(cVar2);
            if (listG2 == null) {
                listG2 = j0.f134944a;
            }
            List list2 = listG2;
            List listG3 = (bVar == null || (cVar = bVar.f80013h) == null) ? null : c02.a.g(cVar);
            if (listG3 == null) {
                listG3 = j0.f134944a;
            }
            Iterator it = p13.h0.C0(list2, list).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float f14 = ((h0.e.a) next).f117347b;
                    do {
                        Object next2 = it.next();
                        float f15 = ((h0.e.a) next2).f117347b;
                        if (Float.compare(f14, f15) < 0) {
                            next = next2;
                            f14 = f15;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            h0.e.a aVar3 = (h0.e.a) next;
            r rVarA = a0Var.a(x2.f(r.S, 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            long jC = sn.a.c(o0VarE);
            long jD2 = d92.b.a(o0VarE).j().d();
            i53.c cVarA = sr1.b.a(bVar != null ? bVar.f80015j : null, bVar != null ? bVar.f80014i : null, o0VarE);
            i53.c<ae0.h> cVar4 = bVar != null ? bVar.f80016k : null;
            if (cVar4 == null) {
                o0VarE.C(-850806561);
                o0VarE.g0(false);
                listA = null;
            } else {
                o0VarE.C(-1135824030);
                listA = ae0.g.a(cVar4, o0VarE);
                o0VarE.g0(false);
            }
            if (listA == null) {
                listA = j0.f134944a;
            }
            boolean zR = o0VarE.r(cVarA) | o0VarE.i(481.0f);
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (zR) {
                objQ = new m92.q(cVarA, 1);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new m92.q(cVarA, 1);
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            listG3.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            h0.e.a aVar6 = (h0.e.a) p13.h0.d0(listG3);
            if (aVar6 != null) {
                arrayList3.add(aVar6);
            }
            int size = listG3.size();
            ArrayList arrayList4 = arrayList3;
            int i17 = 1;
            while (i17 < size) {
                int i18 = size;
                h0.e.a aVar7 = (h0.e.a) listG3.get(i17);
                h0.e.a aVar8 = aVar3;
                List list3 = listG3;
                if (aVar7.f117346a == ((h0.e.a) listG3.get(i17 - 1)).f117346a + 1) {
                    arrayList4.add(aVar7);
                } else {
                    arrayList2.add(arrayList4);
                    arrayList4 = new ArrayList();
                }
                i17++;
                listG3 = list3;
                size = i18;
                aVar3 = aVar8;
            }
            h0.e.a aVar9 = aVar3;
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            h0.e.a aVar10 = (h0.e.a) p13.h0.d0(list2);
            if (aVar10 != null) {
                arrayList6.add(aVar10);
            }
            int size2 = list2.size();
            ArrayList arrayList10 = arrayList8;
            int i19 = 0;
            int i24 = 1;
            while (i24 < size2) {
                int i25 = size2;
                h0.e.a aVar11 = (h0.e.a) list2.get(i24);
                int i26 = i24;
                h0.e.a aVar12 = (h0.e.a) list2.get(i26 - 1);
                long j14 = jC;
                float f16 = aVar11.f117346a - aVar12.f117346a;
                if (f16 > 60.0f) {
                    if (arrayList10.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = arrayList10;
                        arrayList7.add(arrayList);
                    }
                    arrayList5.add(arrayList6);
                    arrayList6 = new ArrayList();
                    arrayList.add(aVar11);
                    i19 = 8;
                    arrayList10 = arrayList;
                } else {
                    ArrayList arrayList11 = arrayList10;
                    if (1.0f < f16 && f16 <= 60.0f) {
                        arrayList9.add(new p(aVar12, aVar11));
                        arrayList5.add(arrayList6);
                        arrayList6 = new ArrayList();
                    } else if (i19 > 0) {
                        arrayList11.add(aVar11);
                        i19--;
                    } else {
                        arrayList6.add(aVar11);
                    }
                    arrayList10 = arrayList11;
                }
                i24 = i26 + 1;
                size2 = i25;
                jC = j14;
            }
            long j15 = jC;
            arrayList5.add(arrayList6);
            arrayList7.add(arrayList10);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f17 = j92.b.f97899b.f97917b / 2;
            g6.f.a aVar13 = g6.f.f75994b;
            g1.f128855a.getClass();
            o4.k kVarA = g1.a.a(0.0f, new float[]{4.0f, 4.0f});
            ArrayList arrayList12 = new ArrayList(p13.y.r(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList12.add(new cd1.c(jD, f17, (List) it3.next(), kVarA));
            }
            o4.k kVar = kVarA;
            ArrayList arrayList13 = new ArrayList(p13.y.r(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList13.add(new cd1.c(jD, f17, (List) it4.next(), (o4.k) null));
            }
            ArrayList arrayList14 = new ArrayList(p13.y.r(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                o4.k kVar2 = kVar;
                arrayList14.add(new cd1.c(jD, f17, (List) it5.next(), kVar2));
                kVar = kVar2;
            }
            o4.k kVar3 = kVar;
            ArrayList arrayList15 = new ArrayList(p13.y.r(arrayList9, 10));
            for (Iterator it6 = arrayList9.iterator(); it6.hasNext(); it6 = it6) {
                p pVar = (p) it6.next();
                arrayList15.add(new cd1.c(jD, f17, x.k(pVar.f128594a, pVar.f128595b), kVar3));
            }
            List list4 = listA;
            ArrayList arrayList16 = new ArrayList(p13.y.r(arrayList5, 10));
            for (Iterator it7 = arrayList5.iterator(); it7.hasNext(); it7 = it7) {
                arrayList16.add(new an.a((List) it7.next(), jD, 3));
            }
            ArrayList arrayList17 = new ArrayList(p13.y.r(arrayList7, 10));
            for (Iterator it8 = arrayList7.iterator(); it8.hasNext(); it8 = it8) {
                arrayList17.add(new an.a((List) it8.next(), jD, 3));
            }
            ArrayList arrayList18 = new ArrayList(p13.y.r(arrayList9, 10));
            for (Iterator it9 = arrayList9.iterator(); it9.hasNext(); it9 = it9) {
                p pVar2 = (p) it9.next();
                arrayList18.add(new an.a(x.k(pVar2.f128594a, pVar2.f128595b), jD, 3));
            }
            ArrayList arrayListC0 = p13.h0.C0(p13.h0.C0(p13.h0.C0(p13.h0.C0(p13.h0.C0(p13.h0.C0(arrayList12, arrayList16), arrayList17), arrayList18), arrayList15), arrayList13), arrayList14);
            boolean zR2 = o0VarE.r(list) | o0VarE.l(jD2) | o0VarE.i(481.0f);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new an.a(list, jD2, 2);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new an.a(list, jD2, 2);
                    o0VarE.K(objQ2);
                }
            }
            l lVar2 = (l) objQ2;
            if (p13.h0.n0(list) != null) {
                o0VarE.C(-849585532);
                x1 x1Var3 = n.f135158a;
                n0 n0VarC = s1.p0.c("", o0VarE, 0);
                gl.c.f77766a.getClass();
                gl.e eVar = gl.c.f77767b;
                i15 = 2;
                j8 = jD;
                o0Var = o0VarE;
                jD2 = ((d0) r1.p2.a(n0VarC, eVar.f77787j, eVar.f77781g, s1.l.a(s1.l.d(1000, 0, s1.e0.f155563d, 2), y0.Reverse, 4), o0VarE, 28680, 0).f155651d.getF182175a()).f128833a;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                i15 = 2;
                j8 = jD;
                o0Var.C(-849520525);
                o0Var.g0(false);
            }
            long j16 = jD2;
            boolean zR3 = o0Var.r(list) | o0Var.r(list2) | o0Var.l(j16) | o0Var.l(j8) | o0Var.i(481.0f);
            Object objQ3 = o0Var.q();
            if (zR3) {
                long j17 = j8;
                o0Var2 = o0Var;
                e eVar2 = new e(list, list2, j16, j17);
                o0Var2.K(eVar2);
                objQ3 = eVar2;
            } else {
                aVar5.getClass();
                if (objQ3 == m.a.f135155b) {
                    long j18 = j8;
                    o0Var2 = o0Var;
                    e eVar3 = new e(list, list2, j16, j18);
                    o0Var2.K(eVar3);
                    objQ3 = eVar3;
                } else {
                    o0Var2 = o0Var;
                }
            }
            l lVar3 = (l) objQ3;
            if (aVar9 != null) {
                aVar = aVar9;
                aVar2 = new h0.e.a(aVar.f117346a, aVar.f117347b);
            } else {
                aVar = aVar9;
                aVar2 = null;
            }
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            i0 i0Var = x0.a(x0Var, com.nimbusds.jose.shaded.gson.internal.a.d(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a;
            fVar.getClass();
            x0 x0VarA = x0.a(x0Var, d92.b.a(o0Var2).c().f(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            float fD = g6.q.d(i0Var.fontSize);
            v1.f129019b.getClass();
            x0 x0VarA2 = x0.a(x0VarA, 0L, 0L, null, null, 0L, null, new q4.k(fD, 10.0f, 0, v1.f129020c, null, 20, null), 0, 0L, null, null, 16760831);
            s0 s0VarA = t0.a(o0Var2);
            s5.c.b bVar4 = new s5.c.b(0, 1, null);
            int iJ = bVar4.j(i0Var);
            if (aVar != null) {
                try {
                    numValueOf = Integer.valueOf((int) aVar.f117347b);
                } catch (Throwable th3) {
                    bVar4.f(iJ);
                    throw th3;
                }
            } else {
                numValueOf = null;
            }
            bVar4.b(String.valueOf(numValueOf));
            Unit unit = Unit.INSTANCE;
            bVar4.f(iJ);
            s5.c cVarK = bVar4.k();
            s5.c.b bVar5 = new s5.c.b(0, 1, null);
            int iJ2 = bVar5.j(x0VarA2.f157322a);
            if (aVar != null) {
                try {
                    numValueOf2 = Integer.valueOf((int) aVar.f117347b);
                } catch (Throwable th4) {
                    bVar5.f(iJ2);
                    throw th4;
                }
            } else {
                numValueOf2 = null;
            }
            bVar5.b(String.valueOf(numValueOf2));
            bVar5.f(iJ2);
            s5.c cVarK2 = bVar5.k();
            int i27 = (int) (s0.b(s0VarA, cVarK, null, 0, false, 0, null, 0L, null, null, null, 2046).f157282c & 4294967295L);
            double d14 = ((double) i27) / 1.25d;
            boolean zR4 = o0Var2.r(aVar2) | o0Var2.B(cVarK2) | o0Var2.B(s0VarA) | o0Var2.i(481.0f) | o0Var2.m(d14) | o0Var2.B(cVarK);
            Object objQ4 = o0Var2.q();
            if (zR4) {
                objQ4 = new f(aVar2, cVarK2, s0VarA, d14, cVarK);
                o0Var2.K(objQ4);
            } else {
                aVar5.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new f(aVar2, cVarK2, s0VarA, d14, cVarK);
                    o0Var2.K(objQ4);
                }
            }
            l lVar4 = (l) objQ4;
            boolean zL = o0Var2.l(j15);
            Object objQ5 = o0Var2.q();
            if (zL) {
                objQ5 = new j82.d(j15, 13);
                o0Var2.K(objQ5);
            } else {
                aVar5.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new j82.d(j15, 13);
                    o0Var2.K(objQ5);
                }
            }
            l lVar5 = (l) objQ5;
            boolean zR5 = o0Var2.r(list4);
            Object objQ6 = o0Var2.q();
            if (zR5) {
                objQ6 = new aq1.d0(list4, 18);
                o0Var2.K(objQ6);
            } else {
                aVar5.getClass();
                if (objQ6 == m.a.f135155b) {
                    objQ6 = new aq1.d0(list4, 18);
                    o0Var2.K(objQ6);
                }
            }
            l[] lVarArr = new l[i15];
            lVarArr[0] = lVar5;
            lVarArr[1] = lVar;
            ArrayList arrayListC1 = p13.h0.C0(p13.h0.C0(x.m(lVarArr), arrayListC0), w.c(lVar2));
            l[] lVarArr2 = new l[3];
            lVarArr2[0] = (l) objQ6;
            lVarArr2[1] = lVar4;
            lVarArr2[i15] = lVar3;
            ArrayList arrayListC2 = p13.h0.C0(arrayListC1, x.m(lVarArr2));
            r rVarD = x2.d(r.S, 1.0f);
            float fC1 = ((g6.c) o0Var2.A(t1.f91490h)).c1(i27);
            d92.b.f58625c.getClass();
            o0 o0Var3 = o0Var2;
            m92.r.b(c2.l.C(rVarD, 0.0f, fC1, 0.0f, j92.b.f97899b.f97917b, 5), i53.a.e(arrayListC2), null, null, false, y.Q(o0Var2, R.string.common_no_data), 0.0f, 0.0f, null, null, null, o0Var3, 0, 0, 2012);
            o0VarE = o0Var3;
            o0VarE.g0(true);
            boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String formattedValue2 = new yz.k(zIs24HourFormat).getFormattedValue(0.0f);
            bVar2 = bVar;
            if (bVar == null || (num = bVar2.f80010e) == null) {
                formattedValue = null;
            } else {
                int iIntValue = num.intValue();
                formattedValue = iIntValue % 60 == 0 ? new yz.k(zIs24HourFormat).getFormattedValue(iIntValue) : new yz.k(zIs24HourFormat).a(iIntValue);
            }
            h02.b.a(a0Var, formattedValue2, formattedValue, bVar2 != null ? bVar2.f80010e : null, o0VarE, 6);
            x1 x1Var4 = n.f135158a;
        } else {
            bVar2 = bVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(a0Var, str, bVar2, i14, 2);
        }
    }
}
