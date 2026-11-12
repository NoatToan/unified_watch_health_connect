package w52;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 {
    public static final void a(final v0 v0Var, double d14, double d15, p3.m mVar, final int i14) {
        int i15;
        final double d16;
        final double d17;
        p3.o0 o0VarE = mVar.E(1916843100);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.m(d14) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.m(d15) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(d14, d15, o0VarE, (i15 >> 3) & 126);
            d17 = d14;
            d16 = d15;
        } else {
            d16 = d15;
            d17 = d14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.n0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q0.a(v0Var, d17, d16, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final double d14, final double d15, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-771651619);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.m(d14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.m(d15) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            l72.x0 x0Var = l72.x0.f111346a;
            bVar.getClass();
            x0Var.e(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), z3.f.c(-1017417938, new e23.q() { // from class: w52.o0
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    t2 t2Var = (t2) obj;
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        l72.x0 x0Var2 = l72.x0.f111346a;
                        String strValueOf = String.valueOf((float) d14);
                        String strQ = gl1.y.Q(mVar2, R.string.activity_aerobic_title);
                        int i16 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                        x0Var2.a(i16, 124, null, t2Var, null, null, strValueOf, strQ, null, null, mVar2);
                        x0Var2.a(i16, 124, null, t2Var, null, null, String.valueOf((float) d15), gl1.y.Q(mVar2, R.string.activity_anaerobic_title), null, null, mVar2);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: w52.p0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    q0.b(d14, d15, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
