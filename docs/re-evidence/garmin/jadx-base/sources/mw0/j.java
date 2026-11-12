package mw0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.t;
import b82.d2;
import b82.g1;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.google.android.exoplayer2.audio.WavUtil;
import e2.i0;
import e2.k0;
import f5.z0;
import gl1.y;
import gw0.h0;
import gw0.u;
import h5.e0;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l30.y0;
import l72.j0;
import l72.x0;
import l72.z2;
import lc.u0;
import mt0.s1;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import pv0.w;
import pv0.x;
import u1.a2;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121274a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121274a = iArr;
        }
    }

    public static final void a(List<kw0.d> list, w wVar, String str, p3.m mVar, int i14) {
        w wVar2;
        o0 o0Var;
        List<kw0.d> list2 = list;
        o0 o0VarE = mVar.E(-1373329508);
        int i15 = i14 | (o0VarE.r(list2) ? 4 : 2) | (o0VarE.k(wVar == null ? -1 : wVar.ordinal()) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar, f14, 0.0f, 0.0f, eVar.f97920e, 6);
            String strQ = y.Q(o0VarE, R.string.lbl_overall_impact);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            fVar.getClass();
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131068);
            o0Var = o0VarE;
            list2 = list;
            wVar2 = wVar;
            e(list2, wVar2, o0Var, i15 & 126);
        } else {
            wVar2 = wVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(list2, wVar2, str, i14, 28);
        }
    }

    public static final void b(int i14, t tVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        int i15;
        o0 o0Var;
        kw0.f fVar2;
        boolean z15;
        CustomCombinedChart customCombinedChart;
        kw0.f fVar3;
        p1 p1Var;
        o0 o0VarE = mVar.E(-947723745);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(rVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            aw0.a aVar = new aw0.a(a0.s(o0VarE));
            h4.r rVarE = u1.n.e(a2.b(x2.d(h4.r.S, 1.0f), a2.a(o0VarE), true), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            kw0.f fVarA = kw0.f.a(fVar);
            zv0.d dVar = zv0.d.f207169a;
            l22.a aVarS = a0.s(o0VarE);
            dVar.getClass();
            String strB = zv0.d.b(rVar, aVarS);
            String strQ = y.Q(o0VarE, R.string.common_no_data);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(!z14, o0VarE);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new CustomCombinedChart(context);
                o0VarE.K(objQ2);
            }
            CustomCombinedChart customCombinedChart2 = (CustomCombinedChart) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                customCombinedChart = customCombinedChart2;
                z15 = false;
                hw0.a aVar3 = new hw0.a(context, customCombinedChart, tVar, z14, rVar, true);
                o0VarE.K(aVar3);
                objQ3 = aVar3;
            } else {
                z15 = false;
                customCombinedChart = customCombinedChart2;
            }
            hw0.a aVar4 = (hw0.a) objQ3;
            boolean zR = o0VarE.r(customCombinedChart);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new hn1.j(customCombinedChart, 4);
                o0VarE.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR2 = o0VarE.r(aVar4) | ((i15 & 896) == 256 ? true : z15) | o0VarE.r(fVarA) | o0VarE.B(strQ);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                fVar3 = fVarA;
                p1Var = p1Var2;
                objQ5 = new d(p1Var, rVar, aVar4, fVar3, strQ, 1);
                o0VarE.K(objQ5);
            } else {
                fVar3 = fVarA;
                p1Var = p1Var2;
            }
            int i16 = i15;
            z3.e eVarC = z3.f.c(-336175188, new e(fVar, p1Var, strB, 1, (byte) 0), o0VarE);
            fVar2 = fVar;
            z3.e eVarC2 = z3.f.c(-660183571, new bt1.m(z14, fVar3, fVar, rVar, p1Var, 20), o0VarE);
            int i17 = i16 >> 9;
            o0Var = o0VarE;
            mw0.a.a(str, z14, lVar, (e23.l) objQ5, eVarC, eVarC2, o0Var, (i17 & 14) | 221184 | (i17 & 112), 0);
            a(fVar2.f106948e, fVar2.f106945b, aVar.b(fVar2.f106950g.f106913g, zv0.d.d(rVar, a0.s(o0Var)), fVar2.f106944a), o0Var, z15 ? 1 : 0);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            fVar2 = fVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(tVar, fVar2, rVar, str, z14, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(int i14, t tVar, u uVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        int i15;
        boolean z15;
        String string;
        uVar.getClass();
        rVar.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-110308526);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(uVar) ? 4 : 2) | i14;
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
            i15 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            w13.c cVar = o.f121285d;
            o0VarE.C(1367700961);
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                o oVar = (o) bVar.next();
                zv0.d dVar = zv0.d.f207169a;
                l22.a aVarS = a0.s(o0VarE);
                dVar.getClass();
                oVar.getClass();
                int i16 = zv0.d.a.f207172c[oVar.ordinal()];
                if (i16 == 1) {
                    string = aVarS.getString(R.string.lbl_quantity);
                } else {
                    if (i16 != 2) {
                        u0.r();
                        return;
                    }
                    string = aVarS.getString(R.string.common_type);
                }
                arrayList.add(new g1(string, null, null, null, 14, null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            p1 p1VarC = s9.c.c(uVar.f79771l, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            bVar3.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            boolean zR = o0VarE.r(cVar) | o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new s1(2, cVar, p1VarC);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s1(2, cVar, p1VarC);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(uVar) | o0VarE.r(cVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new ml0.e(9, uVar, cVar);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ml0.e(9, uVar, cVar);
                    o0VarE.K(objQ2);
                }
            }
            z2.a(cVarE, rVarC2, null, 0.0f, aVar4, (e23.l) objQ2, o0VarE, 384);
            o0VarE = o0VarE;
            int i17 = a.f121274a[((h0) p1VarC.getF182175a()).f79610b.ordinal()];
            if (i17 == 1) {
                o0VarE.C(1836319338);
                g.a(((i15 >> 12) & 14) | 24576 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 458752), tVar, str, fVar, o0VarE, rVar, z14);
                o0VarE.g0(false);
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0VarE, 474875202, false);
                }
                o0VarE.C(1836721098);
                if (fVar.f106948e.isEmpty()) {
                    o0VarE.C(1836773705);
                    z15 = false;
                    i(o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(1836848477);
                    b((i15 >> 3) & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, tVar, str, fVar, o0VarE, rVar, z14);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(uVar, tVar, fVar, rVar, str, z14, i14);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(194248982);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            h4.g.b bVar2 = h4.d.a.f81534l;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar, eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14);
            bVar3.getClass();
            h4.r rVarC3 = c2.l.C(rVarC2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            u2 u2Var = u2.f22900a;
            d2 d2Var = d2.f16532a;
            d2Var.c(u2Var, y.Q(o0VarE, R.string.lbl_beverage), null, u2Var.a(aVar, 0.2f, true), null, 0, 0, o0VarE, 6, 58);
            d2Var.c(u2Var, y.Q(o0VarE, R.string.lbl_quantity), null, u2Var.a(aVar, 0.2f, true), aVar2, 0, 0, o0VarE, 24582, 50);
            o0VarE.g0(true);
            g6.f.a aVar4 = g6.f.f75994b;
            v5.a(2, 48, 1, sn.a.c(o0VarE), null, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ml0.a(i14, 22);
        }
    }

    public static final void e(List<kw0.d> list, w wVar, p3.m mVar, int i14) {
        List<pv0.y> listA;
        o0 o0VarE = mVar.E(-1590475727);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.k(wVar == null ? -1 : wVar.ordinal()) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d(o0VarE, 0);
            ArrayList arrayListA = (wVar == null || (listA = x.a(wVar)) == null) ? null : lw0.a.a(listA, list);
            if (arrayListA == null) {
                o0VarE.C(217098968);
                o0VarE.g0(false);
            } else {
                o0VarE.C(217098969);
                int i16 = 0;
                for (Object obj : arrayListA) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    f((pv0.y) obj, i16, list, o0VarE, (i15 << 6) & 896);
                    i16 = i17;
                }
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(list, wVar, i14, 29);
        }
    }

    public static final void f(pv0.y yVar, int i14, List<kw0.d> list, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-1949946565);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(yVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(list) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (yVar != null) {
                o0VarE.C(-1425218855);
                zv0.a aVar = zv0.a.f207158a;
                l22.a aVarS = a0.s(o0VarE);
                aVar.getClass();
                d2.f16532a.g(i14 + 1, 384, 2, null, o0VarE, z3.f.c(-1270657671, new h(list, new x0.a(bw0.b.a(yVar, o0VarE), null), zv0.a.c(yVar, aVarS), yVar, 0), o0VarE));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1424036825);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(yVar, i14, list, i15, 12);
        }
    }

    public static final void g(p1<Boolean> p1Var, String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(581827051);
        int i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            i53.c cVarE = i53.a.e(p13.w.c(new j0(str, null, null, false, p1Var.getF182175a().booleanValue(), 14, null)));
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f82.b bVar2 = new f82.b();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new li0.w(p1Var, 9);
                o0VarE.K(objQ);
            }
            e82.a.b(cVarE, bVar2, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.k0(i14, 5, str, p1Var);
        }
    }

    public static final void h(kw0.f<kw0.e> fVar, p1<Boolean> p1Var, String str, p3.m mVar, int i14) {
        Collection collection;
        List<pv0.y> listA;
        o0 o0VarE = mVar.E(203821455);
        int i15 = (o0VarE.r(fVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 256 : 128);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l22.a aVarS = a0.s(o0VarE);
            w wVar = fVar.f106945b;
            ArrayList<pv0.y> arrayListA = (wVar == null || (listA = x.a(wVar)) == null) ? null : lw0.a.a(listA, fVar.f106948e);
            if (arrayListA == null) {
                o0VarE.C(-1038451281);
                o0VarE.g0(false);
                collection = null;
            } else {
                o0VarE.C(-1038451280);
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListA, 10));
                for (pv0.y yVar : arrayListA) {
                    zv0.a.f207158a.getClass();
                    String strC = zv0.a.c(yVar, aVarS);
                    bw0.a.b.f21564a.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    arrayList.add(new j82.f(strC, new j82.g.a(bw0.b.a(yVar, o0VarE), null), null, 4, null));
                    z14 = false;
                }
                o0VarE.g0(z14);
                collection = arrayList;
            }
            if (collection == null) {
                collection = p13.j0.f134944a;
            }
            ArrayList arrayListD1 = p13.h0.d1(collection);
            if (gl1.d.E(fVar) && p1Var.getF182175a().booleanValue()) {
                o0VarE.C(-1038065051);
                bw0.a.b.f21564a.getClass();
                x1 x1Var3 = p3.n.f135158a;
                gl.c.f77766a.getClass();
                arrayListD1.add(new j82.f(str, new j82.g.l(gl.c.a(o0VarE).f(), null), null, 4, null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1037867085);
                o0VarE.g0(false);
            }
            i53.c cVarE = i53.a.e(arrayListD1);
            g6.f.a aVar = g6.f.f75994b;
            j82.e.h(cVarE, c2.l.A(h4.r.S, 8, 0.0f, 2), null, o0VarE, 48, 4);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(fVar, p1Var, str, i14);
        }
    }

    public static final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(200195960);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            b82.n.c(u62.a.a(t62.a.f162797a), y.Q(o0VarE, R.string.lbl_no_types_logged), y.Q(o0VarE, R.string.msg_no_types_logged), x2.x(aVar, h4.d.a.f81533k, 2), null, o0VarE, 3072, 16);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ml0.a(i14, 23);
        }
    }
}
