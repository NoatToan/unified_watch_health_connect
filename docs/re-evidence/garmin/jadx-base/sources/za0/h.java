package za0;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(String str, String str2, u4.d dVar, String str3, String str4, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1792817963);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_change_permissions_anytime);
            String strQ2 = y.Q(o0VarE, R.string.lbl_skip_button);
            g.f203243a.getClass();
            int i16 = i15 >> 3;
            o0Var = o0VarE;
            da0.p.b(str, str2, dVar, str3, strQ, str4, aVar2, false, strQ2, aVar, false, null, null, false, z14, aVar3, null, null, null, null, null, g.f203244b, o0Var, (i15 & 8190) | ((i15 << 3) & 458752) | (i16 & 3670016) | ((i15 << 9) & 1879048192), (57344 & i16) | ((i15 >> 9) & 458752), 384, 4144256);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(str, str2, dVar, str3, str4, z14, aVar, aVar2, aVar3, i14);
        }
    }
}
