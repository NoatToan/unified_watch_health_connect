package ll;

import c2.q;
import c2.u;
import c2.x2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import ix.h;
import k2.i;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import yz1.y;
import yz1.z;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(r rVar, yz1.d dVar, String str, u4.d dVar2, String str2, Integer num, String str3, String str4, String str5, e23.a aVar, z zVar, String str6, m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        str.getClass();
        str2.getClass();
        zVar.getClass();
        o0 o0VarE = mVar.E(-1919517611);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(dVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(num) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(str3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            obj = str4;
            i15 |= o0VarE.B(obj) ? 8388608 : 4194304;
        } else {
            obj = str4;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(str5) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(aVar) ? 536870912 : 268435456;
        }
        int i16 = (o0VarE.k(zVar.ordinal()) ? 4 : 2) | (o0VarE.B(str6) ? 32 : 16);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            int i17 = i16 << 18;
            o0Var = o0VarE;
            y.c(rVar, dVar, str, null, dVar2, d0.a(d92.b.a(o0VarE).f().b()), 0.0f, 0, null, 0.0f, null, null, null, null, f.c(703020792, new h(str2, num, str3, str5, obj, 17), o0VarE), aVar, zVar, str6, null, null, o0Var, (i15 & 1022) | ((i15 << 3) & 57344), ((i15 >> 12) & 458752) | 24576 | (3670016 & i17) | (i17 & 29360128), 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, dVar, str, dVar2, str2, num, str3, str4, str5, aVar, zVar, str6, i14);
        }
    }

    public static final void b(final int i14, final int i15, final long j8, final long j14, m mVar) {
        o0 o0VarE = mVar.E(-2146130368);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.l(j14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            g gVar = h4.d.a.f81528f;
            r.a aVar = r.S;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
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
            float f14 = y.f(o0VarE);
            q.a(x2.q(u1.n.e(aVar, j8, i.f102406a), f14), o0VarE, 0);
            t4.d dVarA = n5.c.a(i14, o0VarE, i16 & 14);
            g6.f.a aVar3 = g6.f.f75994b;
            i7.a(dVarA, null, x2.q(aVar, f14 * 0.4f), j14, o0VarE, ((i16 << 3) & 7168) | 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, i15, j8, j14) { // from class: ll.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f113331a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f113332b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f113333c;

                {
                    this.f113332b = j8;
                    this.f113333c = j14;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    c.b(this.f113331a, iT, this.f113332b, this.f113333c, (m) obj);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
