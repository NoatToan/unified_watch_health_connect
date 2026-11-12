package g82;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import i3.ri;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(String str, ri riVar, boolean z14, String str2, e23.a aVar, String str3, p pVar, m mVar, int i14) {
        String str4;
        int i15;
        String str5;
        e23.a aVar2;
        String str6;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        str3.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(2059310209);
        if ((i14 & 6) == 0) {
            str4 = str;
            i15 = (o0VarE.B(str4) ? 4 : 2) | i14;
        } else {
            str4 = str;
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.r(riVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str5 = str2;
            i16 |= o0VarE.B(str5) ? 2048 : 1024;
        } else {
            str5 = str2;
        }
        if ((i14 & 24576) == 0) {
            aVar2 = aVar;
            i16 |= o0VarE.r(aVar2) ? 16384 : 8192;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 196608) == 0) {
            str6 = str3;
            i16 |= o0VarE.B(str6) ? 131072 : 65536;
        } else {
            str6 = str3;
        }
        int i17 = i16 | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean z15 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 2;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            c0.e(z14, null, null, null, null, f.c(701793113, new d(aVar2, str4, z15, riVar, (p1) objQ, str5, pVar, str6), o0VarE), o0VarE, ((i17 >> 6) & 14) | 196608, 30);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(str, riVar, z14, str2, aVar, str3, pVar, i14);
        }
    }
}
