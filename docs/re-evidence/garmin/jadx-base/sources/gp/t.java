package gp;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import f72.a2;
import gl1.y;
import lc.u0;
import ns.q0;
import ns.t1;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgp/t;", "Lr70/r;", "Lhp/f;", "stateHolder", "<init>", "(Lhp/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp.f f78423a;

    public t(hp.f fVar) {
        fVar.getClass();
        this.f78423a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        String str;
        boolean z14;
        String strP;
        Double avgValue;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1387262205);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            hp.f fVar = this.f78423a;
            sn.h hVar = fVar.f84928b;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarQ.A(y3Var);
            sn.g gVarM = hVar.m();
            sn.g gVarR = hVar.r();
            String strB = new wn.c((Context) o0VarQ.A(y3Var)).b(hVar);
            q0 q0Var = new q0(a0.s(o0VarQ), q0.a.Avg, null, 4, null);
            String strC = u00.b.c(q0Var, gVarM != null ? gVarM.getAvgValue() : null, 73, 4);
            if (strC == null) {
                strC = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 1719141891, R.string.no_value, o0VarQ, false);
            } else {
                o0VarQ.C(1719139473);
                o0VarQ.g0(false);
            }
            String str2 = strC;
            String strC2 = u00.b.c(q0Var, gVarM != null ? gVarM.getAvgValue() : null, 32, 4);
            Integer numValueOf = (gVarR == null || (avgValue = gVarR.getAvgValue()) == null) ? null : Integer.valueOf((int) avgValue.doubleValue());
            if (numValueOf != null) {
                o0VarQ.C(1754119981);
                strJ = y.P(R.string.lbl_percentage, new Object[]{numValueOf}, o0VarQ);
                o0VarQ.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 1754212671, R.string.no_value, o0VarQ, false);
            }
            if (numValueOf != null) {
                o0VarQ.C(1754362773);
                str = y.Q(o0VarQ, R.string.lbl_average_oxygen_saturation) + ", " + strJ;
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1754480821);
                str = y.Q(o0VarQ, R.string.lbl_average_oxygen_saturation) + ", " + y.Q(o0VarQ, R.string.no_data_label);
                o0VarQ.g0(false);
            }
            t1 t1Var = new t1(a0.s(o0VarQ), t1.a.Avg, null, 4, null);
            sn.g gVarS = hVar.s();
            String strC3 = u00.b.c(t1Var, gVarS != null ? gVarS.getAvgValue() : null, 73, 4);
            sn.g gVarS2 = hVar.s();
            String strC4 = u00.b.c(t1Var, gVarS2 != null ? gVarS2.getAvgValue() : null, 32, 4);
            bv.b.f21239a.getClass();
            bv.b.a();
            k1 k1Var = k1.f37122a;
            if (!k1Var.e0()) {
                if (!k1Var.l()) {
                    f12.l.f68084a.getClass();
                    if (f12.l.a.a().z2()) {
                        z14 = k1Var.L() ? false : true;
                    }
                } else if (k1Var.L()) {
                }
            }
            yz1.d dVar = fVar.f84927a;
            s62.a.f157643a.getClass();
            u4.d dVarA = a2.a(t62.c.f162799a);
            f02.a.f67722a.getClass();
            gl.c.f77766a.getClass();
            int i16 = i15;
            long j8 = gl.c.f77767b.f77772b0;
            if (z14) {
                o0VarQ.C(1719212280);
                strP = y.P(R.string.avg_spo2_value, new Object[]{strJ}, o0VarQ);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1719214321);
                o0VarQ.g0(false);
                strP = strC3;
            }
            if (!z14) {
                strC3 = null;
            }
            if (!z14) {
                str = strC4;
            }
            String str3 = z14 ? strC4 : null;
            boolean zR = o0VarQ.r(context) | o0VarQ.r(this);
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new f(3, context, this);
                o0VarQ.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(3, context, this);
                    o0VarQ.K(objQ);
                }
            }
            o0Var = o0VarQ;
            yz1.m.a(rVar, dVar, strB, dVarA, 0L, j8, str2, strP, strC3, strC2, str, str3, (e23.a) objQ, o0Var, i16 & 14, 16);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0((r70.r) this, rVar, qVar, i14, 26);
        }
    }
}
