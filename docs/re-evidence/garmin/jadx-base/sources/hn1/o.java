package hn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import gl1.y;
import h4.r;
import i3.e5;
import i3.mc;
import km1.a0;
import km1.c0;
import l72.x0;
import o53.b0;
import org.joda.time.DateTime;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import r53.b2;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static final void a(mm1.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-373430747);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.b bVar = new b10.b((Context) o0VarE.A(y3Var));
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, 1), z3.f.c(-408961236, new gw1.e(aVar, 5, dVar, bVar), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a0 a0Var, DateTime dateTime, DateTime dateTime2, s sVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1VarC;
        u82.f fVar;
        p1 p1VarC2;
        sm1.a0 a0Var2;
        b0Var.getClass();
        o0 o0VarE = mVar.E(-1534260428);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(sVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(b0Var) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b2 b2Var = sVar != null ? sVar.f160188h : null;
            if (b2Var == null) {
                o0VarE.C(-110167856);
                o0VarE.g0(false);
                p1VarC = null;
            } else {
                o0VarE.C(-1250479791);
                p1VarC = s9.c.c(b2Var, o0VarE);
                o0VarE.g0(false);
            }
            km1.f fVar2 = new km1.f(context, (p1VarC == null || (a0Var2 = (sm1.a0) p1VarC.getF182175a()) == null) ? false : a0Var2.f160098n);
            if (dateTime == null || dateTime2 == null) {
                o0VarE.C(-109557806);
                o0VarE.g0(false);
                fVar = null;
            } else {
                o0VarE.C(-109579351);
                u82.a aVar = sVar != null ? sVar.f160193m : null;
                if (aVar == null) {
                    o0VarE.C(-109848649);
                    o0VarE.g0(false);
                    p1VarC2 = null;
                } else {
                    o0VarE.C(-1250469494);
                    p1VarC2 = aVar.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), o0VarE);
                    o0VarE.g0(false);
                }
                u82.f fVar3 = p1VarC2 != null ? (u82.f) p1VarC2.getF182175a() : null;
                o0VarE.g0(false);
                fVar = fVar3;
            }
            boolean zB = o0VarE.B(fVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = hb.a.n(fVar instanceof u82.f.b, o0VarE);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb.a.n(fVar instanceof u82.f.b, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new CustomBarChart(context);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            fn1.r.a(y.Q(o0VarE, R.string.lbl_sleep_history), fVar2.b(c0.SLEEP_HISTORY, a0Var != null ? a0Var.getSleepHistoryAdjustment() : null), y.Q(o0VarE, R.string.lbl_sleep_duration_vs_sleep_need), e5.g(y.Q(o0VarE, R.string.common_lbl_daily_totals), " • ", y.Q(o0VarE, R.string.lbl_seven_days)), mcVar, b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(720386012, new ak0.j((CustomBarChart) objQ2, dateTime, dateTime2, fVar, p1Var, 26), o0VarE), null, z3.f.c(332214058, new i(fVar, 1), o0VarE), o0Var, (57344 & i16) | 817889280 | (458752 & i16), 256);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(a0Var, dateTime, dateTime2, sVar, mcVar, b0Var, i14, 2);
        }
    }
}
