package p21;

import cn1.o;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import i3.fe;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(q21.d dVar, v21.e eVar, e23.l lVar, e23.l lVar2, e23.a aVar, p pVar, fe feVar, m mVar, int i14) {
        int i15;
        dVar.getClass();
        eVar.getClass();
        feVar.getClass();
        o0 o0VarE = mVar.E(-121201258);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(feVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            z02.d.a(false, z3.f.c(-192327333, new mw1.b(dVar, 25, aVar, pVar), o0VarE), z3.f.c(1946512540, new b(feVar, 1), o0VarE), null, null, z3.f.c(-226902433, new na0.a(dVar, eVar, lVar, lVar2), o0VarE), o0VarE, 197046, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(dVar, eVar, lVar, lVar2, aVar, pVar, feVar, i14, 14);
        }
    }
}
