package ie2;

import com.google.android.gms.maps.model.LatLng;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lie2/f;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f93122a = new f();

    private f() {
    }

    public static LatLng a(double d14, double d15) {
        double d16 = d14 - 35.0d;
        double d17 = d15 - 105.0d;
        double d18 = d17 * 2.0d;
        double d19 = d16 * 0.2d * d16;
        double d24 = d17 * 0.1d;
        double d25 = d24 * d16;
        double dSqrt = Math.sqrt(Math.abs(d17)) * 0.2d;
        double d26 = 6.0d * d17 * 3.141592653589793d;
        double d27 = d18 * 3.141592653589793d;
        double dSin = ((((Math.sin(d27) * 20.0d) + (Math.sin(d26) * 20.0d)) * 2.0d) / 3.0d) + dSqrt + d25 + d19 + (d16 * 3.0d) + (-100.0d) + d18;
        double d28 = d16 * 3.141592653589793d;
        double dSin2 = ((((Math.sin(d28 / 30.0d) * ((double) 320)) + (Math.sin((d16 / 12.0d) * 3.141592653589793d) * 160.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d16 / 3.0d) * 3.141592653589793d) * 40.0d) + (Math.sin(d28) * 20.0d)) * 2.0d) / 3.0d) + dSin;
        double d29 = d24 * d17;
        double dSin3 = ((((Math.sin((d17 / 30.0d) * 3.141592653589793d) * 300.0d) + (Math.sin((d17 / 12.0d) * 3.141592653589793d) * 150.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d17 / 3.0d) * 3.141592653589793d) * 40.0d) + (Math.sin(d17 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d27) * 20.0d) + (Math.sin(d26) * 20.0d)) * 2.0d) / 3.0d) + (Math.sqrt(Math.abs(d17)) * 0.1d) + d29 + (d16 * 2.0d) + d17 + 300.0d + d25;
        double d34 = (d14 / 180.0d) * 3.141592653589793d;
        double dSin4 = Math.sin(d34);
        double d35 = ((double) 1) - ((0.006693421622965943d * dSin4) * dSin4);
        double dSqrt2 = Math.sqrt(d35);
        return new LatLng(d14 + ((dSin2 * 180.0d) / ((6335552.717000426d / (d35 * dSqrt2)) * 3.141592653589793d)), d15 + ((dSin3 * 180.0d) / ((Math.cos(d34) * (6378245.0d / dSqrt2)) * 3.141592653589793d)));
    }

    public static LatLng b(LatLng latLng) {
        latLng.getClass();
        return a(latLng.latitude, latLng.longitude);
    }
}
