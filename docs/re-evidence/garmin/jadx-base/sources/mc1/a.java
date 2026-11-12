package mc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f117772a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f117772a = 8;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01a0  */
    public static final void a(dc1.a aVar, boolean z14, m mVar, int i14) {
        int i15;
        o0 o0Var;
        Double averageSpO2;
        String strP;
        o0 o0Var2;
        String str;
        gc1.a aVar2;
        o0 o0VarE = mVar.E(714902032);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Integer numValueOf = (!z14 ? !(aVar == null || (averageSpO2 = aVar.getAverageSpO2()) == null) : !(aVar == null || (averageSpO2 = aVar.getLatestSpO2()) == null)) ? null : Integer.valueOf((int) averageSpO2.doubleValue());
            if (numValueOf == null) {
                o0VarE.C(2047978177);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(2047978178);
                strP = y.P(R.string.lbl_value_percent, new Object[]{numValueOf}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -72481127, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-72483793);
                o0VarE.g0(false);
            }
            String strO = xy2.b.O(context, strP);
            gc1.a aVar3 = new gc1.a(context);
            r.a aVar4 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                if ((aVar != null ? aVar.getLatestSpO2TimestampGMT() : null) != null) {
                    o0VarE.C(-1065823187);
                    String strA = gm.b.a(aVar3.f76925a, aVar.getLatestSpO2TimestampGMT());
                    strA.getClass();
                    String strP2 = y.P(R.string.pulse_ox_acclimation_last_read_lbl, new Object[]{strA}, o0VarE);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    r rVarB = b0Var.b(aVar4, h4.d.a.f81537o);
                    aVar2 = aVar3;
                    str = strP;
                    mh.c(strP2, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                    o0Var2 = o0VarE;
                    o0Var2.g0(false);
                } else {
                    o0Var2 = o0VarE;
                    str = strP;
                    aVar2 = aVar3;
                    o0Var2.C(-1065397464);
                    o0Var2.g0(false);
                }
            } else {
                o0Var2 = o0VarE;
                str = strP;
                aVar2 = aVar3;
                o0Var2.C(-1065397464);
                o0Var2.g0(false);
            }
            float f14 = SyslogConstants.LOG_LOCAL6;
            g6.f.a aVar6 = g6.f.f75994b;
            r rVarQ = x2.q(aVar4, f14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC2 = l.C(rVarQ, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ = o0Var2.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new m30.n(17);
                o0Var2.K(objQ);
            }
            o0 o0Var3 = o0Var2;
            z72.k.a(v.c((e23.l) objQ, rVarC2, true), g8.i.F(numValueOf, o0Var2), g8.i.E(numValueOf), null, null, f117772a, 4.0f, false, false, z3.f.c(663321126, new h21.m(strO, str, z14, aVar2, 9), o0Var2), o0Var3, 807075840, 408);
            o0Var = o0Var3;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv1.v(aVar, z14, i14, 6);
        }
    }
}
