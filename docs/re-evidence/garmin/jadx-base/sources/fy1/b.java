package fy1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import o13.u;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final double a(double d14, boolean z14, boolean z15) {
        double d15;
        if (z14) {
            if (!z15) {
                l3.f23124b.getClass();
                d15 = 1000.0d;
                d14 /= d15;
            }
        } else if (z15) {
            l3.f23124b.getClass();
            d14 = l3.a.S1(d14);
        } else {
            l3.f23124b.getClass();
            d15 = 1609.344d;
            d14 /= d15;
        }
        og0.a.f131967a.getClass();
        return og0.a.A(d14, 2);
    }

    public static final u<Double, Integer, Integer> b(double d14, boolean z14, boolean z15) {
        if (z14) {
            if (z15) {
                og0.a.f131967a.getClass();
                double dA = og0.a.A(d14, 2);
                return new u<>(Double.valueOf(dA), Integer.valueOf(R.string.lbl_m), Integer.valueOf(dA == 1.0d ? R.string.common_meter : R.string.meters));
            }
            og0.a aVar = og0.a.f131967a;
            l3.f23124b.getClass();
            aVar.getClass();
            double dA2 = og0.a.A(d14 / 1000.0d, 2);
            return new u<>(Double.valueOf(dA2), Integer.valueOf(R.string.lbl_km), Integer.valueOf(dA2 == 1.0d ? R.string.lbl_kilometer_singular : R.string.kilometers));
        }
        if (!z15) {
            og0.a aVar2 = og0.a.f131967a;
            l3.f23124b.getClass();
            aVar2.getClass();
            double dA3 = og0.a.A(d14 / 1609.344d, 2);
            return new u<>(Double.valueOf(dA3), Integer.valueOf(R.string.lbl_mile), Integer.valueOf(dA3 == 1.0d ? R.string.common_mile : R.string.miles));
        }
        og0.a aVar3 = og0.a.f131967a;
        l3.f23124b.getClass();
        double dS1 = l3.a.S1(d14);
        aVar3.getClass();
        double dA4 = og0.a.A(dS1, 2);
        return new u<>(Double.valueOf(dA4), Integer.valueOf(R.string.lbl_yard), Integer.valueOf(dA4 == 1.0d ? R.string.common_yard : R.string.common_yards_string));
    }

    public static final String c(double d14) {
        l3.a aVar = l3.f23124b;
        long jD = MathKt.d(d14);
        aVar.getClass();
        return l3.a.e1(jD);
    }
}
