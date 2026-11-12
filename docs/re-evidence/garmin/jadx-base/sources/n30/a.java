package n30;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: n30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$a;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2314a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123346a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public C2314a(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f123346a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2314a) && this.f123346a.equals(((C2314a) obj).f123346a);
        }

        public final int hashCode() {
            return this.f123346a.hashCode();
        }

        public final String toString() {
            return n23.j.e("AddCoursePoint(coursePoint=", this.f123346a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$b;", "Ln30/a;", "", "coursePointId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f123347a;

        public b(long j8) {
            this.f123347a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f123347a == ((b) obj).f123347a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f123347a);
        }

        public final String toString() {
            return a0.f(this.f123347a, "DeleteCoursePoint(coursePointId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln30/a$c;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "oldCoursePointDTO", "newCoursePointDTO", "", "addToUndoStack", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/g;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f123350c;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public c(com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2, boolean z14) {
            gVar.getClass();
            gVar2.getClass();
            this.f123348a = gVar;
            this.f123349b = gVar2;
            this.f123350c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f123348a.equals(cVar.f123348a) && this.f123349b.equals(cVar.f123349b) && this.f123350c == cVar.f123350c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123350c) + ((this.f123349b.hashCode() + (this.f123348a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("EditCoursePoint(oldCoursePointDTO=");
            sb3.append(this.f123348a);
            sb3.append(", newCoursePointDTO=");
            sb3.append(this.f123349b);
            sb3.append(", addToUndoStack=");
            return hb.a.k(sb3, this.f123350c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$d;", "Ln30/a;", "Ln50/c;", "action", "<init>", "(Ln50/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n50.c f123351a;

        public d(n50.c cVar) {
            cVar.getClass();
            this.f123351a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f123351a.equals(((d) obj).f123351a);
        }

        public final int hashCode() {
            return this.f123351a.hashCode();
        }

        public final String toString() {
            return "ExecuteCreateCourseDetailsAction(action=" + this.f123351a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$e;", "Ln30/a;", "Ln50/f;", "action", "<init>", "(Ln50/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n50.f f123352a;

        public e(n50.f fVar) {
            fVar.getClass();
            this.f123352a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f123352a.equals(((e) obj).f123352a);
        }

        public final int hashCode() {
            return this.f123352a.hashCode();
        }

        public final String toString() {
            return "ExecuteCreateCourseOverviewAction(action=" + this.f123352a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$f;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f123353a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -458949514;
        }

        public final String toString() {
            return "HideAddNewPointHint";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$g;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f123354a = new g();

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1408009092;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$h;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f123355a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -183006824;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$i;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f123356a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 831285560;
        }

        public final String toString() {
            return "OpenCourseOptionsMenu";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/a$j;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newLocation", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f123358b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public j(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f123357a = gVar;
            this.f123358b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f123357a.equals(jVar.f123357a) && this.f123358b.equals(jVar.f123358b);
        }

        public final int hashCode() {
            return this.f123358b.hashCode() + (this.f123357a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceCoursePointAtLocation(coursePointDTO=" + this.f123357a + ", newLocation=" + this.f123358b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/a$k;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f123359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f123360b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public k(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f123359a = fVar;
            this.f123360b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f123359a == kVar.f123359a && this.f123360b.equals(kVar.f123360b);
        }

        public final int hashCode() {
            return this.f123360b.hashCode() + (this.f123359a.hashCode() * 31);
        }

        public final String toString() {
            return "PlacePreciseCoursePoint(coursePoint=" + this.f123359a + ", point=" + this.f123360b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln30/a$l;", "Ln30/a;", "Lk30/k;", "courseRoutingType", "Lw20/b;", "courseDirection", "", "courseTargetDistance", "", "shouldAvoidHighTraffic", "shouldAvoidClosedRoads", "shouldAvoidUnpavedRoads", "<init>", "(Lk30/k;Lw20/b;DZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k30.k f123361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w20.b f123362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f123363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f123364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f123365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f123366f;

        public l(k30.k kVar, w20.b bVar, double d14, boolean z14, boolean z15, boolean z16) {
            kVar.getClass();
            bVar.getClass();
            this.f123361a = kVar;
            this.f123362b = bVar;
            this.f123363c = d14;
            this.f123364d = z14;
            this.f123365e = z15;
            this.f123366f = z16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f123361a == lVar.f123361a && this.f123362b == lVar.f123362b && Double.compare(this.f123363c, lVar.f123363c) == 0 && this.f123364d == lVar.f123364d && this.f123365e == lVar.f123365e && this.f123366f == lVar.f123366f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123366f) + q6.f.g(q6.f.g(org.apache.commons.lang3.e.b((this.f123362b.hashCode() + (this.f123361a.hashCode() * 31)) * 31, 31, this.f123363c), 31, this.f123364d), 31, this.f123365e);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RerouteCourse(courseRoutingType=");
            sb3.append(this.f123361a);
            sb3.append(", courseDirection=");
            sb3.append(this.f123362b);
            sb3.append(", courseTargetDistance=");
            sb3.append(this.f123363c);
            sb3.append(", shouldAvoidHighTraffic=");
            sb3.append(this.f123364d);
            com.airbnb.lottie.animation.keyframe.a.v(", shouldAvoidClosedRoads=", ", shouldAvoidUnpavedRoads=", sb3, this.f123365e, this.f123366f);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$m;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f123367a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1667420056;
        }

        public final String toString() {
            return "SaveCourse";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$n;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f123368a = new n();

        private n() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1240691035;
        }

        public final String toString() {
            return "ShowAddNewPointHint";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln30/a$o;", "Ln30/a;", "", "Lk30/a;", "primaryClimbs", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "minDifficulty", "maxDifficulty", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/apps/connectmobile/courses/model/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k30.a> f123369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f123370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f123371c;

        public o(List<k30.a> list, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
            list.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f123369a = list;
            this.f123370b = bVar;
            this.f123371c = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f123369a.equals(oVar.f123369a) && this.f123370b == oVar.f123370b && this.f123371c == oVar.f123371c;
        }

        public final int hashCode() {
            return this.f123371c.hashCode() + ((this.f123370b.hashCode() + (this.f123369a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ShowClimbSystemDetails(primaryClimbs=" + this.f123369a + ", minDifficulty=" + this.f123370b + ", maxDifficulty=" + this.f123371c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln30/a$p;", "Ln30/a;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "Lcom/garmin/android/apps/connectmobile/courses/model/c;", "surfaceType", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "minDifficulty", "maxDifficulty", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;Lcom/garmin/android/apps/connectmobile/courses/model/c;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/apps/connectmobile/courses/model/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f123372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.c f123373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f123374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.b f123375d;

        static {
            com.garmin.android.library.mapsdkadapter.e.b bVar = com.garmin.android.library.mapsdkadapter.e.f50271c;
        }

        public p(com.garmin.android.library.mapsdkadapter.e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
            eVar.getClass();
            cVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f123372a = eVar;
            this.f123373b = cVar;
            this.f123374c = bVar;
            this.f123375d = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f123372a.equals(pVar.f123372a) && this.f123373b == pVar.f123373b && this.f123374c == pVar.f123374c && this.f123375d == pVar.f123375d;
        }

        public final int hashCode() {
            return this.f123375d.hashCode() + ((this.f123374c.hashCode() + ((this.f123373b.hashCode() + (this.f123372a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ShowClimbs(bounds=" + this.f123372a + ", surfaceType=" + this.f123373b + ", minDifficulty=" + this.f123374c + ", maxDifficulty=" + this.f123375d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln30/a$q;", "Ln30/a;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "", "Lfn0/c;", "hazardTypes", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f123376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<fn0.c> f123377b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
            eVar.getClass();
            list.getClass();
            this.f123376a = eVar;
            this.f123377b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f123376a.equals(qVar.f123376a) && this.f123377b.equals(qVar.f123377b);
        }

        public final int hashCode() {
            return this.f123377b.hashCode() + (this.f123376a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowHazards(bounds=" + this.f123376a + ", hazardTypes=" + this.f123377b + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln30/a$r;", "Ln30/a;", "Lcom/garmin/android/library/mapsdkadapter/e;", "bounds", "", "zoomLevel", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "types", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/e;ILjava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.e f123378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f123379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.courses.model.h> f123380c;

        /* JADX WARN: Multi-variable type inference failed */
        public r(com.garmin.android.library.mapsdkadapter.e eVar, int i14, List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list) {
            eVar.getClass();
            list.getClass();
            this.f123378a = eVar;
            this.f123379b = i14;
            this.f123380c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f123378a.equals(rVar.f123378a) && this.f123379b == rVar.f123379b && this.f123380c.equals(rVar.f123380c);
        }

        public final int hashCode() {
            return this.f123380c.hashCode() + q2.d(this.f123379b, this.f123378a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ShowPointsOfInterest(bounds=");
            sb3.append(this.f123378a);
            sb3.append(", zoomLevel=");
            sb3.append(this.f123379b);
            sb3.append(", types=");
            return z.c(sb3, this.f123380c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/a$s;", "Ln30/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f123381a = new s();

        private s() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1492017433;
        }

        public final String toString() {
            return "UndoCourseRouteState";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$t;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.e f123382a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
        }

        public t(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            this.f123382a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f123382a.equals(((t) obj).f123382a);
        }

        public final int hashCode() {
            return this.f123382a.hashCode();
        }

        public final String toString() {
            return "UpdateCoursePointList(courseDetails=" + this.f123382a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln30/a$u;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newCoordinates", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f123383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f123384b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public u(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f123383a = gVar;
            this.f123384b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f123383a.equals(uVar.f123383a) && this.f123384b.equals(uVar.f123384b);
        }

        public final int hashCode() {
            return this.f123384b.hashCode() + (this.f123383a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateCoursePointLocationOnMap(coursePointDTO=" + this.f123383a + ", newCoordinates=" + this.f123384b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$v;", "Ln30/a;", "", "isCoursePublic", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f123385a;

        public v(boolean z14) {
            this.f123385a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f123385a == ((v) obj).f123385a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f123385a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateCoursePrivacy(isCoursePublic=", ")", this.f123385a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$w;", "Ln30/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.i f123386a;

        public w(com.garmin.android.apps.connectmobile.courses.model.i iVar) {
            iVar.getClass();
            this.f123386a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f123386a == ((w) obj).f123386a;
        }

        public final int hashCode() {
            return this.f123386a.hashCode();
        }

        public final String toString() {
            return "UpdateCourseType(courseType=" + this.f123386a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/a$x;", "Ln30/a;", "", "speed", "timeInSeconds", "<init>", "(DD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f123387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f123388b;

        public x(double d14, double d15) {
            this.f123387a = d14;
            this.f123388b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return Double.compare(this.f123387a, xVar.f123387a) == 0 && Double.compare(this.f123388b, xVar.f123388b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f123388b) + (Double.hashCode(this.f123387a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f123388b, ")", com.airbnb.lottie.parser.moshi.a.a("UpdateSpeedAndTime(speed=", this.f123387a, ", timeInSeconds="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/a$y;", "Ln30/a;", "Lcom/google/android/gms/maps/model/LatLng;", "startPoint", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLng f123389a;

        public y(LatLng latLng) {
            latLng.getClass();
            this.f123389a = latLng;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.f123389a.equals(((y) obj).f123389a);
        }

        public final int hashCode() {
            return this.f123389a.hashCode();
        }

        public final String toString() {
            return "UpdateStartPoint(startPoint=" + this.f123389a + ")";
        }
    }
}
