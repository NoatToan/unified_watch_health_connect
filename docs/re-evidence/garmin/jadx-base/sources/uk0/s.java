package uk0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.f1;
import h5.e0;
import i3.e5;
import i3.mh;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import t21.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:66:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, Double d14, String str, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        h4.r rVar3;
        long jB;
        o13.p pVar;
        o0 o0VarE = mVar.E(-752764915);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i18 = i16 | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean z14 = d14 != null && d14.doubleValue() >= 100.0d;
            if (d14 == null) {
                o0VarE.C(-1117539647);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1117539646);
                double dDoubleValue = d14.doubleValue();
                if (z14) {
                    o0VarE.C(1679026382);
                    gl.c.f77766a.getClass();
                    jB = gl.c.a(o0VarE).h();
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1679094768);
                    gl.c.f77766a.getClass();
                    jB = gl.c.a(o0VarE).b();
                    o0VarE.g0(false);
                }
                f1.j(x2.f(h4.r.S, 1.0f), 0, false, jB, (float) ((Number) j23.t.j(Double.valueOf(dDoubleValue), new j23.d(0.0d, 100.0d))).doubleValue(), 0.0f, 0.0f, o0VarE, 6, 102);
                o0VarE.g0(false);
            }
            if (str == null) {
                o0VarE.C(-1117078801);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1117078800);
                if (z14) {
                    o0VarE.C(1959788359);
                    i53.f fVarA = i53.a.a(str, gl1.y.Q(o0VarE, R.string.exceeded_max_use));
                    i.f171830a.getClass();
                    fVarA.getClass();
                    pVar = new o13.p(h0.k0(fVarA, " • ", null, null, null, 62), h0.k0(fVarA, null, null, null, null, 63));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1959977738);
                    o0VarE.g0(false);
                    pVar = new o13.p(str, str);
                }
                String str2 = (String) pVar.f128594a;
                String str3 = (String) pVar.f128595b;
                if (d14 != null) {
                    o0VarE.C(1960075977);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar2, j92.b.f97899b.f97918c, o0VarE, false);
                } else {
                    o0VarE.C(1960172232);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar3, j92.b.f97899b.f97917b, o0VarE, false);
                }
                h4.r.a aVar4 = h4.r.S;
                boolean zB = o0VarE.B(str3);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new u91.c(str3, 4);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new u91.c(str3, 4);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar4, false);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(rVar3, d14, str, i14, i15);
        }
    }
}
