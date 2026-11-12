package k41;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.j;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e32.o;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i41.h;
import i41.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import m92.h0;
import o4.d0;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f102878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f102879b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f102878a = 10;
        f102879b = 20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a0 a0Var, h41.g gVar, m mVar, int i14) {
        int i15;
        r.a aVar;
        boolean z14;
        i53.c cVarH;
        boolean z15;
        float f14;
        float f15;
        o92.b bVarA;
        boolean z16;
        float f16;
        h41.e eVar;
        o0 o0VarE = mVar.E(1326908827);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (o0VarE.B(gVar) ? 32 : 16) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.no_value);
            String strQ2 = y.Q(o0VarE, (gVar != null ? gVar.f81619b : h.f90943f).f90954b);
            if ((gVar != null ? gVar.f81620c : null) != null) {
                o0VarE.C(-937855727);
                strQ = new n41.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).b(gVar.f81620c.intValue());
                o0VarE.g0(false);
            } else {
                o0VarE.C(-937765982);
                o0VarE.g0(false);
            }
            String str = strQ;
            int i17 = (gVar == null || (eVar = gVar.f81621d) == null) ? h41.e.OVERNIGHT.f81612a : eVar.f81612a;
            r.a aVar2 = r.S;
            r rVarA = a0Var.a(x2.f(aVar2, 1.0f), 1.0f, true);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h hVar = gVar != null ? gVar.f81619b : null;
            if (hVar == null || hVar == h.f90945h || hVar == h.f90951n || hVar == h.f90943f) {
                i15 = i17;
                aVar = aVar2;
                z14 = true;
                o0VarE.C(-1146800211);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                g02.c.a(strQ2, null, 0L, null, 0, false, 1, d92.c.b(j92.f.f97930g, o0VarE), 0.0d, o0VarE, 1572864, 318);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1147481002);
                h4.g.b bVar2 = h4.d.a.f81534l;
                j.f22691a.getClass();
                s2 s2VarA = q2.a(j.f22692b, bVar2, o0VarE, 48);
                int i18 = i17;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = k.c(aVar2, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                h hVar2 = gVar != null ? gVar.f81619b : null;
                if (hVar2 == null) {
                    o0VarE.C(1744866706);
                    o0VarE.g0(false);
                    bVarA = null;
                } else {
                    o0VarE.C(333380687);
                    bVarA = i.a(hVar2, o0VarE);
                    o0VarE.g0(false);
                }
                if (bVarA != null) {
                    o0VarE.C(1744934907);
                    if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5f) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97905d;
                    } else {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f16 = j92.b.f97901d.f97903b;
                    }
                    z16 = false;
                    o92.d.a(bVarA, x2.q(aVar2, f16), o0VarE, 0);
                    g6.f.a aVar4 = g6.f.f75994b;
                    l.f(x2.u(aVar2, 8), o0VarE);
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(1745187650);
                    o0VarE.g0(false);
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                i15 = i18;
                aVar = aVar2;
                z14 = true;
                g02.c.a(strQ2, null, 0L, null, 0, false, 1, d92.c.b(j92.f.f97930g, o0VarE), 0.0d, o0VarE, 1572864, 318);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131070);
            String strQ3 = y.Q(o0VarE, i15);
            fVar2.getClass();
            mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            if (gVar == null) {
                o0VarE.C(-936396930);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-936396929);
                d92.b.f58625c.getClass();
                float f17 = 1.0f;
                r rVarH = x2.h(x2.f(l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), 1.0f), ((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5f ? f102879b : f102878a);
                o0VarE.C(-593619965);
                h hVar3 = h.f90946i;
                Float fValueOf = Float.valueOf(0.125f);
                float f18 = 0.0f;
                i53.f<o13.u> fVarA = i53.a.a(new o13.u(hVar3, fValueOf, new j23.e(0.0f, 0.125f)), new o13.u(h.f90949l, fValueOf, new j23.e(0.125f, 0.25f)), new o13.u(h.f90944g, Float.valueOf(0.5f), new j23.e(0.25f, 0.75f)), new o13.u(h.f90950m, Float.valueOf(0.25f), new j23.e(0.75f, 1.0f)));
                ArrayList arrayList = new ArrayList();
                Float f19 = gVar.f81622e;
                float f22 = 100.0f;
                if (f19 == null || f19.floatValue() < 0.0f) {
                    o0VarE.C(2143248935);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(fVarA, 10));
                    int i19 = 0;
                    for (Object obj : fVarA) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            x.q();
                            throw null;
                        }
                        float fFloatValue = ((Number) ((o13.u) obj).f128606b).floatValue();
                        h0.e.a aVar5 = new h0.e.a(i19, 100.0f);
                        f02.e.f67730a.getClass();
                        arrayList2.add(new h0.e.c(aVar5, f02.e.a(o0VarE), Float.valueOf(fFloatValue), null));
                        i19 = i24;
                    }
                    cVarH = m92.u.h(24.0f, arrayList2);
                    z15 = false;
                    o0VarE.g0(false);
                    x1 x1Var2 = n.f135158a;
                } else {
                    o0VarE.C(2143579519);
                    o0VarE.g0(false);
                    h hVar4 = gVar.f81619b;
                    for (o13.u uVar2 : fVarA) {
                        h hVar5 = (h) uVar2.f128605a;
                        float fFloatValue2 = ((Number) uVar2.f128606b).floatValue();
                        j23.f fVar3 = (j23.f) uVar2.f128607c;
                        if (hVar4 == hVar5) {
                            o0VarE.C(1782703143);
                            f14 = f17;
                            if (s.e(f19, ((Number) fVar3.getStart()).floatValue())) {
                                o0VarE.C(1783613148);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(1783237397);
                                float fFloatValue3 = (f19.floatValue() - ((Number) fVar3.getStart()).floatValue()) - (0.02f / 2);
                                h0.e.a aVar6 = new h0.e.a(f18, f22);
                                h.f90942e.getClass();
                                arrayList.add(new h0.e.c(aVar6, h.a.a(hVar5, o0VarE), Float.valueOf(fFloatValue3), null));
                                o0VarE.g0(false);
                                f18 += f14;
                            }
                            float f24 = f18 + f14;
                            h0.e.a aVar7 = new h0.e.a(f18, 150.0f);
                            h.f90942e.getClass();
                            arrayList.add(new h0.e.c(aVar7, h.a.a(hVar5, o0VarE), Float.valueOf(0.02f), null));
                            f15 = f24 + f14;
                            arrayList.add(new h0.e.c(new h0.e.a(f24, 100.0f), h.a.a(hVar5, o0VarE), Float.valueOf(s.e(f19, ((Number) fVar3.getStart()).floatValue()) ? (((Number) fVar3.b()).floatValue() - f19.floatValue()) - 0.02f : (((Number) fVar3.b()).floatValue() - f19.floatValue()) - (0.02f / 2)), null));
                            o0VarE.g0(false);
                        } else {
                            f14 = f17;
                            o0VarE.C(1784428541);
                            f15 = f18 + f14;
                            h0.e.a aVar8 = new h0.e.a(f18, 100.0f);
                            h.f90942e.getClass();
                            arrayList.add(new h0.e.c(aVar8, h.a.a(hVar5, o0VarE), Float.valueOf(fFloatValue2), null));
                            o0VarE.g0(false);
                        }
                        f18 = f15;
                        f17 = f14;
                        f22 = 100.0f;
                    }
                    z15 = false;
                    cVarH = m92.u.h(24.0f, arrayList);
                    x1 x1Var3 = n.f135158a;
                }
                o0VarE.g0(z15);
                m92.u.c(rVarH, cVarH, yz1.y.l(o0VarE), y.Q(o0VarE, R.string.common_no_data), o0VarE, 0);
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(a0Var, gVar, i14, 29);
        }
    }

    public static final void b(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1144458816);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(aVar, j92.b.f97899b.f97918c);
            String strQ = y.Q(o0VarE, R.string.hrv_score_card_no_data_state_message);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k11.c(i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    public static final void c(r rVar, h41.g gVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        z zVar;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1858175729);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            f02.e.f67730a.getClass();
            long jB = f02.e.b(o0VarE);
            String strQ = y.Q(o0VarE, R.string.ohrv_status);
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            String strQ3 = y.Q(o0VarE, R.string.txt_empty_page_no_data);
            String strQ4 = y.Q(o0VarE, (gVar != null ? gVar.f81619b : h.f90943f).f90954b);
            if ((gVar != null ? gVar.f81620c : null) != null) {
                o0VarE.C(920859965);
                strQ2 = new n41.a((Context) o0VarE.A(y3Var)).b(gVar.f81620c.intValue());
                o0VarE.g0(false);
            } else {
                o0VarE.C(920949710);
                o0VarE.g0(false);
            }
            if ((gVar != null ? gVar.f81620c : null) != null) {
                o0VarE.C(921086575);
                strQ4 = oi0.c.P(x.k(strQ4, d53.u.v(strQ2, y.Q(o0VarE, R.string.lbl_ms), y.Q(o0VarE, R.string.lbl_milliseconds), false), y.P(R.string.lbl_day_count_average, new Object[]{Integer.valueOf(o.f62807j.f62819a)}, o0VarE)));
                o0VarE.g0(false);
            } else {
                o0VarE.C(921404945);
                o0VarE.g0(false);
            }
            String strP = y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{strQ}, o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new ho0.a(context, 13);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 13);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            yz1.d dVar = gVar != null ? gVar.f81618a : null;
            t tVar = t.A;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (gVar != null) {
                i53.c<h41.f> cVar = gVar.f81623f;
                if (!cVar.isEmpty() && !cVar.isEmpty()) {
                    Iterator<h41.f> it = cVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zVar = z.EMPTY;
                            break;
                        } else if (it.next() != null) {
                            zVar = z.VALID_DATA;
                            break;
                        }
                    }
                } else {
                    zVar = z.EMPTY;
                    break;
                }
            } else {
                zVar = z.EMPTY;
            }
            z zVar2 = zVar;
            String strQ5 = y.Q(o0VarE, R.string.hrv_score_card_no_data_state_message);
            z3.e eVarC = z3.f.c(-348729293, new e(0, (Object) strQ4, (Object) gVar), o0VarE);
            z3.e eVarC2 = z3.f.c(1940747124, new c42.e(gVar, strQ3, strP, jB, rVar), o0VarE);
            boolean zR2 = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new ho0.a(context, 14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ho0.a(context, 14);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            rVar2 = rVar;
            yz1.y.d(rVar2, dVar, strQ, strQ, dVarB, d0VarE, 0.0f, 0, null, 0.0f, null, null, false, 0L, null, eVarC, eVarC2, aVar2, (e23.a) objQ2, aVar2, zVar2, strQ5, null, null, o0Var, i16 & 14, 1769472, 0, 12615616);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, gVar, i14, 1);
        }
    }
}
