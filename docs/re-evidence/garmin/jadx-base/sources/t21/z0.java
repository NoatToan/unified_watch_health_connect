package t21;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import l72.c3;
import l72.p2;
import l72.r1;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import v62.k5;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 {
    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    public static final void a(s21.g gVar, s21.o oVar, v21.e eVar, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        s21.f fVar;
        s21.f fVar2;
        s21.f fVar3;
        s21.f fVar4;
        s21.f fVar5;
        s21.f fVar6;
        p3.o0 o0VarE = mVar.E(-202826534);
        int i15 = (o0VarE.B(gVar) ? 4 : 2) | i14 | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.f23678ve);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_help);
            boolean z14 = (i15 & 458752) == 131072;
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                objQ = new a(aVar3, 16);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar3, 16);
                    o0VarE.K(objQ);
                }
            }
            r1.c(strW, strQ, (e23.a) objQ, false, null, null, o0VarE, 0, 56);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", eVar.x((gVar == null || (fVar6 = gVar.f156115a) == null) ? null : Double.valueOf(fVar6.f156104a), (gVar == null || (fVar5 = gVar.f156116b) == null) ? null : Double.valueOf(fVar5.f156104a), (gVar == null || (fVar4 = gVar.f156117c) == null) ? null : Double.valueOf(fVar4.f156104a), true));
            b92.a aVarB = c0235a.b();
            p2 p2Var = p2.f111205a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_macronutrients_goals);
            String strX = eVar.x((gVar == null || (fVar3 = gVar.f156115a) == null) ? null : Double.valueOf(fVar3.f156104a), (gVar == null || (fVar2 = gVar.f156116b) == null) ? null : Double.valueOf(fVar2.f156104a), (gVar == null || (fVar = gVar.f156117c) == null) ? null : Double.valueOf(fVar.f156104a), false);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new a(aVar, 17);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(aVar, 17);
                    o0VarE.K(objQ2);
                }
            }
            int i16 = b92.a.f16960b;
            p2Var.h(strQ2, strX, null, null, aVarB, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1004);
            o0VarE = o0VarE;
            if (oVar != null) {
                o0VarE.C(615213929);
                b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                c0235a2.f16962a.put("label_secondary", eVar.C(oVar, true));
                b92.a aVarB2 = c0235a2.b();
                String strW2 = gl1.d.W(c22.x0.f23712xe);
                String strC = eVar.C(oVar, false);
                boolean z16 = (i15 & 57344) == 16384;
                Object objQ3 = o0VarE.q();
                if (z16) {
                    objQ3 = new a(aVar2, 18);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a(aVar2, 18);
                        o0VarE.K(objQ3);
                    }
                }
                p2Var.h(strW2, strC, null, null, aVarB2, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 0, 1004);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(615858760);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(gVar, oVar, eVar, aVar, aVar2, aVar3, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x029c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0318  */
    public static final void b(s21.s sVar, s21.x xVar, v21.e eVar, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        p3.o0 o0Var;
        s21.s sVar2;
        sVar.getClass();
        xVar.getClass();
        eVar.getClass();
        l22.a aVar6 = eVar.f175325b;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        p3.o0 o0VarE = mVar.E(-691530392);
        int i15 = i14 | (o0VarE.k(sVar.ordinal()) ? 4 : 2) | (o0VarE.r(xVar) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304) | (o0VarE.r(aVar5) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarF = x2.f(aVar7, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.g.a aVar9 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(aVar7, aVar9);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            float f15 = eVar2.f97920e;
            h4.r rVarC2 = c2.l.C(rVarB, 0.0f, f14, 0.0f, 0.0f, 13);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(rVarC2, f15, 0.0f, 2);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_recommendations_header_title);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            p3.o0 o0Var2 = o0VarE;
            s21.s sVar3 = s21.s.MAINTAIN_WEIGHT;
            if (sVar != sVar3) {
                o0Var2.C(110791727);
                h4.r rVarB2 = b0Var.b(aVar7, aVar9);
                bVar2.getClass();
                h4.r rVarY = c2.l.y(rVarB2, f15);
                String strQ2 = gl1.y.Q(o0Var2, R.string.lbl_recommendations_subheader_title);
                fVar.getClass();
                sVar2 = sVar3;
                mh.c(strQ2, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var2), o0Var2, 0, 0, 130044);
                o0Var2 = o0Var2;
                c(xVar, eVar, lVar, o0Var2, (i15 >> 3) & 1022);
                o0Var2.g0(false);
            } else {
                sVar2 = sVar3;
                o0Var2.C(111396196);
                o0Var2.g0(false);
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            s21.s sVar4 = sVar2;
            h4.r rVarC3 = aVar7;
            c0235a.f16962a.put("label_secondary", eVar.b(xVar.f156197f, xVar.f156195d, xVar.f156196e, xVar.f156198g, true));
            b92.a aVarB = c0235a.b();
            p2 p2Var = p2.f111205a;
            if (sVar == sVar4) {
                bVar2.getClass();
                rVarC3 = c2.l.C(rVarC3, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            }
            String strQ3 = gl1.y.Q(o0Var2, R.string.txt_activity_level_title);
            String strB = eVar.b(xVar.f156197f, xVar.f156195d, xVar.f156196e, xVar.f156198g, false);
            boolean z14 = (i15 & 458752) == 131072;
            Object objQ = o0Var2.q();
            p3.m.a aVar10 = p3.m.f135153a;
            if (z14) {
                objQ = new a(aVar2, 14);
                o0Var2.K(objQ);
            } else {
                aVar10.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVar2, 14);
                    o0Var2.K(objQ);
                }
            }
            int i17 = b92.a.f16960b;
            p3.o0 o0Var3 = o0Var2;
            p2Var.h(strQ3, strB, null, rVarC3, aVarB, false, false, null, null, null, (e23.a) objQ, o0Var3, 0, 0, 996);
            String strQ4 = gl1.y.Q(o0Var3, R.string.lbl_daily_calories_goal);
            Integer num = xVar.f156193b;
            String strD = num != null ? v21.e.d(eVar, Double.valueOf(num.intValue()), gl1.y.Q(o0Var3, R.string.lbl_calories), 4) : aVar6.getString(R.string.user_goal);
            boolean z15 = (i15 & 57344) == 16384;
            Object objQ2 = o0Var3.q();
            if (z15) {
                objQ2 = new a(aVar, 15);
                o0Var3.K(objQ2);
            } else {
                aVar10.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(aVar, 15);
                    o0Var3.K(objQ2);
                }
            }
            p2Var.h(strQ4, strD, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0Var3, 0, 0, 1020);
            o0Var = o0Var3;
            if (sVar != sVar4) {
                o0Var.C(113268906);
                String strQ5 = gl1.y.Q(o0Var, R.string.target_date);
                b63.o oVar = xVar.f156199h;
                p2Var.h(strQ5, oVar == null ? aVar6.getString(R.string.lbl_empty_string) : eVar.f175326c.d(g22.l.h(oVar), qi0.a.YEAR_MONTH_DAY), null, null, null, false, false, null, null, null, null, o0Var, 0, 0, 2044);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(113478404);
                o0Var.g0(false);
            }
            int i18 = i15 >> 9;
            a(xVar.f156194c, xVar.f156205n, eVar, aVar3, aVar4, aVar5, o0Var, (57344 & i18) | (i15 & 896) | (i18 & 7168) | (i18 & 458752));
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(sVar, xVar, eVar, lVar, aVar, aVar2, aVar3, aVar4, aVar5, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037d  */
    /* JADX WARN: Code duplicated, block: B:104:0x041c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0420  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x01be  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x021f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0222  */
    /* JADX WARN: Code duplicated, block: B:64:0x022e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0236  */
    /* JADX WARN: Code duplicated, block: B:68:0x023c  */
    /* JADX WARN: Code duplicated, block: B:71:0x029d  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0301  */
    /* JADX WARN: Code duplicated, block: B:88:0x0308  */
    /* JADX WARN: Code duplicated, block: B:91:0x0350  */
    /* JADX WARN: Code duplicated, block: B:93:0x0357  */
    /* JADX WARN: Code duplicated, block: B:95:0x035f  */
    public static final void c(final s21.x xVar, v21.e eVar, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        final e23.l<? super Float, Unit> lVar2;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        j92.f fVar2;
        int i16;
        i53.c<Float> cVar2;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.b bVar;
        u2 u2Var;
        h5.e0.a aVar2;
        int i17;
        boolean z14;
        boolean z15;
        Object objQ;
        p3.m.a aVar3;
        final e23.l<? super Float, Unit> lVar3;
        h5.g.a.b bVar2;
        int size;
        boolean z16;
        Object objQ2;
        boolean z17;
        boolean z18;
        Object objQ3;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        p3.o0 o0VarE = mVar.E(-1488460333);
        p3.c<?> cVar3 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(xVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar4, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarB = b0Var.b(aVar4, aVar5);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97920e;
                float f15 = eVar3.f97918c;
                float f16 = eVar3.f97920e;
                org.apache.commons.lang3.e.j(bVar4);
                h4.r rVarB2 = c2.l.B(rVarB, f16, f14, f16, f15);
                String strQ = gl1.y.Q(o0VarE, R.string.target_weekly_weight_change);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                i16 = i15;
                mh.c(strQ, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
                h4.r rVarB3 = b0Var.b(aVar4, aVar5);
                bVar4.getClass();
                h4.r rVarA = c2.l.A(rVarB3, f16, 0.0f, 2);
                float f17 = xVar.f156200i;
                cVar2 = xVar.f156201j;
                String strJ = eVar.J(Float.valueOf(f17));
                fVar2.getClass();
                mh.c(strJ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                bVar4.getClass();
                bVar4.getClass();
                h4.r rVarZ = c2.l.z(aVar4, f16, f15);
                h4.g.b bVar5 = h4.d.a.f81534l;
                bVar4.getClass();
                s2VarA = q2.a(c2.j.i(eVar3.f97921f), bVar5, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarZ, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    aVar = aVar6;
                    o0VarE.M(aVar);
                } else {
                    aVar = aVar6;
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T && p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    bVar = bVar3;
                } else {
                    bVar = bVar3;
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                s62.a.f157643a.getClass();
                t62.b bVar6 = t62.b.f162798a;
                u4.d dVarA = k5.a(bVar6);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_minus);
                aVar2 = aVar;
                long jY = sn.a.y(o0VarE);
                boolean zR = o0VarE.r(xVar);
                i17 = i16 & 896;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zR | z14;
                objQ = o0VarE.q();
                aVar3 = p3.m.f135153a;
                if (z15) {
                    lVar3 = lVar;
                    final int i18 = 0;
                    objQ = new e23.a() { // from class: t21.y0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    lVar3.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                    break;
                                default:
                                    lVar3.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar3 = lVar;
                        final int i19 = 0;
                        objQ = new e23.a() { // from class: t21.y0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        lVar3.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                        break;
                                    default:
                                        lVar3.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    } else {
                        lVar3 = lVar;
                    }
                }
                lVar2 = lVar3;
                bVar2 = bVar;
                i7.b(dVarA, strQ2, u1.w.d(aVar4, false, null, null, (e23.a) objQ, 15), jY, o0VarE, 0, 0);
                c3 c3Var = c3.f110949a;
                h4.r rVarA2 = u2Var.a(aVar4, 1.0f, true);
                float f18 = xVar.f156200i;
                j23.e eVar4 = new j23.e(((Number) p13.h0.b0(cVar2)).floatValue(), ((Number) p13.h0.m0(cVar2)).floatValue());
                size = cVar2.size() - 2;
                if (size < 0) {
                    size = 0;
                }
                if (i17 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new qe2.c(lVar2, 29);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qe2.c(lVar2, 29);
                        o0VarE.K(objQ2);
                    }
                }
                c3Var.a(f18, (e23.l) objQ2, rVarA2, false, eVar4, size, null, null, o0VarE, 0, 200);
                u4.d dVarA2 = s6.a(bVar6);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_plus);
                long jY2 = sn.a.y(o0VarE);
                boolean zR2 = o0VarE.r(xVar);
                if (i17 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zR2 | z17;
                objQ3 = o0VarE.q();
                if (z18) {
                    final int i24 = 1;
                    objQ3 = new e23.a() { // from class: t21.y0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    lVar2.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                    break;
                                default:
                                    lVar2.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    aVar3.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        final int i25 = 1;
                        objQ3 = new e23.a() { // from class: t21.y0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        lVar2.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                        break;
                                    default:
                                        lVar2.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    }
                }
                i7.b(dVarA2, strQ3, u1.w.d(aVar4, false, null, null, (e23.a) objQ3, 15), jY2, o0VarE, 0, 0);
                o0VarE.g0(true);
                g6.f.a aVar7 = g6.f.f75994b;
                h4.r rVarA3 = c2.l.A(aVar4, 66, 0.0f, 2);
                s2VarA2 = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                String strValueOf = String.valueOf(((Number) p13.h0.b0(cVar2)).floatValue());
                d6.h.f57752b.getClass();
                int i26 = d6.h.f57755e;
                d6.h hVarA = d6.h.a(i26);
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97933j;
                mh.c(strValueOf, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130046);
                c2.l.f(u2Var.a(aVar4, 1.0f, true), o0VarE);
                String strValueOf2 = String.valueOf(((Number) p13.h0.m0(cVar2)).floatValue());
                d6.h hVarA2 = d6.h.a(i26);
                fVar2.getClass();
                mh.c(strValueOf2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130046);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarB4 = b0Var2.b(aVar4, aVar5);
            j92.b bVar7 = d92.b.f58625c;
            bVar7.getClass();
            j92.e eVar5 = j92.b.f97899b;
            float f19 = eVar5.f97920e;
            float f110 = eVar5.f97918c;
            float f111 = eVar5.f97920e;
            org.apache.commons.lang3.e.j(bVar7);
            h4.r rVarB5 = c2.l.B(rVarB4, f111, f19, f111, f110);
            String strQ4 = gl1.y.Q(o0VarE, R.string.target_weekly_weight_change);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            i16 = i15;
            mh.c(strQ4, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarB6 = b0Var2.b(aVar4, aVar5);
            bVar7.getClass();
            h4.r rVarA4 = c2.l.A(rVarB6, f111, 0.0f, 2);
            float f112 = xVar.f156200i;
            cVar2 = xVar.f156201j;
            String strJ2 = eVar.J(Float.valueOf(f112));
            fVar2.getClass();
            mh.c(strJ2, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
            bVar7.getClass();
            bVar7.getClass();
            h4.r rVarZ2 = c2.l.z(aVar4, f111, f110);
            h4.g.b bVar8 = h4.d.a.f81534l;
            bVar7.getClass();
            s2VarA = q2.a(c2.j.i(eVar5.f97921f), bVar8, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarZ2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                aVar = aVar6;
                o0VarE.M(aVar);
            } else {
                aVar = aVar6;
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                bVar = bVar3;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                bVar = bVar3;
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            t62.b bVar9 = t62.b.f162798a;
            u4.d dVarA3 = k5.a(bVar9);
            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_minus);
            aVar2 = aVar;
            long jY3 = sn.a.y(o0VarE);
            boolean zR3 = o0VarE.r(xVar);
            i17 = i16 & 896;
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zR3 | z14;
            objQ = o0VarE.q();
            aVar3 = p3.m.f135153a;
            if (z15) {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar3 = lVar;
                    final int i110 = 0;
                    objQ = new e23.a() { // from class: t21.y0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i110) {
                                case 0:
                                    lVar3.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                    break;
                                default:
                                    lVar3.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    lVar3 = lVar;
                }
            } else {
                lVar3 = lVar;
                final int i111 = 0;
                objQ = new e23.a() { // from class: t21.y0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i111) {
                            case 0:
                                lVar3.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                break;
                            default:
                                lVar3.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            }
            lVar2 = lVar3;
            bVar2 = bVar;
            i7.b(dVarA3, strQ5, u1.w.d(aVar4, false, null, null, (e23.a) objQ, 15), jY3, o0VarE, 0, 0);
            c3 c3Var2 = c3.f110949a;
            h4.r rVarA5 = u2Var.a(aVar4, 1.0f, true);
            float f113 = xVar.f156200i;
            j23.e eVar6 = new j23.e(((Number) p13.h0.b0(cVar2)).floatValue(), ((Number) p13.h0.m0(cVar2)).floatValue());
            size = cVar2.size() - 2;
            if (size < 0) {
                size = 0;
            }
            if (i17 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ2 = o0VarE.q();
            if (z16) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new qe2.c(lVar2, 29);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new qe2.c(lVar2, 29);
                o0VarE.K(objQ2);
            }
            c3Var2.a(f113, (e23.l) objQ2, rVarA5, false, eVar6, size, null, null, o0VarE, 0, 200);
            u4.d dVarA4 = s6.a(bVar9);
            String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_plus);
            long jY4 = sn.a.y(o0VarE);
            boolean zR4 = o0VarE.r(xVar);
            if (i17 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zR4 | z17;
            objQ3 = o0VarE.q();
            if (z18) {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    final int i27 = 1;
                    objQ3 = new e23.a() { // from class: t21.y0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    lVar2.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                    break;
                                default:
                                    lVar2.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            } else {
                final int i28 = 1;
                objQ3 = new e23.a() { // from class: t21.y0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                lVar2.invoke(Float.valueOf(xVar.f156200i - 0.25f));
                                break;
                            default:
                                lVar2.invoke(Float.valueOf(xVar.f156200i + 0.25f));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            i7.b(dVarA4, strQ6, u1.w.d(aVar4, false, null, null, (e23.a) objQ3, 15), jY4, o0VarE, 0, 0);
            o0VarE.g0(true);
            g6.f.a aVar8 = g6.f.f75994b;
            h4.r rVarA6 = c2.l.A(aVar4, 66, 0.0f, 2);
            s2VarA2 = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA6, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strValueOf3 = String.valueOf(((Number) p13.h0.b0(cVar2)).floatValue());
            d6.h.f57752b.getClass();
            int i29 = d6.h.f57755e;
            d6.h hVarA3 = d6.h.a(i29);
            fVar2.getClass();
            s5.x0 x0Var2 = j92.f.f97933j;
            mh.c(strValueOf3, null, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 130046);
            c2.l.f(u2Var.a(aVar4, 1.0f, true), o0VarE);
            String strValueOf4 = String.valueOf(((Number) p13.h0.m0(cVar2)).floatValue());
            d6.h hVarA4 = d6.h.a(i29);
            fVar2.getClass();
            mh.c(strValueOf4, null, 0L, null, 0L, null, 0L, hVarA4, 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(xVar, eVar, lVar2, false, i14, 1);
        }
    }
}
