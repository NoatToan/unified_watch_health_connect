package s20;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import o13.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls20/e;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f156007a = new e();

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    public static u a(ArrayList arrayList, com.garmin.android.library.mapsdkadapter.f fVar) {
        double d14;
        double d15 = -1.0d;
        int i14 = -1;
        if (fVar != null) {
            LatLng latLng = fVar.f50283a;
            if (arrayList != null) {
                int i15 = 1;
                if (arrayList.size() > 1) {
                    int i16 = 0;
                    if (fVar.f50284b != ((com.garmin.android.library.mapsdkadapter.f) arrayList.get(0)).f50284b) {
                        f60.a.a(new f60.b("Inconsistent geodetic system."), null, null, null);
                    }
                    int size = arrayList.size();
                    com.garmin.android.library.mapsdkadapter.f fVar2 = fVar;
                    double d16 = -1.0d;
                    while (i16 < size) {
                        com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) arrayList.get(i16);
                        if (i15 < size) {
                            com.garmin.android.library.mapsdkadapter.f fVar4 = (com.garmin.android.library.mapsdkadapter.f) arrayList.get(i15);
                            double dDistanceToLine = PolyUtil.distanceToLine(latLng, fVar3.f50283a, fVar4.f50283a);
                            if (d16 != d15 && dDistanceToLine >= d16) {
                                d14 = d15;
                            } else {
                                if (fVar3.equals(fVar4)) {
                                    d14 = d15;
                                } else {
                                    double radians = Math.toRadians(latLng.latitude);
                                    d14 = d15;
                                    double radians2 = Math.toRadians(latLng.longitude);
                                    LatLng latLng2 = fVar3.f50283a;
                                    double radians3 = Math.toRadians(latLng2.latitude);
                                    double radians4 = Math.toRadians(latLng2.longitude);
                                    LatLng latLng3 = fVar4.f50283a;
                                    double radians5 = Math.toRadians(latLng3.latitude) - radians3;
                                    double radians6 = Math.toRadians(latLng3.longitude) - radians4;
                                    double dB = o2.c.b(radians2, radians4, radians6, (radians - radians3) * radians5) / ((radians6 * radians6) + (radians5 * radians5));
                                    if (dB > 0.0d) {
                                        if (dB >= 1.0d) {
                                            fVar2 = fVar4;
                                        } else {
                                            double d17 = latLng2.latitude;
                                            double dB2 = o2.c.b(latLng3.latitude, d17, dB, d17);
                                            double d18 = latLng2.longitude;
                                            fVar2 = new com.garmin.android.library.mapsdkadapter.f(dB2, o2.c.b(latLng3.longitude, d18, dB, d18), fVar.f50284b);
                                        }
                                    }
                                    i14 = i15;
                                    d16 = dDistanceToLine;
                                }
                                fVar2 = fVar3;
                                i14 = i15;
                                d16 = dDistanceToLine;
                            }
                        } else {
                            d14 = d15;
                        }
                        i15++;
                        i16++;
                        d15 = d14;
                    }
                    return new u(fVar2, Double.valueOf(d16), Integer.valueOf(i14));
                }
            }
        }
        return new u(fVar, Double.valueOf(-1.0d), -1);
    }

    public static String b(double d14, Context context, boolean z14) {
        DecimalFormat decimalFormat = l3.f23125c;
        decimalFormat.getClass();
        if (context == null) {
            return null;
        }
        if (Double.isNaN(d14)) {
            return context.getString(R.string.no_value);
        }
        l3.a aVar = l3.f23124b;
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        aVar.getClass();
        return l3.a.O(context, d14, m3Var, decimalFormat, false);
    }

    public static String c(double d14, Context context, boolean z14) {
        if (context == null || Double.isNaN(d14)) {
            return "";
        }
        l3.a aVar = l3.f23124b;
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        DecimalFormat decimalFormat = l3.f23125c;
        aVar.getClass();
        return l3.a.O(context, d14, m3Var, decimalFormat, true);
    }
}
