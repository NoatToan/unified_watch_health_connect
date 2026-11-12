package x91;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.fe;
import i3.i7;
import kotlin.t1;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.e9;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static final void a(aa1.b bVar, fe feVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        bVar.getClass();
        feVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(851554828);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(1897367463, new wb1.i(21, bVar, aVar), o0VarE), z3.f.c(929406534, new f(feVar, 1), o0VarE), null, null, z3.f.c(-1974476253, new wb1.i(22, bVar, lVar), o0VarE), o0VarE, 197040, 25);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(bVar, feVar, lVar, aVar, i14, 21);
        }
    }

    public static final void b(h4.r rVar, p3.m mVar, int i14) {
        rVar.getClass();
        o0 o0VarE = mVar.E(255484905);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            float f14 = 48;
            float f15 = ((g6.f) j23.t.i(g6.f.a(f14 * f75992b), j23.s.a(g6.f.a(f14), g6.f.a(80)))).f75997a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            g6.f fVarA = g6.f.a(cVar.f97905d * f75992b);
            bVar.getClass();
            g6.f fVarA2 = g6.f.a(cVar.f97905d);
            bVar.getClass();
            float f16 = ((g6.f) j23.t.i(fVarA, j23.s.a(fVarA2, g6.f.a(cVar.f97906e)))).f75997a;
            h4.r rVarE = u1.n.e(l4.k.b(x2.q(rVar, f15), k2.i.f102406a), d92.b.a(o0VarE).e().g(), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            i7.b(e9.a(t62.b.f162798a), y.Q(o0VarE, R.string.personal_records_lbl_single), x2.q(uVar.c(h4.r.S, h4.d.a.f81528f), f16), am.j.d(o0VarE), o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 26);
        }
    }
}
