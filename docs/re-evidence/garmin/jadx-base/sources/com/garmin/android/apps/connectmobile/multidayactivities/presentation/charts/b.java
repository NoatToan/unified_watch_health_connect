package com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.x0;
import fx0.g;
import gl1.d;
import ik1.c;
import iy0.f;
import m92.o;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(f fVar, m mVar, int i14) {
        fVar.getClass();
        o0 o0VarE = mVar.E(-1586280342);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            float f14 = 250;
            g6.f.a aVar = g6.f.f75994b;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (fVar.f95793d == null || fVar.f95794e == null) {
                o0VarE.C(649706488);
                o0VarE.g0(false);
            } else {
                o0VarE.C(647761424);
                x0.f23314a.getClass();
                o.a(null, d.W(x0.f23361cb), null, null, z3.f.c(-8076049, new g(fVar, f14, context), o0VarE), null, null, o0VarE, 24576, 109);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(fVar, i14, 5);
        }
    }
}
