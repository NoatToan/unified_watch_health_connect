package a50;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La50/e$a;", "La50/e;", "", "coursePointType", "Lcom/google/android/gms/maps/model/LatLng;", "courseClosestPointLatLng", "markerName", "", "enablePointAddedListener", "", "distance", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;ZLjava/lang/Double;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LatLng f1321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f1323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f1324e;

        public a(String str, LatLng latLng, String str2, boolean z14, Double d14) {
            str.getClass();
            latLng.getClass();
            this.f1320a = str;
            this.f1321b = latLng;
            this.f1322c = str2;
            this.f1323d = z14;
            this.f1324e = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1320a.equals(aVar.f1320a) && this.f1321b.equals(aVar.f1321b) && p005kotlin.jvm.internal.s.g(this.f1322c, aVar.f1322c) && this.f1323d == aVar.f1323d && p005kotlin.jvm.internal.s.g(this.f1324e, aVar.f1324e);
        }

        public final int hashCode() {
            int iHashCode = (this.f1321b.hashCode() + (this.f1320a.hashCode() * 31)) * 31;
            String str = this.f1322c;
            int iG = q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1323d);
            Double d14 = this.f1324e;
            return iG + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AddCourseMarkerOnMap(coursePointType=");
            sb3.append(this.f1320a);
            sb3.append(", courseClosestPointLatLng=");
            sb3.append(this.f1321b);
            sb3.append(", markerName=");
            v.h.C(this.f1322c, ", enablePointAddedListener=", ", distance=", sb3, this.f1323d);
            return b71.i.g(sb3, this.f1324e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$a0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f1325a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public a0(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f1325a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.f1325a.equals(((a0) obj).f1325a);
        }

        public final int hashCode() {
            return this.f1325a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnClimbOnSystem(climbDTO=" + this.f1325a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$a1;", "La50/e;", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "geodeticSystem", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a1 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.i.b f1326a;

        public a1(com.garmin.android.library.mapsdkadapter.i.b bVar) {
            bVar.getClass();
            this.f1326a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a1) && this.f1326a == ((a1) obj).f1326a;
        }

        public final int hashCode() {
            return this.f1326a.hashCode();
        }

        public final String toString() {
            return "UpdateMapGeodeticSystem(geodeticSystem=" + this.f1326a + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012&\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La50/e$b;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "Lkotlin/Function3;", "", "", "multiplePointCallback", "Lkotlin/Function1;", "", "onFinishAddingCallback", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;Le23/q;Le23/l;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f1327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.q<List<GeoPointDTO>, String, String, Unit> f1330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f1331e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, e23.q<? super List<GeoPointDTO>, ? super String, ? super String, Unit> qVar, e23.l<? super Boolean, Unit> lVar) {
            fVar.getClass();
            fVar2.getClass();
            qVar.getClass();
            lVar.getClass();
            this.f1327a = list;
            this.f1328b = fVar;
            this.f1329c = fVar2;
            this.f1330d = qVar;
            this.f1331e = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f1327a, bVar.f1327a) && this.f1328b == bVar.f1328b && this.f1329c.equals(bVar.f1329c) && this.f1330d.equals(bVar.f1330d) && this.f1331e.equals(bVar.f1331e);
        }

        public final int hashCode() {
            List<GeoPointDTO> list = this.f1327a;
            return this.f1331e.hashCode() + ((this.f1330d.hashCode() + ((this.f1329c.hashCode() + ((this.f1328b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AddCoursePointOnMap(geoPoints=" + this.f1327a + ", coursePoint=" + this.f1328b + ", point=" + this.f1329c + ", multiplePointCallback=" + this.f1330d + ", onFinishAddingCallback=" + this.f1331e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$b0;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f1332a;

        public b0(List<ClimbDTO> list) {
            list.getClass();
            this.f1332a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f1332a.equals(((b0) obj).f1332a);
        }

        public final int hashCode() {
            return this.f1332a.hashCode();
        }

        public final String toString() {
            return tn.k.h("RevertHighlightOnClimbSystem(climbs=", ")", this.f1332a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/e$c;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1334b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public c(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f1333a = fVar;
            this.f1334b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1333a == cVar.f1333a && this.f1334b.equals(cVar.f1334b);
        }

        public final int hashCode() {
            return this.f1334b.hashCode() + (this.f1333a.hashCode() * 31);
        }

        public final String toString() {
            return "AddNewCoursePoint(coursePoint=" + this.f1333a + ", point=" + this.f1334b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$c0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1335a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public c0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1335a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.f1335a.equals(((c0) obj).f1335a);
        }

        public final int hashCode() {
            return this.f1335a.hashCode();
        }

        public final String toString() {
            return n23.j.e("RevertHighlightOnCoursePoint(coursePointDTO=", this.f1335a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$d;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1336a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -29009966;
        }

        public final String toString() {
            return "CenterMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$d0;", "La50/e;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f1337a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public d0(fn0.a aVar) {
            aVar.getClass();
            this.f1337a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.f1337a.equals(((d0) obj).f1337a);
        }

        public final int hashCode() {
            return this.f1337a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnHazard(hazard=" + this.f1337a + ")";
        }
    }

    /* JADX INFO: renamed from: a50.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$e;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0015e implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0015e f1338a = new C0015e();

        private C0015e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0015e);
        }

        public final int hashCode() {
            return -1978727775;
        }

        public final String toString() {
            return "CenterMapToCurrentLocation";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$e0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f1339a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public e0(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f1339a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.f1339a.equals(((e0) obj).f1339a);
        }

        public final int hashCode() {
            return this.f1339a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPointOfInterest(poi=" + this.f1339a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$f;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f1340a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 371899183;
        }

        public final String toString() {
            return "CollapseCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$f0;", "La50/e;", "", "climbId", "<init>", "(Ljava/lang/Long;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f1341a;

        public f0(Long l14) {
            this.f1341a = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && p005kotlin.jvm.internal.s.g(this.f1341a, ((f0) obj).f1341a);
        }

        public final int hashCode() {
            Long l14 = this.f1341a;
            if (l14 == null) {
                return 0;
            }
            return l14.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPrimaryClimb(climbId=" + this.f1341a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$g;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1342a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public g(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1342a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f1342a.equals(((g) obj).f1342a);
        }

        public final int hashCode() {
            return this.f1342a.hashCode();
        }

        public final String toString() {
            return n23.j.e("ConfirmCoursePointNewLocation(coursePointDTO=", this.f1342a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$g0;", "La50/e;", "", "padding", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1343a;

        public g0(int i14) {
            this.f1343a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.f1343a == ((g0) obj).f1343a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1343a);
        }

        public final String toString() {
            return v.e0.f(this.f1343a, "SetCustomMapPadding(padding=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$h;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1344a;

        public h(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f1344a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f1344a == ((h) obj).f1344a;
        }

        public final int hashCode() {
            return this.f1344a.hashCode();
        }

        public final String toString() {
            return "ConfirmPlaceCoursePoint(coursePoint=" + this.f1344a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$h0;", "La50/e;", "", "isLoading", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1345a;

        public h0(boolean z14) {
            this.f1345a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.f1345a == ((h0) obj).f1345a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1345a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetLoadingWaypoints(isLoading=", ")", this.f1345a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$i;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f1346a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1884093516;
        }

        public final String toString() {
            return "ConfirmPlacePoint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$i0;", "La50/e;", "", "enabled", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1347a;

        public i0(boolean z14) {
            this.f1347a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.f1347a == ((i0) obj).f1347a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1347a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetMapEnabled(enabled=", ")", this.f1347a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$j;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f1348a;

        public j(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f1348a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f1348a == ((j) obj).f1348a;
        }

        public final int hashCode() {
            return this.f1348a.hashCode();
        }

        public final String toString() {
            return "DisplayPlaceCoursePointModeOnMap(coursePoint=" + this.f1348a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La50/e$j0;", "La50/e;", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "zoomLevel", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f1349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f1350b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public j0(com.garmin.android.library.mapsdkadapter.f fVar, Integer num) {
            fVar.getClass();
            this.f1349a = fVar;
            this.f1350b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j0)) {
                return false;
            }
            j0 j0Var = (j0) obj;
            return this.f1349a.equals(j0Var.f1349a) && p005kotlin.jvm.internal.s.g(this.f1350b, j0Var.f1350b);
        }

        public final int hashCode() {
            int iHashCode = this.f1349a.hashCode() * 31;
            Integer num = this.f1350b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "ShowAddPointOptions(point=" + this.f1349a + ", zoomLevel=" + this.f1350b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$k;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f1351a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1532953732;
        }

        public final String toString() {
            return "DisplayPlacePointModeOnMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$k0;", "La50/e;", "", "Lk30/g;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k30.g> f1352a;

        public k0(List<k30.g> list) {
            list.getClass();
            this.f1352a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && this.f1352a.equals(((k0) obj).f1352a);
        }

        public final int hashCode() {
            return this.f1352a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowClimbsOnMap(climbs=", ")", this.f1352a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$l;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f1353a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1722070718;
        }

        public final String toString() {
            return "DisplayRouteModeOnMap";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La50/e$l0;", "La50/e;", "", "Lcom/garmin/android/library/mapsdkadapter/f;", "waypoints", "", "waypointsNames", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.garmin.android.library.mapsdkadapter.f> f1354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f1355b;

        public l0(List<com.garmin.android.library.mapsdkadapter.f> list, List<String> list2) {
            list.getClass();
            list2.getClass();
            this.f1354a = list;
            this.f1355b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l0)) {
                return false;
            }
            l0 l0Var = (l0) obj;
            return this.f1354a.equals(l0Var.f1354a) && this.f1355b.equals(l0Var.f1355b);
        }

        public final int hashCode() {
            return this.f1355b.hashCode() + (this.f1354a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("ShowCourseWaypoints(waypoints=", ", waypointsNames=", ")", this.f1354a, this.f1355b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$m;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1356a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public m(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1356a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f1356a.equals(((m) obj).f1356a);
        }

        public final int hashCode() {
            return this.f1356a.hashCode();
        }

        public final String toString() {
            return n23.j.e("DisplayUpdateCoursePointLocationModeOnMap(coursePointDTO=", this.f1356a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$m0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m0 f1357a = new m0();

        private m0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m0);
        }

        public final int hashCode() {
            return -628129742;
        }

        public final String toString() {
            return "ShowGeneralError";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$n;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f1358a = new n();

        private n() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1269227612;
        }

        public final String toString() {
            return "ExpandCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$n0;", "La50/e;", "", "Lfn0/e;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.e> f1359a;

        public n0(List<fn0.e> list) {
            list.getClass();
            this.f1359a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && this.f1359a.equals(((n0) obj).f1359a);
        }

        public final int hashCode() {
            return this.f1359a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowHazardsOnMap(hazards=", ")", this.f1359a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$o;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f1360a = new o();

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1981536324;
        }

        public final String toString() {
            return "HideCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$o0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o0 f1361a = new o0();

        private o0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o0);
        }

        public final int hashCode() {
            return -252069548;
        }

        public final String toString() {
            return "ShowMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$p;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f1362a = new p();

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1951710097;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La50/e$p0;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "pointsFound", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f1363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1364b;

        public p0(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            list.getClass();
            gVar.getClass();
            this.f1363a = list;
            this.f1364b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p0)) {
                return false;
            }
            p0 p0Var = (p0) obj;
            return this.f1363a.equals(p0Var.f1363a) && this.f1364b.equals(p0Var.f1364b);
        }

        public final int hashCode() {
            return this.f1364b.hashCode() + (this.f1363a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowMultipleUpdateCoursePointSelection(pointsFound=" + this.f1363a + ", coursePointDTO=" + this.f1364b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$q;", "La50/e;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1365a;

        public q(int i14) {
            this.f1365a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f1365a == ((q) obj).f1365a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1365a);
        }

        public final String toString() {
            return v.e0.f(this.f1365a, "HighlightClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$q0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q0 f1366a = new q0();

        private q0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q0);
        }

        public final int hashCode() {
            return 193117725;
        }

        public final String toString() {
            return "ShowOutAndBackDisclaimer";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$r;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f1367a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public r(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f1367a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f1367a.equals(((r) obj).f1367a);
        }

        public final int hashCode() {
            return this.f1367a.hashCode();
        }

        public final String toString() {
            return "HighlightClimbOnSystem(climbDTO=" + this.f1367a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$r0;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "pointsOfInterest", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<PointOfInterestDTO> f1368a;

        public r0(List<PointOfInterestDTO> list) {
            list.getClass();
            this.f1368a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r0) && this.f1368a.equals(((r0) obj).f1368a);
        }

        public final int hashCode() {
            return this.f1368a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowPointsOfInterestOnMap(pointsOfInterest=", ")", this.f1368a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$s;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f1369a;

        public s(List<ClimbDTO> list) {
            list.getClass();
            this.f1369a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f1369a.equals(((s) obj).f1369a);
        }

        public final int hashCode() {
            return this.f1369a.hashCode();
        }

        public final String toString() {
            return tn.k.h("HighlightClimbSystem(climbs=", ")", this.f1369a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$s0;", "La50/e;", "Lk30/k;", "courseRoutingType", "<init>", "(Lk30/k;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k30.k f1370a;

        public s0(k30.k kVar) {
            kVar.getClass();
            this.f1370a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s0) && this.f1370a == ((s0) obj).f1370a;
        }

        public final int hashCode() {
            return this.f1370a.hashCode();
        }

        public final String toString() {
            return "ShowRoutingError(courseRoutingType=" + this.f1370a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$t;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1371a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public t(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1371a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f1371a.equals(((t) obj).f1371a);
        }

        public final int hashCode() {
            return this.f1371a.hashCode();
        }

        public final String toString() {
            return n23.j.e("HighlightCoursePoint(coursePointDTO=", this.f1371a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$t0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetail", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.e f1372a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
        }

        public t0(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            this.f1372a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t0) && this.f1372a.equals(((t0) obj).f1372a);
        }

        public final int hashCode() {
            return this.f1372a.hashCode();
        }

        public final String toString() {
            return "ShowSaveCourseSuccess(courseDetail=" + this.f1372a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$u;", "La50/e;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f1373a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public u(fn0.a aVar) {
            aVar.getClass();
            this.f1373a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f1373a.equals(((u) obj).f1373a);
        }

        public final int hashCode() {
            return this.f1373a.hashCode();
        }

        public final String toString() {
            return "HighlightHazard(hazard=" + this.f1373a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La50/e$u0;", "La50/e;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f1374a;

        public u0(List<ClimbDTO> list) {
            this.f1374a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0) && p005kotlin.jvm.internal.s.g(this.f1374a, ((u0) obj).f1374a);
        }

        public final int hashCode() {
            List<ClimbDTO> list = this.f1374a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowSecondaryClimbs(climbs=", ")", this.f1374a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$v;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f1375a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public v(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f1375a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f1375a.equals(((v) obj).f1375a);
        }

        public final int hashCode() {
            return this.f1375a.hashCode();
        }

        public final String toString() {
            return "HighlightPointOfInterest(poi=" + this.f1375a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$v0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0 f1376a = new v0();

        private v0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v0);
        }

        public final int hashCode() {
            return 462534669;
        }

        public final String toString() {
            return "ShowTooManyClosureMessage";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$w;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f1377a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public w(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f1377a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f1377a.equals(((w) obj).f1377a);
        }

        public final int hashCode() {
            return this.f1377a.hashCode();
        }

        public final String toString() {
            return "HighlightPrimaryClimb(climbDTO=" + this.f1377a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$w0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w0 f1378a = new w0();

        private w0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w0);
        }

        public final int hashCode() {
            return -1014133210;
        }

        public final String toString() {
            return "ShowWaypointCorrectedWarning";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$x;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f1379a = new x();

        private x() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return -53219781;
        }

        public final String toString() {
            return "RemoveClimbsFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$x0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1380a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public x0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1380a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x0) && this.f1380a.equals(((x0) obj).f1380a);
        }

        public final int hashCode() {
            return this.f1380a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointMapMarker(coursePointDTO=", this.f1380a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$y;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f1381a = new y();

        private y() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -1339417675;
        }

        public final String toString() {
            return "RemovePointsOfInterestFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$y0;", "La50/e;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "updatedCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f1382a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public y0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f1382a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y0) && this.f1382a.equals(((y0) obj).f1382a);
        }

        public final int hashCode() {
            return this.f1382a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointToEdit(updatedCoursePointDTO=", this.f1382a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La50/e$z;", "La50/e;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1383a;

        public z(int i14) {
            this.f1383a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.f1383a == ((z) obj).f1383a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1383a);
        }

        public final String toString() {
            return v.e0.f(this.f1383a, "RevertHighlightOnClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La50/e$z0;", "La50/e;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z0 implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z0 f1384a = new z0();

        private z0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z0);
        }

        public final int hashCode() {
            return 1358009449;
        }

        public final String toString() {
            return "UpdateDefaultCourseName";
        }
    }
}
