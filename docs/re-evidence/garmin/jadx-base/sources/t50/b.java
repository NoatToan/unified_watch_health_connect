package t50;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/b$a;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162491a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public a(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162491a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f162491a.equals(((a) obj).f162491a);
        }

        public final int hashCode() {
            return this.f162491a.hashCode();
        }

        public final String toString() {
            return n23.j.e("AddCoursePoint(coursePoint=", this.f162491a, ")");
        }
    }

    /* JADX INFO: renamed from: t50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/b$b;", "Lt50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3060b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3060b f162492a = new C3060b();

        private C3060b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3060b);
        }

        public final int hashCode() {
            return 943264010;
        }

        public final String toString() {
            return "AddNewCoursePoint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/b$c;", "Lt50/b;", "", "coursePointId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f162493a;

        public c(long j8) {
            this.f162493a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f162493a == ((c) obj).f162493a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f162493a);
        }

        public final String toString() {
            return a0.f(this.f162493a, "DeleteCoursePoint(coursePointId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/b$d;", "Lt50/b;", "Lt50/a;", "property", "<init>", "(Lt50/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t50.a f162494a;

        public d(t50.a aVar) {
            aVar.getClass();
            this.f162494a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f162494a == ((d) obj).f162494a;
        }

        public final int hashCode() {
            return this.f162494a.hashCode();
        }

        public final String toString() {
            return "DeleteCoursePointProperty(property=" + this.f162494a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt50/b$e;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "oldCoursePointDTO", "newCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162496b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public e(com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2) {
            gVar.getClass();
            gVar2.getClass();
            this.f162495a = gVar;
            this.f162496b = gVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f162495a.equals(eVar.f162495a) && this.f162496b.equals(eVar.f162496b);
        }

        public final int hashCode() {
            return this.f162496b.hashCode() + (this.f162495a.hashCode() * 31);
        }

        public final String toString() {
            return "EditCoursePoint(oldCoursePointDTO=" + this.f162495a + ", newCoursePointDTO=" + this.f162496b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt50/b$f;", "Lt50/b;", "", "note", "", "cutoffDuration", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f162497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f162498b;

        public f(String str, Integer num) {
            this.f162497a = str;
            this.f162498b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return s.g(this.f162497a, fVar.f162497a) && s.g(this.f162498b, fVar.f162498b);
        }

        public final int hashCode() {
            String str = this.f162497a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f162498b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "EditFinishDetails(note=" + this.f162497a + ", cutoffDuration=" + this.f162498b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/b$g;", "Lt50/b;", "", "note", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f162499a;

        public g(String str) {
            this.f162499a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f162499a, ((g) obj).f162499a);
        }

        public final int hashCode() {
            String str = this.f162499a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("EditStartDetails(note=", this.f162499a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt50/b$h;", "Lt50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f162500a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 226709476;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt50/b$i;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newLocation", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f162502b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public i(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f162501a = gVar;
            this.f162502b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f162501a.equals(iVar.f162501a) && this.f162502b.equals(iVar.f162502b);
        }

        public final int hashCode() {
            return this.f162502b.hashCode() + (this.f162501a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceCoursePointAtLocation(coursePointDTO=" + this.f162501a + ", newLocation=" + this.f162502b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt50/b$j;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/f;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.f f162503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.library.mapsdkadapter.f f162504b;

        static {
            com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
        }

        public j(com.garmin.android.apps.connectmobile.courses.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2) {
            fVar.getClass();
            fVar2.getClass();
            this.f162503a = fVar;
            this.f162504b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f162503a == jVar.f162503a && this.f162504b.equals(jVar.f162504b);
        }

        public final int hashCode() {
            return this.f162504b.hashCode() + (this.f162503a.hashCode() * 31);
        }

        public final String toString() {
            return "PlacePreciseCoursePoint(coursePoint=" + this.f162503a + ", point=" + this.f162504b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt50/b$k;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoint", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162505a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public k(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f162505a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f162505a.equals(((k) obj).f162505a);
        }

        public final int hashCode() {
            return this.f162505a.hashCode();
        }

        public final String toString() {
            return n23.j.e("SelectCoursePoint(coursePoint=", this.f162505a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt50/b$l;", "Lt50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newCoordinates", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f162506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f162507b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public l(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f162506a = gVar;
            this.f162507b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f162506a.equals(lVar.f162506a) && this.f162507b.equals(lVar.f162507b);
        }

        public final int hashCode() {
            return this.f162507b.hashCode() + (this.f162506a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateCoursePointLocationOnMap(coursePointDTO=" + this.f162506a + ", newCoordinates=" + this.f162507b + ")";
        }
    }
}
