package tw;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.g0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import java.util.Locale;
import kw.m;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import tn2.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static final void a(List<pw.a> list, m mVar, p3.m mVar2, int i14) {
        m mVar3;
        List<pw.a> list2;
        list.getClass();
        o0 o0VarE = mVar2.E(801987293);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(mVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new oz.a(context);
                o0VarE.K(objQ);
            }
            oz.a aVar = (oz.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new sw.f(aVar);
                o0VarE.K(objQ2);
            }
            sw.f fVar = (sw.f) objQ2;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarF2 = x2.f(aVar2, 1.0f);
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarF2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarThen = l4.k.g(aVar2, -90.0f).then(g0.d(aVar2, new t21.e(24)));
            float f14 = 8;
            g6.f.a aVar5 = g6.f.f75994b;
            float f15 = 4;
            r rVarC3 = l.C(rVarThen, f14, 0.0f, f15, 0.0f, 10);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57756f;
            d92.b.f58623a.getClass();
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_blood_pressure_systolic);
            Locale locale = Locale.ROOT;
            String upperCase = strQ.toUpperCase(locale);
            upperCase.getClass();
            mh.c(upperCase, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            r rVarH = x2.h(u2Var.a(aVar2, 1.0f, true), 300);
            float f16 = 24;
            r rVarC4 = l.C(rVarH, 0.0f, 0.0f, f16, 0.0f, 11);
            boolean zR = o0VarE.r(aVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new mc1.j(aVar, 1);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR2 = o0VarE.r(fVar) | o0VarE.r(list) | o0VarE.r(mVar);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new s0(fVar, 3, list, mVar);
                o0VarE.K(objQ4);
            }
            p002j6.c.b(lVar, rVarC4, (e23.l) objQ4, o0VarE, 0, 0);
            o0VarE.g0(true);
            String upperCase2 = gl1.y.Q(o0VarE, R.string.lbl_blood_pressure_diastolic).toUpperCase(locale);
            upperCase2.getClass();
            r rVarC5 = l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13);
            fVar3.getClass();
            list2 = list;
            mh.c(upperCase2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 48, 0, 131068);
            mVar3 = mVar;
            t0.a(l.B(x2.f(aVar2, 1.0f), f16, f15, f16, 16), j.f22696f, null, null, 0, 0, z3.f.c(2122294882, new ry0.g(23, mVar3, list2), o0VarE), o0VarE, 1572912, 60);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            mVar3 = mVar;
            list2 = list;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(list2, mVar3, i14, 17);
        }
    }
}
