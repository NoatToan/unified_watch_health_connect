package m30;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.g0;
import g02.q1;
import h5.e0;
import i3.mh;
import l30.y0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {
    public static final void a(Double d14, e23.l<? super g6.m, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        lVar.getClass();
        o0 o0VarE = mVar.E(865590337);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new k11.n(lVar, 24);
                o0VarE.K(objQ);
            }
            h4.r rVarF = g0.f(rVarE, (e23.l) objQ);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (zf.b.D(d14)) {
                o0VarE.C(-837616875);
                l72.w.f111301a.b(o0VarE, 0);
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                s20.e eVar = s20.e.f156007a;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                double dDoubleValue = d14.doubleValue();
                eVar.getClass();
                String strP = gl1.y.P(R.string.title_course_distance, new Object[]{s20.e.c(dDoubleValue, context, zY)}, o0VarE);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                d92.b.f58624b.getClass();
                mh.c(strP, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), 1.3f, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0VarE.C(-836917174);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarF3 = x2.f(c2.l.y(aVar, eVar2.f97920e), 1.0f);
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(rVarF3, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                String strQ = gl1.y.Q(o0VarE, R.string.automatic_course_creator_description);
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, q1.a(d92.c.f(j92.f.f97933j, o0VarE), 1.3f, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(d14, lVar, i14, 16);
        }
    }
}
