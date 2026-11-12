package defpackage;

import health.compact.a.CommonUtil;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class lip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f40308a;
    public final double d;

    public lip(double d, double d2) {
        if (-180.0d <= d2 && d2 < 180.0d) {
            this.f40308a = b(d2);
        } else {
            this.f40308a = b(((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        }
        this.d = b(Math.max(-90.0d, Math.min(90.0d, d)));
    }

    private static double b(double d) {
        return CommonUtil.a(new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US)).format(d));
    }
}
