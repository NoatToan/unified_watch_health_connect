package l71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import e23.l;
import f72.id;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.h1;
import i3.i7;
import i3.mh;
import i3.v5;
import i71.x;
import kotlin.t1;
import l30.y0;
import o13.p;
import o4.d0;
import o70.n;
import o70.t;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110862a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.GENESIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f110862a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    public static final void a(int i14, int i15, String str, String str2, m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(437772265);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            float f69051c = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97901d.f97903b * f69051c;
            g6.f.a aVar2 = g6.f.f75994b;
            i7.a(n5.c.a(i14, o0VarE, i16 & 14), null, x2.q(aVar, f14), am.j.d(o0VarE), o0VarE, 48, 0);
            boolean z14 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new jl0.e(str2, 18);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl0.e(str2, 18);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((l) objQ, aVar, false);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, (i16 >> 3) & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(i14, i15, str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(x xVar, m mVar, int i14) {
        int i15;
        float f14;
        p pVar;
        String str;
        o0 o0VarE = mVar.E(937771501);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(xVar) : o0VarE.r(xVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() >= 1.5f) {
                f14 = 12;
                g6.f.a aVar = g6.f.f75994b;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97918c;
            }
            float f15 = f14;
            r.a aVar2 = r.S;
            r rVarO = c2.l.o(c2.l.C(aVar2, 0.0f, f15, 0.0f, 0.0f, 13), q1.Min);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f16);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarO, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(-1366202758);
            gg1.o0 o0Var = xVar != null ? xVar.f92022k : null;
            Integer num = xVar != null ? xVar.f92018g : null;
            if (o0Var == null || num == null) {
                pVar = null;
            } else {
                int iIntValue = num.intValue();
                l22.a aVarS = a0.s(o0VarE);
                b61.a aVar4 = b61.a.f16163a;
                Integer numValueOf = Integer.valueOf(iIntValue);
                aVar4.getClass();
                pVar = new p(b61.a.b(aVarS, numValueOf, o0Var, true), b61.a.b(aVarS, Integer.valueOf(iIntValue), o0Var, false));
            }
            o0VarE.g0(false);
            Integer num2 = xVar != null ? xVar.f92019h : null;
            boolean z14 = (pVar != null ? (String) pVar.f128594a : null) != null;
            boolean z15 = num2 != null;
            boolean z16 = z14 && z15;
            if (z14) {
                o0VarE.C(598423050);
                String strG = e5.g(y.Q(o0VarE, R.string.lbl_altitude_acclimation), ", ", pVar != null ? (String) pVar.f128595b : null);
                if (pVar == null || (str = (String) pVar.f128594a) == null) {
                    str = "";
                }
                a(R.drawable.alt_acclimation, 0, str, strG, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(598675793);
                o0VarE.g0(false);
            }
            if (z16) {
                o0VarE.C(598711598);
                g6.f.a aVar5 = g6.f.f75994b;
                v5.a(0.0f, 0, 2, sn.a.c(o0VarE), x2.c(u2Var.c(x2.u(aVar2, 1), h4.d.a.f81534l), 1.0f), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(598991249);
                o0VarE.g0(false);
            }
            if (z15) {
                o0VarE.C(599039981);
                num2.getClass();
                String strP = y.P(R.string.lbl_value_percent, new Object[]{num2}, o0VarE);
                a(R.drawable.brightness, 0, strP, e5.g(y.Q(o0VarE, R.string.lbl_heat_acclimation), ", ", strP), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(599320593);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.l(xVar, i14, 27);
        }
    }

    public static final void c(r rVar, x xVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1938631966);
        int i15 = i14 | 6 | (o0VarE.B(xVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            f(aVar, (xVar != null ? xVar.f92017f : i41.h.f90943f).f90954b, R.string.ohrv_status, 0, o0VarE, 6, 8);
            rVar = aVar;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(rVar, xVar, i14, i16);
        }
    }

    public static final void d(r rVar, x xVar, m mVar, int i14, int i15) {
        int i16;
        r rVar2;
        int i17;
        r rVar3;
        e71.m mVar2;
        Integer num;
        o0 o0VarE = mVar.E(1322213326);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        int i19 = i16 | (o0VarE.B(xVar) ? 32 : 16);
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            if (i18 != 0) {
                rVar3 = r.S;
                i17 = i19;
            } else {
                i17 = i19;
                rVar3 = rVar;
            }
            x1 x1Var = p3.n.f135158a;
            f(rVar3, (xVar == null || (mVar2 = xVar.f92015d) == null || (num = mVar2.f63321a) == null) ? R.string.no_value : num.intValue(), R.string.lbl_training_status_load, 0, o0VarE, i17 & 14, 8);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, xVar, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    public static final void e(r rVar, x xVar, m mVar, int i14) {
        int i15;
        i53.c cVarB;
        n nVar;
        long jH;
        int i16;
        boolean z14;
        long jH2;
        r rVar2 = rVar;
        rVar2.getClass();
        o0 o0VarE = mVar.E(-147072597);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(xVar) : o0VarE.r(xVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.lbl_training_status);
            s62.a.f157643a.getClass();
            u4.d dVarA = id.a(t62.c.f162799a);
            com.garmin.android.apps.connectmobile.performance.model.b bVar = xVar != null ? xVar.f92013b : com.garmin.android.apps.connectmobile.performance.model.b.NO_DATA;
            i53.c<i71.y> cVar = xVar != null ? xVar.f92016e : null;
            if (cVar == null) {
                o0VarE.C(-572703001);
                o0VarE.g0(false);
                cVarB = null;
            } else {
                o0VarE.C(397167706);
                cVarB = k71.b.b(cVar, o0VarE);
                o0VarE.g0(false);
            }
            DateTime dateTimeK = j0.K(xVar != null ? xVar.f92014c : null, "yyyy-MM-dd");
            String strB = dateTimeK != null ? j0.b(dateTimeK, "MMM d", null) : null;
            String strB2 = dateTimeK != null ? j0.b(dateTimeK, "MMMM d", null) : null;
            int i17 = xVar != null ? xVar.f92025n : 0;
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new ho0.a(context, 29);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 29);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            if (xVar != null && !xVar.f92023l) {
                nVar = n.GENESIS;
            } else if (xVar == null) {
                nVar = n.VALID_DATA;
            } else {
                if (!xVar.f92024m && xVar.f92023l) {
                    nVar = n.VALID_DATA;
                } else {
                    nVar = n.EMPTY;
                }
            }
            if (a.f110862a[nVar.ordinal()] == 1) {
                o0VarE.C(-571931100);
                yz1.d dVar = xVar != null ? xVar.f92012a : null;
                d0 d0VarE = t.K0.e(null, o0VarE, 1);
                if (d0VarE == null) {
                    o0VarE.C(397200594);
                    z14 = false;
                    jH2 = fb1.c.h(d92.b.f58623a, o0VarE, false);
                } else {
                    z14 = false;
                    o0VarE.C(397198486);
                    o0VarE.g0(false);
                    jH2 = d0VarE.f128833a;
                }
                String strQ2 = y.Q(o0VarE, R.string.tr_no_status_available_sentence_case);
                String strQ3 = y.Q(o0VarE, R.string.lbl_receive_training_status);
                d0 d0VarA = d0.a(jH2);
                boolean zK = o0VarE.k(i17) | o0VarE.r(context);
                Object objQ2 = o0VarE.q();
                if (zK) {
                    objQ2 = new ag0.a(i17, context, 10);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new ag0.a(i17, context, 10);
                        o0VarE.K(objQ2);
                    }
                }
                yz1.s.d(rVar2, dVar, strQ, strQ2, strQ3, dVarA, d0VarA, 0.0f, null, 0.0f, aVar2, (e23.a) objQ2, null, o0VarE, i15 & 14, 0, 40832);
                o0VarE.g0(false);
                rVar2 = rVar;
            } else {
                int i18 = i15;
                o0VarE.C(-570736887);
                yz1.d dVar2 = xVar != null ? xVar.f92012a : null;
                d0 d0VarE2 = t.K0.e(null, o0VarE, 1);
                if (d0VarE2 == null) {
                    o0VarE.C(397239058);
                    jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
                } else {
                    o0VarE.C(397236950);
                    o0VarE.g0(false);
                    jH = d0VarE2.f128833a;
                }
                d0 d0VarA2 = d0.a(jH);
                z3.e eVarC = z3.f.c(420589122, new jt1.m(xVar, 24, aVar2, bVar), o0VarE);
                z3.e eVarC2 = z3.f.c(589840707, new gp.k(cVarB, strB, strB2), o0VarE);
                boolean zR2 = o0VarE.r(context);
                Object objQ3 = o0VarE.q();
                if (zR2) {
                    i16 = 0;
                    objQ3 = new g(context, i16);
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        i16 = 0;
                        objQ3 = new g(context, i16);
                        o0VarE.K(objQ3);
                    } else {
                        i16 = 0;
                    }
                }
                rVar2 = rVar;
                yz1.s.b(rVar2, dVar2, strQ, null, dVarA, d0VarA2, 0.0f, 0, null, 0.0f, null, null, eVarC, eVarC2, false, false, aVar2, (e23.a) objQ3, null, o0VarE, i18 & 14, 3456, 315336);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, xVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void f(final r rVar, final int i14, final int i15, int i16, m mVar, final int i17, final int i18) {
        int i19;
        int i24;
        int i25;
        boolean z14;
        o0 o0Var;
        p2 p2VarI0;
        int i26;
        String strQ;
        String strQ2;
        String strQ3;
        boolean zB;
        Object objQ;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        o0 o0VarE = mVar.E(1997882550);
        if ((i17 & 6) == 0) {
            i19 = i17 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i19 = i17;
        }
        int i27 = i19 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128);
        if ((i18 & 8) == 0) {
            i24 = i16;
            int i28 = o0VarE.k(i24) ? 2048 : 1024;
            i25 = i27 | i28;
            if ((i25 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i25 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0 || o0VarE.o0()) {
                    if ((i18 & 8) != 0) {
                        i26 = i15;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    strQ = y.Q(o0VarE, i14);
                    strQ2 = y.Q(o0VarE, i15);
                    strQ3 = y.Q(o0VarE, i26);
                    zB = o0VarE.B(strQ3) | o0VarE.B(strQ);
                    objQ = o0VarE.q();
                    if (zB) {
                        objQ = new cn1.j(strQ3, strQ, 8);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new cn1.j(strQ3, strQ, 8);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarC2 = v.c((l) objQ, rVar, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarC2, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                    d6.p.f57793b.getClass();
                    int i29 = d6.p.f57795d;
                    int i30 = i26;
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, i29, false, 1, 0, null, x0VarB, o0VarE, 0, 24960, 110590);
                    fVar.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, i29, false, 1, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
                    o0Var = o0VarE;
                    o0Var.g0(true);
                    i24 = i30;
                } else {
                    o0VarE.e();
                    int i34 = i18 & 8;
                }
                i26 = i24;
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                strQ = y.Q(o0VarE, i14);
                strQ2 = y.Q(o0VarE, i15);
                strQ3 = y.Q(o0VarE, i26);
                zB = o0VarE.B(strQ3) | o0VarE.B(strQ);
                objQ = o0VarE.q();
                if (zB) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new cn1.j(strQ3, strQ, 8);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new cn1.j(strQ3, strQ, 8);
                    o0VarE.K(objQ);
                }
                r rVarC3 = v.c((l) objQ, rVar, false);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC3, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                d6.p.f57793b.getClass();
                int i210 = d6.p.f57795d;
                int i35 = i26;
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, i210, false, 1, 0, null, x0VarB2, o0VarE, 0, 24960, 110590);
                fVar2.getClass();
                mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, i210, false, 1, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
                o0Var = o0VarE;
                o0Var.g0(true);
                i24 = i35;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final int i36 = i24;
                p2VarI0.f135219d = new e23.p() { // from class: l71.f
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h.f(rVar, i14, i15, i36, (m) obj, p0.t(i17 | 1), i18);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 = i16;
        i25 = i27 | i28;
        if ((i25 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i25 & 1, z14)) {
            o0VarE.G0();
            if ((i17 & 1) != 0) {
                if ((i18 & 8) != 0) {
                    i26 = i15;
                } else {
                    i26 = i24;
                }
            } else if ((i18 & 8) != 0) {
                i26 = i15;
            } else {
                i26 = i24;
            }
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            strQ = y.Q(o0VarE, i14);
            strQ2 = y.Q(o0VarE, i15);
            strQ3 = y.Q(o0VarE, i26);
            zB = o0VarE.B(strQ3) | o0VarE.B(strQ);
            objQ = o0VarE.q();
            if (zB) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new cn1.j(strQ3, strQ, 8);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new cn1.j(strQ3, strQ, 8);
                o0VarE.K(objQ);
            }
            r rVarC4 = v.c((l) objQ, rVar, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC4, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0VarB3 = d92.c.b(j92.f.f97931h, o0VarE);
            d6.p.f57793b.getClass();
            int i211 = d6.p.f57795d;
            int i37 = i26;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, i211, false, 1, 0, null, x0VarB3, o0VarE, 0, 24960, 110590);
            fVar3.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, i211, false, 1, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 24960, 110590);
            o0Var = o0VarE;
            o0Var.g0(true);
            i24 = i37;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i38 = i24;
            p2VarI0.f135219d = new e23.p() { // from class: l71.f
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h.f(rVar, i14, i15, i38, (m) obj, p0.t(i17 | 1), i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void g(com.garmin.android.apps.connectmobile.performance.model.b bVar, x xVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1235047072);
        int i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.B(xVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = bVar == com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
            e71.m.a aVar = e71.m.f63320c;
            int i16 = i15 & 112;
            j(null, xVar, o0VarE, i16, 1);
            d(null, xVar, o0VarE, i16, 1);
            if (z14) {
                o0VarE.C(-1697199326);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1697237766);
                c(null, xVar, o0VarE, i16);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(bVar, xVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    public static final void h(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2107830539);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new ku1.a(aVar, 22);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ku1.a(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            r rVarD2 = w.d(rVarD, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarC = c2.l.C(rVarD2, f14, eVar.f97922g, f15, 0.0f, 8);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            float f16 = eVar.f97918c;
            bVar.getClass();
            r rVarC3 = c2.l.C(aVar2, 0.0f, f16, 0.0f, eVar.f97918c, 5);
            String strQ = y.Q(o0VarE, R.string.lbl_receive_training_status);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new g(context, i16);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new g(context, i16);
                    o0VarE.K(objQ2);
                }
            }
            l71.a.f110840a.getClass();
            h1.c((e23.a) objQ2, null, false, null, null, null, null, null, l71.a.f110841b, o0VarE, C.ENCODING_PCM_32BIT, 510);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0389  */
    /* JADX WARN: Code duplicated, block: B:102:0x0390  */
    /* JADX WARN: Code duplicated, block: B:103:0x0394  */
    /* JADX WARN: Code duplicated, block: B:108:0x03af  */
    /* JADX WARN: Code duplicated, block: B:110:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0408  */
    /* JADX WARN: Code duplicated, block: B:123:0x0435  */
    /* JADX WARN: Code duplicated, block: B:125:0x043c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0440  */
    /* JADX WARN: Code duplicated, block: B:131:0x045b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0473  */
    /* JADX WARN: Code duplicated, block: B:135:0x0477  */
    /* JADX WARN: Code duplicated, block: B:137:0x0488  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0207  */
    /* JADX WARN: Code duplicated, block: B:65:0x0254  */
    /* JADX WARN: Code duplicated, block: B:66:0x0268  */
    /* JADX WARN: Code duplicated, block: B:68:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x028d  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x0320  */
    /* JADX WARN: Code duplicated, block: B:89:0x0327  */
    /* JADX WARN: Code duplicated, block: B:90:0x032b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0346  */
    /* JADX WARN: Code duplicated, block: B:98:0x0367  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v18 */
    public static final void i(com.garmin.android.apps.connectmobile.performance.model.b bVar, x xVar, m mVar, int i14) {
        com.garmin.android.apps.connectmobile.performance.model.b bVar2;
        ?? r14;
        o0 o0Var;
        j92.b bVar3;
        h5.g.a.f fVar;
        u2 u2Var;
        float f14;
        h4.g.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        b0 b0Var;
        j92.b bVar4;
        j92.f fVar2;
        r.a aVar2;
        o0 o0Var2;
        float f15;
        o0 o0Var3;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        u2 u2Var2;
        h5.g.a.f fVar3;
        e0.a aVar3;
        h5.g.a.b bVar5;
        h4.g.a aVar4;
        Throwable th3;
        boolean z14;
        boolean z15;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        z zVarA3;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        s2 s2VarA;
        int iHashCode4;
        i2 i2VarA3;
        r rVarC4;
        int i15;
        boolean z16;
        s2 s2VarA2;
        int iHashCode5;
        i2 i2VarA4;
        r rVarC5;
        Integer num;
        o0 o0Var4;
        o0 o0Var5;
        x xVar2 = xVar;
        o0 o0VarE = mVar.E(-701407830);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.k(bVar.ordinal()) ? 4 : 2) | (o0VarE.B(xVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z17 = bVar == com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
            boolean z18 = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b() >= 1.5f;
            r.a aVar5 = r.S;
            r rVarF = x2.f(aVar5, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f16 = eVar2.f97920e;
            float f17 = eVar2.f97920e;
            r rVarA = c2.l.A(rVarF, 0.0f, f16, 1);
            c2.j jVar = c2.j.f22691a;
            bVar6.getClass();
            float f18 = eVar2.f97921f;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f18);
            h4.d.f81522a.getClass();
            h4.g.b bVar7 = h4.d.a.f81533k;
            s2 s2VarA3 = q2.a(iVarI, bVar7, o0VarE, 0);
            int iHashCode6 = Long.hashCode(o0VarE.U);
            i2 i2VarA5 = o0VarE.a0();
            r rVarC6 = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA3, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA5, o0VarE);
            h5.g.a.b bVar8 = h5.g.a.f81813j;
            if (o0VarE.T) {
                bVar3 = bVar6;
            } else {
                bVar3 = bVar6;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode6))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC6, o0VarE);
                u2Var = u2.f22900a;
                if (z18) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.6f;
                }
                r rVarA2 = u2Var.a(aVar5, f14, true);
                c2.j.k kVar = c2.j.f22694d;
                aVar = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g2, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar8);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0Var = b0.f22601a;
                bVar4 = bVar3;
                k71.e.a(null, n5.a.a(o0VarE, bVar.f39937d), n5.a.a(o0VarE, bVar.f39936c), bVar.f39940g, yz1.y.f(o0VarE), o0VarE, 0);
                bVar4.getClass();
                r rVarC7 = c2.l.C(aVar5, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                String strQ = y.Q(o0VarE, bVar.f39938e);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                d6.p.f57793b.getClass();
                aVar2 = aVar5;
                mh.c(strQ, rVarC7, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarB, o0VarE, 0, 24960, 110588);
                o0Var2 = o0VarE;
                if (z17) {
                    f15 = 1.0f;
                    o0Var2.C(910349874);
                    o0Var2.g0(false);
                } else {
                    o0Var2.C(909909736);
                    if (xVar2 != null) {
                        num = xVar2.f92020i;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        o0Var2.C(909948857);
                        o0Var2.g0(false);
                    } else {
                        o0Var2.C(909948858);
                        String strP = y.P(R.string.lbl_load_focus_dash_placeholder, new Object[]{y.Q(o0Var2, num.intValue())}, o0Var2);
                        fVar2.getClass();
                        mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var2), o0Var2, 0, 0, 131070);
                        Unit unit = Unit.INSTANCE;
                        o0Var4.g0(false);
                    }
                    if (z18) {
                        o0Var4 = o0Var2;
                        o0Var5 = o0Var4;
                        o0Var5 = o0Var2;
                        f15 = 1.0f;
                        o0Var5.C(910293330);
                        o0Var5.g0(false);
                    } else {
                        o0Var4 = o0Var2;
                        o0Var5 = o0Var4;
                        o0Var5 = o0Var2;
                        o0Var5.C(910228943);
                        f15 = 1.0f;
                        c2.l.f(b0Var.a(aVar2, 1.0f, true), o0Var5);
                        o0Var5.g0(false);
                    }
                    e71.m.a aVar7 = e71.m.f63320c;
                    b(xVar2, o0Var5, (i16 >> 3) & 14);
                    o0Var5.g0(false);
                    o0Var3 = o0Var5;
                }
                if (z18) {
                    o0Var3 = o0Var2;
                    r rVarC8 = c2.l.C(ds.e0.g(o0Var3, 910415191, aVar2, f15, bVar4), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    bVar4.getClass();
                    aVar4 = aVar;
                    zVarA3 = c2.y.a(c2.j.i(f17), aVar4, o0Var3, 0);
                    iHashCode3 = Long.hashCode(o0Var3.U);
                    i2VarA2 = o0Var3.a0();
                    rVarC3 = k.c(rVarC8, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        aVar3 = aVar6;
                        o0Var3.M(aVar3);
                    } else {
                        aVar3 = aVar6;
                        o0Var3.c();
                    }
                    eVar = eVar3;
                    b4.c(eVar, zVarA3, o0Var3);
                    c1623g = c1623g2;
                    b4.c(c1623g, i2VarA2, o0Var3);
                    if (o0Var3.T && s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                        bVar5 = bVar8;
                    } else {
                        bVar5 = bVar8;
                        v.h.A(iHashCode3, o0Var3, iHashCode3, bVar5);
                    }
                    fVar3 = fVar;
                    b4.c(fVar3, rVarC3, o0Var3);
                    r rVarF2 = x2.f(aVar2, f15);
                    bVar4.getClass();
                    s2VarA = q2.a(c2.j.i(f17), bVar7, o0Var3, 0);
                    iHashCode4 = Long.hashCode(o0Var3.U);
                    i2VarA3 = o0Var3.a0();
                    rVarC4 = k.c(rVarF2, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar3);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar, s2VarA, o0Var3);
                    b4.c(c1623g, i2VarA3, o0Var3);
                    if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode4))) {
                        v.h.A(iHashCode4, o0Var3, iHashCode4, bVar5);
                    }
                    b4.c(fVar3, rVarC4, o0Var3);
                    u2Var2 = u2Var;
                    r rVarA3 = u2Var2.a(aVar2, f15, true);
                    e71.m.a aVar8 = e71.m.f63320c;
                    i15 = i16 & 112;
                    z16 = false;
                    j(rVarA3, xVar2, o0Var3, i15, 0);
                    d(u2Var2.a(aVar2, f15, true), xVar2, o0Var3, i15, 0);
                    o0Var3.g0(true);
                    if (z17) {
                        th3 = null;
                        z14 = true;
                        o0Var3.C(-171637542);
                        o0Var3.g0(false);
                    } else {
                        o0Var3.C(-171788419);
                        r rVarF3 = x2.f(aVar2, f15);
                        s2VarA2 = q2.a(c2.j.f22692b, bVar7, o0Var3, 0);
                        iHashCode5 = Long.hashCode(o0Var3.U);
                        i2VarA4 = o0Var3.a0();
                        rVarC5 = k.c(rVarF3, o0Var3);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var3.z();
                        if (o0Var3.T) {
                            o0Var3.M(aVar3);
                        } else {
                            o0Var3.c();
                        }
                        b4.c(eVar, s2VarA2, o0Var3);
                        b4.c(c1623g, i2VarA4, o0Var3);
                        if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode5))) {
                            v.h.A(iHashCode5, o0Var3, iHashCode5, bVar5);
                        }
                        b4.c(fVar3, rVarC5, o0Var3);
                        xVar2 = xVar;
                        th3 = null;
                        c(null, xVar2, o0Var3, i15);
                        z14 = true;
                        o0Var3.g0(true);
                        z16 = false;
                        o0Var3.g0(false);
                    }
                    o0Var3.g0(z14);
                    o0Var3.g0(z16);
                } else {
                    o0Var3 = o0Var2;
                    aVar2 = aVar2;
                    eVar = eVar3;
                    c1623g = c1623g2;
                    u2Var2 = u2Var;
                    fVar3 = fVar;
                    aVar3 = aVar6;
                    bVar5 = bVar8;
                    aVar4 = aVar;
                    th3 = null;
                    z14 = true;
                    o0Var3.C(911302194);
                    o0Var3.g0(false);
                }
                o0Var3.g0(z14);
                if (z18) {
                    bVar2 = bVar;
                    z15 = z14;
                    o0Var3.C(565713788);
                    o0Var3.g0(false);
                } else {
                    o0Var3.C(565484109);
                    r rVarA4 = u2Var2.a(aVar2, 0.4f, z14);
                    g6.f.a aVar9 = g6.f.f75994b;
                    zVarA2 = c2.y.a(c2.j.i(12), aVar4, o0Var3, 6);
                    iHashCode2 = Long.hashCode(o0Var3.U);
                    i2VarA1 = o0Var3.a0();
                    rVarC2 = k.c(rVarA4, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw th3;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar3);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar, zVarA2, o0Var3);
                    b4.c(c1623g, i2VarA1, o0Var3);
                    if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var3, iHashCode2, bVar5);
                    }
                    b4.c(fVar3, rVarC2, o0Var3);
                    e71.m.a aVar10 = e71.m.f63320c;
                    bVar2 = bVar;
                    g(bVar2, xVar2, o0Var3, i16 & 126);
                    z15 = true;
                    o0Var3.g0(true);
                    o0Var3.g0(false);
                }
                o0Var3.g0(z15);
                o0Var = o0Var3;
                r14 = z15;
            }
            v.h.A(iHashCode6, o0VarE, iHashCode6, bVar8);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC6, o0VarE);
            u2Var = u2.f22900a;
            if (z18) {
                f14 = 1.0f;
            } else {
                f14 = 0.6f;
            }
            r rVarA5 = u2Var.a(aVar5, f14, true);
            c2.j.k kVar2 = c2.j.f22694d;
            aVar = h4.d.a.f81536n;
            zVarA = c2.y.a(kVar2, aVar, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g2, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar8);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar8);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0Var = b0.f22601a;
            bVar4 = bVar3;
            k71.e.a(null, n5.a.a(o0VarE, bVar.f39937d), n5.a.a(o0VarE, bVar.f39936c), bVar.f39940g, yz1.y.f(o0VarE), o0VarE, 0);
            bVar4.getClass();
            r rVarC9 = c2.l.C(aVar5, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            String strQ2 = y.Q(o0VarE, bVar.f39938e);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            d6.p.f57793b.getClass();
            aVar2 = aVar5;
            mh.c(strQ2, rVarC9, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 1, 0, null, x0VarB2, o0VarE, 0, 24960, 110588);
            o0Var2 = o0VarE;
            if (z17) {
                o0Var2.C(909909736);
                if (xVar2 != null) {
                    num = xVar2.f92020i;
                } else {
                    num = null;
                }
                if (num == null) {
                    o0Var2.C(909948857);
                    o0Var2.g0(false);
                } else {
                    o0Var2.C(909948858);
                    String strP2 = y.P(R.string.lbl_load_focus_dash_placeholder, new Object[]{y.Q(o0Var2, num.intValue())}, o0Var2);
                    fVar2.getClass();
                    mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var2), o0Var2, 0, 0, 131070);
                    Unit unit2 = Unit.INSTANCE;
                    o0Var4.g0(false);
                }
                if (z18) {
                    o0Var4 = o0Var2;
                    o0Var5 = o0Var4;
                    o0Var5 = o0Var2;
                    o0Var5.C(910228943);
                    f15 = 1.0f;
                    c2.l.f(b0Var.a(aVar2, 1.0f, true), o0Var5);
                    o0Var5.g0(false);
                } else {
                    o0Var4 = o0Var2;
                    o0Var5 = o0Var4;
                    o0Var5 = o0Var2;
                    f15 = 1.0f;
                    o0Var5.C(910293330);
                    o0Var5.g0(false);
                }
                e71.m.a aVar11 = e71.m.f63320c;
                b(xVar2, o0Var5, (i16 >> 3) & 14);
                o0Var5.g0(false);
                o0Var3 = o0Var5;
            } else {
                f15 = 1.0f;
                o0Var2.C(910349874);
                o0Var2.g0(false);
            }
            if (z18) {
                o0Var3 = o0Var2;
                r rVarC10 = c2.l.C(ds.e0.g(o0Var3, 910415191, aVar2, f15, bVar4), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                bVar4.getClass();
                aVar4 = aVar;
                zVarA3 = c2.y.a(c2.j.i(f17), aVar4, o0Var3, 0);
                iHashCode3 = Long.hashCode(o0Var3.U);
                i2VarA2 = o0Var3.a0();
                rVarC3 = k.c(rVarC10, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    aVar3 = aVar6;
                    o0Var3.M(aVar3);
                } else {
                    aVar3 = aVar6;
                    o0Var3.c();
                }
                eVar = eVar3;
                b4.c(eVar, zVarA3, o0Var3);
                c1623g = c1623g2;
                b4.c(c1623g, i2VarA2, o0Var3);
                if (o0Var3.T) {
                    bVar5 = bVar8;
                    v.h.A(iHashCode3, o0Var3, iHashCode3, bVar5);
                } else {
                    bVar5 = bVar8;
                    v.h.A(iHashCode3, o0Var3, iHashCode3, bVar5);
                }
                fVar3 = fVar;
                b4.c(fVar3, rVarC3, o0Var3);
                r rVarF4 = x2.f(aVar2, f15);
                bVar4.getClass();
                s2VarA = q2.a(c2.j.i(f17), bVar7, o0Var3, 0);
                iHashCode4 = Long.hashCode(o0Var3.U);
                i2VarA3 = o0Var3.a0();
                rVarC4 = k.c(rVarF4, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar3);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar, s2VarA, o0Var3);
                b4.c(c1623g, i2VarA3, o0Var3);
                if (o0Var3.T) {
                    v.h.A(iHashCode4, o0Var3, iHashCode4, bVar5);
                } else {
                    v.h.A(iHashCode4, o0Var3, iHashCode4, bVar5);
                }
                b4.c(fVar3, rVarC4, o0Var3);
                u2Var2 = u2Var;
                r rVarA6 = u2Var2.a(aVar2, f15, true);
                e71.m.a aVar12 = e71.m.f63320c;
                i15 = i16 & 112;
                z16 = false;
                j(rVarA6, xVar2, o0Var3, i15, 0);
                d(u2Var2.a(aVar2, f15, true), xVar2, o0Var3, i15, 0);
                o0Var3.g0(true);
                if (z17) {
                    o0Var3.C(-171788419);
                    r rVarF5 = x2.f(aVar2, f15);
                    s2VarA2 = q2.a(c2.j.f22692b, bVar7, o0Var3, 0);
                    iHashCode5 = Long.hashCode(o0Var3.U);
                    i2VarA4 = o0Var3.a0();
                    rVarC5 = k.c(rVarF5, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar3);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar, s2VarA2, o0Var3);
                    b4.c(c1623g, i2VarA4, o0Var3);
                    if (o0Var3.T) {
                        v.h.A(iHashCode5, o0Var3, iHashCode5, bVar5);
                    } else {
                        v.h.A(iHashCode5, o0Var3, iHashCode5, bVar5);
                    }
                    b4.c(fVar3, rVarC5, o0Var3);
                    xVar2 = xVar;
                    th3 = null;
                    c(null, xVar2, o0Var3, i15);
                    z14 = true;
                    o0Var3.g0(true);
                    z16 = false;
                    o0Var3.g0(false);
                } else {
                    th3 = null;
                    z14 = true;
                    o0Var3.C(-171637542);
                    o0Var3.g0(false);
                }
                o0Var3.g0(z14);
                o0Var3.g0(z16);
            } else {
                o0Var3 = o0Var2;
                aVar2 = aVar2;
                eVar = eVar3;
                c1623g = c1623g2;
                u2Var2 = u2Var;
                fVar3 = fVar;
                aVar3 = aVar6;
                bVar5 = bVar8;
                aVar4 = aVar;
                th3 = null;
                z14 = true;
                o0Var3.C(911302194);
                o0Var3.g0(false);
            }
            o0Var3.g0(z14);
            if (z18) {
                o0Var3.C(565484109);
                r rVarA7 = u2Var2.a(aVar2, 0.4f, z14);
                g6.f.a aVar13 = g6.f.f75994b;
                zVarA2 = c2.y.a(c2.j.i(12), aVar4, o0Var3, 6);
                iHashCode2 = Long.hashCode(o0Var3.U);
                i2VarA1 = o0Var3.a0();
                rVarC2 = k.c(rVarA7, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar3);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar, zVarA2, o0Var3);
                b4.c(c1623g, i2VarA1, o0Var3);
                if (o0Var3.T) {
                    v.h.A(iHashCode2, o0Var3, iHashCode2, bVar5);
                } else {
                    v.h.A(iHashCode2, o0Var3, iHashCode2, bVar5);
                }
                b4.c(fVar3, rVarC2, o0Var3);
                e71.m.a aVar14 = e71.m.f63320c;
                bVar2 = bVar;
                g(bVar2, xVar2, o0Var3, i16 & 126);
                z15 = true;
                o0Var3.g0(true);
                o0Var3.g0(false);
            } else {
                bVar2 = bVar;
                z15 = z14;
                o0Var3.C(565713788);
                o0Var3.g0(false);
            }
            o0Var3.g0(z15);
            o0Var = o0Var3;
            r14 = z15;
        } else {
            bVar2 = bVar;
            r14 = 1;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(bVar2, xVar2, i14, r14);
        }
    }

    public static final void j(r rVar, x xVar, m mVar, int i14, int i15) {
        int i16;
        r rVar2;
        int i17;
        r rVar3;
        Integer num;
        o0 o0VarE = mVar.E(-426313725);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        int i19 = i16 | (o0VarE.B(xVar) ? 32 : 16);
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            if (i18 != 0) {
                rVar3 = r.S;
                i17 = i19;
            } else {
                i17 = i19;
                rVar3 = rVar;
            }
            x1 x1Var = p3.n.f135158a;
            f(rVar3, (xVar == null || (num = xVar.f92021j) == null) ? R.string.no_value : num.intValue(), R.string.lbl_vo2_max, R.string.lbl_max_oxygen_rate, o0VarE, i17 & 14, 0);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar2, xVar, i14, i15, 1);
        }
    }
}
