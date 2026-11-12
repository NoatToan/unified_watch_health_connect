package y01;

import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    public static final void a(String str, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        String str2;
        String strQ;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        aVar.getClass();
        o0 o0VarE = mVar.E(778627761);
        if ((i14 & 6) == 0) {
            i16 = i14 | (((i15 & 1) == 0 && o0VarE.B(str)) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.c cVar = c2.j.f22696f;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(cVar, h4.d.a.f81536n, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                s62.a.f157643a.getClass();
                b82.n.d(fa.a(t62.b.f162798a), strQ, gl1.y.Q(o0VarE, R.string.request_error_message), null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, ((i16 << 3) & 112) | ((i16 << 12) & 458752), 200);
                o0VarE.g0(true);
                str2 = strQ;
            } else {
                o0VarE.e();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
            }
            strQ = str;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            h4.r rVarD2 = x2.d(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar2 = c2.j.f22696f;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(cVar2, h4.d.a.f81536n, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), strQ, gl1.y.Q(o0VarE, R.string.request_error_message), null, gl1.y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, ((i16 << 3) & 112) | ((i16 << 12) & 458752), 200);
            o0VarE.g0(true);
            str2 = strQ;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(str2, aVar, i14, i15, 20);
        }
    }
}
