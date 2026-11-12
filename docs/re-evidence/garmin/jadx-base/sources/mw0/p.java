package mw0;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.t;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import gl1.y;
import h5.e0;
import java.util.List;
import lc.u0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121286a;

        static {
            int[] iArr = new int[pv0.r.values().length];
            try {
                iArr[pv0.r.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pv0.r.OVERNIGHT_HRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pv0.r.OVERNIGHT_STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f121286a = iArr;
        }
    }

    public static final void a(int i14, t tVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        int i15;
        qz.c gVar;
        o0 o0VarE = mVar.E(1296151476);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(rVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.common_no_data);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            pi0.e eVar = new pi0.e(context);
            int i16 = a.f121286a[rVar.ordinal()];
            if (i16 == 1) {
                gVar = new iw0.g(eVar, context, tVar, z14);
            } else if (i16 == 2) {
                gVar = new iw0.d(context, eVar, tVar, z14);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                gVar = new iw0.f(eVar, context, tVar, z14);
            }
            qz.c cVar = gVar;
            jw0.b bVar = new jw0.b(customLineChart, fVar, tVar, z14);
            k00.f fVar2 = new k00.f(customLineChart, rVar == pv0.r.OVERNIGHT_HRV);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                tz.a aVar = new tz.a(customLineChart, cVar, bVar, fVar2, null, null, 48, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            tz.a aVar2 = (tz.a) objQ2;
            boolean zR = o0VarE.r(customLineChart);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new b40.a(customLineChart, 6);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR2 = o0VarE.r(aVar2) | o0VarE.r(fVar) | o0VarE.B(strQ);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new ls0.h(aVar2, 8, fVar, strQ);
                o0VarE.K(objQ4);
            }
            mw0.a.a(str, z14, lVar, (e23.l) objQ4, z3.f.c(1509704593, new i1(fVar, rVar, z14, 25), o0VarE), null, o0VarE, (i15 & 14) | 24576 | ((i15 >> 9) & 112), 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(str, tVar, fVar, rVar, z14, i14, 3);
        }
    }

    public static final void b(int i14, t tVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        kw0.f fVar2;
        float f14;
        List<kw0.a> list;
        kw0.a aVar;
        rVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-706123420);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14 | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.k(rVar.ordinal()) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            if (!z14 || (list = fVar.f106949f) == null || (aVar = (kw0.a) h0.d0(list)) == null || !aVar.f106905c) {
                o0VarE.C(627641254);
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarE = u1.n.e(a2.b(aVar2, a2.a(o0VarE), true), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                if (z14) {
                    fVar2 = fVar;
                    o0VarE.C(630323576);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(630026627);
                    int i16 = i15 << 3;
                    a(((i15 >> 9) & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i15 & 57344), tVar, str, fVar, o0VarE, rVar, z14);
                    fVar2 = fVar;
                    o0VarE.g0(false);
                }
                zv0.d dVar = zv0.d.f207169a;
                l22.a aVarS = a0.s(o0VarE);
                dVar.getClass();
                String strD = zv0.d.d(rVar, aVarS);
                kw0.c cVar = fVar2.f106950g;
                String str2 = fVar2.f106944a;
                boolean z15 = !z14;
                if (z14) {
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97921f;
                } else {
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97918c;
                }
                c.b(cVar, str2, strD, c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), z15, o0VarE, 0);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(627333734);
                int i17 = ((i15 >> 9) & 14) | 221184;
                int i18 = i15 << 3;
                g.a(i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168), tVar, str, fVar, o0VarE, rVar, true);
                o0VarE.g0(false);
                fVar2 = fVar;
            }
        } else {
            fVar2 = fVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(tVar, fVar2, rVar, str, z14, i14, 2);
        }
    }
}
