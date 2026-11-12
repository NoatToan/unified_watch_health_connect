package ck0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.Locale;
import l72.g3;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final void a(h4.r rVar, b63.o oVar, boolean z14, b63.o oVar2, pi0.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        pi0.a aVar2;
        String strJ;
        o0 o0VarE = mVar.E(26077250);
        int i15 = i14 | 6 | (o0VarE.r(oVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(oVar2) ? 2048 : 1024) | 8192;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                aVar2 = new pi0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            } else {
                o0VarE.e();
                rVar2 = rVar;
                aVar2 = aVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (oVar != null) {
                o0VarE.C(-521396170);
                strJ = y.P(R.string.redeemed_date, new Object[]{aVar2.d(g22.l.h(oVar), qi0.a.YEAR_ABBREV_MONTH_DAY)}, o0VarE);
                o0VarE.g0(false);
            } else if (z14) {
                o0VarE.C(-521168878);
                strJ = y.Q(o0VarE, R.string.lbl_code_revealed).toUpperCase(Locale.ROOT);
                strJ.getClass();
                o0VarE.g0(false);
            } else if (oVar2 != null) {
                o0VarE.C(-521059138);
                strJ = y.P(R.string.expires_date, new Object[]{aVar2.d(g22.l.h(oVar2), qi0.a.YEAR_ABBREV_MONTH_DAY)}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -520864737, R.string.lbl_ongoing, o0VarE, false);
            }
            g3.a(48, 0, rVar2, strJ, o0VarE);
        } else {
            o0VarE.e();
            rVar2 = rVar;
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(rVar2, oVar, oVar2, aVar2, z14, i14, 3);
        }
    }
}
