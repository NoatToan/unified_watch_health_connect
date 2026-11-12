package w51;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1070872729);
        int i15 = i14 | 2 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                str = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
            } else {
                o0VarE.e();
            }
            int i16 = i15 & (-15);
            String str2 = str;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(cVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), str2, gl1.y.Q(o0VarE, R.string.request_error_message), null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, (i16 << 12) & 458752, 200);
            o0VarE.g0(true);
            str = str2;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uu1.i(str, aVar, i14, 3);
        }
    }
}
