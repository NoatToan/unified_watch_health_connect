package sz1;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import sk0.r1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f161556a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f161556a = 8;
    }

    public static final void a(oz1.b bVar, p3.m mVar, int i14) {
        int i15;
        oz1.u uVarA;
        String strJ;
        o0 o0VarE = mVar.E(343581272);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = bVar.getMinutesSinceLastDive() != null;
            Float score = (!p005kotlin.jvm.internal.s.g(bVar.getValidSleep(), Boolean.TRUE) || z14) ? null : bVar.getScore();
            String strValueOf = score != null ? String.valueOf((int) score.floatValue()) : null;
            if (strValueOf == null) {
                strValueOf = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -530871111, R.string.no_value, o0VarE, false);
            } else {
                o0VarE.C(-530872041);
                o0VarE.g0(false);
            }
            if (z14) {
                uVarA = oz1.u.RECENT_DIVE;
            } else {
                oz1.u.a aVar = oz1.u.f134627e;
                String level = bVar.getLevel();
                aVar.getClass();
                uVarA = oz1.u.a.a(level);
            }
            if (score == null || score.floatValue() <= 0.0f) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -165488721, R.string.txt_empty_page_no_data, o0VarE, false);
            } else {
                o0VarE.C(-165674411);
                strJ = y.P(R.string.lbl_out_of_goal_1, new Object[]{String.valueOf((int) score.floatValue()), String.valueOf((int) oz1.u.PRIME.f134641d)}, o0VarE);
                o0VarE.g0(false);
            }
            h4.r.a aVar2 = h4.r.S;
            float f14 = SyslogConstants.LOG_LOCAL6;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar2, f14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarQ, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new r1(15);
                o0VarE.K(objQ);
            }
            e.a(score, uVarA, f161556a, 4.0f, v.c((e23.l) objQ, rVarC, true), z3.f.c(-852547092, new f(strJ, strValueOf, z14, i16), o0VarE), o0VarE, 200064);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(bVar, i14, 0);
        }
    }
}
