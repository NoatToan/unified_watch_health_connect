package t50;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public interface c {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt50/c$a;", "Lt50/c;", "", "coursePointType", "Lcom/google/android/gms/maps/model/LatLng;", "courseClosestPointLatLng", "markerName", "", "enablePointAddedListener", "", "distance", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;ZLjava/lang/Double;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f162508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LatLng f162509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f162510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f162511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f162512e;

        public a(String str, LatLng latLng, String str2, boolean z14, Double d14) {
            str.getClass();
            latLng.getClass();
            this.f162508a = str;
            this.f162509b = latLng;
            this.f162510c = str2;
            this.f162511d = z14;
            this.f162512e = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f162508a.equals(aVar.f162508a) && this.f162509b.equals(aVar.f162509b) && p005kotlin.jvm.internal.s.g(this.f162510c, aVar.f162510c) && this.f162511d == aVar.f162511d && p005kotlin.jvm.internal.s.g(this.f162512e, aVar.f162512e);
        }

        public final int hashCode() {
            int iHashCode = (this.f162509b.hashCode() + (this.f162508a.hashCode() * 31)) * 31;
            String str = this.f162510c;
            int iG = q6.f.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f162511d);
            Double d14 = this.f162512e;
            return iG + (d14 != null ? d14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AddCourseMarkerOnMap(coursePointType=");
            sb3.append(this.f162508a);
            sb3.append(", courseClosestPointLatLng=");
            sb3.append(this.f162509b);
            sb3.append(", markerName=");
            v.h.C(this.f162510c, ", enablePointAddedListener=", ", distance=", sb3, this.f162511d);
            return b71.i.g(sb3, this.f162512e, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012&\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lt50/c$b;", "Lt50/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "geoPoint", "Lkotlin/Function3;", "", "", "multiplePointCallback", "Lkotlin/Function1;", "", "onFinishAddingCallback", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;Le23/q;Le23/l;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f162513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f162514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f162515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.q<List<GeoPointDTO>, String, String, Unit> f162516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f162517e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, e23.q<? super List<GeoPointDTO>, ? super String, ? super String, Unit> qVar, e23.l<? super Boolean, Unit> lVar) {
            fVar.getClass();
            fVar2.getClass();
            qVar.getClass();
            lVar.getClass();
            this.f162513a = list;
            this.f162514b = fVar;
            this.f162515c = fVar2;
            this.f162516d = qVar;
            this.f162517e = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f162513a, bVar.f162513a) && this.f162514b == bVar.f162514b && this.f162515c.equals(bVar.f162515c) && this.f162516d.equals(bVar.f162516d) && this.f162517e.equals(bVar.f162517e);
        }

        public final int hashCode() {
            List<GeoPointDTO> list = this.f162513a;
            return this.f162517e.hashCode() + ((this.f162516d.hashCode() + ((this.f162515c.hashCode() + ((this.f162514b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AddCoursePointOnMap(geoPoints=" + this.f162513a + ", coursePoint=" + this.f162514b + ", geoPoint=" + this.f162515c + ", multiplePointCallback=" + this.f162516d + ", onFinishAddingCallback=" + this.f162517e + ")";
        }
    }

    /* JADX INFO: renamed from: t50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt50/c$c;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3061c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f162518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f162519b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public C3061c(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f162518a = fVar;
            this.f162519b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3061c)) {
                return false;
            }
            C3061c c3061c = (C3061c) obj;
            return this.f162518a == c3061c.f162518a && this.f162519b.equals(c3061c.f162519b);
        }

        public final int hashCode() {
            return this.f162519b.hashCode() + (this.f162518a.hashCode() * 31);
        }

        public final String toString() {
            return "AddNewCoursePoint(coursePoint=" + this.f162518a + ", point=" + this.f162519b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$d;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162520a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public d(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162520a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f162520a.equals(((d) obj).f162520a);
        }

        public final int hashCode() {
            return this.f162520a.hashCode();
        }

        public final String toString() {
            return n23.j.e("ConfirmCoursePointNewLocation(coursePointDTO=", this.f162520a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$e;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f162521a;

        public e(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f162521a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f162521a == ((e) obj).f162521a;
        }

        public final int hashCode() {
            return this.f162521a.hashCode();
        }

        public final String toString() {
            return "ConfirmPlaceCoursePoint(coursePoint=" + this.f162521a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$f;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162522a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public f(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162522a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f162522a.equals(((f) obj).f162522a);
        }

        public final int hashCode() {
            return this.f162522a.hashCode();
        }

        public final String toString() {
            return n23.j.e("DeleteCoursePointMapMarker(coursePointDTO=", this.f162522a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$g;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f162523a;

        public g(com.garmin.android.apps.connectmobile.courses.model.f fVar) {
            fVar.getClass();
            this.f162523a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f162523a == ((g) obj).f162523a;
        }

        public final int hashCode() {
            return this.f162523a.hashCode();
        }

        public final String toString() {
            return "DisplayPlaceCoursePointModeOnMap(coursePoint=" + this.f162523a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/c$h;", "Lt50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f162524a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -662861598;
        }

        public final String toString() {
            return "DisplayRouteModeOnMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$i;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162525a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public i(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162525a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f162525a.equals(((i) obj).f162525a);
        }

        public final int hashCode() {
            return this.f162525a.hashCode();
        }

        public final String toString() {
            return n23.j.e("DisplayUpdateCoursePointLocationModeOnMap(coursePointDTO=", this.f162525a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/c$j;", "Lt50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f162526a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -240306772;
        }

        public final String toString() {
            return "ExpandCoursePointListBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/c$k;", "Lt50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f162527a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -952108396;
        }

        public final String toString() {
            return "HideCoursePointListBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$l;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162528a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public l(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162528a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f162528a.equals(((l) obj).f162528a);
        }

        public final int hashCode() {
            return this.f162528a.hashCode();
        }

        public final String toString() {
            return n23.j.e("HighlightCoursePoint(coursePointDTO=", this.f162528a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$m;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162529a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public m(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162529a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f162529a.equals(((m) obj).f162529a);
        }

        public final int hashCode() {
            return this.f162529a.hashCode();
        }

        public final String toString() {
            return n23.j.e("RevertHighlightOnCoursePoint(coursePointDTO=", this.f162529a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$n;", "Lt50/c;", "", "padding", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f162530a;

        public n(int i14) {
            this.f162530a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f162530a == ((n) obj).f162530a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f162530a);
        }

        public final String toString() {
            return e0.f(this.f162530a, "SetCustomMapPadding(padding=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/c$o;", "Lt50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f162531a = new o();

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1157425038;
        }

        public final String toString() {
            return "ShowGeneralError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt50/c$p;", "Lt50/c;", "", "Lfn0/a;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.a> f162532a;

        public p(List<fn0.a> list) {
            list.getClass();
            this.f162532a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f162532a.equals(((p) obj).f162532a);
        }

        public final int hashCode() {
            return this.f162532a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowHazardsOnMap(hazards=", ")", this.f162532a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt50/c$q;", "Lt50/c;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "pointsFound", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f162533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162534b;

        public q(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            list.getClass();
            gVar.getClass();
            this.f162533a = list;
            this.f162534b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f162533a.equals(qVar.f162533a) && this.f162534b.equals(qVar.f162534b);
        }

        public final int hashCode() {
            return this.f162534b.hashCode() + (this.f162533a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowMultipleUpdateCoursePointSelection(pointsFound=" + this.f162533a + ", coursePointDTO=" + this.f162534b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$r;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162535a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public r(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162535a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f162535a.equals(((r) obj).f162535a);
        }

        public final int hashCode() {
            return this.f162535a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointMapMarker(coursePointDTO=", this.f162535a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/c$s;", "Lt50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "updatedCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162536a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public s(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162536a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f162536a.equals(((s) obj).f162536a);
        }

        public final int hashCode() {
            return this.f162536a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointToEdit(updatedCoursePointDTO=", this.f162536a, ")");
        }
    }
}
