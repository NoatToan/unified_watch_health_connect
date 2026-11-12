package wg2;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.Locale;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes11.dex */
public final class m {
    public static final void a(r rVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        rVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1167707387);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarB = a2.b(x2.d(rVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = y.a(cVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            String strP = null;
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str == null) {
                o0VarE.C(1077060864);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1077060865);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                strP = gl1.y.P(R.string.your_type_activity_cannot_be_displayed_live, new Object[]{lowerCase}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1904915088, R.string.your_activity_cannot_be_displayed_live, o0VarE, false);
            } else {
                o0VarE.C(-1904919304);
                o0VarE.g0(false);
            }
            String str2 = strP;
            s62.a.f157643a.getClass();
            b82.n.d(u62.a.a(t62.a.f162797a), gl1.y.Q(o0VarE, R.string.unable_to_display_live_activity), str2, null, gl1.y.Q(o0VarE, R.string.lbl_close), aVar, gl1.y.Q(o0VarE, R.string.common_learn_more), aVar2, o0VarE, ((i15 << 9) & 458752) | ((i15 << 12) & 29360128), 8);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(rVar, str, aVar, aVar2, i14, 8);
        }
    }
}
