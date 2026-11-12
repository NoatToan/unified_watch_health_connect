package b82;

import c2.x2;
import i3.i7;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb82/d1;", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f16531a = new d1();

    private d1() {
    }

    public final void a(float f14, int i14, float f15, long j8, long j14, p3.m mVar, int i15, int i16) {
        int i17;
        long j15;
        int i18;
        long j16;
        long j17;
        p3.o0 o0VarE = mVar.E(907005487);
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.i(f14) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i19 = i17 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.i(f15) ? 256 : 128);
        int i24 = i16 & 8;
        if (i24 != 0) {
            i18 = i19 | 3072;
            j15 = j8;
        } else {
            j15 = j8;
            i18 = i19 | (o0VarE.l(j15) ? 2048 : 1024);
        }
        int i25 = i18 | (o0VarE.l(j14) ? 16384 : 8192) | (o0VarE.B(this) ? 131072 : 65536);
        if (o0VarE.n(i25 & 1, (74899 & i25) != 74898)) {
            if (i24 != 0) {
                o4.d0.f128823b.getClass();
                j17 = o4.d0.f128826e;
            } else {
                j17 = j15;
            }
            p3.x1 x1Var = p3.n.f135158a;
            u4.d.b bVar = u4.d.f168373k;
            b(f14, n5.e.b(i14, o0VarE, (i25 & 112) | 6), f15, j17, j14, o0VarE, i25 & 524174);
            j16 = j17;
        } else {
            o0VarE.e();
            j16 = j15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(this, f14, i14, f15, j16, j14, i15, i16);
        }
    }

    public final void b(final float f14, final u4.d dVar, final float f15, final long j8, final long j14, p3.m mVar, final int i14) {
        int i15;
        dVar.getClass();
        p3.o0 o0VarE = mVar.E(-74086850);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(dVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.i(f15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.l(j8) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.l(j14) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(l4.k.b(x2.q(aVar, f14), k2.i.f102406a), j14, o4.m1.f128891a);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            i7.b(dVar, null, c2.u.f22885a.c(x2.u(x2.h(aVar, f15), f15), h4.d.a.f81528f), j8, o0VarE, ((i16 >> 3) & 14) | 48 | (i16 & 7168), 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: b82.c1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    d1 d1Var = d1.f16531a;
                    this.f16499a.b(f14, dVar, f15, j8, j14, mVar2, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
