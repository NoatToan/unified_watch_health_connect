package y01;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.bi;
import i3.mh;
import i3.si;
import java.time.LocalTime;
import l72.p2;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(v21.e eVar, b63.v vVar, String str, Boolean bool, e23.l lVar, p3.m mVar, int i14) {
        p1 p1Var;
        eVar.getClass();
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        lVar.getClass();
        o0 o0VarE = mVar.E(-666212904);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(vVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(bool) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            p2 p2Var = p2.f111205a;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new m0(21);
                o0VarE.K(objQ2);
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ2, aVar, false);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_time_of_day);
            String strR = eVar.r(vVar);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new x91.d(p1Var2, 12);
                o0VarE.K(objQ3);
            }
            p2Var.h(strQ, strR, null, rVarC2, null, false, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 6, 1012);
            o0 o0Var = o0VarE;
            if (str == null || !p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
                o0Var.C(1335913620);
                o0Var.g0(false);
            } else {
                o0Var.C(1335618283);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(aVar, eVar2.f97920e, f14);
                String strP = gl1.y.P(R.string.meal_window_value, new Object[]{str}, o0Var);
                d92.b.f58624b.getClass();
                mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131068);
                o0Var = o0Var;
                o0Var.g0(false);
            }
            o0Var.g0(true);
            si siVarZ = bi.z(localTime.getHour(), localTime.getMinute(), zIs24HourFormat, o0Var, 0, 0);
            String strQ2 = gl1.y.Q(o0Var, R.string.lbl_time_of_day);
            String strQ3 = gl1.y.Q(o0Var, R.string.lbl_ok);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            String strQ4 = gl1.y.Q(o0Var, R.string.lbl_cancel);
            Object objQ4 = o0Var.q();
            if (objQ4 == c2565a) {
                p1Var = p1Var2;
                objQ4 = new x91.d(p1Var, 13);
                o0Var.K(objQ4);
            } else {
                p1Var = p1Var2;
            }
            e23.a aVar3 = (e23.a) objQ4;
            boolean z14 = (i15 & 57344) == 16384;
            Object objQ5 = o0Var.q();
            if (z14 || objQ5 == c2565a) {
                objQ5 = new bt1.k(lVar, p1Var, 15);
                o0Var.K(objQ5);
            }
            o0 o0Var2 = o0Var;
            g82.e.a(strQ2, siVarZ, zBooleanValue, strQ4, aVar3, strQ3, (e23.p) objQ5, o0Var2, 24576);
            o0VarE = o0Var2;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(eVar, vVar, str, bool, lVar, i14);
        }
    }
}
