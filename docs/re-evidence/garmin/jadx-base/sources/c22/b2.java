package c22;

import java.text.DecimalFormatSymbols;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/b2;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f23009a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f23010b = DecimalFormatSymbols.getInstance().getDecimalSeparator();

    private b2() {
    }

    public static final boolean a(Double... dArr) {
        boolean z14 = false;
        for (Double d14 : dArr) {
            if (d14 == null || Double.isNaN(d14.doubleValue())) {
                z14 = true;
                break;
            }
        }
        return !z14;
    }

    public static final boolean b(Double d14, Double d15) {
        if (d14 == null) {
            return !(d14 != null);
        }
        double dDoubleValue = d15.doubleValue();
        double dDoubleValue2 = d14.doubleValue();
        return !Double.isNaN(dDoubleValue) && (!(Double.isNaN(dDoubleValue2) || p005kotlin.jvm.internal.s.a(dDoubleValue2, d15) || Math.abs(dDoubleValue2 - dDoubleValue) < 0.01d) || Double.isNaN(dDoubleValue2));
    }

    public static final o13.p c(double d14) {
        double d15 = (((double) 5) / 100.0d) * d14;
        return new o13.p(Double.valueOf(d14 - d15), Double.valueOf(d14 + d15));
    }

    public static double[] d() {
        double[] dArr = new double[100];
        for (int i14 = 0; i14 < 100; i14++) {
            dArr[i14] = (Math.pow(((double) i14) / ((double) 99), 6.0d) * (-1.0d)) + 1.0d;
        }
        return dArr;
    }
}
