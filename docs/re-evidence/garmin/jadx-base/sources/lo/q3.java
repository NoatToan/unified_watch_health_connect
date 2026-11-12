package lo;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public final class q3 {
    private q3() {
    }

    public static double a(double d14, am.x0 x0Var, boolean z14) {
        double d15;
        if (Double.isNaN(d14) || d14 == 0.0d) {
            return Double.NaN;
        }
        double d16 = 1.0d / d14;
        String str = x0Var.f4358a;
        String str2 = x0Var.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(am.x0.f4297k1, str) || am.z0.Q(str2) || am.z0.b(am.x0.f4301l1, str2)) {
            d15 = 500.0d;
        } else if (x0Var == am.x0.f4317p1 || x0Var == am.x0.f4324r || x0Var == am.x0.f4313o1) {
            d15 = z14 ? 100.0d : 91.44d;
        } else {
            d15 = z14 ? 1000.0d : 1609.344d;
        }
        return d16 * d15;
    }

    public static int b(am.x0 x0Var, boolean z14) {
        String str = x0Var.f4358a;
        int i14 = z14 ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile;
        if (am.z0.I(str)) {
            return R.string.lbl_minute_per_nautical_mile;
        }
        if (am.z0.b(am.x0.f4308n, str) || am.z0.b(am.x0.f4331t, str) || am.z0.b(am.x0.f4320q, str) || am.z0.b(am.x0.F2, str)) {
            return z14 ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile;
        }
        if (x0Var != am.x0.f4317p1 && x0Var != am.x0.f4313o1) {
            return (am.z0.Q(str) || am.z0.b(am.x0.f4297k1, str) || am.z0.b(am.x0.f4301l1, str)) ? R.string.lbl_minute_500_meters : i14;
        }
        c22.l3.f23124b.getClass();
        return c22.l3.a.O1(z14);
    }
}
