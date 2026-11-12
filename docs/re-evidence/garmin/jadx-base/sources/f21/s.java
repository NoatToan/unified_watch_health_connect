package f21;

import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ve;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static final void a(h4.r rVar, v21.e eVar, g21.o oVar, boolean z14, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, gw1.d dVar, p3.m mVar, int i14) {
        v21.e eVar2;
        e23.l lVar4;
        e23.l lVar5;
        gw1.d dVar2;
        oVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1640846435);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        int i16 = i15 | (o0VarE.r(oVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if ((i14 & 1572864) == 0) {
            lVar4 = lVar2;
            i16 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar4 = lVar2;
        }
        if ((i14 & 12582912) == 0) {
            lVar5 = lVar3;
            i16 |= o0VarE.r(lVar5) ? 8388608 : 4194304;
        } else {
            lVar5 = lVar3;
        }
        if ((i14 & 100663296) == 0) {
            dVar2 = dVar;
            i16 |= o0VarE.r(dVar2) ? 67108864 : 33554432;
        } else {
            dVar2 = dVar;
        }
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar, 1.0f);
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            ve.a(rVarF, k2.i.a(j92.b.f97900c.f97911c), jB, 0L, 0.0f, 0.0f, null, z3.f.c(-466837406, new r(eVar2, oVar, aVar, z14, rVar, lVar, lVar4, lVar5, dVar2), o0VarE), o0VarE, 12582912, 120);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(rVar, eVar, oVar, z14, aVar, lVar, lVar2, lVar3, dVar, i14);
        }
    }
}
