package b12;

import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import j23.t;
import kotlin.t1;
import o4.q1;
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
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(float f14, long j8, Integer num, float f15, m mVar, int i14) {
        float f16;
        o0 o0VarE = mVar.E(-1412170970);
        int i15 = i14 | (o0VarE.i(f14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.B(num) ? 256 : 128) | 3072;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                f16 = 0.6f;
            } else {
                o0VarE.e();
                f16 = f15;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarQ = x2.q(aVar, f14);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarQ, o0VarE);
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
            u uVar = u.f22885a;
            y0.a(n5.c.a(R.drawable.badge_level_background, o0VarE, 0), y.Q(o0VarE, R.string.default_image_view_content_description), x2.d(aVar, 1.0f), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, j8), o0VarE, 384, 56);
            long jY = ((g6.c) o0VarE.A(t1.f91490h)).Y(((g6.f) t.b(g6.f.a(f14 * f16), g6.f.a(1))).f75997a);
            String strValueOf = String.valueOf(num);
            d92.b.f58623a.getClass();
            long jC = d92.b.a(o0VarE).k().c();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97934k;
            long j14 = d92.b.a(o0VarE).f().f63509d;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            n4.c.a aVar3 = n4.c.f123541b;
            f15 = f16;
            mh.c(strValueOf, null, jC, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, 0L, jY, null, null, 0L, new q1(j14, jFloatToRawIntBits, f16 * 2, null), null, 0, 0L, null, null, 16769021), o0VarE, 0, 0, 131066);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        float f17 = f15;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p82.d(f14, j8, num, f17, i14);
        }
    }
}
