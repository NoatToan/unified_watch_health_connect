package ct1;

import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.h7;
import i3.mh;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(r rVar, int i14, boolean z14, boolean z15, e23.a aVar, p3.m mVar, int i15) {
        r rVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1670450161);
        int i16 = i15 | 6 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String strP = y.P(i14 == 1 ? R.string.likes_count_singular_lowercase : R.string.likes_count_lowercase, new Object[]{Integer.valueOf(i14)}, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            if (z15) {
                o0VarE.C(1515355188);
                h7.a(aVar, null, false, null, null, z3.f.c(-2123490798, new an1.i(z14, 9), o0VarE), o0VarE, ((i16 >> 12) & 14) | 1572864, 62);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1515696343);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar2, i14, z14, z15, aVar, i15);
        }
    }
}
