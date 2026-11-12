package wp;

import am.x0;
import am.z0;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import lc.u0;
import mp.k;
import oi0.h;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: wp.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3468a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186520a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.TIME_INDOOR_ROWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.DISTANCE_SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.ASCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.CALORIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.RESTING_CALORIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.NON_PACK_WEIGHT_CALORIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.PACK_WEIGHT_CALORIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.WIN_RATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.GAMES_WON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.GAMES_AVG_WON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k.GAMES_NOT_WON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k.STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k.AVG_WIN_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k.AVG_LOSS_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k.AVG_DRAW_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k.BODY_BATTERY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k.PACK_WEIGHT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k.AVG_PACK_WEIGHT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k.PACE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f186520a = iArr;
        }
    }

    public static String a(Context context, Double d14) {
        if (!s.c(d14, 0.0d)) {
            return new h(context).d(MathKt.d(d14.doubleValue()), true);
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public static String b(Context context, Double d14, k kVar, x0 x0Var, boolean z14, boolean z15, int i14) {
        m3 m3Var;
        x0 x0Var2 = (i14 & 8) != 0 ? null : x0Var;
        boolean z16 = (i14 & 16) != 0;
        boolean z17 = (i14 & 64) == 0;
        kVar.getClass();
        int[] iArr = C3468a.f186520a;
        int i15 = iArr[kVar.ordinal()];
        int i16 = (i15 == 1 || i15 == 2) ? R.string.no_duration_value : R.string.no_value;
        DecimalFormat decimalFormat = z17 ? l3.f23135m : l3.f23126d;
        if (d14 == null) {
            String string = context.getString(i16);
            string.getClass();
            return string;
        }
        String str = x0Var2 != null ? x0Var2.f4358a : null;
        z0 z0Var = z0.f4390a;
        if (z0.b(x0.I0, str)) {
            m3Var = m3.METER;
        } else {
            m3Var = z14 ? m3.KILOMETER : m3.MILE;
        }
        switch (iArr[kVar.ordinal()]) {
            case 1:
                l3.a aVar = l3.f23124b;
                long jD = MathKt.d(d14.doubleValue() * 1000.0d);
                aVar.getClass();
                return l3.a.b1(jD);
            case 2:
                String strX1 = l3.a.x1(l3.f23124b, MathKt.d(d14.doubleValue() * ((double) 1000)));
                if (strX1 != null) {
                    return strX1;
                }
                String string2 = context.getString(i16);
                string2.getClass();
                return string2;
            case 3:
                l3.a aVar2 = l3.f23124b;
                double dDoubleValue = d14.doubleValue();
                aVar2.getClass();
                return l3.a.O(context, dDoubleValue, m3Var, decimalFormat, z16);
            case 4:
                boolean z18 = z16;
                l3.a aVar3 = l3.f23124b;
                double dDoubleValue2 = d14.doubleValue();
                aVar3.getClass();
                return l3.a.P(context, dDoubleValue2, z14 ? m3.METER : m3.YARD, l3.f23131i, z18, null);
            case 5:
                l3.a aVar4 = l3.f23124b;
                double dDoubleValue3 = d14.doubleValue();
                aVar4.getClass();
                return l3.a.c0(context, dDoubleValue3, z15, z16, false);
            case 6:
            case 7:
            case 8:
            case 9:
                return l3.a.H(l3.f23124b, new l22.a(context), d14.doubleValue(), z16);
            case 10:
            case 11:
            case 12:
            case 13:
                l3.a aVar5 = l3.f23124b;
                double dDoubleValue4 = d14.doubleValue();
                aVar5.getClass();
                return l3.a.D1(dDoubleValue4, z16);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                l3.a aVar6 = l3.f23124b;
                double dDoubleValue5 = d14.doubleValue();
                aVar6.getClass();
                return l3.a.B(dDoubleValue5);
            case 19:
            case 20:
                return l3.a.C1(l3.f23124b, context, d14.doubleValue() / 1000.0d, z14, true, null, 16);
            case 21:
                l3.a aVar7 = l3.f23124b;
                double dDoubleValue6 = d14.doubleValue();
                aVar7.getClass();
                return aVar7.r0(context, l3.a.p(dDoubleValue6, z14), z14, false, "");
            default:
                u0.r();
                return null;
        }
    }

    public static final String c(Context context, k kVar, Double d14, String str, boolean z14) {
        String strA;
        kVar.getClass();
        switch (C3468a.f186520a[kVar.ordinal()]) {
            case 1:
                strA = a(context, Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d));
                break;
            case 2:
                strA = a(context, Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d));
                break;
            case 3:
                z0 z0Var = z0.f4390a;
                strA = (z0.b(x0.I0, null) ? m3.METER : z14 ? m3.KILOMETER : m3.MILE) != m3.METER ? oi0.c.A(context, new wl.a(19), str) : oi0.c.A(context, new wl.a(18), str);
                break;
            case 4:
                strA = oi0.c.A(context, new wl.a(17), str);
                break;
            case 5:
                strA = oi0.c.A(context, new wl.a(20), str);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                strA = oi0.c.A(context, new wl.a(21), str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                strA = oi0.c.A(context, new wl.a(13), str);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                strA = oi0.c.A(context, new wl.a(22), str);
                break;
            case 18:
                strA = oi0.c.A(context, new wl.a(12), str);
                break;
            case 19:
            case 20:
                strA = oi0.c.A(context, new wl.a(11), str);
                break;
            case 21:
                strA = oi0.c.A(context, new wl.a(16), str);
                break;
            default:
                u0.r();
                return null;
        }
        return oi0.c.A(context, new wl.a(10), strA);
    }
}
