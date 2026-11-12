package ln1;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mc;
import i3.mh;
import l72.n2;
import li0.x;
import o53.b0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(km1.c cVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(488415033);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(mcVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(b0Var) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1320770330, new f(cVar, 3), o0VarE);
            b.f113652a.getClass();
            kn1.e.a(R.string.sleep_lbl_awake, mcVar, b0Var, eVarC, b.f113654c, o0VarE, (i15 & 112) | 27648 | (i15 & 896), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(cVar, mcVar, b0Var, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    public static final void b(int i14, String str, String str2, p3.m mVar, boolean z14) {
        o0 o0VarE = mVar.E(578640898);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
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
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                objQ = new n2(str2, 17);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n2(str2, 17);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC2 = v.c((e23.l) objQ, aVar, false);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            if (z14) {
                o0VarE.C(-1379233304);
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarC3 = u2Var.c(c2.l.C(x2.q(aVar, 14), 0.0f, 4, 0.0f, 0.0f, 13), h4.d.a.f81534l);
                Object objQ2 = o0VarE.q();
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new x(21);
                    o0VarE.K(objQ2);
                }
                y0.a(n5.c.a(R.drawable.check, o0VarE, 0), "", v.c((e23.l) objQ2, rVarC3, false), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).f().e()), o0VarE, 48, 56);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1378773636);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h50.d(str, str2, z14, i14, 1);
        }
    }
}
