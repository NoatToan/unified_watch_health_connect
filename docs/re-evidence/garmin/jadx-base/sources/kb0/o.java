package kb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static final void a(v vVar, v vVar2, String str, z80.h hVar, e23.l<? super v, Unit> lVar, e23.l<? super v, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, 1301813882);
        int i15 = (o0VarP.r(vVar) ? 4 : 2) | i14 | (o0VarP.r(vVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.B(str) ? 256 : 128;
        }
        int i16 = i15 | (o0VarP.B(hVar) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i16 |= o0VarP.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarP.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarP.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarP.r(aVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarP.r(aVar3) ? 67108864 : 33554432;
        }
        if (o0VarP.n(i16 & 1, (38347923 & i16) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(mb0.g.NONE);
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarP, R.string.common_bic_sleep_and_wake_title);
            String strQ2 = y.Q(o0VarP, R.string.sleep_wake_setup_instruction_subtitle_msg);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.f.a(t62.b.f162798a);
            String strQ3 = y.Q(o0VarP, R.string.lbl_next);
            String strQ4 = y.Q(o0VarP, R.string.sleep_window_customize_daily_schedule_label);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            boolean z14 = (29360128 & i16) == 8388608;
            Object objQ2 = o0VarP.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new j22.d(aVar2, 28);
                o0VarP.K(objQ2);
            }
            e23.a aVar5 = (e23.a) objQ2;
            boolean z15 = (3670016 & i16) == 1048576;
            Object objQ3 = o0VarP.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new j22.d(aVar, 29);
                o0VarP.K(objQ3);
            }
            o0Var = o0VarP;
            da0.p.b("user_profile_advanced_sleep_screen", strQ, dVarA, strQ2, null, strQ3, aVar5, false, strQ4, (e23.a) objQ3, false, null, null, false, false, aVar3, null, null, null, null, aVar4, z3.f.c(485447034, new ak0.g((Object) hVar, (Object) str, (Object) vVar, (Object) vVar2, (Object) lVar, (Object) lVar2, context, (Object) p1Var, 3), o0VarP), o0Var, 6, (i16 >> 9) & 458752, 432, 2063504);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(vVar, vVar2, str, hVar, lVar, lVar2, aVar, aVar2, aVar3, i14);
        }
    }
}
