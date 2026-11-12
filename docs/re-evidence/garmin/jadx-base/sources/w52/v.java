package w52;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import org.apache.commons.lang3.StringUtils;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class v {
    public static final void a(c62.x0 x0Var, String str, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(371503605);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 3;
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(str, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(x0Var, str, i14, i16);
        }
    }

    public static final void b(String str, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        byte b14;
        p3.o0 o0VarE = mVar.E(1066874900);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.msn_workout_attribution_note);
            if (g22.n.d(str)) {
                o0VarE.C(512341688);
                strQ = strQ + StringUtils.SPACE + gl1.y.P(R.string.msn_workout_image_attribution_note, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(512455086);
                o0VarE.g0(false);
            }
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, f14, 0.0f, f15, eVar.f97920e, 2);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            o0Var = o0VarE;
            b14 = 0;
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            b14 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bg2.b(str, i14, 5, b14);
        }
    }
}
