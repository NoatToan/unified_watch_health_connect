package vz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.f0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.mc;
import o53.b0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1472506651);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            e.f180900a.getClass();
            b82.n.a(e.f180901b, y.Q(o0VarE, R.string.msg_no_data_available), y.Q(o0VarE, R.string.recovery_time_sync_your_device), null, null, o0VarE, 6, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 14);
        }
    }

    public static final void b(oz1.b bVar, oz1.a aVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        mc mcVar2;
        b0 b0Var2;
        aVar.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(182638732);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            mcVar2 = mcVar;
            i15 |= o0VarE.B(mcVar2) ? 256 : 128;
        } else {
            mcVar2 = mcVar;
        }
        if ((i14 & 3072) == 0) {
            b0Var2 = b0Var;
            i15 |= o0VarE.r(b0Var2) ? 2048 : 1024;
        } else {
            b0Var2 = b0Var;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Integer recoveryTime = bVar.getRecoveryTime();
            int iIntValue = (recoveryTime != null ? recoveryTime.intValue() : 0) / 60;
            oz1.j.a aVar2 = oz1.j.f134561c;
            int i16 = aVar.f134492c;
            aVar2.getClass();
            oz1.j jVarA = oz1.j.a.a(i16);
            oz1.k.a(jVarA, o0VarE);
            int i17 = i15 >> 3;
            i.a(R.string.tr_factor_recovery_time, mcVar2, b0Var2, null, null, z3.f.c(145785865, new f0(jVarA, new sz1.o((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).a(bVar, Boolean.FALSE), iIntValue == 0 ? R.string.tr_recovery_time_display_very_good : jVarA.f134570a, y.Q(o0VarE, iIntValue == 0 ? R.string.tr_feedback_recovery_time_very_good : jVarA.f134571b), iIntValue, aVar.f134491b), o0VarE), o0VarE, (i17 & 112) | 224256 | (i17 & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(bVar, aVar, mcVar, b0Var, i14, 6);
        }
    }

    public static final long c(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        if (i14 == 0) {
            mVar.C(433504563);
            d92.b.f58623a.getClass();
            long jG = d92.b.a(mVar).e().g();
            mVar.f();
            return jG;
        }
        if (1 <= i14 && i14 < 19) {
            mVar.C(433505689);
            gl.c.f77766a.getClass();
            long jD = gl.c.a(mVar).d();
            mVar.f();
            return jD;
        }
        if (19 > i14 || i14 >= 37) {
            mVar.C(433508247);
            gl.c.f77766a.getClass();
            long jL = gl.c.a(mVar).l();
            mVar.f();
            return jL;
        }
        mVar.C(433507034);
        gl.c.f77766a.getClass();
        long jH = gl.c.a(mVar).h();
        mVar.f();
        return jH;
    }
}
