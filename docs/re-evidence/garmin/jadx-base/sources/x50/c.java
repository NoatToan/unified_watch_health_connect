package x50;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx50/c$a;", "Lx50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f188987a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public a(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f188987a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f188987a.equals(((a) obj).f188987a);
        }

        public final int hashCode() {
            return this.f188987a.hashCode();
        }

        public final String toString() {
            return "NavigateToCourseDetails(course=" + this.f188987a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx50/c$b;", "Lx50/c;", "", "courseId", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f188988a;

        public b(String str) {
            str.getClass();
            this.f188988a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f188988a.equals(((b) obj).f188988a);
        }

        public final int hashCode() {
            return this.f188988a.hashCode();
        }

        public final String toString() {
            return j.m("NavigateToCreatePowerGuide(courseId=", this.f188988a, ")");
        }
    }

    /* JADX INFO: renamed from: x50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx50/c$c;", "Lx50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3514c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f188989a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public C3514c(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f188989a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3514c) && this.f188989a.equals(((C3514c) obj).f188989a);
        }

        public final int hashCode() {
            return this.f188989a.hashCode();
        }

        public final String toString() {
            return "NavigateToPaceProSelection(course=" + this.f188989a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx50/c$d;", "Lx50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f188990a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1544046194;
        }

        public final String toString() {
            return "NavigateToTrails";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx50/c$e;", "Lx50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f188991a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -117647266;
        }

        public final String toString() {
            return "ShowCourseSaveError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx50/c$f;", "Lx50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f188992a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public f(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f188992a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f188992a.equals(((f) obj).f188992a);
        }

        public final int hashCode() {
            return this.f188992a.hashCode();
        }

        public final String toString() {
            return "ShowDeleteCourseConfirmation(course=" + this.f188992a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx50/c$g;", "Lx50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f188993a = new g();

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2077461239;
        }

        public final String toString() {
            return "ShowNoCoursesWarning";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx50/c$h;", "Lx50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f188994a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -272240658;
        }

        public final String toString() {
            return "ShowSearchError";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx50/c$i;", "Lx50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f188995a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -64930139;
        }

        public final String toString() {
            return "ShowTooManyCoursesWarning";
        }
    }
}
