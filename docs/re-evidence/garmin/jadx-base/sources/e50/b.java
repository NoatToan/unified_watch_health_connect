package e50;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$a;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f62947a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -35179993;
        }

        public final String toString() {
            return "CollapseCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$a0;", "Le50/b;", "", "deviceUnitId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a0 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62948a;

        public a0(long j8) {
            this.f62948a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && this.f62948a == ((a0) obj).f62948a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62948a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62948a, "ShowSendPowerGuideSuccess(deviceUnitId=", ")");
        }
    }

    /* JADX INFO: renamed from: e50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$b;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1327b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62949a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public C1327b(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62949a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1327b) && this.f62949a.equals(((C1327b) obj).f62949a);
        }

        public final int hashCode() {
            return this.f62949a.hashCode();
        }

        public final String toString() {
            return n23.j.e("ConfirmCoursePointNewLocation(coursePointDTO=", this.f62949a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$b0;", "Le50/b;", "", "isFavorite", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b0 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f62950a;

        public b0(boolean z14) {
            this.f62950a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && this.f62950a == ((b0) obj).f62950a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62950a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("ShowToggleFavoriteStateSuccess(isFavorite=", ")", this.f62950a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$c;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f62951a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1056118074;
        }

        public final String toString() {
            return "DisplayRouteModeOnMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$c0;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c0 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62952a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public c0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62952a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.f62952a.equals(((c0) obj).f62952a);
        }

        public final int hashCode() {
            return this.f62952a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointMapMarker(coursePointDTO=", this.f62952a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$d;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62953a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public d(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62953a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f62953a.equals(((d) obj).f62953a);
        }

        public final int hashCode() {
            return this.f62953a.hashCode();
        }

        public final String toString() {
            return n23.j.e("DisplayUpdateCoursePointLocationModeOnMap(coursePointDTO=", this.f62953a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$d0;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "updatedCoursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d0 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62954a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public d0(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62954a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.f62954a.equals(((d0) obj).f62954a);
        }

        public final int hashCode() {
            return this.f62954a.hashCode();
        }

        public final String toString() {
            return n23.j.e("UpdateCoursePointToEdit(updatedCoursePointDTO=", this.f62954a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$e;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f62955a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 316312380;
        }

        public final String toString() {
            return "HideCourseDetailsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$f;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f62956a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1830869623;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$g;", "Le50/b;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62957a;

        public g(int i14) {
            this.f62957a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f62957a == ((g) obj).f62957a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f62957a);
        }

        public final String toString() {
            return e0.f(this.f62957a, "HighlightClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$h;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62958a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public h(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62958a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f62958a.equals(((h) obj).f62958a);
        }

        public final int hashCode() {
            return this.f62958a.hashCode();
        }

        public final String toString() {
            return n23.j.e("HighlightCoursePoint(coursePointDTO=", this.f62958a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$i;", "Le50/b;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f62959a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public i(fn0.a aVar) {
            aVar.getClass();
            this.f62959a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f62959a.equals(((i) obj).f62959a);
        }

        public final int hashCode() {
            return this.f62959a.hashCode();
        }

        public final String toString() {
            return "HighlightHazardOnCourse(hazard=" + this.f62959a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$j;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f62960a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1349163369;
        }

        public final String toString() {
            return "NavigateToCoursePoints";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$k;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f62961a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1336794434;
        }

        public final String toString() {
            return "NavigateToEditCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$l;", "Le50/b;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f62962a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public l(fn0.a aVar) {
            aVar.getClass();
            this.f62962a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f62962a.equals(((l) obj).f62962a);
        }

        public final int hashCode() {
            return this.f62962a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightHazardOnCourse(hazard=" + this.f62962a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$m;", "Le50/b;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62963a;

        public m(int i14) {
            this.f62963a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f62963a == ((m) obj).f62963a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f62963a);
        }

        public final String toString() {
            return e0.f(this.f62963a, "RevertHighlightOnClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$n;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62964a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.g.Companion companion = com.garmin.android.apps.connectmobile.courses.model.g.INSTANCE;
        }

        public n(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            gVar.getClass();
            this.f62964a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f62964a.equals(((n) obj).f62964a);
        }

        public final int hashCode() {
            return this.f62964a.hashCode();
        }

        public final String toString() {
            return n23.j.e("RevertHighlightOnCoursePoint(coursePointDTO=", this.f62964a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$o;", "Le50/b;", "", "padding", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62965a;

        public o(int i14) {
            this.f62965a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f62965a == ((o) obj).f62965a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f62965a);
        }

        public final String toString() {
            return e0.f(this.f62965a, "SetCustomMapPadding(padding=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$p;", "Le50/b;", "", "enabled", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f62966a;

        public p(boolean z14) {
            this.f62966a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f62966a == ((p) obj).f62966a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62966a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetMapEnabled(enabled=", ")", this.f62966a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$q;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f62967a = new q();

        private q() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1841376467;
        }

        public final String toString() {
            return "ShareCourse";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le50/b$r;", "Le50/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailDTO", "", "showElevationUpdatedDialog", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.e f62968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62969b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.e.Companion companion = com.garmin.android.apps.connectmobile.courses.model.e.INSTANCE;
        }

        public r(com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14) {
            eVar.getClass();
            this.f62968a = eVar;
            this.f62969b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f62968a.equals(rVar.f62968a) && this.f62969b == rVar.f62969b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62969b) + (this.f62968a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowCopyingCourseSuccess(courseDetailDTO=" + this.f62968a + ", showElevationUpdatedDialog=" + this.f62969b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$s;", "Le50/b;", "Le50/g;", "operation", "<init>", "(Le50/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e50.g f62970a;

        public s(e50.g gVar) {
            gVar.getClass();
            this.f62970a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f62970a == ((s) obj).f62970a;
        }

        public final int hashCode() {
            return this.f62970a.hashCode();
        }

        public final String toString() {
            return "ShowCourseOperationFail(operation=" + this.f62970a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$t;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f62971a = new t();

        private t() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 912861971;
        }

        public final String toString() {
            return "ShowDeleteCourseSuccess";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$u;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f62972a = new u();

        private u() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -2036979575;
        }

        public final String toString() {
            return "ShowDeletePowerGuideStrategyError";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le50/b$v;", "Le50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f62973a = new v();

        private v() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return -2125928662;
        }

        public final String toString() {
            return "ShowGeneralError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le50/b$w;", "Le50/b;", "", "Lfn0/a;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.a> f62974a;

        public w(List<fn0.a> list) {
            list.getClass();
            this.f62974a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f62974a.equals(((w) obj).f62974a);
        }

        public final int hashCode() {
            return this.f62974a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowHazardsOnMap(hazards=", ")", this.f62974a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le50/b$x;", "Le50/b;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "pointsFound", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePointDTO", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<GeoPointDTO> f62975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.g f62976b;

        public x(List<GeoPointDTO> list, com.garmin.android.apps.connectmobile.courses.model.g gVar) {
            list.getClass();
            gVar.getClass();
            this.f62975a = list;
            this.f62976b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f62975a.equals(xVar.f62975a) && this.f62976b.equals(xVar.f62976b);
        }

        public final int hashCode() {
            return this.f62976b.hashCode() + (this.f62975a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowMultipleUpdateCoursePointSelection(pointsFound=" + this.f62975a + ", coursePointDTO=" + this.f62976b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$y;", "Le50/b;", "", "deviceUnitId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62977a;

        public y(long j8) {
            this.f62977a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && this.f62977a == ((y) obj).f62977a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62977a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62977a, "ShowSendCoursePaceBandSuccess(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le50/b$z;", "Le50/b;", "", "deviceUnitId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62978a;

        public z(long j8) {
            this.f62978a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.f62978a == ((z) obj).f62978a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f62978a);
        }

        public final String toString() {
            return androidx.room.a0.f(this.f62978a, "ShowSendCourseSuccess(deviceUnitId=", ")");
        }
    }
}
