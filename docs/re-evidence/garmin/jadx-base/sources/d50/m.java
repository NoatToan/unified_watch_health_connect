package d50;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import l72.r1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public static final void a(String str, Double d14, boolean z14, ab1.g gVar, w01.c cVar, e23.l<? super String, Unit> lVar, e23.l<? super Long, Unit> lVar2, e23.l<? super Long, Unit> lVar3, p<? super Long, ? super Long, Unit> pVar, e23.l<? super w01.c, Unit> lVar4, p3.m mVar, int i14) {
        int i15;
        Double d15;
        e23.l<? super Long, Unit> lVar5;
        e23.l<? super Long, Unit> lVar6;
        p<? super Long, ? super Long, Unit> pVar2;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-1378637089);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            d15 = d14;
            i15 |= o0VarE.B(d15) ? 32 : 16;
        } else {
            d15 = d14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            lVar5 = lVar2;
            i15 |= o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar5 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            lVar6 = lVar3;
            i15 |= o0VarE.r(lVar6) ? 8388608 : 4194304;
        } else {
            lVar6 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        } else {
            pVar2 = pVar;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(1795388281);
                r1.b(y.Q(o0VarE, R.string.lbl_strategy), z3.f.c(-778966571, new c42.d(d15, gVar, lVar5, lVar6, pVar2, str, lVar, cVar, lVar4), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1797581283);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(str, d14, z14, gVar, cVar, lVar, lVar2, lVar3, pVar, lVar4, i14);
        }
    }
}
