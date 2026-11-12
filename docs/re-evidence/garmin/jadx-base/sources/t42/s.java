package t42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import i3.mh;
import l72.x0;
import p3.o0;
import p3.p2;
import p3.x1;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final void a(t2 t2Var, String str, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(907482677);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (str != null) {
                o0VarE.C(-2002596627);
                eVar.invoke(str, o0VarE, Integer.valueOf((i15 >> 3) & 126));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2002558931);
                x0.f111346a.h(t2Var, o0VarE, (i15 & 14) | (x0.f111348c << 3));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(t2Var, str, eVar, i14, 3);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, p3.m mVar, int i14) {
        boolean z14;
        str.getClass();
        o0 o0VarE = mVar.E(-972695117);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(str5) ? 16384 : 8192) | (o0VarE.B(str6) ? 131072 : 65536) | (o0VarE.B(str7) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = y.Q(o0VarE, R.string.golf_stats_averages_label);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            mh.c(strQ, c2.l.y(aVar, 16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 131068);
            x0 x0Var = x0.f111346a;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar, f14, 0.0f, f15, eVar.f97920e, 2);
            h4.r.a aVar3 = aVar;
            z3.e eVarC = z3.f.c(-140657908, new q(context, str, str2, str3), o0VarE);
            int i16 = (x0.f111348c << 6) | 48;
            j92.e eVar2 = eVar;
            x0Var.e(rVarC, eVarC, o0VarE, i16, 0);
            int i17 = i16;
            if (str4 == null && str5 == null) {
                o0VarE.C(586063855);
                o0VarE.g0(false);
                z14 = false;
            } else {
                o0VarE = o0VarE;
                o0VarE.C(585311392);
                bVar.getClass();
                float f16 = eVar2.f97920e;
                bVar.getClass();
                float f17 = eVar2.f97920e;
                bVar.getClass();
                h4.r rVarC2 = c2.l.C(aVar3, f16, 0.0f, f17, eVar2.f97920e, 2);
                aVar3 = aVar3;
                eVar2 = eVar2;
                z14 = false;
                x0Var.e(rVarC2, z3.f.c(591681703, new q(str4, str5, str2, context, 1), o0VarE), o0VarE, i17, 0);
                i17 = i17;
                o0VarE.g0(false);
            }
            if (str6 == null && str7 == null) {
                o0VarE.C(586940783);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(586179671);
                bVar.getClass();
                float f18 = eVar2.f97920e;
                bVar.getClass();
                float f19 = eVar2.f97920e;
                bVar.getClass();
                x0Var.e(c2.l.C(aVar3, f18, 0.0f, f19, eVar2.f97920e, 2), z3.f.c(113342046, new q(str6, str7, str2, context, 2), o0VarE), o0VarE, i17, 0);
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ne1.b(str, str2, str3, str4, str5, str6, str7, i14);
        }
    }
}
