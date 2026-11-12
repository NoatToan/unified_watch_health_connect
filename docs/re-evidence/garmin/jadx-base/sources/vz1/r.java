package vz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.nb;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mc;
import i3.mh;
import o53.b0;
import org.joda.time.DateTime;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;
import sk0.k1;
import sz1.t;
import v62.l1;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    public static final void a(DateTime dateTime, DateTime dateTime2, t tVar, mc mcVar, b0 b0Var, oz1.a aVar, p3.m mVar, int i14) {
        int i15;
        b0Var.getClass();
        aVar.getClass();
        int i16 = aVar.f134492c;
        o0 o0VarE = mVar.E(391244639);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.r(dateTime2) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(tVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(b0Var) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74897 & i15) != 74896)) {
            x1 x1Var = p3.n.f135158a;
            oz1.n.f134585c.getClass();
            String strQ = y.Q(o0VarE, oz1.n.a.a(i16).f134594a);
            String strQ2 = y.Q(o0VarE, oz1.n.a.a(i16).f134595b);
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            b10.b bVar = new b10.b((Context) o0VarE.A(y3Var));
            Context context = (Context) o0VarE.A(y3Var);
            if (oz1.n.a.a(i16) != oz1.n.NONE) {
                o0VarE.C(-971146397);
                int i17 = i15 >> 6;
                i.a(R.string.lbl_sleep_score, mcVar, b0Var, strQ, strQ2, z3.f.c(2044702583, new k1(dateTime2, tVar, bVar, dVar, 28), o0VarE), o0VarE, (i17 & 896) | (i17 & 112) | 196608);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-964506104);
                s62.a.f157643a.getClass();
                u4.d dVarA = nb.a(t62.c.f162799a);
                Integer numValueOf = Integer.valueOf(R.string.gcm_sleep_tracking_help_info);
                boolean zR = o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new tz1.h(context, 12);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new tz1.h(context, 12);
                        o0VarE.K(objQ);
                    }
                }
                l.a(mcVar, b0Var, R.string.lbl_sleep_score, dVarA, R.string.no_data_on_device, numValueOf, R.string.tr_feedback_sleep_score_no_data, (e23.a) objQ, o0VarE, (i15 >> 9) & 126);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, i14, 3);
        }
    }

    public static final void b(h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-623149408);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            u4.d dVarA = l1.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).f().d();
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            i7.b(dVarA, null, x2.q(aVar2, 16), jD, o0VarE, 432, 0);
            String strQ = y.Q(o0VarE, R.string.lbl_time_change);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            d92.b.f58625c.getClass();
            mh.c(strQ, c2.l.C(aVar2, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 24);
        }
    }
}
