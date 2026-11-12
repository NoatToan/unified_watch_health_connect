package s20;

import c22.t;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ls20/m;", "", "<init>", "()V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f156022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f156023b = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls20/m$a;", "", "", "minX", "maxX", "minY", "maxY", "<init>", "(DDDD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f156024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f156025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f156026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f156027d;

        public a(double d14, double d15, double d16, double d17) {
            this.f156024a = d14;
            this.f156025b = d15;
            this.f156026c = d16;
            this.f156027d = d17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f156024a, aVar.f156024a) == 0 && Double.compare(this.f156025b, aVar.f156025b) == 0 && Double.compare(this.f156026c, aVar.f156026c) == 0 && Double.compare(this.f156027d, aVar.f156027d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f156027d) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f156024a) * 31, 31, this.f156025b), 31, this.f156026c);
        }

        public final String toString() {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("Bbox(minX=", this.f156024a, ", maxX=");
            sbA.append(this.f156025b);
            am.j.x(sbA, ", minY=", this.f156026c, ", maxY=");
            return t.d(this.f156027d, ")", sbA);
        }
    }

    static {
        new b(null);
        f156022a = 10.0d;
    }

    public static a a(GeoPointDTO geoPointDTO, GeoPointDTO geoPointDTO2) {
        Double d14 = geoPointDTO.longitude;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        Double d15 = geoPointDTO2.longitude;
        double dMin = Math.min(dDoubleValue, d15 != null ? d15.doubleValue() : 0.0d);
        Double d16 = geoPointDTO.longitude;
        double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
        Double d17 = geoPointDTO2.longitude;
        double dMax = Math.max(dDoubleValue2, d17 != null ? d17.doubleValue() : 0.0d);
        Double d18 = geoPointDTO.latitude;
        double dDoubleValue3 = d18 != null ? d18.doubleValue() : 0.0d;
        Double d19 = geoPointDTO2.latitude;
        double dMin2 = Math.min(dDoubleValue3, d19 != null ? d19.doubleValue() : 0.0d);
        Double d24 = geoPointDTO.latitude;
        double dDoubleValue4 = d24 != null ? d24.doubleValue() : 0.0d;
        Double d25 = geoPointDTO2.latitude;
        return new a(dMin, dMax, dMin2, Math.max(dDoubleValue4, d25 != null ? d25.doubleValue() : 0.0d));
    }

    public static GeoPointDTO b(GeoPointDTO geoPointDTO, double d14, double d15) {
        Double d16 = geoPointDTO.latitude;
        double dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
        Double d17 = geoPointDTO.longitude;
        LatLng latLngComputeOffset = SphericalUtil.computeOffset(new LatLng(dDoubleValue, d17 != null ? d17.doubleValue() : 0.0d), d14, d15);
        double d18 = latLngComputeOffset.latitude;
        double d19 = latLngComputeOffset.longitude;
        Double d24 = geoPointDTO.elevation;
        return new GeoPointDTO(d18, d19, Double.valueOf(d24 != null ? d24.doubleValue() : 0.0d));
    }

    public static boolean c(a aVar, a aVar2) {
        return aVar.f156024a <= aVar2.f156025b && aVar.f156025b >= aVar2.f156024a && aVar.f156026c <= aVar2.f156027d && aVar.f156027d >= aVar2.f156026c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static GeoPointDTO d(GeoPointDTO geoPointDTO, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) it.next();
            next = (GeoPointDTO) next;
            GeoPointDTO.INSTANCE.getClass();
            if (GeoPointDTO.Companion.b(geoPointDTO, next) >= GeoPointDTO.Companion.b(geoPointDTO, geoPointDTO2)) {
                next = geoPointDTO2;
            }
        }
        return (GeoPointDTO) next;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0055  */
    public static ArrayList e(List list, GeoPointDTO geoPointDTO) {
        double d14;
        list.getClass();
        geoPointDTO.getClass();
        ArrayList arrayList = new ArrayList();
        double d15 = f156022a;
        double d16 = 0.0d;
        GeoPointDTO geoPointDTOB = b(geoPointDTO, d15, 0.0d);
        double d17 = -d15;
        GeoPointDTO geoPointDTOB2 = b(geoPointDTO, d17, 0.0d);
        GeoPointDTO geoPointDTOB3 = b(geoPointDTO, d15, 90.0d);
        GeoPointDTO geoPointDTOB4 = b(geoPointDTO, d17, 90.0d);
        a aVarA = a(geoPointDTOB, geoPointDTOB2);
        a aVarA2 = a(geoPointDTOB3, geoPointDTOB4);
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            GeoPointDTO geoPointDTO2 = (GeoPointDTO) list.get(i14);
            GeoPointDTO geoPointDTO3 = (GeoPointDTO) h0.e0(i15, list);
            if (geoPointDTO3 == null) {
                d14 = d16;
            } else {
                a aVarA3 = a(geoPointDTO2, geoPointDTO3);
                if (c(aVarA, aVarA3) || c(aVarA2, aVarA3)) {
                    Double d18 = geoPointDTO2.longitude;
                    double radians = Math.toRadians(d18 != null ? d18.doubleValue() : d16);
                    Double d19 = geoPointDTO2.latitude;
                    double radians2 = Math.toRadians(d19 != null ? d19.doubleValue() : d16);
                    d14 = d16;
                    Double d24 = geoPointDTO3.longitude;
                    double radians3 = Math.toRadians(d24 != null ? d24.doubleValue() : d14);
                    Double d25 = geoPointDTO3.latitude;
                    double radians4 = Math.toRadians(d25 != null ? d25.doubleValue() : d14);
                    Double d26 = geoPointDTO.longitude;
                    double radians5 = Math.toRadians(d26 != null ? d26.doubleValue() : d14);
                    Double d27 = geoPointDTO.latitude;
                    double d28 = radians3 - radians;
                    double d29 = radians4 - radians2;
                    double radians6 = (((Math.toRadians(d27 != null ? d27.doubleValue() : d14) - radians2) * d29) + ((radians5 - radians) * d28)) / ((d29 * d29) + (d28 * d28));
                    if (radians6 < d14) {
                        radians6 = d14;
                    } else if (radians6 > 1.0d) {
                        radians6 = 1.0d;
                    }
                    GeoPointDTO geoPointDTO4 = new GeoPointDTO(Math.toDegrees((radians6 * d29) + radians2), Math.toDegrees((d28 * radians6) + radians), geoPointDTO2.elevation);
                    GeoPointDTO.INSTANCE.getClass();
                    if (GeoPointDTO.Companion.b(geoPointDTO, geoPointDTO4) < 50.0d) {
                        Double d34 = geoPointDTO2.distance;
                        geoPointDTO4.distance = d34 != null ? Double.valueOf(GeoPointDTO.Companion.b(geoPointDTO2, geoPointDTO4) + d34.doubleValue()) : null;
                        arrayList.add(geoPointDTO4);
                    }
                } else {
                    d14 = d16;
                }
            }
            i14 = i15;
            d16 = d14;
        }
        double d35 = d16;
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        List<GeoPointDTO> listN0 = h0.N0(arrayList, new a61.c(new rk2.b((byte) 0, 13), 20));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (GeoPointDTO geoPointDTO5 : listN0) {
            if (arrayList3.isEmpty()) {
                arrayList3.add(geoPointDTO5);
            } else {
                GeoPointDTO geoPointDTO6 = (GeoPointDTO) arrayList3.get(arrayList3.size() - 1);
                Double d36 = geoPointDTO5.distance;
                double dDoubleValue = d36 != null ? d36.doubleValue() : d35;
                Double d37 = geoPointDTO6.distance;
                if (dDoubleValue - (d37 != null ? d37.doubleValue() : d35) <= 25.0d) {
                    arrayList3.add(geoPointDTO5);
                } else {
                    arrayList2.add(d(geoPointDTO, arrayList3));
                    arrayList3 = x.m(geoPointDTO5);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(d(geoPointDTO, arrayList3));
        }
        return arrayList2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ls20/m$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "COURSE_POINT_DISTANCE_BUFFER_METERS", "D", "COURSE_POINT_DISTANCE_THRESHOLD_METERS", "length", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
