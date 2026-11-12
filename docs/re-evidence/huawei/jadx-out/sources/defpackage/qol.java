package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class qol implements Cloneable {
    private static final DecimalFormat d = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.ENGLISH));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f46564b;
    public final double e;

    public qol(double d2, double d3) {
        if (-180.0d <= d3 && d3 < 180.0d) {
            this.f46564b = c(d3);
        } else {
            this.f46564b = c(((((d3 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        }
        this.e = c(Math.max(-90.0d, Math.min(90.0d, d2)));
    }

    private static double c(double d2) {
        try {
            return Double.parseDouble(d.format(d2));
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LatLng", e.getMessage());
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public qol clone() {
        return new qol(this.e, this.f46564b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.e);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f46564b);
        return ((i + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public boolean equals(Object obj) {
        return (obj instanceof qol) && hashCode() == ((qol) obj).hashCode();
    }

    public String toString() {
        return "lat/lng";
    }
}
