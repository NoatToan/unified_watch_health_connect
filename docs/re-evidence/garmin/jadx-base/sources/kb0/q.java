package kb0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    public static final void a(v vVar, v vVar2, z80.h hVar, e23.l<? super v, Unit> lVar, e23.l<? super v, Unit> lVar2, e23.l<? super Boolean, Unit> lVar3, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-787416028);
        int i15 = (o0VarE.r(vVar) ? 4 : 2) | i14 | (o0VarE.r(vVar2) ? 32 : 16) | (o0VarE.B(hVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(mb0.g.NONE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarE, R.string.common_bic_sleep_and_wake_title);
            String strQ2 = y.Q(o0VarE, R.string.sleep_wake_setup_instruction_subtitle_msg);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.f.a(t62.b.f162798a);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            boolean z14 = (3670016 & i15) == 1048576;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new p(aVar, 0);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            da0.p.b("user_profile_simple_sleep_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ2, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, aVar3, z3.f.c(-976199388, new ak0.g((Object) hVar, (Object) lVar3, (Object) vVar, (Object) vVar2, (Object) lVar, (Object) lVar2, context, (Object) p1Var, 4), o0VarE), o0Var, 6, (i15 >> 6) & 458752, 432, 2064272);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(vVar, vVar2, hVar, lVar, lVar2, lVar3, aVar, aVar2, i14);
        }
    }
}
