package ne2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import com.mapbox.turf.TurfConstants;
import com.mapbox.turf.TurfMeasurement;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lne2/h;", "", "<init>", "()V", "c", "a", "b", JWKParameterNames.RSA_EXPONENT, "d", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f125596a = new d(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lne2/h$a;", "", "", "bearing", FirebaseAnalytics.Param.SCORE, "<init>", "(DD)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f125597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f125598b;

        public a(double d14, double d15) {
            this.f125597a = d14;
            this.f125598b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f125597a, aVar.f125597a) == 0 && Double.compare(this.f125598b, aVar.f125598b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f125598b) + (Double.hashCode(this.f125597a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f125598b, ")", com.airbnb.lottie.parser.moshi.a.a("BearingResult(bearing=", this.f125597a, ", score="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lne2/h$b;", "", "", "bearing", "pitch", FirebaseAnalytics.Param.SCORE, "cameraElevation", "distance", "<init>", "(DDDDD)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f125599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f125600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f125601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f125602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f125603e;

        public b(double d14, double d15, double d16, double d17, double d18) {
            this.f125599a = d14;
            this.f125600b = d15;
            this.f125601c = d16;
            this.f125602d = d17;
            this.f125603e = d18;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f125599a, bVar.f125599a) == 0 && Double.compare(this.f125600b, bVar.f125600b) == 0 && Double.compare(this.f125601c, bVar.f125601c) == 0 && Double.compare(this.f125602d, bVar.f125602d) == 0 && Double.compare(this.f125603e, bVar.f125603e) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f125603e) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f125599a) * 31, 31, this.f125600b), 31, this.f125601c), 31, this.f125602d);
        }

        public final String toString() {
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("CameraCandidate(bearing=", this.f125599a, ", pitch=");
            sbA.append(this.f125600b);
            am.j.x(sbA, ", score=", this.f125601c, ", cameraElevation=");
            sbA.append(this.f125602d);
            return am.j.r(sbA, ", distance=", this.f125603e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lne2/h$c;", "", "", "bearing", "pitch", "<init>", "(DD)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f125604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f125605b;

        public c(double d14, double d15) {
            this.f125604a = d14;
            this.f125605b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f125604a, cVar.f125604a) == 0 && Double.compare(this.f125605b, cVar.f125605b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f125605b) + (Double.hashCode(this.f125604a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f125605b, ")", com.airbnb.lottie.parser.moshi.a.a("CameraOrientation(bearing=", this.f125604a, ", pitch="));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lne2/h$e;", "", "Lcom/mapbox/geojson/Point;", "coordinate", "", "elevation", "<init>", "(Lcom/mapbox/geojson/Point;D)V", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Point f125606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f125607b;

        public e(Point point, double d14) {
            point.getClass();
            this.f125606a = point;
            this.f125607b = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f125606a.equals(eVar.f125606a) && Double.compare(this.f125607b, eVar.f125607b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f125607b) + (this.f125606a.hashCode() * 31);
        }

        public final String toString() {
            return "Coordinate3D(coordinate=" + this.f125606a + ", elevation=" + this.f125607b + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lne2/h$d;", "", "<init>", "()V", "", "MIN_ZOOM_LEVEL", "D", "", "POINTS_TO_SAMPLE", "I", "BEARING_OFFSET_AMOUNT", "PITCH_OFFSET_AMOUNT", "LOW_PITCH", "HIGH_PITCH", "LOW_BEARING", "HIGH_BEARING", "SIGHTLINE_BASE_ACCURACY", "SIGHTLINE_IN_DEPTH_ACCURACY", "BEARING_BIAS", "PITCH_BIAS", "START_POINT_OCCLUSION_MAGNITUDE", "OCCLUSION_MAGNITUDE", "CAMERA_ELEVATION_OFFSET_FACTOR", "INTERPOLATION_SAMPLING_BIAS", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        public static final Object a(d dVar, double d14, double d15, double d16, double d17, double d18, double d19, List list, int i14, Point point, double d24, double d25, MapView mapView, v13.c cVar) {
            m mVar;
            double d26;
            double d27;
            double d28;
            double d29;
            double d34;
            double d35;
            dVar.getClass();
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i15 = mVar.f125687i;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    mVar.f125687i = i15 - Integer.MIN_VALUE;
                } else {
                    mVar = new m(dVar, cVar);
                }
            } else {
                mVar = new m(dVar, cVar);
            }
            Object objE = mVar.f125685g;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = mVar.f125687i;
            if (i16 == 0) {
                o13.r.b(objE);
                mVar.f125679a = d14;
                mVar.f125680b = d15;
                mVar.f125681c = d16;
                mVar.f125682d = d17;
                mVar.f125683e = d18;
                d26 = d19;
                mVar.f125684f = d26;
                mVar.f125687i = 1;
                Point pointDestination = TurfMeasurement.destination(point, d24, d14 + ((double) 180), TurfConstants.UNIT_METERS);
                pointDestination.getClass();
                objE = o53.c0.e(new l(list, pointDestination, d25, i14, mapView, null), mVar);
                if (objE == aVar) {
                    return aVar;
                }
                d27 = d18;
                d28 = d14;
                d29 = d15;
                d34 = d16;
                d35 = d17;
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d26 = mVar.f125684f;
                d27 = mVar.f125683e;
                d35 = mVar.f125682d;
                d34 = mVar.f125681c;
                d29 = mVar.f125680b;
                d28 = mVar.f125679a;
                o13.r.b(objE);
            }
            int iIntValue = ((Number) objE).intValue();
            g0.f125595a.getClass();
            double dMin = Math.min(Math.max((Math.min(g0.a.a(d28, d34), g0.a.a(d28, d35)) - 0.0d) / 90.0d, 0.0d), 1.0d);
            double dMin2 = Math.min(Math.max((d29 - 45.0d) / 20.0d, 0.0d), 1.0d);
            return new Double((((double) iIntValue) + ((dMin * dMin) * d27)) - ((dMin2 * dMin2) * d26));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static double b(List list, double d14) {
            double d15;
            double d16 = 0.0d;
            if (list.size() <= 1) {
                return 0.0d;
            }
            g0.f125595a.getClass();
            Point point = (Point) h0.b0(list);
            ArrayList<o13.p> arrayListD1 = h0.d1(j0.f134944a);
            Iterator it = list.iterator();
            while (true) {
                d15 = 3.141592653589793d;
                if (!it.hasNext()) {
                    break;
                }
                Point point2 = (Point) it.next();
                double d17 = 111320.0f;
                arrayListD1.add(new o13.p(Double.valueOf(Math.cos((point.latitude() * 3.141592653589793d) / ((double) 180)) * d17 * (point2.longitude() - point.longitude())), Double.valueOf((point2.latitude() - point.latitude()) * d17)));
            }
            double size = arrayListD1.size();
            Iterator it3 = arrayListD1.iterator();
            double dDoubleValue = 0.0d;
            while (it3.hasNext()) {
                dDoubleValue += ((Number) ((o13.p) it3.next()).f128594a).doubleValue();
            }
            double d18 = dDoubleValue / size;
            Iterator it4 = arrayListD1.iterator();
            double dDoubleValue2 = 0.0d;
            while (it4.hasNext()) {
                dDoubleValue2 += ((Number) ((o13.p) it4.next()).f128595b).doubleValue();
            }
            double d19 = dDoubleValue2 / size;
            double d24 = 0.0d;
            double d25 = 0.0d;
            for (o13.p pVar : arrayListD1) {
                double d26 = d15;
                double dDoubleValue3 = ((Number) pVar.f128594a).doubleValue() - d18;
                double dDoubleValue4 = ((Number) pVar.f128595b).doubleValue() - d19;
                d16 = (dDoubleValue3 * dDoubleValue3) + d16;
                d24 = (dDoubleValue4 * dDoubleValue4) + d24;
                d25 += dDoubleValue3 * dDoubleValue4;
                d15 = d26;
            }
            double dAtan2 = Math.atan2(((double) 2) * (d25 / size), (d16 / size) - (d24 / size)) * 0.5d * ((double) 180);
            double d27 = 360;
            double d28 = (d27 - (dAtan2 / d15)) % d27;
            return d14 < 1.0d ? (d28 + ((double) 90)) % d27 : d28;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0557  */
        /* JADX WARN: Code duplicated, block: B:108:0x0599 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:109:0x059b  */
        /* JADX WARN: Code duplicated, block: B:111:0x05ac  */
        /* JADX WARN: Code duplicated, block: B:113:0x05b2  */
        /* JADX WARN: Code duplicated, block: B:115:0x05ba  */
        /* JADX WARN: Code duplicated, block: B:116:0x05bd  */
        /* JADX WARN: Code duplicated, block: B:118:0x05c5  */
        /* JADX WARN: Code duplicated, block: B:120:0x05cb A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:121:0x05ce A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:125:0x05db  */
        /* JADX WARN: Code duplicated, block: B:127:0x05e2  */
        /* JADX WARN: Code duplicated, block: B:81:0x042a  */
        /* JADX WARN: Code duplicated, block: B:83:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:84:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:88:0x04f0  */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        /* JADX WARN: Code duplicated, block: B:90:0x04f8  */
        /* JADX WARN: Code duplicated, block: B:92:0x0502  */
        /* JADX WARN: Code duplicated, block: B:93:0x0525  */
        /* JADX WARN: Code duplicated, block: B:97:0x053d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:98:0x053f  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not found block with instruction: 0x04f8: MOVE (r2v33 ?? I:??[long, double]) A[DONT_GENERATE, REMOVE] */
        /* JADX WARN: Type inference failed for: r0v122 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v36 */
        /* JADX WARN: Type inference failed for: r0v45 */
        /* JADX WARN: Type inference failed for: r0v46, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r0v68, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r15v12, types: [T, ne2.h$b] */
        /* JADX WARN: Type inference failed for: r26v1 */
        /* JADX WARN: Type inference failed for: r26v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r26v3 */
        /* JADX WARN: Type inference failed for: r26v4 */
        /* JADX WARN: Type inference failed for: r26v5 */
        /* JADX WARN: Type inference failed for: r26v6 */
        /* JADX WARN: Type inference failed for: r2v35, types: [T, ne2.h$b] */
        /* JADX WARN: Type inference failed for: r31v0 */
        /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r31v3 */
        /* JADX WARN: Type inference failed for: r31v5 */
        /* JADX WARN: Type inference failed for: r31v6 */
        /* JADX WARN: Type inference failed for: r31v9 */
        /* JADX WARN: Type inference failed for: r37v2 */
        /* JADX WARN: Type inference failed for: r37v4 */
        /* JADX WARN: Type inference failed for: r37v7 */
        /* JADX WARN: Type inference failed for: r60v1 */
        /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x06a8 -> B:142:0x06b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x04c3 -> B:85:0x04e3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object c(java.util.ArrayList r60, double r61, double r63, com.mapbox.maps.EdgeInsets r65, com.mapbox.maps.MapView r66, v13.c r67) {
            /*
                Method dump skipped, instruction units count: 1888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ne2.h.d.c(java.util.ArrayList, double, double, com.mapbox.maps.EdgeInsets, com.mapbox.maps.MapView, v13.c):java.lang.Object");
        }

        private d() {
        }
    }
}
