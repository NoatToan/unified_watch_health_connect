package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class jpg implements Cloneable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DecimalFormat f38786b = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.ENGLISH));
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    public final double f38787a;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    public final double d;

    public jpg(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.f38787a = d(d2);
        } else {
            this.f38787a = d(((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        }
        this.d = d(Math.max(-90.0d, Math.min(90.0d, d)));
    }

    private static double d(double d) {
        try {
            return Double.parseDouble(f38786b.format(d));
        } catch (NumberFormatException e) {
            LogUtil.e("Track_LatLng", e.getMessage());
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public jpg clone() {
        return new jpg(this.d, this.f38787a);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f38787a);
        return ((i + 31) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public boolean equals(Object obj) {
        return (obj instanceof jpg) && hashCode() == ((jpg) obj).hashCode();
    }

    public String toString() {
        return "lat/lng";
    }
}
