package wq;

import am.x0;
import am.z0;
import c22.l3;
import c22.m3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import p005kotlin.math.MathKt;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186551b;

        static {
            int[] iArr = new int[uq.i.values().length];
            try {
                iArr[uq.i.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.i.DISTANCE_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq.i.POOL_APNEA_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uq.i.AVG_POOL_VELOCITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uq.i.MAX_SPEED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uq.i.AVG_SPEED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uq.i.AVG_MOVING_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uq.i.MAX_NAUT_SOG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uq.i.AVG_NAUT_SOG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uq.i.AVG_DESCENT_SPEED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uq.i.MIN_HR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uq.i.AVG_HR_SHORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uq.i.AVG_HR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uq.i.MAX_HR_SHORT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[uq.i.MAX_HR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[uq.i.MIN_TEMPERATURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[uq.i.MAX_TEMPERATURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[uq.i.AVG_TEMPERATURE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[uq.i.MIN_WATER_TEMPERATURE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[uq.i.MAX_POWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[uq.i.AVG_POWER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[uq.i.CYCLING_AVG_POWER.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[uq.i.CYCLING_GOAL_POWER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[uq.i.NORMALIZED_POWER.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[uq.i.MAX_BIKE_FORCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[uq.i.AVG_BIKE_FORCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[uq.i.NORMALIZED_FORCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[uq.i.AVG_RUN_CADENCE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[uq.i.MAX_RUN_CADENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[uq.i.AVG_BIKE_CADENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[uq.i.MAX_BIKE_CADENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[uq.i.ELEVATION_GAIN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[uq.i.ASCENT_ELEVATION_GAIN.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[uq.i.ELEVATION_LOSS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[uq.i.DESCENT_ELEVATION_LOSS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[uq.i.MAX_DEPTH.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[uq.i.AVG_PACE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[uq.i.AVG_GAP.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[uq.i.AVG_MOVING_PACE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[uq.i.BEST_PACE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[uq.i.GOAL_PACE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[uq.i.AVG_COMPARISON_PACE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[uq.i.CALORIES.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[uq.i.AVG_STRIDE_LENGTH.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[uq.i.MAX_SPEED_10S_NAUTICAL.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[uq.i.SPEED_10S_NAUTICAL.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[uq.i.MAX_SPEED_2S_NAUTICAL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[uq.i.MAX_SPEED_NAUTICAL.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[uq.i.AVG_SPEED_NAUTICAL.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[uq.i.MAX_SPEED_10S.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[uq.i.MAX_SPEED_2S.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[uq.i.AVG_SPEED_USER_UNIT.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[uq.i.MAX_SPEED_USER_UNIT.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[uq.i.AVG_GCT.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC_RATIO.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[uq.i.PACK_WEIGHT.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            f186550a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.DIVE_INTERVAL_DYN.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr2[x.DIVE_INTERVAL_STA.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr2[x.DIVE_INTERVAL_REST.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            f186551b = iArr2;
        }
    }

    public static final int a(Double d14, boolean z14) {
        if (d14 == null) {
            return 0;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.u(dDoubleValue, z14);
    }

    public static final String b(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Math.rint(d14.doubleValue()));
        return sb3.toString();
    }

    public static final String c(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        double dCeil = Math.ceil(d14.doubleValue());
        l3.f23124b.getClass();
        return new StringBuilder(l3.f23131i.format(dCeil)).toString();
    }

    public static final String d(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue())) {
            return null;
        }
        l3.f23124b.getClass();
        return new StringBuilder(l3.f23131i.format(d14.doubleValue())).toString();
    }

    public static final String e(Double d14, String str) {
        DecimalFormat decimalFormat;
        str.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return null;
        }
        m3 m3VarB = ar.b.b(z0.m(str), null);
        m3VarB.getClass();
        StringBuilder sb3 = new StringBuilder();
        m3 m3Var = m3.METER;
        if (p13.u.z(new m3[]{m3Var, m3.FOOT}, m3VarB)) {
            l3.f23124b.getClass();
            decimalFormat = l3.f23131i;
        } else {
            decimalFormat = l3.f23129g;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        sb3.append(decimalFormat.format(l3.a.g(dDoubleValue, m3Var, m3VarB)).toString());
        return sb3.toString();
    }

    public static final String f(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return null;
        }
        return l3.a.x1(l3.f23124b, MathKt.d(d14.doubleValue() * ((double) 1000)));
    }

    public static final String g(Double d14, boolean z14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(l3.f23126d.format(Integer.valueOf(MathKt.b(d14.doubleValue() * (z14 ? 1.0d : 3.2808399d)))));
        return sb3.toString();
    }

    public static final String h(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.i0(bVar, dDoubleValue, false);
    }

    public static final String i(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.j0(bVar, dDoubleValue);
    }

    public static final String j(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return bVar.getString(R.string.no_value);
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public static final String k(l22.b bVar, Double d14, Double d15) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || d15 == null || Double.isNaN(d15.doubleValue())) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return bVar.a(R.string.lbl_lr_cycling_metric, bVar.a(R.string.lbl_value_percent, l3.a.B(dDoubleValue)), bVar.a(R.string.lbl_value_percent, l3.a.B(d15.doubleValue())));
    }

    public static final String l(l22.b bVar, Double d14, boolean z14) {
        bVar.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return bVar.getString(R.string.no_duration_value);
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.t0(aVar, bVar, l3.a.u(dDoubleValue, z14));
    }

    public static final String m(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        m3 m3VarB = ar.b.b(x0.f4296k0, null);
        m3VarB.getClass();
        StringBuilder sb3 = new StringBuilder();
        l3.f23124b.getClass();
        sb3.append(l3.f23130h.format(l3.a.g(d14.doubleValue(), m3.METER, m3VarB)).toString());
        return sb3.toString();
    }

    public static final String n(Double d14, boolean z14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        q3 q3Var = z14 ? q3.METERS_PER_SECOND : q3.FEET_PER_SECOND;
        StringBuilder sb3 = new StringBuilder();
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        double dI = l3.a.i(dDoubleValue, q3Var);
        if (!Double.isNaN(dI) && dI != 0.0d) {
            String str = (q3Var.f23219a ? l3.f23129g : l3.f23130h).format(dI);
            str.getClass();
            sb3.append(str);
        }
        return sb3.toString();
    }

    public static final String o(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.f23124b.getClass();
        return new StringBuilder(l3.f23131i.format(d14.doubleValue())).toString();
    }

    public static final String p(l22.b bVar, Double d14) {
        if (Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.H0(bVar, dDoubleValue, false, "");
    }

    public static final String q(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Math.rint(d14.doubleValue()));
        return sb3.toString();
    }

    public static final String r(q3 q3Var, Double d14) {
        q3Var.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        double dW = l3.a.w(dDoubleValue, q3.METERS_PER_SECOND, q3Var);
        if (!Double.isNaN(dW) && dW != 0.0d) {
            String str = l3.f23130h.format(dW);
            str.getClass();
            sb3.append(str);
        }
        return sb3.toString();
    }

    public static final String s(String str, Double d14, boolean z14) {
        q3 q3Var;
        str.getClass();
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        if (z0.I(str)) {
            q3Var = q3.NAUTICAL_MILES_PER_HOUR;
        } else {
            q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        }
        StringBuilder sb3 = new StringBuilder();
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        double dI = l3.a.i(dDoubleValue, q3Var);
        if (!Double.isNaN(dI) && dI != 0.0d) {
            String str2 = l3.f23130h.format(dI);
            str2.getClass();
            sb3.append(str2);
        }
        return sb3.toString();
    }

    public static final String t(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return bVar.getString(R.string.no_value);
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public static final String u(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        return l3.f23129g.format(d14.doubleValue() / ((double) 100));
    }

    public static final String v(Double d14, boolean z14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(z14 ? d14.doubleValue() : l3.a.d(d14.doubleValue()));
    }

    public static final String w(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        long jD = MathKt.d(d14.doubleValue());
        aVar.getClass();
        return l3.a.e1(jD);
    }

    public static final String x(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.z1(bVar, dDoubleValue, false);
    }

    public static final String y(l22.b bVar, Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue()) || p005kotlin.jvm.internal.s.c(d14, 0.0d)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.A1(bVar, dDoubleValue, false);
    }
}
