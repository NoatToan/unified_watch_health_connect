package gk1;

import am.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import et1.a2;
import ew1.c2;
import g02.h0;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import java.util.Set;
import l72.c1;
import l72.f0;
import lc.y;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b2;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar, y yVar, e eVar, e23.a<Unit> aVar2, m mVar, int i14) {
        Object e1Var;
        p1 p1Var;
        e23.a aVar3;
        int i15;
        com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar4 = aVar;
        aVar4.getClass();
        yVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(471041503);
        int i16 = i14 | (o0VarE.r(aVar4) ? 4 : 2) | (o0VarE.r(yVar) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b2(DateTime.now().getMillis());
                o0VarE.K(objQ);
            }
            o1 o1Var = (o1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            g.a<Set<String>, Set<String>> aVar5 = eVar.f77743b;
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(eVar) | o0VarE.r(aVar4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                p1Var = p1Var2;
                e1Var = new e1(eVar, aVar2, aVar4, o1Var, p1Var, 20);
                aVar4 = aVar4;
                o0VarE.K(e1Var);
            } else {
                e1Var = objQ3;
                p1Var = p1Var2;
            }
            q qVarC = w.c(aVar5, (l) e1Var, o0VarE, 0);
            String strJ = eVar.x4() ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1140485335, R.string.googlehealthconnect_connected_title, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1140566710, R.string.googlehealthconnect_share_data_title, o0VarE, false);
            String strJ2 = eVar.x4() ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1140708659, R.string.googlehealthconnect_connected_secondary, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1140794095, R.string.googlehealthconnect_not_connected_secondary, o0VarE, false);
            String strJ3 = eVar.x4() ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1140939392, R.string.lbl_healthconnect_settings, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1141011901, R.string.smart_scale_label_get_started, o0VarE, false);
            if (eVar.x4()) {
                o0VarE.C(1141151556);
                boolean zR2 = o0VarE.r(yVar);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new b(yVar, 0);
                    o0VarE.K(objQ4);
                }
                aVar3 = (e23.a) objQ4;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1141412266);
                boolean zR3 = o0VarE.r(qVarC) | o0VarE.r(aVar4);
                Object objQ5 = o0VarE.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new fk0.a(qVarC, 10, aVar4, o1Var);
                    o0VarE.K(objQ5);
                }
                aVar3 = (e23.a) objQ5;
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1141794589);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.googlehealthconnect_permissions_dialog_canceled_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.googlehealthconnect_permissions_dialog_canceled_text);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_settings);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_close);
                boolean zR4 = o0VarE.r(yVar);
                Object objQ6 = o0VarE.q();
                if (zR4 || objQ6 == c2565a) {
                    objQ6 = new c2(28, yVar, p1Var);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar6 = (e23.a) objQ6;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new a2(p1Var, 29);
                    o0VarE.K(objQ7);
                }
                i15 = 0;
                c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, aVar6, strQ4, (e23.a) objQ7, o0VarE, 6, 6, 216);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                i15 = 0;
                o0VarE.C(1142421347);
                o0VarE.g0(false);
            }
            r.a aVar7 = r.S;
            r rVarF = x2.f(aVar7, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            r rVarY = c2.l.y(rVarF, f14);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, i15);
            String str = strJ;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar8 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            t4.d dVarA = n5.c.a(2131232421, o0VarE, 0);
            String strQ5 = gl1.y.Q(o0VarE, R.string.default_image_view_content_description);
            r rVarF2 = x2.f(aVar7, 1.0f);
            bVar.getClass();
            f.a aVar9 = f.f75994b;
            o0 o0Var = o0VarE;
            String str2 = strJ3;
            y0.a(dVarA, strQ5, x2.h(c2.l.A(rVarF2, 0.0f, eVar2.f97923h, 1), 88), null, null, 0.0f, null, o0Var, 0, 120);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97931h;
            x0 x0VarB = d92.c.b(d92.c.e(x0Var), o0Var);
            r rVarF3 = x2.f(aVar7, 1.0f);
            bVar.getClass();
            mh.c(str, c2.l.A(rVarF3, 0.0f, f15, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 131068);
            fVar.getClass();
            mh.c(strJ2, x2.f(aVar7, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0Var), o0Var, 48, 0, 131068);
            String strQ6 = gl1.y.Q(o0Var, R.string.common_learn_more);
            fVar.getClass();
            x0 x0VarA = x0.a(x0Var, d92.b.a(o0Var).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            bVar.getClass();
            r rVarA = c2.l.A(aVar7, 0.0f, f15, 1);
            p5.l.f136032b.getClass();
            p5.l lVarA = p5.l.a(0);
            boolean zR5 = o0Var.r(context);
            Object objQ8 = o0Var.q();
            if (zR5 || objQ8 == c2565a) {
                objQ8 = new cy1.a(context, 27);
                o0Var.K(objQ8);
            }
            mh.c(strQ6, u1.w.d(rVarA, false, null, lVarA, (e23.a) objQ8, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var, 0, 0, 131068);
            o0VarE = o0Var;
            c2.l.f(b0Var.a(aVar7, 1.0f, true), o0VarE);
            f0 f0Var = f0.f110999a;
            r rVarF4 = x2.f(aVar7, 1.0f);
            boolean zB = o0VarE.B(aVar3);
            Object objQ9 = o0VarE.q();
            if (zB || objQ9 == c2565a) {
                objQ9 = new h0(aVar3, 17);
                o0VarE.K(objQ9);
            }
            f0Var.d(384, 9, (e23.a) objQ9, rVarF4, str2, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(aVar, yVar, eVar, aVar2, i14, 2);
        }
    }
}
