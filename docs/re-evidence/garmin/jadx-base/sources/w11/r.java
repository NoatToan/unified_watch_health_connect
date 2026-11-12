package w11;

import a11.v;
import c.w;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.fe;
import i3.r1;
import i3.s1;
import java.util.Arrays;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fe feVar, v21.e eVar, x11.k kVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        o0 o0Var;
        feVar.getClass();
        eVar.getClass();
        kVar.getClass();
        o0 o0VarE = mVar.E(2080384494);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(feVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = aVar;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = aVar;
        }
        if ((196608 & i14) == 0) {
            obj2 = aVar2;
            i15 |= o0VarE.r(obj2) ? 131072 : 65536;
        } else {
            obj2 = aVar2;
        }
        if ((1572864 & i14) == 0) {
            obj3 = aVar3;
            i15 |= o0VarE.r(obj3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            obj3 = aVar3;
        }
        if ((12582912 & i14) == 0) {
            obj4 = lVar;
            i15 |= o0VarE.r(obj4) ? 8388608 : 4194304;
        } else {
            obj4 = lVar;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean z15 = !((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new vd0.c(p1Var, 23);
                o0VarE.K(objQ2);
            }
            w.a(48, 0, (e23.a) objQ2, o0VarE, z15);
            Object obj5 = obj3;
            Object obj6 = obj4;
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(-199515255, new hn1.b(z14, p1Var, 2), o0VarE), z3.f.c(145048104, new p21.b(feVar, 25), o0VarE), null, null, z3.f.c(1178738181, new vz1.j(obj5, kVar, obj, obj2, eVar, obj6, pVar, p1Var, 1), o0VarE), o0Var, 197046, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(feVar, eVar, kVar, z14, aVar, aVar2, aVar3, lVar, pVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    public static final void b(v21.e eVar, v11.b.e eVar2, e23.a aVar, e23.l lVar, h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1450131987);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | 24576;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            b11.v vVar = eVar2.f174676a;
            String strO = eVar.o(vVar.getF14238e().f14254b, vVar.getF14238e().f14256d);
            double dG0 = vVar.G0();
            String strD0 = vVar.D0(o0VarE);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar2, eVar3.f97918c, 0.0f, 0.0f, 0.0f, 14);
            boolean zB = o0VarE.B(strO);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new u91.c(strO, 14);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u91.c(strO, 14);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
            boolean z14 = eVar2.f174677b;
            r1 r1Var = r1.f89474a;
            long jS = hb.a.s(o0VarE);
            long j8 = d92.b.a(o0VarE).f().f63508c;
            r1Var.getClass();
            s1.a(z14, lVar, rVarC3, false, r1.a(jS, j8, o0VarE, 58), o0VarE, (i15 >> 6) & 112, 40);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", eVar.a(Double.valueOf(dG0), strD0, vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), true));
            b92.a aVarB = c0235a.b();
            String strA = eVar.a(Double.valueOf(dG0), strD0, vVar.getTotalCalories(), vVar.z3(), vVar.g4(), vVar.b4(), false);
            String imageUrl = vVar.getImageUrl();
            bVar3.getClass();
            float f14 = eVar3.f97916a;
            int i16 = b92.a.f16960b;
            j21.q.a(strO, strA, aVarB, imageUrl, false, false, aVar, null, f14, o0VarE, 196608 | ((i15 << 12) & 3670016), SyslogConstants.LOG_LOCAL2);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g(eVar, eVar2, aVar, lVar, rVar2, i14);
        }
    }

    public static final String c(v11.d dVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        c3 c3Var = dVar.f174683a;
        String[] strArr = (String[]) dVar.f174684b.toArray(new String[0]);
        return gl1.d.U(c3Var, Arrays.copyOf(strArr, strArr.length), mVar);
    }
}
