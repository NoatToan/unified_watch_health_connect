package zj1;

import b82.y0;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import gt1.t;
import h4.r;
import h5.e0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -705281269);
        int i15 = i14 | (o0VarP.B(str) ? 4 : 2) | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarP), m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = h4.k.c(rVarE, o0VarP);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            u uVar = u.f22885a;
            d.f204911a.getClass();
            y0.d(str, d.f204912b, y.Q(o0VarP, R.string.msg_get_help), y.Q(o0VarP, R.string.msg_safety_features_genesis), z3.f.c(1152191648, new nw0.l(aVar2, aVar, 26), o0VarP), null, o0VarP, (i15 & 14) | 24624, 32);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(str, aVar, aVar2, i14, 10);
        }
    }
}
