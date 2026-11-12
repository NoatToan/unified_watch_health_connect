package i50;

import com.garmin.android.apps.connectmobile.f3;
import ds.e0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$a;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91707a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public a(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            this.f91707a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f91707a, ((a) obj).f91707a);
        }

        public final int hashCode() {
            com.garmin.android.apps.connectmobile.courses.model.d dVar = this.f91707a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "FinishWithCourse(course=" + this.f91707a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$b;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91708a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public b(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91708a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f91708a.equals(((b) obj).f91708a);
        }

        public final int hashCode() {
            return this.f91708a.hashCode();
        }

        public final String toString() {
            return "NavigateToCourseDetails(course=" + this.f91708a + ")";
        }
    }

    /* JADX INFO: renamed from: i50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/c$c;", "Li50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1753c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1753c f91709a = new C1753c();

        private C1753c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1753c);
        }

        public final int hashCode() {
            return 1278409175;
        }

        public final String toString() {
            return "NavigateToCreateCourse";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/c$d;", "Li50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f91710a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -592368249;
        }

        public final String toString() {
            return "NavigateToCreateCourseForTi";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$e;", "Li50/c;", "", "courseId", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91711a;

        public e(String str) {
            str.getClass();
            this.f91711a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f91711a.equals(((e) obj).f91711a);
        }

        public final int hashCode() {
            return this.f91711a.hashCode();
        }

        public final String toString() {
            return am.j.m("NavigateToCreatePowerGuide(courseId=", this.f91711a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li50/c$f;", "Li50/c;", "", "courseId", "powerGuideId", "<init>", "(JJ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91713b;

        public f(long j8, long j14) {
            this.f91712a = j8;
            this.f91713b = j14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f91712a == fVar.f91712a && this.f91713b == fVar.f91713b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91713b) + (Long.hashCode(this.f91712a) * 31);
        }

        public final String toString() {
            return am.j.i(this.f91713b, ")", e0.k(this.f91712a, "NavigateToEditPowerGuide(courseId=", ", powerGuideId="));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$g;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91714a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public g(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91714a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f91714a.equals(((g) obj).f91714a);
        }

        public final int hashCode() {
            return this.f91714a.hashCode();
        }

        public final String toString() {
            return "NavigateToPaceProSelection(course=" + this.f91714a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/c$h;", "Li50/c;", "", "courseId", "", "powerGuideId", "<init>", "(Ljava/lang/String;J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91716b;

        public h(String str, long j8) {
            str.getClass();
            this.f91715a = str;
            this.f91716b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f91715a.equals(hVar.f91715a) && this.f91716b == hVar.f91716b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91716b) + (this.f91715a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f91716b, "NavigateToReplacePowerGuide(courseId=", this.f91715a, ", powerGuideId=");
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li50/c$i;", "Li50/c;", "", "", "favoriteCourseIds", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f91717a;

        public i(List<String> list) {
            list.getClass();
            this.f91717a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f91717a.equals(((i) obj).f91717a);
        }

        public final int hashCode() {
            return this.f91717a.hashCode();
        }

        public final String toString() {
            return tn.k.h("NavigateToSearch(favoriteCourseIds=", ")", this.f91717a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$j;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91718a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public j(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91718a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f91718a.equals(((j) obj).f91718a);
        }

        public final int hashCode() {
            return this.f91718a.hashCode();
        }

        public final String toString() {
            return "ShowChangeLegDistanceDialog(course=" + this.f91718a + ")";
        }
    }

    @d23.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Li50/c$l;", "Li50/c;", "messageRes", "", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91722a;

        private /* synthetic */ l(int i14) {
            this.f91722a = i14;
        }

        public static final /* synthetic */ l a(int i14) {
            return new l(i14);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof l) {
                return this.f91722a == ((l) obj).f91722a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f91722a);
        }

        public final String toString() {
            return v.e0.f(this.f91722a, "ShowInfoMessage(messageRes=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li50/c$m;", "Li50/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f91723a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 943395857;
        }

        public final String toString() {
            return "ShowLoadError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li50/c$n;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91724a;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public n(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
            dVar.getClass();
            this.f91724a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f91724a.equals(((n) obj).f91724a);
        }

        public final int hashCode() {
            return this.f91724a.hashCode();
        }

        public final String toString() {
            return "ShowMakeCoursePublicDialog(course=" + this.f91724a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/c$o;", "Li50/c;", "", "courseId", "", "powerGuideId", "<init>", "(Ljava/lang/String;J)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91726b;

        public o(String str, long j8) {
            str.getClass();
            this.f91725a = str;
            this.f91726b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f91725a.equals(oVar.f91725a) && this.f91726b == oVar.f91726b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f91726b) + (this.f91725a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f91726b, "ShowPowerGuideOptions(courseId=", this.f91725a, ", powerGuideId=");
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li50/c$p;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "Li50/i;", "tab", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;Li50/i;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i50.i f91728b;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public p(com.garmin.android.apps.connectmobile.courses.model.d dVar, i50.i iVar) {
            dVar.getClass();
            iVar.getClass();
            this.f91727a = dVar;
            this.f91728b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f91727a.equals(pVar.f91727a) && this.f91728b == pVar.f91728b;
        }

        public final int hashCode() {
            return this.f91728b.hashCode() + (this.f91727a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowRemoveFavoriteConfirmation(course=" + this.f91727a + ", tab=" + this.f91728b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li50/c$k;", "Li50/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "", "messageRes", "messageArgRes", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/d;ILjava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.courses.model.d f91719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f91721c;

        static {
            com.garmin.android.apps.connectmobile.courses.model.d.Companion companion = com.garmin.android.apps.connectmobile.courses.model.d.INSTANCE;
        }

        public k(com.garmin.android.apps.connectmobile.courses.model.d dVar, int i14, Integer num) {
            dVar.getClass();
            this.f91719a = dVar;
            this.f91720b = i14;
            this.f91721c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return s.g(this.f91719a, kVar.f91719a) && this.f91720b == kVar.f91720b && s.g(this.f91721c, kVar.f91721c);
        }

        public final int hashCode() {
            int iD = q2.d(this.f91720b, this.f91719a.hashCode() * 31, 31);
            Integer num = this.f91721c;
            return iD + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ShowDeleteCourseConfirmation(course=");
            sb3.append(this.f91719a);
            sb3.append(", messageRes=");
            sb3.append(this.f91720b);
            sb3.append(", messageArgRes=");
            return f3.i(sb3, this.f91721c, ")");
        }

        public /* synthetic */ k(com.garmin.android.apps.connectmobile.courses.model.d dVar, int i14, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
            this(dVar, i14, (i15 & 4) != 0 ? null : num);
        }
    }
}
