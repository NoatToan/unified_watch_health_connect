package ar;

import am.g2;
import am.x0;
import am.z0;
import android.content.Context;
import c22.b2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import f12.l;
import java.text.DecimalFormat;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;
import ps.z1;
import qs.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12516a;

        static {
            int[] iArr = new int[y.values().length];
            f12516a = iArr;
            try {
                iArr[y.UNIT_DISTANCE_MILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12516a[y.UNIT_DISTANCE_FOOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12516a[y.UNIT_DISTANCE_YARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12516a[y.UNIT_DISTANCE_INCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12516a[y.UNIT_DISTANCE_CENTIMETER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12516a[y.UNIT_DISTANCE_KILOMETER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private b() {
    }

    public static double a(double d14, String str) {
        y.f147222b.getClass();
        y yVarA = y.a.a(str);
        if (yVarA != null) {
            switch (a.f12516a[yVarA.ordinal()]) {
                case 1:
                    m3 m3Var = m3.MILE;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var);
                case 2:
                    m3 m3Var2 = m3.FOOT;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var2);
                case 3:
                    m3 m3Var3 = m3.YARD;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var3);
                case 4:
                    m3 m3Var4 = m3.INCH;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var4);
                case 5:
                    m3 m3Var5 = m3.CENTIMETER;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var5);
                case 6:
                    m3 m3Var6 = m3.KILOMETER;
                    l3.f23124b.getClass();
                    return l3.a.h(d14, m3Var6);
            }
        }
        return d14;
    }

    public static m3 b(x0 x0Var, z1 z1Var) {
        String str = x0Var != null ? x0Var.f4358a : null;
        boolean z14 = z0.Q(str) || z0.b(x0.f4297k1, str);
        boolean zB = z0.b(x0.f4313o1, str);
        boolean zB2 = z0.b(x0.f4296k0, str);
        if (z0.b(x0.I0, str) || z14 || z0.b(x0.f4301l1, str)) {
            return m3.METER;
        }
        if (zB) {
            if (z1Var == null) {
                return m3.METER;
            }
            m3 m3VarD = z1Var.d();
            Objects.requireNonNull(m3VarD);
            return m3VarD;
        }
        boolean zB3 = z0.b(x0.D, str);
        boolean zB4 = z0.b(x0.f4324r, str);
        boolean zI0 = z0.i0(str);
        boolean zX = z0.X(str);
        boolean zA0 = z0.a0(str);
        if (zI0) {
            return m3.NAUTICAL;
        }
        if (((l) KoinJavaComponent.get(l.class)).y()) {
            return (zB4 || zB3 || zX || zA0 || zB2) ? m3.METER : m3.KILOMETER;
        }
        if (zB4 || zB2) {
            return m3.YARD;
        }
        return (zB3 || zX || zA0) ? m3.FOOT : m3.MILE;
    }

    public static m3 c(ActivityListItemDTO activityListItemDTO) {
        return d(activityListItemDTO, ((l) KoinJavaComponent.get(l.class)).y() ? m3.METER : m3.FOOT);
    }

    public static m3 d(ActivityListItemDTO activityListItemDTO, m3 m3Var) {
        if (activityListItemDTO == null) {
            return m3Var;
        }
        String str = activityListItemDTO.f29265g.f4358a;
        boolean z14 = z0.Q(str) || z0.b(x0.f4297k1, str);
        if (z0.i0(str)) {
            return m3.NAUTICAL;
        }
        if (z14 || z0.b(x0.f4301l1, str)) {
            return m3.METER;
        }
        boolean zB = z0.b(x0.f4324r, str);
        boolean zB2 = z0.b(x0.D, str);
        boolean zX = z0.X(str);
        boolean zA0 = z0.a0(str);
        if (h(activityListItemDTO, ((l) KoinJavaComponent.get(l.class)).y())) {
            return (zB || zB2 || zX || zA0) ? m3.METER : m3.KILOMETER;
        }
        if (zB) {
            return m3.YARD;
        }
        return (zB2 || zX || zA0) ? m3.FOOT : m3.MILE;
    }

    public static String e(Context context, x0 x0Var, double d14, z1 z1Var, String str) {
        if (x0Var == x0.B) {
            String string = context.getString(R.string.steps_with_label);
            l3.f23124b.getClass();
            return String.format(string, l3.a.Z0((int) d14));
        }
        String str2 = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        boolean zB = z0.b(x0.f4324r, str2);
        boolean zB2 = z0.b(x0.f4313o1, str2);
        boolean z14 = !zB && z0.Q(str2);
        boolean z15 = !(zB || z14 || !z0.b(x0.f4297k1, str2)) || z0.b(x0.f4301l1, str2);
        if (zB || zB2) {
            m3 m3VarB = b(x0Var, z1Var);
            DecimalFormat decimalFormatM = (m3VarB == m3.METER || m3VarB == m3.YARD) ? l3.m() : l3.f23129g;
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3VarB, decimalFormatM, true, str);
        }
        if (z14) {
            m3 m3VarB2 = b(x0Var, z1Var);
            DecimalFormat decimalFormatM2 = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3VarB2, decimalFormatM2, true, str);
        }
        if (z15) {
            m3 m3Var = m3.METER;
            DecimalFormat decimalFormatM3 = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3Var, decimalFormatM3, true, str);
        }
        if (z0.b(x0.I0, str2)) {
            m3 m3Var2 = m3.METER;
            DecimalFormat decimalFormatM4 = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3Var2, decimalFormatM4, true, str);
        }
        m3 m3VarB3 = b(x0Var, z1Var);
        DecimalFormat decimalFormat = l3.f23129g;
        l3.f23124b.getClass();
        return l3.a.P(context, d14, m3VarB3, decimalFormat, true, str);
    }

    public static String f(Context context, ActivityListItemDTO activityListItemDTO, boolean z14, String str) {
        if (activityListItemDTO == null || Double.isNaN(activityListItemDTO.f29273j)) {
            return str;
        }
        double d14 = activityListItemDTO.f29273j;
        String str2 = activityListItemDTO.f29265g.f4358a;
        z0 z0Var = z0.f4390a;
        boolean zB = z0.b(x0.f4324r, str2);
        boolean z15 = false;
        boolean z16 = !zB && z0.Q(str2);
        boolean z17 = !(zB || z16 || !z0.b(x0.f4297k1, str2)) || z0.b(x0.f4301l1, str2);
        if (!zB && !z17 && !z16 && z0.b(x0.D, str2)) {
            z15 = true;
        }
        boolean z18 = z16;
        if (z0.i0(str2)) {
            m3 m3VarC = c(activityListItemDTO);
            DecimalFormat decimalFormat = l3.f23125c;
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3VarC, decimalFormat, true, str);
        }
        boolean z19 = z17;
        if (zB) {
            m3 m3VarD = d(activityListItemDTO, z14 ? m3.METER : m3.YARD);
            DecimalFormat decimalFormatM = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3VarD, decimalFormatM, true, str);
        }
        if (z18 || z19) {
            m3 m3VarC2 = c(activityListItemDTO);
            DecimalFormat decimalFormatM2 = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3VarC2, decimalFormatM2, true, str);
        }
        if (z0.b(x0.I0, str2)) {
            m3 m3Var = m3.METER;
            DecimalFormat decimalFormatM3 = l3.m();
            l3.f23124b.getClass();
            return l3.a.O(context, d14, m3Var, decimalFormatM3, true);
        }
        if (z15) {
            m3 m3Var2 = z14 ? m3.METER : m3.FOOT;
            DecimalFormat decimalFormatM4 = l3.m();
            l3.f23124b.getClass();
            return l3.a.P(context, d14, m3Var2, decimalFormatM4, true, str);
        }
        m3 m3VarC3 = c(activityListItemDTO);
        DecimalFormat decimalFormat2 = l3.f23125c;
        l3.f23124b.getClass();
        return l3.a.P(context, d14, m3VarC3, decimalFormat2, true, str);
    }

    public static boolean g(c cVar, boolean z14) {
        double dDoubleValue;
        double dDoubleValue2;
        if (cVar == null) {
            return z14;
        }
        String str = cVar.f12517a;
        Double d14 = cVar.f12519c;
        if (d14 == null) {
            dDoubleValue = Double.NaN;
            dDoubleValue2 = Double.NaN;
        } else {
            dDoubleValue = d14.doubleValue();
            dDoubleValue2 = Double.NaN;
        }
        z1 z1Var = cVar.f12518b;
        Double d15 = cVar.f12520d;
        if (d15 != null) {
            dDoubleValue2 = d15.doubleValue();
        }
        return i(str, dDoubleValue, z1Var, z14, dDoubleValue2);
    }

    public static boolean h(ActivityListItemDTO activityListItemDTO, boolean z14) {
        if (activityListItemDTO == null) {
            return z14;
        }
        return i(activityListItemDTO.f29265g.f4358a, activityListItemDTO.f29273j, activityListItemDTO.f29254c1, z14, activityListItemDTO.N0);
    }

    public static boolean i(String str, double d14, z1 z1Var, boolean z14, double d15) {
        boolean z15 = b2.a(Double.valueOf(d15)) && d15 > 0.0d;
        z0 z0Var = z0.f4390a;
        boolean z16 = z0.b(x0.f4313o1, str) || z15;
        boolean z17 = z0.Q(str) || z0.b(x0.f4297k1, str);
        if (z16) {
            if (z1Var == null || z1Var.h() == null) {
                return (((double) Math.round(d14)) == d14 && d14 % g2.f3977f.f3984c == 0.0d) || d14 % g2.f3978g.f3984c == 0.0d;
            }
            return y.UNIT_DISTANCE_METER.equals(z1Var.h());
        }
        if (z17 || z0.b(x0.f4301l1, str)) {
            return true;
        }
        return z14;
    }
}
