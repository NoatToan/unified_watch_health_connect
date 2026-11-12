package nv;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import gl1.y;
import i3.mc;
import ix.h;
import l72.w;
import ng2.i;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final void a(String str, mc mcVar, e eVar, l lVar, e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1588720192);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(mcVar) ? 32 : 16) | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            w.f111301a.f(y.Q(o0VarE, R.string.lbl_how_to_enter_pairing_mode), null, null, z3.f.c(1945789953, new ll1.g(aVar, 19), o0VarE), aVar, mcVar, false, new nu1.b(29), z3.f.c(782377623, new i(eVar, 1, str, lVar), o0VarE), o0VarE, (57344 & i15) | 806882304 | ((i15 << 12) & 458752), TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(str, mcVar, eVar, lVar, aVar, i14, 27);
        }
    }
}
