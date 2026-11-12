package u11;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.g;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import j92.e;
import j92.f;
import li0.h0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import tn.k;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(int i14, r rVar, String str, m mVar) {
        o0 o0Var;
        r rVar2;
        String str2;
        r rVar3;
        String strQ;
        o0 o0VarE = mVar.E(269055151);
        int i15 = i14 | 22;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = r.S;
                strQ = y.Q(o0VarE, R.string.msg_center_window_barcode);
            } else {
                o0VarE.e();
                rVar3 = rVar;
                strQ = str;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.x(x2.f(rVar3, 1.0f), null, 3), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            g.a aVar = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
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
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            l.f(x2.h(aVar3, eVar.f97920e), o0VarE);
            bVar2.getClass();
            r rVarA = l.A(aVar3, eVar.f97920e, 0.0f, 2);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(f.f97933j, o0VarE);
            d6.h.f57752b.getClass();
            r rVar4 = rVar3;
            String str3 = strQ;
            mh.c(str3, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            str2 = str3;
            o0Var = o0VarE;
            bVar2.getClass();
            e5.t(aVar3, eVar.f97923h, o0Var, true);
            rVar2 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            str2 = str;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar2, str2, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    public static final void b(r rVar, e23.l lVar, float f14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1410401475);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).c().d();
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean zL = ((i15 & 896) == 256) | ((i15 & 112) == 32) | o0VarE.l(jD);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new qq1.g(f14, jD, lVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new qq1.g(f14, jD, lVar);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarD, (e23.l) objQ, o0VarE, 6);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(rVar, lVar, f14, i14);
        }
    }
}
