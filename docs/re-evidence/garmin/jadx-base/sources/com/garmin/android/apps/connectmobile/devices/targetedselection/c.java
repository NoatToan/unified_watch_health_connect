package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.f3;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import ew1.r1;
import ew1.u1;
import gl1.y;
import l72.c1;
import l72.p2;
import p005kotlin.Unit;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(l.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        String strC;
        o0 o0VarE = mVar.E(1763237183);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar4) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = aVar.f34620i;
            boolean z15 = aVar.f34621j == bz.d.f22265d;
            p2 p2Var = p2.f111205a;
            String str = aVar.f34613b;
            if (aVar.f34619h) {
                strC = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1151477857, R.string.devices_connected, o0VarE, false);
            } else {
                o0VarE.C(1151551048);
                f3 f3Var = f3.f23054a;
                String strQ = y.Q(o0VarE, R.string.devices_not_connected);
                f3Var.getClass();
                strC = f3.c(context, strQ, false);
                o0VarE.g0(false);
            }
            p2Var.h(str, strC, null, null, null, aVar.f34618g, false, z3.f.c(-1916858675, new r1(11, context, aVar), o0VarE), z3.f.c(1395115244, new u1(aVar, aVar3, z14, aVar2, z15), o0VarE), null, !z14 ? aVar4 : null, o0VarE, 113246208, 0, 604);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i(aVar, aVar2, aVar3, aVar4, i14, 23);
        }
    }

    public static final void b(l.a aVar, int i14, String str, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i15) {
        o0 o0Var;
        o0 o0VarE = mVar.E(435539435);
        int i16 = i15 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.device_compatibility_alert_title), y.P(i14, new Object[]{aVar.f34613b, str}, o0VarE), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar2, y.Q(o0VarE, R.string.common_learn_more), aVar.f34622k ? aVar3 : null, o0Var, 100663302, 0, 216);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(aVar, i14, str, aVar2, aVar3, i15);
        }
    }
}
