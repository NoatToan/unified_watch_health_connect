package fp0;

import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f21.a0;
import gl1.y;
import h4.r;
import h5.e0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import r70.q;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    public static final void a(r rVar, n70.a aVar, q qVar, p3.m mVar, int i14) {
        int i15;
        String strP;
        rVar.getClass();
        o0 o0VarE = mVar.E(490237932);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int size = aVar.f123996a.size();
            if (size == 1) {
                o0VarE.C(1789655679);
                strP = y.P(R.string.lbl_num_item_singular, new Object[]{Integer.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1789747904);
                strP = y.P(R.string.lbl_num_items_plural, new Object[]{Integer.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            }
            String strP2 = oi0.c.P(x.k(y.Q(o0VarE, R.string.lbl_carousel), strP));
            if (size > 0) {
                o0VarE.C(1790088315);
                boolean zB = o0VarE.B(strP2);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new c(strP2, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(strP2, 1);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC = v.c((e23.l) objQ, rVar, false);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarC, o0VarE);
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
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                int i16 = i15 << 3;
                s70.b.a(b0.f22601a, rVar, aVar, qVar, o0VarE, (i16 & 112) | 518 | (i16 & 896) | (i16 & 7168));
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1790298774);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(rVar, aVar, qVar, i14, 13);
        }
    }
}
