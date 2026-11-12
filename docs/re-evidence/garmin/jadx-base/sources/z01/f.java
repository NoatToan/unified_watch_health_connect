package z01;

import a42.g0;
import b11.o;
import b82.g1;
import b82.k1;
import c2.b0;
import c2.j;
import c2.l;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.f0;
import g21.u;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import o4.m1;
import o72.a3;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import r1.q2;
import tn.k;
import u1.m0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(v21.e eVar, u uVar, f0 f0Var, String str, f0 f0Var2, u uVar2, f0 f0Var3, i53.c<o> cVar, m mVar, int i14) {
        eVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(1399409661);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(uVar) ? 32 : 16) | (o0VarE.B(f0Var) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.B(f0Var2) ? 16384 : 8192) | (o0VarE.B(uVar2) ? 131072 : 65536) | (o0VarE.B(f0Var3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(cVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            if (uVar == null) {
                o0VarE.C(-1433882601);
                int i16 = i15 << 3;
                d.a(null, eVar, y.Q(o0VarE, R.string.calories_and_macros), f0Var, f0Var3, false, o0VarE, (i16 & 7168) | (i16 & 112) | 196608 | ((i15 >> 6) & 57344), 1);
                o0VarE.g0(false);
            } else if (str == null || f0Var2 == null || uVar2 == null) {
                o0VarE.C(-1433467201);
                int i17 = i15 << 6;
                int i18 = ((i15 << 3) & 112) | (i17 & 7168) | (i17 & 57344);
                int i19 = i15 >> 3;
                c.a(null, eVar, y.Q(o0VarE, R.string.todays_goals), uVar, f0Var, f0Var3, cVar, false, o0VarE, i18 | (458752 & i19) | (i19 & 3670016), 129);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1432974425);
                r.a aVar = r.S;
                r rVarE = u1.n.e(aVar, k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                float f15 = eVar2.f97920e;
                r rVarA = l.A(rVarE, 0.0f, f14, 1);
                j.i iVarG = q2.g(bVar, j.f22691a, f15);
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarA, o0VarE);
                g.V.getClass();
                e0.a aVar2 = g.a.f81805b;
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
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                i53.f fVarA = i53.a.a(new g1(y.Q(o0VarE, R.string.todays_goals), null, null, null, 14, null), new g1(y.Q(o0VarE, R.string.meal_goals), null, null, null, 14, null));
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1 n1Var = (n1) objQ;
                int intValue = n1Var.getIntValue();
                r rVarA2 = m0.a(aVar, true, null);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new yq.d(15);
                    o0VarE.K(objQ2);
                }
                r rVarC2 = v.c((e23.l) objQ2, rVarA2, false);
                bVar.getClass();
                r rVarA3 = l.A(rVarC2, f15, 0.0f, 2);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new a3(n1Var, 22);
                    o0VarE.K(objQ3);
                }
                k1.a(fVarA, intValue, rVarA3, null, 0.0f, (e23.l) objQ3, o0VarE, 199680, 16);
                r1.b.a(Integer.valueOf(n1Var.getIntValue()), null, null, h4.d.a.f81525c, "GoalsChartSection", null, z3.f.c(463189468, new g0(eVar, uVar, f0Var, f0Var3, cVar, str, uVar2, f0Var2, 5), o0VarE), o0VarE, 1600512, 38);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vz1.j(eVar, uVar, f0Var, str, f0Var2, uVar2, f0Var3, (i53.c) cVar, i14);
        }
    }
}
