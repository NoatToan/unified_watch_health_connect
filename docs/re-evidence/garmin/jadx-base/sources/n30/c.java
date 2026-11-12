package n30;

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
public interface c {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln30/c$a;", "Ln30/c;", "", "coursePointType", "Lcom/google/android/gms/maps/model/LatLng;", "courseClosestPointLatLng", "markerName", "", "enablePointAddedListener", "", "distance", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;ZLjava/lang/Double;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f123392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LatLng f123393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f123394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f123395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f123396e;

        public a(String str, LatLng latLng, String str2, boolean z14, Double d14) {
            str.getClass();
            latLng.getClass();
            this.f123392a = str;
            this.f123393b = latLng;
            this.f123394c = str2;
            this.f123395d = z14;
            this.f123396e = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f123392a.equals(aVar.f123392a) && this.f123393b.equals(aVar.f123393b) && p005kotlin.jvm.internal.s.g(this.f123394c, aVar.f123394c) && this.f123395d == aVar.f123395d && p005kotlin.jvm.internal.s.g(this.f123396e, aVar.f123396e);
        }

        public final int hashCode() {
            int iHashCode = (this.f123393b.hashCode() + (this.f123392a.hashCode() * 31)) * 31;
            String str = this.f123394c;
            int iG = q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123395d);
            Double d14 = this.f123396e;
            return iG + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AddCourseMarkerOnMap(coursePointType=");
            sb3.append(this.f123392a);
            sb3.append(", courseClosestPointLatLng=");
            sb3.append(this.f123393b);
            sb3.append(", markerName=");
            v.h.C(this.f123394c, ", enablePointAddedListener=", ", distance=", sb3, this.f123395d);
            return b71.i.g(sb3, this.f123396e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$a0;", "Ln30/c;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f123397a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public a0(fn0.a aVar) {
            aVar.getClass();
            this.f123397a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.f123397a.equals(((a0) obj).f123397a);
        }

        public final int hashCode() {
            return this.f123397a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnHazard(hazard=" + this.f123397a + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012&\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln30/c$b;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "Lkotlin/Function3;", "", "", "multiplePointCallback", "Lkotlin/Function1;", "", "onFinishAddingCallback", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;Le23/q;Le23/l;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f123398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f123399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f123400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.q<List<GeoPointDTO>, String, String, Unit> f123401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f123402e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, e23.q<? super List<GeoPointDTO>, ? super String, ? super String, Unit> qVar, e23.l<? super Boolean, Unit> lVar) {
            fVar.getClass();
            fVar2.getClass();
            qVar.getClass();
            lVar.getClass();
            this.f123398a = list;
            this.f123399b = fVar;
            this.f123400c = fVar2;
            this.f123401d = qVar;
            this.f123402e = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f123398a, bVar.f123398a) && this.f123399b == bVar.f123399b && this.f123400c.equals(bVar.f123400c) && this.f123401d.equals(bVar.f123401d) && this.f123402e.equals(bVar.f123402e);
        }

        public final int hashCode() {
            List<GeoPointDTO> list = this.f123398a;
            return this.f123402e.hashCode() + ((this.f123401d.hashCode() + ((this.f123400c.hashCode() + ((this.f123399b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AddCoursePointOnMap(geoPoints=" + this.f123398a + ", coursePoint=" + this.f123399b + ", point=" + this.f123400c + ", multiplePointCallback=" + this.f123401d + ", onFinishAddingCallback=" + this.f123402e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$b0;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f123403a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public b0(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f123403a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f123403a.equals(((b0) obj).f123403a);
        }

        public final int hashCode() {
            return this.f123403a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPointOfInterest(poi=" + this.f123403a + ")";
        }
    }

    /* JADX INFO: renamed from: n30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/c$c;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2315c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f123404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f123405b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public C2315c(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f123404a = fVar;
            this.f123405b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2315c)) {
                return false;
            }
            C2315c c2315c = (C2315c) obj;
            return this.f123404a == c2315c.f123404a && this.f123405b.equals(c2315c.f123405b);
        }

        public final int hashCode() {
            return this.f123405b.hashCode() + (this.f123404a.hashCode() * 31);
        }

        public final String toString() {
            return "AddNewCoursePoint(coursePoint=" + this.f123404a + ", point=" + this.f123405b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$c0;", "Ln30/c;", "", "climbId", "<init>", "(Ljava/lang/Long;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f123406a;

        public c0(Long l14) {
            this.f123406a = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && p005kotlin.jvm.internal.s.g(this.f123406a, ((c0) obj).f123406a);
        }

        public final int hashCode() {
            Long l14 = this.f123406a;
            if (l14 == null) {
                return 0;
            }
            return l14.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPrimaryClimb(climbId=" + this.f123406a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$d;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f123407a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 869995953;
        }

        public final String toString() {
            return "CenterMapToCurrentLocation";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$d0;", "Ln30/c;", "", "padding", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123408a;

        public d0(int i14) {
            this.f123408a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.f123408a == ((d0) obj).f123408a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123408a);
        }

        public final String toString() {
            return v.e0.f(this.f123408a, "SetCustomMapPadding(padding=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$e;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f123409a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1681898945;
        }

        public final String toString() {
            return "CollapseCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$e0;", "Ln30/c;", "", "Lk30/g;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k30.g> f123410a;

        public e0(List<k30.g> list) {
            list.getClass();
            this.f123410a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.f123410a.equals(((e0) obj).f123410a);
        }

        public final int hashCode() {
            return this.f123410a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowClimbsOnMap(climbs=", ")", this.f123410a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$f;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123411a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public f(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123411a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f123411a.equals(((f) obj).f123411a);
        }

        public final int hashCode() {
            return this.f123411a.hashCode();
        }

        public final String toString() {
            return n23.j.e("ConfirmCoursePointNewLocation(coursePointDTO=", this.f123411a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$f0;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f123412a = new f0();

        private f0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        public final int hashCode() {
            return 1874143042;
        }

        public final String toString() {
            return "ShowGeneralError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$g;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f123413a;

        public g(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f123413a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f123413a == ((g) obj).f123413a;
        }

        public final int hashCode() {
            return this.f123413a.hashCode();
        }

        public final String toString() {
            return "ConfirmPlaceCoursePoint(coursePoint=" + this.f123413a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$g0;", "Ln30/c;", "", "Lfn0/e;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.e> f123414a;

        public g0(List<fn0.e> list) {
            list.getClass();
            this.f123414a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.f123414a.equals(((g0) obj).f123414a);
        }

        public final int hashCode() {
            return this.f123414a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowHazardsOnMap(hazards=", ")", this.f123414a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$h;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f123415a;

        public h(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f123415a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f123415a == ((h) obj).f123415a;
        }

        public final int hashCode() {
            return this.f123415a.hashCode();
        }

        public final String toString() {
            return "DisplayPlaceCoursePointModeOnMap(coursePoint=" + this.f123415a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$h0;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h0 f123416a = new h0();

        private h0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h0);
        }

        public final int hashCode() {
            return 1504049220;
        }

        public final String toString() {
            return "ShowMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$i;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f123417a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1430059438;
        }

        public final String toString() {
            return "DisplayRouteModeOnMap";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln30/c$i0;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "pointsFound", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f123418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123419b;

        public i0(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            list.getClass();
            gVar.getClass();
            this.f123418a = list;
            this.f123419b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return this.f123418a.equals(i0Var.f123418a) && this.f123419b.equals(i0Var.f123419b);
        }

        public final int hashCode() {
            return this.f123419b.hashCode() + (this.f123418a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowMultipleUpdateCoursePointSelection(pointsFound=" + this.f123418a + ", coursePointDTO=" + this.f123419b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$j;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123420a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public j(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123420a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f123420a.equals(((j) obj).f123420a);
        }

        public final int hashCode() {
            return this.f123420a.hashCode();
        }

        public final String toString() {
            return n23.j.e("DisplayUpdateCoursePointLocationModeOnMap(coursePointDTO=", this.f123420a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$j0;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "pointsOfInterest", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<PointOfInterestDTO> f123421a;

        public j0(List<PointOfInterestDTO> list) {
            list.getClass();
            this.f123421a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.f123421a.equals(((j0) obj).f123421a);
        }

        public final int hashCode() {
            return this.f123421a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowPointsOfInterestOnMap(pointsOfInterest=", ")", this.f123421a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$k;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f123422a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1007872876;
        }

        public final String toString() {
            return "ExpandCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$k0;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0 f123423a = new k0();

        private k0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k0);
        }

        public final int hashCode() {
            return -209122780;
        }

        public final String toString() {
            return "ShowRoutingError";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$l;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f123424a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -584095916;
        }

        public final String toString() {
            return "HideCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$l0;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetail", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.e f123425a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
        }

        public l0(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            this.f123425a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && this.f123425a.equals(((l0) obj).f123425a);
        }

        public final int hashCode() {
            return this.f123425a.hashCode();
        }

        public final String toString() {
            return "ShowSaveCourseSuccess(courseDetail=" + this.f123425a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$m;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f123426a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -195591329;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$m0;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123427a;

        public m0(List<ClimbDTO> list) {
            this.f123427a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && p005kotlin.jvm.internal.s.g(this.f123427a, ((m0) obj).f123427a);
        }

        public final int hashCode() {
            List<ClimbDTO> list = this.f123427a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowSecondaryClimbs(climbs=", ")", this.f123427a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$n;", "Ln30/c;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123428a;

        public n(int i14) {
            this.f123428a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f123428a == ((n) obj).f123428a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123428a);
        }

        public final String toString() {
            return v.e0.f(this.f123428a, "HighlightClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$n0;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123429a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public n0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123429a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && this.f123429a.equals(((n0) obj).f123429a);
        }

        public final int hashCode() {
            return this.f123429a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointMapMarker(coursePointDTO=", this.f123429a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$o;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123430a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public o(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123430a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f123430a.equals(((o) obj).f123430a);
        }

        public final int hashCode() {
            return this.f123430a.hashCode();
        }

        public final String toString() {
            return "HighlightClimbOnSystem(climbDTO=" + this.f123430a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$o0;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "updatedCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123431a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public o0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123431a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && this.f123431a.equals(((o0) obj).f123431a);
        }

        public final int hashCode() {
            return this.f123431a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointToEdit(updatedCoursePointDTO=", this.f123431a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$p;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123432a;

        public p(List<ClimbDTO> list) {
            list.getClass();
            this.f123432a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f123432a.equals(((p) obj).f123432a);
        }

        public final int hashCode() {
            return this.f123432a.hashCode();
        }

        public final String toString() {
            return tn.k.h("HighlightClimbSystem(climbs=", ")", this.f123432a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$p0;", "Ln30/c;", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "geodeticSystem", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i$b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p0 implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.i.b f123433a;

        public p0(com.garmin.android.library.mapsdkadapter.i.b bVar) {
            bVar.getClass();
            this.f123433a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && this.f123433a == ((p0) obj).f123433a;
        }

        public final int hashCode() {
            return this.f123433a.hashCode();
        }

        public final String toString() {
            return "UpdateMapGeodeticSystem(geodeticSystem=" + this.f123433a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$q;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123434a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public q(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123434a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f123434a.equals(((q) obj).f123434a);
        }

        public final int hashCode() {
            return this.f123434a.hashCode();
        }

        public final String toString() {
            return n23.j.e("HighlightCoursePoint(coursePointDTO=", this.f123434a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$r;", "Ln30/c;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f123435a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public r(fn0.a aVar) {
            aVar.getClass();
            this.f123435a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f123435a.equals(((r) obj).f123435a);
        }

        public final int hashCode() {
            return this.f123435a.hashCode();
        }

        public final String toString() {
            return "HighlightHazard(hazard=" + this.f123435a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$s;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f123436a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public s(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f123436a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f123436a.equals(((s) obj).f123436a);
        }

        public final int hashCode() {
            return this.f123436a.hashCode();
        }

        public final String toString() {
            return "HighlightPointOfInterest(poi=" + this.f123436a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$t;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123437a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public t(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123437a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f123437a.equals(((t) obj).f123437a);
        }

        public final int hashCode() {
            return this.f123437a.hashCode();
        }

        public final String toString() {
            return "HighlightPrimaryClimb(climbDTO=" + this.f123437a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$u;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f123438a = new u();

        private u() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1702898987;
        }

        public final String toString() {
            return "RemoveClimbsFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/c$v;", "Ln30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f123439a = new v();

        private v() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 730361509;
        }

        public final String toString() {
            return "RemovePointsOfInterestFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$w;", "Ln30/c;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123440a;

        public w(int i14) {
            this.f123440a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f123440a == ((w) obj).f123440a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123440a);
        }

        public final String toString() {
            return v.e0.f(this.f123440a, "RevertHighlightOnClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$x;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123441a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public x(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123441a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f123441a.equals(((x) obj).f123441a);
        }

        public final int hashCode() {
            return this.f123441a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnClimbOnSystem(climbDTO=" + this.f123441a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/c$y;", "Ln30/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123442a;

        public y(List<ClimbDTO> list) {
            list.getClass();
            this.f123442a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.f123442a.equals(((y) obj).f123442a);
        }

        public final int hashCode() {
            return this.f123442a.hashCode();
        }

        public final String toString() {
            return tn.k.h("RevertHighlightOnClimbSystem(climbs=", ")", this.f123442a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/c$z;", "Ln30/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123443a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public z(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123443a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.f123443a.equals(((z) obj).f123443a);
        }

        public final int hashCode() {
            return this.f123443a.hashCode();
        }

        public final String toString() {
            return n23.j.e("RevertHighlightOnCoursePoint(coursePointDTO=", this.f123443a, ")");
        }
    }
}
