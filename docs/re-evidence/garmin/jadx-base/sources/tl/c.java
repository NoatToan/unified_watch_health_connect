package tl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import f02.w;
import h4.r;
import j21.p;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import z72.k;
import z72.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f165265a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f165265a = 10;
    }

    @SuppressLint({"StringFormatMatches"})
    public static final void a(Integer num, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(298679863);
        int i16 = (o0VarE.B(num) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String string = context.getString(R.string.no_value);
            string.getClass();
            Float fValueOf = num != null ? Float.valueOf(num.intValue() / 100.0f) : null;
            if (num != null) {
                string = context.getString(R.string.lbl_value_percent, num);
            }
            string.getClass();
            w.f67751a.getClass();
            gl.c cVar = gl.c.f77766a;
            cVar.getClass();
            l lVar = new l(0.7f, gl.c.a(o0VarE).l(), null);
            cVar.getClass();
            l lVar2 = new l(0.1f, gl.c.a(o0VarE).h(), null);
            cVar.getClass();
            l lVar3 = new l(0.1f, gl.c.a(o0VarE).i(), null);
            cVar.getClass();
            l lVar4 = new l(0.1f, gl.c.a(o0VarE).d(), null);
            r.a aVar = r.S;
            float f14 = SyslogConstants.LOG_LOCAL6;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarQ = x2.q(aVar, f14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarQ, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new t52.c(24);
                o0VarE.K(objQ);
            }
            i15 = 2;
            k.a(v.c((e23.l) objQ, rVarC, true), i53.a.a(lVar, lVar2, lVar3, lVar4), fValueOf, null, null, f165265a, 2.0f, false, false, z3.f.c(-1697937685, new p(string, 21), o0VarE), o0VarE, 807075840, 408);
        } else {
            i15 = 2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.f(num, i14, i15);
        }
    }
}
