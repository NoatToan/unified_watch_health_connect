package uy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f02.e;
import g6.f;
import gl.c;
import gl1.y;
import h4.r;
import java.util.List;
import m92.h0;
import o4.d0;
import o70.t;
import p13.w;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r11.k;
import tz1.h;
import w2.a0;
import yz1.d;
import yz1.z;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f173077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f173078b;

    static {
        f.a aVar = f.f75994b;
        f173077a = 10;
        f173078b = 20;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x027a  */
    public static final void a(r rVar, ry.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        String strJ2;
        String strJ3;
        boolean z14;
        long jA;
        List listC;
        z zVar;
        o0 o0VarE = mVar.E(1090487655);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Double d14 = aVar != null ? aVar.f155057b : null;
            Double d15 = aVar != null ? aVar.f155058c : null;
            Double d16 = aVar != null ? aVar.f155059d : null;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (d14 != null) {
                o0VarE.C(-414582311);
                strJ = l3.a.H(l3.f23124b, a0.s(o0VarE), d14.doubleValue(), false);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -414480259, R.string.no_value, o0VarE, false);
            }
            String str = strJ;
            if (d15 != null) {
                o0VarE.C(-414358088);
                strJ2 = l3.a.H(l3.f23124b, a0.s(o0VarE), d15.doubleValue(), false);
                o0VarE.g0(false);
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -414255075, R.string.no_value, o0VarE, false);
            }
            String str2 = strJ2;
            if (d16 != null) {
                o0VarE.C(-414130889);
                strJ3 = l3.a.H(l3.f23124b, a0.s(o0VarE), d16.doubleValue(), false);
                o0VarE.g0(false);
            } else {
                strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -414026915, R.string.no_value, o0VarE, false);
            }
            String str3 = strJ3;
            if (d14 == 0 || d14.doubleValue() <= 0.0d || d15 == null || d15.doubleValue() <= 0.0d || d16 == null || d16.doubleValue() <= 0.0d) {
                o0VarE.C(-413064706);
                if (d15 != null && d15.doubleValue() > 0.0d) {
                    o0VarE.C(-412989097);
                    c.f77766a.getClass();
                    jA = c.a(o0VarE).l();
                    z14 = false;
                    o0VarE.g0(false);
                } else if (d16 == null || d16.doubleValue() <= 0.0d) {
                    z14 = false;
                    o0VarE.C(-412795502);
                    e.f67730a.getClass();
                    jA = e.a(o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-412870026);
                    c.f77766a.getClass();
                    jA = c.a(o0VarE).b();
                    z14 = false;
                    o0VarE.g0(false);
                }
                listC = w.c(new h0.e.c(new h0.e.a(0.0f, 100.0f), jA, Float.valueOf(1.0f), null));
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-413736228);
                h0.e.a aVar2 = new h0.e.a(0.0f, 100.0f);
                c.f77766a.getClass();
                listC = x.k(new h0.e.c(aVar2, c.a(o0VarE).l(), Float.valueOf((float) (d15.doubleValue() / d14.doubleValue())), null), new h0.e.c(new h0.e.a(1.0f, 100.0f), c.a(o0VarE).b(), Float.valueOf((float) (d16.doubleValue() / d14.doubleValue())), null));
                o0VarE.g0(false);
            }
            String strQ = y.Q(o0VarE, R.string.lbl_calories_burned);
            String strQ2 = y.Q(o0VarE, R.string.calories_active);
            String strQ3 = y.Q(o0VarE, R.string.lbl_resting_calorie);
            String strQ4 = y.Q(o0VarE, R.string.no_data_label);
            if (d14 == 0 || d15 == null || d16 == null) {
                o0VarE.C(-411520379);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-411995020);
                strQ4 = oi0.c.P(x.k(y.P(R.string.lbl_unit_total, new Object[]{Integer.valueOf((int) d14.doubleValue())}, o0VarE), y.P(R.string.string_space_string_pattern, new Object[]{Integer.valueOf((int) d15.doubleValue()), y.Q(o0VarE, R.string.lbl_active_calories)}, o0VarE), y.P(R.string.string_space_string_pattern, new Object[]{Integer.valueOf((int) d16.doubleValue()), y.Q(o0VarE, R.string.lbl_calories_details_resting)}, o0VarE)));
                o0VarE.g0(false);
            }
            String str4 = strQ4;
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new h(context, 6);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(context, 6);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            d dVar = aVar != null ? aVar.f155056a : null;
            t tVar = t.f130066j;
            List list = listC;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (aVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = (aVar.f155057b == null && aVar.f155058c == null && aVar.f155059d == null) ? z.EMPTY : z.VALID_DATA;
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strQ, strQ, dVarB, d0VarE, 0.0f, 0, null, 0.0f, null, null, null, null, z3.f.c(-155860956, new k(str4, str, list, str2, strQ2, str3, strQ3, 17), o0VarE), aVar3, zVar, y.Q(o0VarE, R.string.calories_burned_card_no_data_state_message), null, null, o0Var, i15 & 14, 24576, 802752);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(rVar, aVar, i14, 25);
        }
    }
}
