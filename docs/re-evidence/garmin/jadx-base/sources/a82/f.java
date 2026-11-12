package a82;

import android.annotation.SuppressLint;
import c2.l2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import h4.r;
import i3.b1;
import i3.h1;
import k2.i;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(final p pVar, final String str, @SuppressLint({"ModifierParameter"}) final r rVar, final boolean z14, final b1 b1Var, final long j8, final long j14, final l2 l2Var, final e23.a aVar, m mVar, final int i14) {
        int i15;
        r rVar2;
        b1 b1Var2;
        l2 l2Var2;
        e23.a aVar2;
        o0 o0VarE = mVar.E(-1688799735);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            rVar2 = rVar;
            i15 |= o0VarE.B(rVar2) ? 256 : 128;
        } else {
            rVar2 = rVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            b1Var2 = b1Var;
            i15 |= o0VarE.B(b1Var2) ? 16384 : 8192;
        } else {
            b1Var2 = b1Var;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            l2Var2 = l2Var;
            i15 |= o0VarE.B(l2Var2) ? 8388608 : 4194304;
        } else {
            l2Var2 = l2Var;
        }
        if ((100663296 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            long jC = z14 ? j8 : d0.c(0.5f, j8, 14);
            long jC2 = z14 ? j14 : d0.c(0.5f, j14, 14);
            g6.f.a aVar3 = g6.f.f75994b;
            int i16 = i15;
            int i17 = i16 >> 3;
            h1.b(aVar2, rVar2, z14, i.a(4), b1Var2, u1.n.a(1, jC), l2Var2, z3.f.c(1857160535, new d(pVar, jC2, str), o0VarE), o0VarE, ((i16 >> 24) & 14) | C.ENCODING_PCM_32BIT | (i17 & 112) | (i17 & 896) | (i16 & 57344) | (i16 & 29360128));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: a82.e
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.a(pVar, str, rVar, z14, b1Var, j8, j14, l2Var, aVar, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
