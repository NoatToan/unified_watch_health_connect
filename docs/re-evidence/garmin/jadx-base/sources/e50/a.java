package e50;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: e50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$a;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1326a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1326a f62905a = new C1326a();

        private C1326a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1326a);
        }

        public final int hashCode() {
            return 530321891;
        }

        public final String toString() {
            return "CopyExistingCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/a$a0;", "Le50/a;", "", "latitude", "longitude", "<init>", "(DD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f62906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f62907b;

        public a0(double d14, double d15) {
            this.f62906a = d14;
            this.f62907b = d15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return Double.compare(this.f62906a, a0Var.f62906a) == 0 && Double.compare(this.f62907b, a0Var.f62907b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f62907b) + (Double.hashCode(this.f62906a) * 31);
        }

        public final String toString() {
            return c22.t.d(this.f62907b, ")", com.airbnb.lottie.parser.moshi.a.a("RequestDrivingDirections(latitude=", this.f62906a, ", longitude="));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$b;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f62908a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -612208018;
        }

        public final String toString() {
            return "CreatePaceProForCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$b0;", "Le50/a;", "", "deviceId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62909a;

        public b0(long j8) {
            this.f62909a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f62909a == ((b0) obj).f62909a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62909a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62909a, "SendCourseToDevice(deviceId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$c;", "Le50/a;", "", "courseId", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62910a;

        public c(String str) {
            str.getClass();
            this.f62910a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f62910a.equals(((c) obj).f62910a);
        }

        public final int hashCode() {
            return this.f62910a.hashCode();
        }

        public final String toString() {
            return am.j.m("CreatePowerGuideForCourse(courseId=", this.f62910a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/a$c0;", "Le50/a;", "", "planId", "deviceId", "<init>", "(JJ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62912b;

        public c0(long j8, long j14) {
            this.f62911a = j8;
            this.f62912b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f62911a == c0Var.f62911a && this.f62912b == c0Var.f62912b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62912b) + (Long.hashCode(this.f62911a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f62912b, ")", ds.e0.k(this.f62911a, "SendPaceProPlanToDevice(planId=", ", deviceId="));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$d;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f62913a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1562852050;
        }

        public final String toString() {
            return "DeleteCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/a$d0;", "Le50/a;", "", "strategyId", "deviceId", "<init>", "(JJ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62915b;

        public d0(long j8, long j14) {
            this.f62914a = j8;
            this.f62915b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.f62914a == d0Var.f62914a && this.f62915b == d0Var.f62915b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62915b) + (Long.hashCode(this.f62914a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f62915b, ")", ds.e0.k(this.f62914a, "SendPowerGuideToDevice(strategyId=", ", deviceId="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$e;", "Le50/a;", "", "coursePointId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62916a;

        public e(long j8) {
            this.f62916a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f62916a == ((e) obj).f62916a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62916a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62916a, "DeleteCoursePoint(coursePointId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$e0;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e0 f62917a = new e0();

        private e0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e0);
        }

        public final int hashCode() {
            return 1253361746;
        }

        public final String toString() {
            return "ShareCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$f;", "Le50/a;", "", "strategyId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62918a;

        public f(long j8) {
            this.f62918a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f62918a == ((f) obj).f62918a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62918a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62918a, "DeletePowerGuideStrategy(strategyId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$f0;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f62919a = new f0();

        private f0() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        public final int hashCode() {
            return 1951609496;
        }

        public final String toString() {
            return "ToggleFavorite";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$g;", "Le50/a;", "", "courseName", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62920a;

        public g(String str) {
            str.getClass();
            this.f62920a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f62920a.equals(((g) obj).f62920a);
        }

        public final int hashCode() {
            return this.f62920a.hashCode();
        }

        public final String toString() {
            return am.j.m("DuplicateCourse(courseName=", this.f62920a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$g0;", "Le50/a;", "", "isUsingMetric", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f62921a;

        public g0(boolean z14) {
            this.f62921a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.f62921a == ((g0) obj).f62921a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62921a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("ToggleMileKmSegment(isUsingMetric=", ")", this.f62921a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$h;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f62922a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1391848525;
        }

        public final String toString() {
            return "EditCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le50/a$h0;", "Le50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newCoordinates", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f62924b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public h0(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f62923a = gVar;
            this.f62924b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            return this.f62923a.equals(h0Var.f62923a) && this.f62924b.equals(h0Var.f62924b);
        }

        public final int hashCode() {
            return this.f62924b.hashCode() + (this.f62923a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateCoursePointLocationOnMap(coursePointDTO=" + this.f62923a + ", newCoordinates=" + this.f62924b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/a$i;", "Le50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "oldCoursePointDTO", "newCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62926b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public i(com.garmin.android.apps.connectmobile.courses.model.g gVar, com.garmin.android.apps.connectmobile.courses.model.g gVar2) {
            gVar.getClass();
            gVar2.getClass();
            this.f62925a = gVar;
            this.f62926b = gVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f62925a.equals(iVar.f62925a) && this.f62926b.equals(iVar.f62926b);
        }

        public final int hashCode() {
            return this.f62926b.hashCode() + (this.f62925a.hashCode() * 31);
        }

        public final String toString() {
            return "EditCoursePoint(oldCoursePointDTO=" + this.f62925a + ", newCoursePointDTO=" + this.f62926b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$i0;", "Le50/a;", "Lw01/c;", "details", "<init>", "(Lw01/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i0 implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w01.c f62927a;

        static {
            Parcelable.Creator<w01.c> creator = w01.c.CREATOR;
        }

        public i0(w01.c cVar) {
            cVar.getClass();
            this.f62927a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.f62927a.equals(((i0) obj).f62927a);
        }

        public final int hashCode() {
            return this.f62927a.hashCode();
        }

        public final String toString() {
            return "UpdateNutritionAndHydrationDetails(details=" + this.f62927a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$j;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f62928a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1323860608;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$k;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f62929a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 251597643;
        }

        public final String toString() {
            return "OpenCourseClimbs";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$l;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f62930a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -99960261;
        }

        public final String toString() {
            return "OpenCourseDemands";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$m;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f62931a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 626548688;
        }

        public final String toString() {
            return "OpenCoursePoints";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$n;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f62932a = new n();

        private n() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -675862445;
        }

        public final String toString() {
            return "OpenElevationChartInFullscreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$o;", "Le50/a;", "Lfg0/k;", "eventDTO", "<init>", "(Lfg0/k;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fg0.k f62933a;

        static {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
        }

        public o(fg0.k kVar) {
            kVar.getClass();
            this.f62933a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f62933a.equals(((o) obj).f62933a);
        }

        public final int hashCode() {
            return this.f62933a.hashCode();
        }

        public final String toString() {
            return "OpenEventDetails(eventDTO=" + this.f62933a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$p;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f62934a = new p();

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 934008883;
        }

        public final String toString() {
            return "OpenHelp";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$q;", "Le50/a;", "Lw01/c;", "nutritionAndHydrationDetails", "<init>", "(Lw01/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w01.c f62935a;

        static {
            Parcelable.Creator<w01.c> creator = w01.c.CREATOR;
        }

        public q(w01.c cVar) {
            cVar.getClass();
            this.f62935a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f62935a.equals(((q) obj).f62935a);
        }

        public final int hashCode() {
            return this.f62935a.hashCode();
        }

        public final String toString() {
            return "OpenNutritionAndHydrationDetails(nutritionAndHydrationDetails=" + this.f62935a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$r;", "Le50/a;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceband", "<init>", "(Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.pacepro.data.dto.b f62936a;

        static {
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b.Companion companion = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.INSTANCE;
        }

        public r(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
            bVar.getClass();
            this.f62936a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f62936a.equals(((r) obj).f62936a);
        }

        public final int hashCode() {
            return this.f62936a.hashCode();
        }

        public final String toString() {
            return "OpenPaceProPlanDetails(paceband=" + this.f62936a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/a$s;", "Le50/a;", "", "strategyId", "courseId", "<init>", "(JJ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62938b;

        public s(long j8, long j14) {
            this.f62937a = j8;
            this.f62938b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f62937a == sVar.f62937a && this.f62938b == sVar.f62938b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62938b) + (Long.hashCode(this.f62937a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f62938b, ")", ds.e0.k(this.f62937a, "OpenPowerGuideDetails(strategyId=", ", courseId="));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$t;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f62939a = new t();

        private t() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 223301894;
        }

        public final String toString() {
            return "OpenSendCourseToDevice";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$u;", "Le50/a;", "", "planId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62940a;

        public u(long j8) {
            this.f62940a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f62940a == ((u) obj).f62940a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62940a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62940a, "OpenSendPaceProPlanToDevice(planId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$v;", "Le50/a;", "", "strategyId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62941a;

        public v(long j8) {
            this.f62941a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f62941a == ((v) obj).f62941a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62941a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62941a, "OpenSendPowerGuideToDevice(strategyId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/a$w;", "Le50/a;", "Lr30/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lr30/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r30.a f62942a;

        public w(r30.a aVar) {
            this.f62942a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f62942a == ((w) obj).f62942a;
        }

        public final int hashCode() {
            r30.a aVar = this.f62942a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "OverlayElevationChart(type=" + this.f62942a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le50/a$x;", "Le50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "newLocation", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeoPointDTO f62944b;

        static {
            GeoPointDTO.Companion companion = GeoPointDTO.INSTANCE;
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion2 = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public x(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
            gVar.getClass();
            geoPointDTO.getClass();
            this.f62943a = gVar;
            this.f62944b = geoPointDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f62943a.equals(xVar.f62943a) && this.f62944b.equals(xVar.f62944b);
        }

        public final int hashCode() {
            return this.f62944b.hashCode() + (this.f62943a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceCoursePointAtLocation(coursePointDTO=" + this.f62943a + ", newLocation=" + this.f62944b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$y;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f62945a = new y();

        private y() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1043998442;
        }

        public final String toString() {
            return "PublishAndShareCourse";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/a$z;", "Le50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f62946a = new z();

        private z() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -2141817057;
        }

        public final String toString() {
            return "RepositionCourse";
        }
    }
}
