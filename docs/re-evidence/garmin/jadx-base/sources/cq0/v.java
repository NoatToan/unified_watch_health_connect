package cq0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import java.util.List;
import java.util.Locale;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class v {
    public static final void a(String str, String str2, String str3, List list, String str4, e23.a aVar, boolean z14, p3.m mVar, int i14) {
        String str5;
        String strQ;
        o0 o0VarE = mVar.E(-1167499471);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | 128 | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.B(str4) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                strQ = gl1.y.Q(o0VarE, R.string.incident_detection_msg_if_you_do_not_need_help);
            } else {
                o0VarE.e();
                strQ = str3;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(-1273069285, new u(str4, aVar, z14), o0VarE), z3.f.c(825548257, new a42.y(str, str2, strQ, list, 14), o0VarE), o0VarE, 54);
            str5 = strQ;
        } else {
            o0VarE.e();
            str5 = str3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(str, str2, str5, list, str4, aVar, z14, i14);
        }
    }

    public static final void b(String str, String str2, String str3, List list, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        str2.getClass();
        str3.getClass();
        o0 o0VarE = mVar.E(-1572515321);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97922g;
            float f16 = eVar.f97920e;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            String upperCase = gl1.y.Q(o0VarE, R.string.lbl_safety_event_triggered).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(upperCase, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            bVar.getClass();
            c2.l.f(x2.h(aVar, eVar.f97919d), o0VarE);
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97929f), o0VarE), o0VarE, i15 & 14, 0, 131068);
            bVar.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarE);
            bVar.getClass();
            h4.r rVarA3 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str2, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            bVar.getClass();
            c2.l.f(x2.h(aVar, f15), o0VarE);
            bVar.getClass();
            h4.r rVarA4 = c2.l.A(aVar, f16, 0.0f, 2);
            fVar.getClass();
            mh.c(str3, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131068);
            o0Var = o0VarE;
            bVar.getClass();
            c2.l.f(x2.h(aVar, f15), o0Var);
            b.a(list, o0Var, (i15 >> 9) & 14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(str, str2, str3, list, i14, 26);
        }
    }
}
