package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11807a = new a();

    private a() {
    }

    public static final String A(Context context, String str) {
        context.getClass();
        return B(new l22.a(context), str);
    }

    public static final String B(l22.b bVar, String str) {
        return (str == null || str.length() == 0) ? bVar.getString(R.string.no_value) : str;
    }

    public static final String C(Context context, Double d14, boolean z14) {
        Context context2;
        String strM1;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            String string = context.getString(R.string.no_duration_value);
            string.getClass();
            context2 = context;
            strM1 = aVar.M1(context2, dDoubleValue, z14, false, string);
        } else {
            context2 = context;
            strM1 = null;
        }
        return A(context2, strM1);
    }

    public static String D(Context context, Double d14, boolean z14) {
        Context context2;
        String strJ1;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            String string = context.getString(R.string.no_duration_value);
            string.getClass();
            context2 = context;
            strJ1 = aVar.J1(context2, dDoubleValue, false, z14, false, string);
        } else {
            context2 = context;
            strJ1 = null;
        }
        return A(context2, strJ1);
    }

    public static String E(Context context, Double d14) {
        context.getClass();
        return A(context, d14 != null ? c22.l3.a.F0(c22.l3.f23124b, context, d14.doubleValue(), false) : null);
    }

    public static String F(Context context, Double d14, double d15) {
        String strG0;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue() / d15;
            aVar.getClass();
            strG0 = c22.l3.a.G0(context, dDoubleValue, false, "");
        } else {
            strG0 = null;
        }
        return A(context, strG0);
    }

    public static String G(Context context, Double d14) {
        Context context2;
        String strP;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = c22.m3.METER;
            DecimalFormat decimalFormat = c22.l3.f23129g;
            String string = context.getString(R.string.no_value);
            aVar.getClass();
            context2 = context;
            strP = c22.l3.a.P(context2, dDoubleValue, m3Var, decimalFormat, false, string);
        } else {
            context2 = context;
            strP = null;
        }
        return A(context2, strP);
    }

    public static String H(Context context, Double d14) {
        Integer numValueOf;
        Context context2;
        context.getClass();
        String strR0 = null;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            numValueOf = Integer.valueOf(c22.l3.a.q(dDoubleValue));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            c22.l3.a aVar2 = c22.l3.f23124b;
            double dIntValue = numValueOf.intValue();
            aVar2.getClass();
            context2 = context;
            strR0 = aVar2.r0(context2, dIntValue, true, false, "");
        } else {
            context2 = context;
        }
        return A(context2, strR0);
    }

    public static String I(Context context, Double d14) {
        String strE;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strE = c22.l3.a.E(context, dDoubleValue, false, false);
        } else {
            strE = null;
        }
        return A(context, strE);
    }

    public static String J(Context context, Double d14, gg1.o0 o0Var) {
        String strY;
        context.getClass();
        o0Var.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strY = c22.l3.a.Y(context, dDoubleValue, o0Var, false);
        } else {
            strY = null;
        }
        return A(context, strY);
    }

    public static final String K(Context context, Double d14, boolean z14) {
        Context context2;
        String strN0;
        context.getClass();
        c22.q3 q3Var = z14 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            context2 = context;
            strN0 = c22.l3.a.N0(context2, dDoubleValue, q3Var, c22.l3.f23130h, false, context.getString(R.string.no_value));
        } else {
            context2 = context;
            strN0 = null;
        }
        return A(context2, strN0);
    }

    public static final String M(Context context, Double d14) {
        return A(context, ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS, new l22.a(context), d14, 24));
    }

    public static final String N(Context context, Double d14) {
        return A(context, ss.k.b(ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT, new l22.a(context), d14, 24));
    }

    public static String O(Context context, Double d14) {
        String strR0;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            l22.a aVar2 = new l22.a(context);
            double dDoubleValue = d14.doubleValue() / ((double) 100);
            aVar.getClass();
            strR0 = c22.l3.a.R0(aVar2, dDoubleValue, false);
        } else {
            strR0 = null;
        }
        return A(context, strR0);
    }

    public static final String P(Context context, Double d14) {
        String strD;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strD = Double.isNaN(dDoubleValue) ? "" : c22.l3.a.D(dDoubleValue);
        } else {
            strD = null;
        }
        return A(context, strD);
    }

    public static final String Q(Context context, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        c22.l3.f23124b.getClass();
        String string2 = context.getString(R.string.lbl_value_percent, c22.l3.f23131i.format(d14.doubleValue()));
        string2.getClass();
        return string2;
    }

    public static final String R(Context context, Double d14) {
        String strE;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strE = c22.l3.a.E(context, dDoubleValue, false, false);
        } else {
            strE = null;
        }
        return A(context, strE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    public static final String S(Context context, Double d14, boolean z14) {
        Context context2;
        String strP = null;
        if (d14 == null) {
            context2 = context;
        } else {
            if ((d14.doubleValue() >= 0.0d ? d14 : null) != null) {
                c22.l3.a aVar = c22.l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                c22.m3 m3Var = z14 ? c22.m3.METER : c22.m3.YARD;
                aVar.getClass();
                context2 = context;
                strP = c22.l3.a.P(context2, dDoubleValue, m3Var, c22.l3.f23131i, false, context.getString(R.string.no_value));
            } else {
                context2 = context;
            }
        }
        return A(context2, strP);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public static final String T(Context context, Double d14, boolean z14) {
        Context context2;
        String strJ1 = null;
        if (d14 == null) {
            context2 = context;
        } else {
            if ((d14.doubleValue() >= 0.0d ? d14 : null) != null) {
                c22.l3.a aVar = c22.l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                String string = context.getString(R.string.no_duration_value);
                string.getClass();
                context2 = context;
                strJ1 = aVar.J1(context2, dDoubleValue, true, z14, false, string);
            } else {
                context2 = context;
            }
        }
        return A(context2, strJ1);
    }

    public static final String U(Context context, Double d14) {
        String strB;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strB = c22.l3.a.B(dDoubleValue);
        } else {
            strB = null;
        }
        return A(context, strB);
    }

    public static String V(Context context, Double d14) {
        String strU0 = null;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            l22.a aVar2 = new l22.a(context);
            double dDoubleValue = d14.doubleValue();
            boolean zC = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c();
            aVar.getClass();
            strU0 = c22.l3.a.U0(aVar2, dDoubleValue, zC, false, false);
        }
        return A(context, strU0);
    }

    public static final String W(Context context, Double d14) {
        context.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        String strX1 = c22.l3.a.x1(c22.l3.f23124b, MathKt.d(d14.doubleValue() * ((double) 1000)));
        if (strX1 != null) {
            return strX1;
        }
        String string2 = context.getString(R.string.no_value);
        string2.getClass();
        return string2;
    }

    public static final String X(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return bVar.getString(R.string.no_value);
        }
        if (d14.doubleValue() >= 172800.0d) {
            return bVar.getString(R.string.no_value);
        }
        String strX1 = c22.l3.a.x1(c22.l3.f23124b, MathKt.d(d14.doubleValue() * ((double) 1000)));
        return strX1 == null ? bVar.getString(R.string.no_value) : strX1;
    }

    public static final String Y(Context context, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        long jD = MathKt.d(d14.doubleValue() * ((double) 1000));
        c22.l3.a aVar = c22.l3.f23124b;
        l22.a aVar2 = new l22.a(context);
        aVar.getClass();
        return c22.l3.a.m1(jD, aVar2, false);
    }

    public static final String Z(Context context, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        long jD = MathKt.d(d14.doubleValue() * ((double) 1000));
        c22.l3.f23124b.getClass();
        return c22.l3.a.b1(jD);
    }

    public static String a(a aVar, Context context, double d14, double d15, String str, boolean z14) {
        aVar.getClass();
        str.getClass();
        double d16 = d15 > 0.0d ? d14 / d15 : 0.0d;
        if (am.z0.Q(str) || am.z0.b(am.x0.f4297k1, str) || am.z0.b(am.x0.f4301l1, str)) {
            return H(context, Double.valueOf(d16));
        }
        if (am.z0.b(am.x0.f4308n, str)) {
            return D(context, Double.valueOf(d16), z14);
        }
        if (am.z0.b(am.x0.f4312o, str)) {
            return K(context, Double.valueOf(d16), z14);
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public static final String a0(Context context, Double d14) {
        context.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        c22.l3.a aVar = c22.l3.f23124b;
        long jD = MathKt.d(d14.doubleValue());
        aVar.getClass();
        String strE1 = c22.l3.a.e1(jD);
        if (strE1 != null) {
            return strE1;
        }
        String string2 = context.getString(R.string.no_value);
        string2.getClass();
        return string2;
    }

    public static final String b(Context context, Double d14) {
        String strT0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strT0 = c22.l3.a.T0(dDoubleValue, context, false);
        } else {
            strT0 = null;
        }
        return A(context, strT0);
    }

    public static String b0(Context context, Double d14) {
        String strY1;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strY1 = c22.l3.a.y1(new l22.a(context), dDoubleValue, false, "");
        } else {
            strY1 = null;
        }
        return A(context, strY1);
    }

    public static String c(Context context, Double d14) {
        String strE;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strE = c22.l3.a.E(context, dDoubleValue, false, true);
        } else {
            strE = null;
        }
        return A(context, strE);
    }

    public static String c0(a aVar, Context context, String str, double d14) {
        aVar.getClass();
        str.getClass();
        if (!am.z0.Q(str)) {
            if (am.z0.b(am.x0.f4297k1, str) || am.z0.b(am.x0.f4301l1, str)) {
                return r(context, Double.valueOf(d14));
            }
            return am.z0.b(am.x0.I0, str) ? d0(context, Double.valueOf(d14)) : f(context, Double.valueOf(d14));
        }
        c22.l3.a aVar2 = c22.l3.f23124b;
        c22.m3 m3Var = c22.m3.METER;
        DecimalFormat decimalFormat = c22.l3.f23129g;
        String string = context.getString(R.string.no_value);
        aVar2.getClass();
        return A(context, c22.l3.a.P(context, d14, m3Var, decimalFormat, false, string));
    }

    public static String d(Context context, Double d14) {
        context.getClass();
        return A(context, d14 != null ? c22.l3.a.H(c22.l3.f23124b, new l22.a(context), d14.doubleValue(), false) : null);
    }

    public static final String d0(Context context, Double d14) {
        Context context2;
        String strP;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = c22.m3.METER;
            aVar.getClass();
            context2 = context;
            strP = c22.l3.a.P(context2, dDoubleValue, m3Var, c22.l3.f23131i, false, context.getString(R.string.no_value));
        } else {
            context2 = context;
            strP = null;
        }
        return A(context2, strP);
    }

    public static final String e(Context context, Double d14, Double d15) {
        String string;
        if (d14 == null || d15 == null) {
            string = null;
        } else {
            double dDoubleValue = d15.doubleValue();
            double dDoubleValue2 = d14.doubleValue();
            c22.l3.f23124b.getClass();
            string = context.getString(R.string.lbl_lr_cycling_metric, context.getString(R.string.lbl_value_percent, c22.l3.a.B(dDoubleValue2)), context.getString(R.string.lbl_value_percent, c22.l3.a.B(dDoubleValue)));
        }
        return A(context, string);
    }

    public static final String f(Context context, Double d14) {
        Context context2;
        context.getClass();
        String strP = null;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? c22.m3.KILOMETER : c22.m3.MILE;
            DecimalFormat decimalFormat = c22.l3.f23129g;
            String string = context.getString(R.string.no_value);
            aVar.getClass();
            context2 = context;
            strP = c22.l3.a.P(context2, dDoubleValue, m3Var, decimalFormat, false, string);
        } else {
            context2 = context;
        }
        return A(context2, strP);
    }

    public static String f0(Context context, Double d14) {
        context.getClass();
        String strZ1 = null;
        if (d14 != null && d14.doubleValue() > 0.0d) {
            c22.l3.a aVar = c22.l3.f23124b;
            l22.a aVar2 = new l22.a(context);
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strZ1 = c22.l3.a.z1(aVar2, dDoubleValue, false);
        }
        return A(context, strZ1);
    }

    public static String g0(Context context, Double d14) {
        context.getClass();
        String strA1 = null;
        if (d14 != null && d14.doubleValue() > 0.0d) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strA1 = c22.l3.a.A1(new l22.a(context), dDoubleValue, false);
        }
        return A(context, strA1);
    }

    public static final String h(Context context, Double d14, boolean z14) {
        Context context2;
        String strP;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = z14 ? c22.m3.KILOMETER : c22.m3.MILE;
            DecimalFormat decimalFormat = c22.l3.f23129g;
            String string = context.getString(R.string.no_value);
            aVar.getClass();
            context2 = context;
            strP = c22.l3.a.P(context2, dDoubleValue, m3Var, decimalFormat, false, string);
        } else {
            context2 = context;
            strP = null;
        }
        return A(context2, strP);
    }

    public static final int h0(int i14, Context context) {
        context.getClass();
        return i14 % 2 == 0 ? a7.b.getColor(context, R.color.gcm_table_row_even) : a7.b.getColor(context, R.color.gcm_table_row_odd);
    }

    public static String i(l22.b bVar, Double d14) {
        l22.b bVar2;
        String strR = null;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? c22.m3.METER : c22.m3.FOOT;
            aVar.getClass();
            bVar2 = bVar;
            strR = c22.l3.a.R(bVar2, dDoubleValue, m3Var, c22.l3.f23131i, false, bVar.getString(R.string.no_value));
        } else {
            bVar2 = bVar;
        }
        return B(bVar2, strR);
    }

    public static String j(Context context, Double d14, gg1.o0 o0Var) {
        Context context2;
        String strA0;
        context.getClass();
        o0Var.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            context2 = context;
            strA0 = c22.l3.a.a0(context2, dDoubleValue, o0Var, false, false);
        } else {
            context2 = context;
            strA0 = null;
        }
        return A(context2, strA0);
    }

    public static final String k(Context context, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        c22.l3.f23124b.getClass();
        String str = c22.l3.f23131i.format(d14.doubleValue());
        str.getClass();
        return str;
    }

    public static final String l(Context context, Double d14) {
        String strE0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strE0 = c22.l3.a.e0(context, dDoubleValue);
        } else {
            strE0 = null;
        }
        return A(context, strE0);
    }

    public static String m(Context context, Double d14) {
        String strG0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strG0 = c22.l3.a.g0(new l22.a(context), dDoubleValue, false, "");
        } else {
            strG0 = null;
        }
        return A(context, strG0);
    }

    public static String n(Context context, Double d14) {
        context.getClass();
        String strI0 = null;
        if (d14 != null && d14.doubleValue() > 0.0d) {
            c22.l3.a aVar = c22.l3.f23124b;
            l22.a aVar2 = new l22.a(context);
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strI0 = c22.l3.a.i0(aVar2, dDoubleValue, false);
        }
        return A(context, strI0);
    }

    public static final String o(Context context, Double d14) {
        String strJ;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            l22.a aVar2 = new l22.a(context);
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strJ = c22.l3.a.J(aVar2, dDoubleValue);
        } else {
            strJ = null;
        }
        return A(context, strJ);
    }

    public static final String p(Context context, Double d14) {
        String strH0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strH0 = c22.l3.a.h0(context, dDoubleValue);
        } else {
            strH0 = null;
        }
        return A(context, strH0);
    }

    public static String q(Context context, Double d14) {
        context.getClass();
        return A(context, d14 != null ? c22.l3.a.l0(c22.l3.f23124b, new l22.a(context), d14.doubleValue(), false) : null);
    }

    public static final String r(Context context, Double d14) {
        Context context2;
        String strP;
        context.getClass();
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.m3 m3Var = c22.m3.METER;
            aVar.getClass();
            context2 = context;
            strP = c22.l3.a.P(context2, dDoubleValue, m3Var, c22.l3.f23131i, false, context.getString(R.string.no_value));
        } else {
            context2 = context;
            strP = null;
        }
        return A(context2, strP);
    }

    public static final String t(Context context, Integer num) {
        return A(context, num != null ? String.valueOf(num.intValue()) : null);
    }

    public static final String u(int i14) {
        return i14 > 0 ? String.valueOf(i14) : "";
    }

    public static final String v(Context context, Double d14) {
        return A(context, (d14 == null || Double.isNaN(d14.doubleValue()) || d14.doubleValue() < 0.0d) ? null : String.valueOf((int) d14.doubleValue()));
    }

    public static final String w(l22.b bVar, Double d14, Double d15) {
        String string;
        if (d14 == null || d15 == null) {
            string = null;
        } else {
            double dDoubleValue = d15.doubleValue();
            double dDoubleValue2 = d14.doubleValue();
            c22.l3.f23124b.getClass();
            string = (Double.isNaN(dDoubleValue2) || Double.isNaN(dDoubleValue)) ? bVar.getString(R.string.no_value) : bVar.a(R.string.location_format_with_6_decimals_and_comma, Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
        }
        return B(bVar, string);
    }

    public static final String x(Context context, Double d14) {
        String strT0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            strT0 = c22.l3.a.T0(dDoubleValue, context, false);
        } else {
            strT0 = null;
        }
        return A(context, strT0);
    }

    public static final String y(Context context, Double d14) {
        String string;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            string = context.getString(R.string.no_duration_value);
            string.getClass();
            aVar.getClass();
            if (!Double.isNaN(dDoubleValue)) {
                string = aVar.p0(c22.l3.a.o(dDoubleValue), context);
            }
        } else {
            string = null;
        }
        return A(context, string);
    }

    public static final String z(Context context, Double d14) {
        Context context2;
        String strN0;
        if (d14 != null) {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            c22.q3 q3Var = c22.q3.NAUTICAL_MILES_PER_HOUR;
            aVar.getClass();
            context2 = context;
            strN0 = c22.l3.a.N0(context2, dDoubleValue, q3Var, c22.l3.f23130h, false, context.getString(R.string.no_value));
        } else {
            context2 = context;
            strN0 = null;
        }
        return A(context2, strN0);
    }
}
