package ll1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.n1;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-570452705);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = y.a(cVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_error_occurred), gl1.y.Q(o0VarE, R.string.request_error_message), null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, (i15 << 15) & 458752, 200);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(aVar, i14, 0);
        }
    }

    public static final void b(int i14, e23.a aVar, e23.a aVar2, String str, p3.m mVar, boolean z14, boolean z15) {
        int i15;
        boolean z16;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-2137815078);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z16 = z14;
            i15 |= o0VarE.h(z16) ? 32 : 16;
        } else {
            z16 = z14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(z16, z3.f.c(-918838091, new ao1.g(str, aVar, 20), o0VarE), null, null, null, z3.f.c(-491603919, new a42.e(z15, aVar2, 9), o0VarE), o0VarE, ((i15 >> 3) & 14) | 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(i14, aVar, aVar2, str, z14, z15);
        }
    }
}
