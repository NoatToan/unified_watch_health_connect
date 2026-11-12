package s20;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls20/o;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f156028a = new o();

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.garmin.android.apps.connectmobile.courses.model.g a(GeoPointDTO geoPointDTO, GeoPointDTO geoPointDTO2, double d14, com.garmin.android.apps.connectmobile.courses.model.f fVar) {
        Double dValueOf;
        p pVar;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = new com.garmin.android.apps.connectmobile.courses.model.g();
        gVar.m(fVar.f32922a);
        Double d15 = geoPointDTO.latitude;
        Double d16 = geoPointDTO.longitude;
        Double d17 = geoPointDTO2.latitude;
        Double d18 = geoPointDTO2.longitude;
        if (d15 == null || d16 == null || d17 == null || d18 == null) {
            dValueOf = null;
        } else {
            double radians = Math.toRadians(d15.doubleValue());
            double radians2 = Math.toRadians(d17.doubleValue());
            double radians3 = Math.toRadians(d18.doubleValue() - d16.doubleValue());
            dValueOf = Double.valueOf(Math.toDegrees(Math.atan2(Math.cos(radians2) * Math.sin(radians3), (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))));
        }
        b bVar = b.f156004a;
        Double d19 = geoPointDTO.latitude;
        Double d24 = geoPointDTO.longitude;
        double d25 = d14 / ((double) 1000);
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
        bVar.getClass();
        if (d19 == null || d24 == null) {
            pVar = null;
        } else {
            double radians4 = Math.toRadians(dDoubleValue);
            double radians5 = Math.toRadians(d19.doubleValue());
            double radians6 = Math.toRadians(d24.doubleValue());
            double d26 = d25 / 6371.0d;
            double dAsin = Math.asin((Math.cos(radians4) * Math.sin(d26) * Math.cos(radians5)) + (Math.cos(d26) * Math.sin(radians5)));
            pVar = new p(Double.valueOf(Math.toDegrees(dAsin)), Double.valueOf(Math.toDegrees((((Math.atan2(Math.cos(radians5) * (Math.sin(d26) * Math.sin(radians4)), Math.cos(d26) - (Math.sin(dAsin) * Math.sin(radians5))) + radians6) + 9.42477796076938d) % 6.283185307179586d) - 3.141592653589793d)));
        }
        gVar.lat = pVar != null ? (Double) pVar.f128594a : null;
        gVar.lon = pVar != null ? (Double) pVar.f128595b : null;
        gVar.elevation = geoPointDTO.elevation;
        return gVar;
    }

    public static final ArrayList b(List list, double d14, boolean z14) {
        list.getClass();
        List listN0 = h0.N0(list, new n());
        ArrayList arrayList = new ArrayList();
        int size = listN0.size();
        int i14 = 0;
        while (i14 < size) {
            com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) listN0.get(i14);
            f156028a.getClass();
            x0 x0Var = x0.f105818a;
            i14++;
            String strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i14) * d14)}, 1));
            if (z14) {
                strValueOf = String.valueOf(((int) d14) * i14);
            }
            gVar.name = strValueOf;
            arrayList.add(gVar);
        }
        return arrayList;
    }
}
