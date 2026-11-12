package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import ew1.w2;
import i3.e5;
import i3.mh;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import l72.p2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class v1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(hv1.f fVar, e23.l<? super hv1.f, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super hv1.f, Unit> lVar2;
        p3.o0 o0Var;
        p3.p1 p1Var;
        fVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-2077535241);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar, f15, f14, eVar.f97920e, 0.0f, 8);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_cycling).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.average_weekly_time);
            String strA = fVar.a(context);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                p1Var = p1Var2;
                objQ2 = new k(p1Var, 9);
                o0VarE.K(objQ2);
            } else {
                p1Var = p1Var2;
            }
            p3.p1 p1Var3 = p1Var;
            p2Var.h(strQ, strA, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 6, 1012);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var.C(-1372736686);
                boolean z14 = (i16 & 112) == 32;
                Object objQ3 = o0Var.q();
                if (z14 || objQ3 == c2565a) {
                    lVar2 = lVar;
                    objQ3 = new a11.b0(lVar2, p1Var3, 6);
                    o0Var.K(objQ3);
                } else {
                    lVar2 = lVar;
                }
                e23.l lVar3 = (e23.l) objQ3;
                Object objQ4 = o0Var.q();
                if (objQ4 == c2565a) {
                    objQ4 = new k(p1Var3, 10);
                    o0Var.K(objQ4);
                }
                d(fVar, lVar3, (e23.a) objQ4, o0Var, (i16 & 14) | 384);
                o0Var.g0(false);
            } else {
                lVar2 = lVar;
                o0Var.C(-1372435893);
                o0Var.g0(false);
            }
        } else {
            lVar2 = lVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(fVar, lVar2, i14, 18);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r10v17 */
    public static final void b(hv1.j jVar, e23.l<? super hv1.j, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        o13.p pVar;
        p3.o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, 1652991382);
        int i15 = ((i14 & 6) == 0 ? i14 | (o0VarP.k(jVar.ordinal()) ? 4 : 2) : i14) | (o0VarP.r(lVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(hv1.j.ZERO);
                o0VarP.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            o0VarP.C(-613172372);
            hv1.j.f85874d.getClass();
            ?? r14 = 0;
            List<hv1.j> listC = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? hv1.j.a.c() : p13.x.k(hv1.j.ZERO, hv1.j.ONE_TO_FIVE, hv1.j.SIX_TO_TEN, hv1.j.ELEVEN_TO_FIFTEEN, hv1.j.SIXTEEN_TO_TWENTY, hv1.j.TWENTY_ONE_TO_TWENTY_FIVE, hv1.j.TWENTY_FIVE_PLUS);
            int iA = p13.t0.a(p13.y.r(listC, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            for (hv1.j jVar2 : listC) {
                Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
                hv1.j jVar3 = hv1.j.ZERO;
                int i17 = jVar2.f85891c;
                context.getClass();
                if (!((f12.l) KoinJavaComponent.get$default(f12.l.class, r14, r14, 6, r14)).y()) {
                    switch (hv1.j.b.f85892a[jVar2.ordinal()]) {
                        case 1:
                            pVar = new o13.p(jVar3, jVar2.a(context));
                            break;
                        case 2:
                            pVar = new o13.p(hv1.j.ONE_TO_FIVE, jVar2.a(context));
                            break;
                        case 3:
                            pVar = new o13.p(hv1.j.SIX_TO_TEN, jVar2.a(context));
                            break;
                        case 4:
                            pVar = new o13.p(hv1.j.ELEVEN_TO_FIFTEEN, jVar2.a(context));
                            break;
                        case 5:
                            pVar = new o13.p(hv1.j.SIXTEEN_TO_TWENTY, jVar2.a(context));
                            break;
                        case 6:
                            pVar = new o13.p(hv1.j.TWENTY_ONE_TO_TWENTY_FIVE, jVar2.a(context));
                            break;
                        case 7:
                            pVar = new o13.p(hv1.j.TWENTY_FIVE_PLUS, jVar2.a(context));
                            break;
                        default:
                            pVar = new o13.p(Integer.valueOf(i17), jVar2.a(context));
                            break;
                    }
                } else {
                    int i18 = hv1.j.b.f85892a[jVar2.ordinal()];
                    if (i18 != 1) {
                        switch (i18) {
                            case 8:
                                pVar = new o13.p(hv1.j.ONE_TO_EIGHT_KM, jVar2.a(context));
                                break;
                            case 9:
                                pVar = new o13.p(hv1.j.NINE_TO_SIX_TEEN_KM, jVar2.a(context));
                                break;
                            case 10:
                                pVar = new o13.p(hv1.j.SEVEN_TEEN_TO_TWENTY_FOUR_KM, jVar2.a(context));
                                break;
                            case 11:
                                pVar = new o13.p(hv1.j.TWENTY_FIVE_TO_THIRTY_TWO_KM, jVar2.a(context));
                                break;
                            case 12:
                                pVar = new o13.p(hv1.j.THIRTY_THREE_TO_FORTY_KM, jVar2.a(context));
                                break;
                            case 13:
                                pVar = new o13.p(hv1.j.FORTY_PLUS_KM, jVar2.a(context));
                                break;
                            default:
                                pVar = new o13.p(Integer.valueOf(i17), jVar2.a(context));
                                break;
                        }
                    } else {
                        pVar = new o13.p(jVar3, jVar2.a(context));
                    }
                }
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                r14 = 0;
            }
            o0VarP.g0(false);
            int iF0 = p13.h0.f0(linkedHashMap.keySet(), jVar);
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.average_weekly_distance);
            String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_ok);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            z3.e eVarC = z3.f.c(395141106, new t1(linkedHashMap, iF0, p1Var, i16), o0VarP);
            boolean z14 = (i15 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z14 || objQ2 == p3.m.a.f135155b) {
                objQ2 = new a51.k(lVar, p1Var, 14);
                o0VarP.K(objQ2);
            }
            e23.a<Unit> aVar2 = (e23.a) objQ2;
            Object objQ3 = o0VarP.q();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new p0(aVar, 6);
                o0VarP.K(objQ3);
            }
            o0Var = o0VarP;
            c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ3, o0Var, 3078, 0, 212);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(jVar, lVar, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(int i14, e23.l lVar, e23.a aVar, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, 361621045);
        int i17 = 4;
        if ((i15 & 6) == 0) {
            i16 = (o0VarP.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarP.r(lVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarP.r(aVar) ? 256 : 128;
        }
        if (o0VarP.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o13.p pVar = mg0.b.c() ? new o13.p(149L, 779L) : new o13.p(240L, 1200L);
            long jLongValue = ((Number) pVar.f128594a).longValue();
            long jLongValue2 = ((Number) pVar.f128595b).longValue();
            og0.a.f131967a.getClass();
            o13.p pVarZ = og0.a.z(jLongValue);
            o13.p pVarZ2 = og0.a.z(jLongValue2);
            int iIntValue = ((Number) pVarZ.f128594a).intValue();
            int iIntValue2 = ((Number) pVarZ2.f128594a).intValue();
            int iIntValue3 = ((Number) pVarZ.f128595b).intValue();
            int iIntValue4 = ((Number) pVarZ2.f128595b).intValue();
            String strQ = gl1.y.Q(o0VarP, R.string.activities_avg_pace_help_subtitle);
            i53.c cVarH = ds.e0.h(iIntValue, iIntValue2);
            i53.c cVarH2 = ds.e0.h(iIntValue3, iIntValue4);
            Long lValueOf = Long.valueOf(i14);
            String strQ2 = gl1.y.Q(o0VarP, R.string.common_button_done);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            boolean z14 = (i16 & 896) == 256;
            Object objQ = o0VarP.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new p0(aVar, 4);
                o0VarP.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(aVar, 4);
                    o0VarP.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z15 = (i16 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new ci0.f(lVar, i17);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ci0.f(lVar, i17);
                    o0VarP.K(objQ2);
                }
            }
            f10.m.b(strQ, cVarH, cVarH2, lValueOf, strQ2, strQ3, aVar3, (e23.l) objQ2, o0VarP, 0, 0);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s1(i14, lVar, aVar, i15);
        }
    }

    public static final void d(hv1.f fVar, e23.l<? super hv1.f, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1420964942);
        int i15 = 2;
        int i16 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(hv1.f.ZERO_FOUR);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            o0VarE.C(252299766);
            w13.c cVar = hv1.f.f85855h;
            int iA = p13.t0.a(p13.y.r(cVar, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                hv1.f fVar2 = (hv1.f) bVar.next();
                fVar2.getClass();
                o13.p pVar = new o13.p(fVar2, fVar2.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            o0VarE.g0(false);
            int iF0 = p13.h0.f0(linkedHashMap.keySet(), fVar);
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.average_weekly_distance);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            z3.e eVarC = z3.f.c(1671231702, new t1(linkedHashMap, iF0, p1Var, i15), o0VarE);
            boolean z14 = (i16 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == p3.m.a.f135155b) {
                objQ2 = new a51.k(lVar, p1Var, 15);
                o0VarE.K(objQ2);
            }
            e23.a<Unit> aVar2 = (e23.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new p0(aVar, 7);
                o0VarE.K(objQ3);
            }
            c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ3, o0VarE, 3078, 0, 212);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(fVar, lVar, aVar, i14, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(hv1.j jVar, int i14, e23.l lVar, e23.l lVar2, p3.m mVar, int i15) {
        p3.o0 o0Var;
        e23.l lVar3;
        e23.l lVar4;
        p3.p1 p1Var;
        int i16;
        lVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(1542829053);
        int i17 = (o0VarE.k(jVar == null ? -1 : jVar.ordinal()) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16);
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var3 = (p3.p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            int i18 = i17;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar, f15, f14, eVar.f97920e, 0.0f, 8);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_running).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.average_weekly_distance);
            hv1.j.f85874d.getClass();
            String strA = hv1.j.a.a(context, jVar);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new k(p1Var2, 8);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ, strA, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 6, 1012);
            String strQ2 = gl1.y.Q(o0VarE, R.string.activities_avg_pace_help_subtitle);
            tu1.i.f166483a.getClass();
            context.getClass();
            og0.a.f131967a.getClass();
            String strQ3 = og0.a.q(context);
            l3.f23124b.getClass();
            String strG = e5.g(l3.a.e1(i14), " /", strQ3);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                p1Var = p1Var3;
                objQ4 = new k(p1Var, 11);
                o0VarE.K(objQ4);
            } else {
                p1Var = p1Var3;
            }
            p3.p1 p1Var4 = p1Var;
            p2Var.h(strQ2, strG, null, null, null, false, false, null, null, null, (e23.a) objQ4, o0VarE, 0, 6, 1020);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var.C(1976620769);
                i16 = i18;
                boolean z14 = (i16 & 896) == 256;
                Object objQ5 = o0Var.q();
                if (z14 || objQ5 == c2565a) {
                    lVar3 = lVar;
                    objQ5 = new a11.b0(lVar3, p1Var2, 7);
                    o0Var.K(objQ5);
                } else {
                    lVar3 = lVar;
                }
                e23.l lVar5 = (e23.l) objQ5;
                Object objQ6 = o0Var.q();
                if (objQ6 == c2565a) {
                    objQ6 = new k(p1Var2, 12);
                    o0Var.K(objQ6);
                }
                b(jVar, lVar5, (e23.a) objQ6, o0Var, (i16 & 14) | 384);
                o0Var.g0(false);
            } else {
                lVar3 = lVar;
                i16 = i18;
                o0Var.C(1976932133);
                o0Var.g0(false);
            }
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var.C(1976966853);
                boolean z15 = (i16 & 7168) == 2048;
                Object objQ7 = o0Var.q();
                if (z15 || objQ7 == c2565a) {
                    lVar4 = lVar2;
                    objQ7 = new a11.b0(lVar4, p1Var4, 8);
                    o0Var.K(objQ7);
                } else {
                    lVar4 = lVar2;
                }
                e23.l lVar6 = (e23.l) objQ7;
                Object objQ8 = o0Var.q();
                if (objQ8 == c2565a) {
                    objQ8 = new k(p1Var4, 13);
                    o0Var.K(objQ8);
                }
                c(i14, lVar6, (e23.a) objQ8, o0Var, ((i16 >> 3) & 14) | 384);
                o0Var.g0(false);
            } else {
                lVar4 = lVar2;
                o0Var.C(1977243621);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            lVar3 = lVar;
            lVar4 = lVar2;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(jVar, i14, lVar3, lVar4, i15, 3);
        }
    }

    public static final void f(hv1.i iVar, e23.l<? super hv1.i, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        iVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(976390712);
        int i15 = i14 | (o0VarE.k(iVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(hv1.i.NOVICE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            o0VarE.C(2008611964);
            w13.c cVar = hv1.i.f85871g;
            int iA = p13.t0.a(p13.y.r(cVar, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                hv1.i iVar2 = (hv1.i) bVar.next();
                iVar2.getClass();
                o13.p pVar = new o13.p(iVar2, iVar2.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), true));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            o0VarE.g0(false);
            int iF0 = p13.h0.f0(linkedHashMap.keySet(), iVar);
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.average_distance_per_swim);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            z3.e eVarC = z3.f.c(637737820, new t1(linkedHashMap, iF0, p1Var, i16), o0VarE);
            i16 = (i15 & 112) == 32 ? 1 : 0;
            Object objQ2 = o0VarE.q();
            if (i16 != 0 || objQ2 == p3.m.a.f135155b) {
                objQ2 = new a51.k(lVar, p1Var, 13);
                o0VarE.K(objQ2);
            }
            e23.a<Unit> aVar2 = (e23.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new p0(aVar, 5);
                o0VarE.K(objQ3);
            }
            c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar2, strQ3, (e23.a) objQ3, o0VarE, 3078, 0, 212);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(iVar, lVar, aVar, i14, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(hv1.i iVar, w2 w2Var, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        iVar.getClass();
        p3.o0 o0VarE = mVar.E(-2055056149);
        int i15 = i14 | (o0VarE.k(iVar.ordinal()) ? 4 : 2) | (o0VarE.r(w2Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var3 = (p3.p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar2.getClass();
            float f15 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar, f15, f14, eVar.f97920e, 0.0f, 8);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_swimming).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(upperCase, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            p2 p2Var = p2.f111205a;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.average_distance_per_swim);
            String strB = iVar.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), true);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                p1Var = p1Var3;
                objQ2 = new k(p1Var, 14);
                o0VarE.K(objQ2);
            } else {
                p1Var = p1Var3;
            }
            p3.p1 p1Var4 = p1Var;
            p2Var.h(strQ, strB, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 6, 1012);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var.C(-1713002145);
                boolean z14 = (i15 & 112) == 32;
                Object objQ3 = o0Var.q();
                if (z14 || objQ3 == c2565a) {
                    p1Var2 = p1Var4;
                    objQ3 = new cn1.d(14, w2Var, p1Var2);
                    o0Var.K(objQ3);
                } else {
                    p1Var2 = p1Var4;
                }
                e23.l lVar = (e23.l) objQ3;
                Object objQ4 = o0Var.q();
                if (objQ4 == c2565a) {
                    objQ4 = new k(p1Var2, 15);
                    o0Var.K(objQ4);
                }
                f(iVar, lVar, (e23.a) objQ4, o0Var, (i15 & 14) | 384);
                o0Var.g0(false);
            } else {
                o0Var.C(-1712702313);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.c0(iVar, w2Var, i14, 25);
        }
    }
}
