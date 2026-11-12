package i50;

import androidx.room.a0;
import com.google.common.net.HttpHeaders;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: i50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$a;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1752a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91671a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public C1752a(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91671a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1752a) && this.f91671a.equals(((C1752a) obj).f91671a);
        }

        public final int hashCode() {
            return this.f91671a.hashCode();
        }

        public final String toString() {
            return "ConfirmChangeLegDistance(course=" + this.f91671a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$b;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91672a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public b(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91672a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f91672a.equals(((b) obj).f91672a);
        }

        public final int hashCode() {
            return this.f91672a.hashCode();
        }

        public final String toString() {
            return "ConfirmDeleteCourse(course=" + this.f91672a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$c;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91673a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public c(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91673a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f91673a.equals(((c) obj).f91673a);
        }

        public final int hashCode() {
            return this.f91673a.hashCode();
        }

        public final String toString() {
            return "ConfirmMakeCoursePublic(course=" + this.f91673a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/a$d;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "Li50/i;", "tab", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;Li50/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i50.i f91675b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public d(com.garmin.android.apps.connectmobile.courses.model.d dVar, i50.i iVar) {
            dVar.getClass();
            iVar.getClass();
            this.f91674a = dVar;
            this.f91675b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f91674a.equals(dVar.f91674a) && this.f91675b == dVar.f91675b;
        }

        public final int hashCode() {
            return this.f91675b.hashCode() + (this.f91674a.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmRemoveFavorite(course=" + this.f91674a + ", tab=" + this.f91675b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$e;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91676a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public e(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91676a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f91676a.equals(((e) obj).f91676a);
        }

        public final int hashCode() {
            return this.f91676a.hashCode();
        }

        public final String toString() {
            return "CourseLongPressed(course=" + this.f91676a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$f;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91677a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public f(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91677a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f91677a.equals(((f) obj).f91677a);
        }

        public final int hashCode() {
            return this.f91677a.hashCode();
        }

        public final String toString() {
            return "CourseSelected(course=" + this.f91677a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$g;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f91678a = new g();

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 446236897;
        }

        public final String toString() {
            return "CreateCourseClicked";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$h;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f91679a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1241782081;
        }

        public final String toString() {
            return "ExternalCourseChanged";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$i;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f91680a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1088195675;
        }

        public final String toString() {
            return "NextClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$j;", "Li50/a;", "", "powerGuideId", "<init>", "(J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91681a;

        public j(long j8) {
            this.f91681a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f91681a == ((j) obj).f91681a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91681a);
        }

        public final String toString() {
            return a0.f(this.f91681a, "PowerGuideRemoved(powerGuideId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$k;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f91682a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1847959348;
        }

        public final String toString() {
            return "PullToRefresh";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$l;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f91683a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -721505972;
        }

        public final String toString() {
            return HttpHeaders.REFRESH;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/a$m;", "Li50/a;", "", "courseId", "", "powerGuideId", "<init>", "(Ljava/lang/String;J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91685b;

        public m(String str, long j8) {
            str.getClass();
            this.f91684a = str;
            this.f91685b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f91684a.equals(mVar.f91684a) && this.f91685b == mVar.f91685b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91685b) + (this.f91684a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f91685b, "ReplacePowerGuide(courseId=", this.f91684a, ", powerGuideId=");
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$n;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f91686a = new n();

        private n() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 27286288;
        }

        public final String toString() {
            return "SearchClicked";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/a$o;", "Li50/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f91687a = new o();

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 298607513;
        }

        public final String toString() {
            return "SkipClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$p;", "Li50/a;", "Lk30/n;", "sortFilter", "<init>", "(Lk30/n;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k30.n f91688a;

        public p(k30.n nVar) {
            nVar.getClass();
            this.f91688a = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f91688a.equals(((p) obj).f91688a);
        }

        public final int hashCode() {
            return this.f91688a.hashCode();
        }

        public final String toString() {
            return "SortFilterApplied(sortFilter=" + this.f91688a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/a$q;", "Li50/a;", "Li50/i;", "tab", "<init>", "(Li50/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i50.i f91689a;

        public q(i50.i iVar) {
            iVar.getClass();
            this.f91689a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f91689a == ((q) obj).f91689a;
        }

        public final int hashCode() {
            return this.f91689a.hashCode();
        }

        public final String toString() {
            return "TabSelected(tab=" + this.f91689a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/a$r;", "Li50/a;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "Li50/i;", "tab", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;Li50/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i50.i f91691b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public r(com.garmin.android.apps.connectmobile.courses.model.d dVar, i50.i iVar) {
            dVar.getClass();
            iVar.getClass();
            this.f91690a = dVar;
            this.f91691b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f91690a.equals(rVar.f91690a) && this.f91691b == rVar.f91691b;
        }

        public final int hashCode() {
            return this.f91691b.hashCode() + (this.f91690a.hashCode() * 31);
        }

        public final String toString() {
            return "ToggleFavorite(course=" + this.f91690a + ", tab=" + this.f91691b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li50/a$s;", "Li50/a;", "", "courseId", "powerGuideId", "<init>", "(JJ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91693b;

        public s(long j8, long j14) {
            this.f91692a = j8;
            this.f91693b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f91692a == sVar.f91692a && this.f91693b == sVar.f91693b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91693b) + (Long.hashCode(this.f91692a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f91693b, ")", e0.k(this.f91692a, "ViewPowerGuide(courseId=", ", powerGuideId="));
        }
    }
}
