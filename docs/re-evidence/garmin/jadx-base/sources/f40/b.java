package f40;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import f12.l;
import f21.g0;
import h4.r;
import i3.e5;
import l72.p2;
import oi0.h;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    public static final void a(r rVar, i iVar, Double d14, Double d15, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        String str;
        g gVar;
        g gVar2;
        g gVar3;
        String str2;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1136835716);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.k(iVar.ordinal()) ? 32 : 16) | (o0VarE.B(d14) ? 256 : 128) | (o0VarE.B(d15) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            boolean z14 = iVar.d() || iVar == i.HIKING;
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1655376518, R.string.lbl_pace_calculator_virtual_partner, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1655295143, R.string.lbl_speed_calculator_virtual_partner, o0VarE, false);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (z14) {
                if (Double.isNaN(d14.doubleValue()) || d14.doubleValue() <= 0.0d) {
                    str = "";
                    gVar = new g(str, str);
                } else {
                    boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                    l3.a aVar2 = l3.f23124b;
                    double dDoubleValue = d14.doubleValue();
                    aVar2.getClass();
                    double dP = l3.a.p(dDoubleValue, zY);
                    str = "";
                    gVar = new g(aVar2.r0(context, dP, zY, true, ""), e5.g(new h(context).d(MathKt.d(dP), true), StringUtils.SPACE, new oi0.g(context).a(zY)));
                }
            } else if (Double.isNaN(d14.doubleValue()) || d14.doubleValue() <= 0.0d) {
                str = "";
                gVar = new g(str, str);
            } else {
                q3 q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.a aVar3 = l3.f23124b;
                double dDoubleValue2 = d14.doubleValue();
                aVar3.getClass();
                String strN0 = l3.a.N0(context, dDoubleValue2, q3Var, l3.f23130h, true, "");
                str = "";
                gVar = new g(strN0, oi0.c.A(context, new g0(4), strN0));
            }
            if (d15 == null || Double.isNaN(d15.doubleValue()) || d15.doubleValue() <= 0.0d) {
                context = context;
                context = context;
                context = context;
                gVar2 = new g(str, str);
            } else {
                long jDoubleValue = (long) d15.doubleValue();
                l3.f23124b.getClass();
                String strE1 = l3.a.e1(jDoubleValue);
                if (strE1 == null) {
                    context = context;
                    str2 = str;
                } else {
                    context = context;
                    str2 = strE1;
                }
                gVar2 = new g(str2, new h(context).d(jDoubleValue, true));
            }
            String str3 = gVar.f68856a;
            if (str3.equals(str)) {
                String string = context.getString(R.string.no_value);
                string.getClass();
                gVar3 = new g(string, oi0.c.A(context, new g0(3), string));
            } else {
                String str4 = gVar2.f68856a;
                if (str4.equals(str)) {
                    String string2 = context.getString(R.string.no_value);
                    string2.getClass();
                    gVar3 = new g(string2, oi0.c.A(context, new g0(3), string2));
                } else {
                    String string3 = context.getString(R.string.string_space_bullet_string_pattern, str3, str4);
                    string3.getClass();
                    String string4 = context.getString(R.string.string_space_bullet_string_pattern, gVar.f68857b, gVar2.f68857b);
                    string4.getClass();
                    gVar3 = new g(string3, string4);
                }
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", gVar3.f68857b);
            b92.a aVarB = c0235a.b();
            String str5 = strJ;
            p2 p2Var = p2.f111205a;
            boolean z15 = aVar != null;
            boolean z16 = (i15 & 57344) == 16384;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new eu.a(aVar, 6);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new eu.a(aVar, 6);
                    o0VarE.K(objQ);
                }
            }
            int i16 = b92.a.f16960b;
            o0Var = o0VarE;
            p2Var.h(str5, gVar3.f68856a, null, rVar, aVarB, z15, false, null, null, null, (e23.a) objQ, o0Var, (i15 << 9) & 7168, 0, 964);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(rVar, iVar, d14, d15, aVar, i14, 17);
        }
    }
}
