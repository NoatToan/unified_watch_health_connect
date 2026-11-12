package com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import cy0.n;
import g6.f;
import gl1.y;
import hz0.w;
import i53.c;
import m92.o;
import p3.m;
import p3.o0;
import p3.p2;
import p3.x1;
import sy0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(l lVar, c<n> cVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-190652945);
        int i15 = (o0VarE.B(lVar) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            f.a aVar = f.f75994b;
            o.a(null, y.Q(o0VarE, R.string.activity_details_elevation), null, null, z3.f.c(524247663, new w(250, 1, cVar, lVar, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE), null, null, o0VarE, 24576, 109);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(lVar, cVar, i14, 12);
        }
    }
}
